package com.InteractionLogging.InteractionLogging.service.impl;

import ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd.CreateComplaintRequest;
import ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd.CreateComplaintRequestDataHeader;
import ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd.CreateComplaintRequestDataHeaderAttachmentDetailsArray;
import ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd.CreateComplaintRequestDataHeaderContactDetailsArray;
import ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintResponse_xsd.CreateComplaintResponse;
import ae.etisalat.www.Middleware.HLRActions.HLRActions.QueryHLREndpoint0BindingStub;
import ae.etisalat.www.Middleware.HLRActions.QueryHLRRequest_xsd.QueryHLRRequest;
import ae.etisalat.www.Middleware.HLRActions.QueryHLRRequest_xsd.QueryHLRRequestDataHeader;
import ae.etisalat.www.Middleware.HLRActions.QueryHLRResponse_xsd.QueryHLRResponse;
import ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsRequest_xsd.GetAccountDetailsRequest;
import ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsRequest_xsd.GetAccountDetailsRequestDataHeader;
import ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsRequest_xsd.GetAccountDetailsRequestDataHeaderAccountDetails;
import ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsRequest_xsd.GetAccountDetailsRequestDataHeaderAddtionalInfo;

import ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponse;
import ae.etisalat.www.Middleware.SharedResources.Common.ApplicationHeader_xsd.ApplicationHeader;
import ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsRequest_xsd.GetComplaintDetailsRequest;
import ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsRequest_xsd.GetComplaintDetailsRequestDataHeader;
import ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponse;
import com.InteractionLogging.InteractionLogging.dto.*;
import com.InteractionLogging.InteractionLogging.request.PaymentAndChargesStartProcessRequest;
import com.InteractionLogging.InteractionLogging.service.base.ThirdPartyCallService;

import com.InteractionLogging.InteractionLogging.utils.RestServiceUtility;
import com.example.xmlns._1414677435101.ManageSRInterfaceBindingStub;
import com.example.xmlns._1433759742497.INCommunicationManagementEndpointBindingStub;
import com.example.xmlns._1436867334942.PortTypeEndpoint1BindingStub;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

@Service
public class ThirdPartyCallServiceImpl implements ThirdPartyCallService {


    Logger logger = LoggerFactory.getLogger(ThirdPartyCallServiceImpl.class);

    @Autowired
    RestServiceUtility utility;

    @Override
    public RetrieveCustomerDto callRetrieveCustomer(PaymentAndChargesStartProcessRequest request){

        final String uri = "http://localhost:8077/retrieve";
        //final String uri = "http://au316:9002/gw/rest/crm/v1/retrievecustomer";



        String accountProduct = "";
        String accountStatus = "";
        String consumerValueSegment = "";
        String nationalty = "";
        String isRatePlanAvailableStill = "NO";
        String creditStatus = "";
        String creditReason = "";
        String notesTypeCode = "";
        String registrationStatus = "";
        String effectiveTill = "";
        String registrationMessage = "";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Basic bW9iaWxlYXBwOm1vYmlsZWFwcA==");
        headers.set("ContentType", "application/json");
        headers.set("Accept", "application/json");



        RoamingAddonRequest roamingAddonRequest = new RoamingAddonRequest();


        RoamingAddonRequest.ReqInfo requiredInfo = new RoamingAddonRequest.ReqInfo();
        requiredInfo.setSubscriptions("true");
        requiredInfo.setAutopay("true");
        requiredInfo.setAccounts("true");
        requiredInfo.setLatestAccount("true");
        requiredInfo.setSegments("true");
        requiredInfo.setNotes("true");
        requiredInfo.setDocuments("true");

        roamingAddonRequest.setRequiredInfo(requiredInfo);
        roamingAddonRequest.setAccountNumber(request.getMsisdn());

        Gson g = new Gson();
        String req = g.toJson(roamingAddonRequest);
        HttpEntity<String> requestEntity = new HttpEntity<>(req, headers);
        logger.info("Retrieve Customer Request "+requestEntity.toString());




        ObjectMapper mapper = new ObjectMapper();

        try{


            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> responseEntity = restTemplate.exchange(uri , HttpMethod.POST,
                    requestEntity, String.class);


            String st = responseEntity.getBody();
            logger.info("Retrieve Customer Response "+st);


            CustomerResponse customerResponse = g.fromJson(st, CustomerResponse.class);

          /*  LinkedHashMap response = (LinkedHashMap) utility.callPostJson(uri, headers, roamingAddonRequest, CustomerResponse.class);
            CustomerResponse customerResponse = null;
            if(response !=null){
                customerResponse = mapper.convertValue(response, new TypeReference<CustomerResponse>(){});
            }*/


            if(customerResponse !=null && customerResponse.getResult() !=null){

                if(customerResponse.getResult().getSegment() !=null){
                    consumerValueSegment = customerResponse.getResult().getSegment().getCode();
                }

                if(customerResponse.getResult().getNationality() !=null){
                    nationalty = customerResponse.getResult().getNationality().getCode();
                }

                if(customerResponse.getResult().getAccounts().get(0).getProductGroup() !=null){
                    accountProduct = customerResponse.getResult().getAccounts().get(0).getProductGroup().getCode();


                }if(customerResponse.getResult().getAccounts().get(0).getAccountStatus() !=null) {

                    accountStatus = customerResponse.getResult().getAccounts().get(0).getAccountStatus().getName();

                }if(customerResponse.getResult().getAccounts().get(0).getCreditStatus() !=null) {

                    creditStatus = customerResponse.getResult().getAccounts().get(0).getCreditStatus().getName();




                }if(customerResponse.getResult().getAccounts().get(0).getCreditReason() !=null) {

                    creditReason = customerResponse.getResult().getAccounts().get(0).getCreditReason().getName();



                }if(customerResponse.getResult().getAccounts().get(0).getNotes() !=null && customerResponse.getResult().getAccounts().get(0).getNotes().size() >0 ) {

                    if(customerResponse.getResult().getAccounts().get(0).getNotes().get(0).getNotesRemovedDate() == null) {

                        notesTypeCode = customerResponse.getResult().getAccounts().get(0).getNotes().get(0).getNotesType().getCode();

                    }



                }if(customerResponse.getResult().getDocuments() !=null && customerResponse.getResult().getDocuments().size() >0){


                    registrationStatus = customerResponse.getResult().getDocuments().get(0).getStatus().getCode();
                    if("ACTIVE".equals(registrationStatus)){

                        effectiveTill = customerResponse.getResult().getDocuments().get(0).getEffectiveTill();
                        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
                        String dateString = format.format(new Date());
                        Date dateToday = new Date(dateString);
                        Date effectiveTillDate = format.parse(effectiveTill);
                        long difference_In_Time = effectiveTillDate.getTime() - dateToday.getTime();
                        long difference_In_Days = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365;

                        if(difference_In_Days > -1 && difference_In_Days <= 30){

                            registrationStatus = "NONACTIVE";

                            if("en".equalsIgnoreCase(request.getLang())){
                                registrationMessage = "Dear customer we noticed that your mobile account registration is about expire by "+effectiveTill+". Please select one of the following options to continue.";
                            }

                            else {

                                registrationMessage = " لاحظنا أن فترة صلاحية تسجيل هاتفك المتحرك على وشك أن تنتهي "+effectiveTill + " يرجى تحديد أحد الخيارات التالية للاستمرار. ";
                            }

                            System.out.println(registrationMessage);
                        }else{
                            effectiveTill = "";
                        }

                    }else{

                        effectiveTill = customerResponse.getResult().getDocuments().get(0).getEffectiveTill();
                        registrationMessage = "Dear customer we noticed that your mobile account registration is expired from "+effectiveTill+". Please register your account by visitig any business center or the web portal. Please select one of the following options to continue.";
                        System.out.println(registrationMessage);
                    }


                }/*if(customerResponse.getResult().getAccounts().get(0).getSubscriptions() !=null && customerResponse.getResult().getAccounts().get(0).getSubscriptions().size() >0) {


                for(int i=0; i<customerResponse.getResult().getAccounts().get(0).getSubscriptions().size(); i++) {

                    if(request.getRatePlan().equals(customerResponse.getResult().getAccounts().get(0).getSubscriptions().get(i).getProduct().getProductCode1())) {

                        if("ACTIVE".equals(customerResponse.getResult().getAccounts().get(0).getSubscriptions().get(i).getStatus().getName())) {

                            isRatePlanAvailableStill = "YES";
                            break;
                        }

                    }

                }

            }*/

            }


        }catch (Exception ex){
            ex.printStackTrace();
        }



        RetrieveCustomerDto dto = RetrieveCustomerDto.builder().accountProduct(accountProduct).accountStatus(accountStatus).consumerValueSegment(consumerValueSegment)
                .creditReason(creditReason).effectiveTill(effectiveTill).isRatePlanAvailableStill(isRatePlanAvailableStill).nationality(nationalty)
                .notesTypeCode(notesTypeCode).registrationStatus(registrationStatus).creditStatus(creditStatus).registrationMessage(registrationMessage).build();


        return dto;

    }




    @Override
    public String callQueryHLR(PaymentAndChargesStartProcessRequest request){

        String hotLineCheck = "false";

        try{

            QueryHLREndpoint0BindingStub queryHLREndpoint0BindingStub =new QueryHLREndpoint0BindingStub();

            QueryHLRRequest queryHLRRequest = new QueryHLRRequest();

            ApplicationHeader applicationHeader = new ApplicationHeader();
            applicationHeader.setRequestedSystem(request.getHlrRequestedSystem());
            applicationHeader.setTransactionID(request.getTransactionId());
            queryHLRRequest.setApplicationHeader(applicationHeader);


            QueryHLRRequestDataHeader dataHeader = new QueryHLRRequestDataHeader();
            dataHeader.setMSISDN("971"+request.getMsisdn().substring(1));
            dataHeader.setAction("Query");
            dataHeader.setOperation("GetCustomerProfile");
            queryHLRRequest.setDataHeader(dataHeader);


            QueryHLRResponse response = queryHLREndpoint0BindingStub.queryHLR(queryHLRRequest);
            String requestXML=queryHLREndpoint0BindingStub._getCall().getMessageContext().getRequestMessage().getSOAPPartAsString();
            System.out.println("HLRActionsRequest : "+requestXML);
            String responseXML=queryHLREndpoint0BindingStub._getCall().getMessageContext().getResponseMessage().getSOAPPartAsString();
            System.out.println("HLRActionsResponse : "+responseXML);


            if(response.getAckMessage() !=null && response.getAckMessage().getStatus() !=null &&
                    "SUCCESS".equals(response.getAckMessage().getStatus())) {

                if(response.getResponseHeader() !=null && response.getResponseHeader().getDetails() !=null) {

                    for(int i =0; i<response.getResponseHeader().getDetails().length; i++) {

                        for(int j=0; j<response.getResponseHeader().getDetails(i).getAdditionalInfo().length; j++) {

                            String name = response.getResponseHeader().getDetails(i).getAdditionalInfo(j).getName();
                            String value = response.getResponseHeader().getDetails(i).getAdditionalInfo(j).getValue();
                            System.out.println("HLRActionResponse : Name: "+name+"  Value: "+value);

                            if("OSB2-1".equals(name) || "OSB1-1".equals(name) || "OSB2-1".equals(value) || "OSB1-1".equals(value)) {

                                hotLineCheck = "true";
                            }

                        }

                    }

                }


            }

        }catch (Exception ex){
            ex.printStackTrace();
        }


        return hotLineCheck;


    }



    @Override
    public UCMSComplainDetailsDto callUCMSComplainDetails(PaymentAndChargesStartProcessRequest request){


        String openendComplains = "false";
        String complainNumber = "";
        String openComplaintsMessage = "";

        GetComplaintDetailsRequest ucmsRequest = new GetComplaintDetailsRequest();

        ApplicationHeader applicationHeader = new ApplicationHeader();
        applicationHeader.setRequestedSystem(request.getUcmsRequestedSystem());
        applicationHeader.setTransactionID(request.getTransactionId());
        ucmsRequest.setApplicationHeader(applicationHeader);


        GetComplaintDetailsRequestDataHeader dataHeader = new GetComplaintDetailsRequestDataHeader();
        dataHeader.setAccountNumber(request.getMsisdn());
        dataHeader.setComplaintStatus("Closed,Resolved,Ready For Closure,Work In Progress - Level 0,Work In Progress - Level 1,Work In Progress - Level 2,Work In Progress - Level 3,Work In Progress - Level 4,Work In Progress - OW,Suspended");
        dataHeader.setIdIdentifier("1");
        dataHeader.setCRSComplaintId("82247");
        dataHeader.setFromDateTime("2019-09-12T13:05:31.112Z");


        LocalDate localDate = LocalDate.now();
        String toDateTime = localDate+"T13:05:31.112Z";
        dataHeader.setToDateTime(toDateTime);
        ucmsRequest.setDataHeader(dataHeader);

        try{

            PortTypeEndpoint1BindingStub stub = new PortTypeEndpoint1BindingStub();


            GetComplaintDetailsResponse response = stub.opGetComplaintDtls(ucmsRequest);
            String requestXML=stub._getCall().getMessageContext().getRequestMessage().getSOAPPartAsString();
            System.out.println("GetUCMSCompalinRequest : "+requestXML);
            String responseXML=stub._getCall().getMessageContext().getResponseMessage().getSOAPPartAsString();
            System.out.println("GetUCMSCompalinResponse : "+responseXML);

            if(response !=null  && response.getAckMessage().getStatus() !=null &&
                    "SUCCESS".equals(response.getAckMessage().getStatus().getValue())){


                if(response.getResponseData() !=null && response.getResponseData().getComplaintList() != null
                && response.getResponseData().getComplaintList().length > 0){

                    for(int i =0; i<response.getResponseData().getComplaintList().length; i++) {

                        if(!"closed".equalsIgnoreCase(response.getResponseData().getComplaintList()[i].getStatus())){

                            openendComplains = "true";
                            complainNumber = response.getResponseData().getComplaintList()[i].getNumber();

                            if("en".equalsIgnoreCase(request.getLang())){

                                openComplaintsMessage = "Dear customer we noticed that you already have an open complaint for Billing & Charges on your account "+request.getMsisdn()
                                +" Please select one of the following options to continue. Complaint Number: "+complainNumber;

                            }else{

                                openComplaintsMessage =  complainNumber+" يرجى تحديد أحد الخيارات التالية للاستمرار. رقم الشكوى:"+request.getMsisdn() +"لاحظنا أن هناك شكوى تتعلّق بالفواتير والرسوم موجودة بالفعل ضمن حسابك ";
                            }
                        }

                    }

                }





            }

        }catch (Exception ex){
            ex.printStackTrace();
        }


        UCMSComplainDetailsDto dto = UCMSComplainDetailsDto.builder().complainNumber(complainNumber).openendComplains(openendComplains).openComplaintsMessage(openComplaintsMessage).build();
        return dto;
    }


    @Override
    public RetrieveOrderDto callRetrieveOrders(PaymentAndChargesStartProcessRequest request){



        String openOrders = "false";
        String orderNumber = "";
        String openOrdersMessage = "";

        final String uri = "http://localhost:8070/retrieveorders";
        //final String uri = "http://au316:9002/gw/rest/crm/v1/retrieveorders";

        Gson g = new Gson();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Basic bW9iaWxlYXBwOm1vYmlsZWFwcA==");
        headers.set("ContentType", "application/json");
        headers.set("Accept", "application/json");
        RoamingAddonRequest roamingAddonRequest = new RoamingAddonRequest();
        roamingAddonRequest.setAccountNumber(request.getMsisdn());
        String req = g.toJson(roamingAddonRequest);



        HttpEntity<String> requestEntity = new HttpEntity<>(req, headers);

        logger.info("Retrieve Order Request "+requestEntity.toString());

        try{

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> responseEntity = restTemplate.exchange(uri , HttpMethod.POST,
                    requestEntity, String.class);


            String st = responseEntity.getBody();
            logger.info("Retrieve Order Response "+st);


            RetrieveOrdersResponse orderResponse = g.fromJson(st, RetrieveOrdersResponse.class);


            if(orderResponse !=null && orderResponse.getResponseDesc() !=null && "SUCCESS".equalsIgnoreCase(orderResponse.getResponseDesc())) {

                if(orderResponse.getResult() !=null && orderResponse.getResult().length >0) {

                    for(int i=0; i<orderResponse.getResult().length; i++) {

                        System.out.println("Point 6 : Order STatus : "+orderResponse.getResult()[i].getOrderStatus().getCode());

                        if(!"CLOSE".equals(orderResponse.getResult()[i].getOrderStatus().getCode()) && !"CANCEL".equals(orderResponse.getResult()[i].getOrderStatus().getCode())) {

                            openOrders = "true";
                            orderNumber = orderResponse.getResult()[i].getOrderCrmId();

                            if("en".equalsIgnoreCase(request.getLang())){

                                openOrdersMessage = "Dear customer we noticed that you already have an open order on your account "+request.getMsisdn()
                                +" Please select one of the following options to continue. Order Number: "+orderNumber;

                            }else{

                                openOrdersMessage = orderNumber + " يرجى تحديد أحد الخيارات التالية للاستمرار. رقم الطلب:"+ request.getMsisdn() + "لاحظنا أن هذا الطلب موجود بالفعل ضمن حسابك ";
                            }


                            break;
                        }

                    }
                }

            }

        }catch (Exception ex){
            ex.printStackTrace();
        }


        RetrieveOrderDto dto = RetrieveOrderDto.builder().openOrders(openOrders).orderNumber(orderNumber).openOrdersMessage(openOrdersMessage).build();
        return dto;
    }




    @Override
    public AccountDetailDto getAcountDetailsCall(PaymentAndChargesStartProcessRequest request){


        String isMinimumBalanceAvailable = "true";
        String prepaidBalance = "0";
        String minimumBalanceMessage = "";

        GetAccountDetailsRequest accountDetailsRequest = new GetAccountDetailsRequest();

        ApplicationHeader applicationHeader = new ApplicationHeader();
        applicationHeader.setRequestedSystem(request.getAccountDetailsRequestedSystem());
        applicationHeader.setTransactionID(request.getTransactionId());
        accountDetailsRequest.setApplicationHeader(applicationHeader);



        GetAccountDetailsRequestDataHeaderAccountDetails[] accountDetails = new GetAccountDetailsRequestDataHeaderAccountDetails[1];
        accountDetails[0] = new GetAccountDetailsRequestDataHeaderAccountDetails();
        accountDetails[0].setAccountNo("971"+request.getMsisdn().substring(1));

        GetAccountDetailsRequestDataHeaderAddtionalInfo[] additionalInfo = new GetAccountDetailsRequestDataHeaderAddtionalInfo[1];
        additionalInfo[0]=new GetAccountDetailsRequestDataHeaderAddtionalInfo();
        additionalInfo[0].setName("isresourcedescreq");
        additionalInfo[0].setValue("true");

        GetAccountDetailsRequestDataHeader dataHeader = new GetAccountDetailsRequestDataHeader();
        dataHeader.setActionType("GetBalanceAndDate");
        dataHeader.setNoOfAccount("1");
        dataHeader.setModeType("Sync");
        dataHeader.setAccountDetails(accountDetails);
        dataHeader.setAddtionalInfo(additionalInfo);
        accountDetailsRequest.setDataHeader(dataHeader);


        try{
            INCommunicationManagementEndpointBindingStub stub = new INCommunicationManagementEndpointBindingStub();
            GetAccountDetailsResponse response = stub.opGetAccountDetails(accountDetailsRequest);
            String requestXML=stub._getCall().getMessageContext().getRequestMessage().getSOAPPartAsString();
            System.out.println("GetAccountDetailsRequest : "+requestXML);
            String responseXML=stub._getCall().getMessageContext().getResponseMessage().getSOAPPartAsString();
            System.out.println("GetAccountDetailsResponse : "+responseXML);

            if(response !=null && response.getAckMessage() !=null && "SUCCESS".equals(response.getAckMessage().getStatus().getValue())){

                if(response.getResponseHeader() !=null && response.getResponseHeader().getBalanceAndDate() !=null){

                    if("AED".equals(response.getResponseHeader().getBalanceAndDate().getCurrencym1())){

                        String accountValue = response.getResponseHeader().getBalanceAndDate().getAccountValue1();
                        Double accountValueInt = 0.0;
                        if(accountValue !=null && !accountValue.isEmpty()){

                            accountValueInt = Double.parseDouble(accountValue);
                            if(accountValueInt >0){
                                accountValueInt = accountValueInt/100;
                            }
                        }

                        if(accountValueInt <= 5){
                            isMinimumBalanceAvailable = "false";
                            prepaidBalance = accountValueInt.toString();

                            if("en".equalsIgnoreCase(request.getLang())){

                                minimumBalanceMessage = "Dear customer we noticed that your prepaid account credit is about to finish, your current balance is "+prepaidBalance
                                        +" Please select one of the following options to continue.";

                            }else{

                                minimumBalanceMessage = " يرجى تحديد أحد الخيارات التالية للاستمرار." +prepaidBalance + "لاحظنا أن رصيد حسابك المدفوع مقدماً في انخفاض. رصيد حسابك الحالي ";

                            }

                        }


                    }


                }

            }

        }catch (Exception ex){

            ex.printStackTrace();
        }

        AccountDetailDto dto = AccountDetailDto.builder().isMinimumBalanceAvailable(isMinimumBalanceAvailable)
                .prepaidBalance(prepaidBalance).minimumBalanceMessage(minimumBalanceMessage).build();

        return dto;

    }


    @Override
    public void manageSrCreateComplaint(PaymentAndChargesStartProcessRequest request){

        try{

            CreateComplaintRequest jsonRequest = new CreateComplaintRequest();

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String dateString = format.format( new Date() );
            Date   date       = format.parse ( dateString );

            com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchema.ApplicationHeader_xsd.ApplicationHeader header = new com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchema.ApplicationHeader_xsd.ApplicationHeader();
            header.setRequestedSystem("MobileApp");
            jsonRequest.setApplicationHeader(header);

            CreateComplaintRequestDataHeader dataHeader = new CreateComplaintRequestDataHeader();
            dataHeader.setTransactionId(request.getTransactionId());
            dataHeader.setComplaintDescription("QA TC10");
            dataHeader.setRequestDescription("Help and Support");
            dataHeader.setPreferredLanguage("English");
            dataHeader.setRegisteredDate(date);
            dataHeader.setProblemOccuredDate(date);
            dataHeader.setComplaintNatureCode("CNA373_MSS");
            dataHeader.setComplaintTypeCode("CT03_CNA373_MSS");
            dataHeader.setRequestNatureCode("CNA29_Req_Churn");
            dataHeader.setRequestTypeCode("CT02_CNA29_Req_Churn");
            dataHeader.setAccountNumber(request.getMsisdn());
            dataHeader.setChannelCode("IVR");
            dataHeader.setCreatedUserId("MobileApp");
            dataHeader.setSourceChannel("MobileApp");

            CreateComplaintRequestDataHeaderContactDetailsArray[] contactDetailArray = new CreateComplaintRequestDataHeaderContactDetailsArray[1];
            contactDetailArray[0] = new CreateComplaintRequestDataHeaderContactDetailsArray();
            contactDetailArray[0].setContactName("ALTERNATE MANAGED");
            contactDetailArray[0].setContactMode("Mobile");
            contactDetailArray[0].setContactNumber(request.getMsisdn());
            contactDetailArray[0].setPriority("1");
            dataHeader.setContactDetailsArray(contactDetailArray);

            dataHeader.setIsTechnical(2);
            jsonRequest.setDataHeader(dataHeader);


            ManageSRInterfaceBindingStub stub = new ManageSRInterfaceBindingStub();
            CreateComplaintResponse response = stub.opCreateComplaint(jsonRequest);
            String requestXML=stub._getCall().getMessageContext().getRequestMessage().getSOAPPartAsString();
            System.out.println("ManageSRCreateComplaintRequest : "+requestXML);
            String responseXML=stub._getCall().getMessageContext().getResponseMessage().getSOAPPartAsString();
            System.out.println("ManageSRCreateComplaintResponse : "+responseXML);


        }catch (Exception ex){ex.printStackTrace();}



    }


}
