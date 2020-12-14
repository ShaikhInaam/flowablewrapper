package com.InteractionLogging.InteractionLogging.service.impl;

import com.InteractionLogging.InteractionLogging.dto.*;
import com.InteractionLogging.InteractionLogging.entity.ProcessLookups;
import com.InteractionLogging.InteractionLogging.repository.ProcessLookupsRepository;
import com.InteractionLogging.InteractionLogging.request.PaymentAndChargeNavigateProcessRequest;
import com.InteractionLogging.InteractionLogging.request.PaymentAndChargesStartProcessRequest;
import com.InteractionLogging.InteractionLogging.response.PaymentAndChargeNavigateProcessResponse;
import com.InteractionLogging.InteractionLogging.response.PaymentAndChargesStartProcessResponse;
import com.InteractionLogging.InteractionLogging.service.base.PaymentAndChargesService;
import com.InteractionLogging.InteractionLogging.service.base.ThirdPartyCallService;
import com.InteractionLogging.InteractionLogging.utils.RestServiceUtility;
import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.ObjectMapper;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import java.util.LinkedHashMap;

@Service
public class PaymentAndChargesServiceImpl implements PaymentAndChargesService {

    Logger logger = LoggerFactory.getLogger(PaymentAndChargesServiceImpl.class);

    @Autowired
    RestServiceUtility utility;

    @Autowired
    ProcessLookupsRepository processLookupsRepository;

    @Autowired
    ThirdPartyCallService thirdPartyService;

    private String transactionId= "";
    private String msisdn = "";

    @Override
    public PaymentAndChargesStartProcessResponse startProcess(PaymentAndChargesStartProcessRequest request) {

        transactionId = request.getTransactionId();
        msisdn = request.getMsisdn();

        PaymentAndChargesStartProcessResponse processResponse = new PaymentAndChargesStartProcessResponse();

        ObjectMapper mapper = new ObjectMapper();

        logger.info("Retrieve Customer call started\n");
        RetrieveCustomerDto customerDto = thirdPartyService.callRetrieveCustomer(request);
        logger.info("Retrieve Customer call Ended\n");


        logger.info("HLR Action call started\n");
        String hotLineCheck = thirdPartyService.callQueryHLR(request);
        logger.info("HLR Action call Ended\n");

        logger.info("UCMS Complain Details call started\n");
        UCMSComplainDetailsDto ucmsComplainDetailsDto = thirdPartyService.callUCMSComplainDetails(request);
        logger.info("UCMS Complain Details call Ended\n");

        logger.info("Retrieve Order call started\n");
        RetrieveOrderDto retrieveOrderDto = thirdPartyService.callRetrieveOrders(request);
        logger.info("Retrieve Order call Ended\n");


        logger.info("Get Account Details call started\n");
        AccountDetailDto accountDetailDto = thirdPartyService.getAcountDetailsCall(request);
        logger.info("Get Account Details call Ended\n");

        logger.info("\n\n\nAll BE calls are ended\n");

        String url = "http://localhost:8080/flowable-rest/service/runtime/process-instances";
        //String url = "http://dx10463:20001/flowable-rest/service/runtime/process-instances";

        // setting up request
        PayAndCharStartProcessRuntimeProcessInstancesJsonRequest jsonRequest = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest();

        PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables[] variables = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables[34];
        variables[0] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[0].setName("accountProduct");
        variables[0].setValue(request.getAccountProduct());

        variables[1] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[1].setName("chargeType");
        variables[1].setValue(request.getChargeType());

        variables[2] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[2].setName("chargeSubType1");
        variables[2].setValue(request.getChargeSubType1());

        variables[3] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[3].setName("chargeSubType2");
        variables[3].setValue(request.getChargeSubType2());

        variables[4] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[4].setName("chargeBenifitType");
        variables[4].setValue(request.getChargeBenifitType());

        variables[5] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[5].setName("consumerValueSegment");
        variables[5].setValue(customerDto.getConsumerValueSegment());

        variables[6] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[6].setName("nationality");
        variables[6].setValue(customerDto.getNationality());

        variables[7] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[7].setName("customerFrequency");
        variables[7].setValue(request.getCustomerFrequency());

        variables[8] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[8].setName("account");
        variables[8].setValue(request.getMsisdn());

        variables[9] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[9].setName("chargeDate");
        variables[9].setValue(request.getChargeDate());

        variables[10] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[10].setName("ratePlan");
        variables[10].setValue(request.getRatePlan());

        variables[11] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[11].setName("ratePlanType");
        variables[11].setValue(request.getRatePlanType());

        variables[12] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[12].setName("chargeAmount");
        variables[12].setValue(request.getChargeAmount().toString());

        variables[13] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[13].setName("channel");
        variables[13].setValue(request.getChannel());

        variables[14] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[14].setName("transactionId");
        variables[14].setValue(request.getTransactionId());

        variables[15] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[15].setName("accountStatus");
        variables[15].setValue(customerDto.getAccountStatus());

        variables[16] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[16].setName("isRatePlanAvailableStill");
        variables[16].setValue(customerDto.getIsRatePlanAvailableStill());

        variables[17] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[17].setName("creditStatus");
        variables[17].setValue(customerDto.getCreditStatus());

        variables[18] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[18].setName("creditReason");
        variables[18].setValue(customerDto.getCreditReason());

        variables[19] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[19].setName("notesTypeCode");
        variables[19].setValue(customerDto.getNotesTypeCode());

        variables[20] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[20].setName("registrationStatus");
        variables[20].setValue(customerDto.getRegistrationStatus());

        variables[21] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[21].setName("effectiveTill");
        variables[21].setValue(customerDto.getEffectiveTill());

        variables[22] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[22].setName("hotLineCheck");
        variables[22].setValue(hotLineCheck);

        variables[23] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[23].setName("openendComplains");
        variables[23].setValue(ucmsComplainDetailsDto.getOpenendComplains());

        variables[24] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[24].setName("complainNumber");
        variables[24].setValue(ucmsComplainDetailsDto.getComplainNumber());

        variables[25] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[25].setName("openOrders");
        variables[25].setValue(retrieveOrderDto.getOpenOrders());

        variables[26] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[26].setName("orderNumber");
        variables[26].setValue(retrieveOrderDto.getOrderNumber());


        variables[27] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[27].setName("isMinimumBalanceAvailable");
        variables[27].setValue(accountDetailDto.getIsMinimumBalanceAvailable());


        variables[28] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[28].setName("prepaidBalance");
        variables[28].setValue(accountDetailDto.getPrepaidBalance());

        variables[29] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[29].setName("lang");
        variables[29].setValue(request.getLang());

        variables[30] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[30].setName("registrationMessage");
        variables[30].setValue(customerDto.getRegistrationMessage());

        variables[31] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[31].setName("openComplaintsMessage");
        variables[31].setValue(ucmsComplainDetailsDto.getOpenComplaintsMessage());

        variables[32] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[32].setName("openOrdersMessage");
        variables[32].setValue(retrieveOrderDto.getOpenOrdersMessage());

        variables[33] = new PayAndCharStartProcessRuntimeProcessInstancesJsonRequest.Variables();
        variables[33].setName("minimumBalanceMessage");
        variables[33].setValue(accountDetailDto.getMinimumBalanceMessage());


        jsonRequest.setVariables(variables);

        ProcessLookups processLookups = processLookupsRepository.findByProcessKey("PAYMENTS_AND_CHARGES");
        if(processLookups !=null){
            jsonRequest.setProcessDefinitionId(processLookups.getProcessDefinationId());
        }

        jsonRequest.setReturnVariables(true);



        // sending request to server
        LinkedHashMap response = (LinkedHashMap) utility.callPostJson(url, utility.setAuthHeaders(), jsonRequest, PayAndCharStartProcessRuntimeProcessInstancesJsonResponse.class);
        PayAndCharStartProcessRuntimeProcessInstancesJsonResponse res = null;
        if(response !=null){
            Boolean isFormActions = false;
            res = mapper.convertValue(response, new TypeReference<PayAndCharStartProcessRuntimeProcessInstancesJsonResponse>(){});
            String processInstanceId = "";

            if(res!=null){
                processInstanceId = res.getId();
            }


            if(res!=null && res.getVariables() !=null && res.getVariables().length >0){



                for(int j=0; j<res.getVariables().length; j++){

                    if(res.getVariables()[j].getName().equalsIgnoreCase("formActions") && res.getVariables()[j].getValue() !=null){

                        isFormActions = true;

                        if(res.getVariables()[j].getValue().contains("#:#")){
                            processResponse.setFormActions(res.getVariables()[j].getValue().split("#:#"));

                        }else{
                            processResponse.setFormActions(new String[]{res.getVariables()[j].getValue()});
                        }
                    }

                }




                for(int i=0; i<res.getVariables().length; i++){



                    if(isFormActions && res.getVariables()[i].getName().equalsIgnoreCase("formCode")){

                        processResponse.setFormCode(res.getVariables()[i].getValue());
                    }

                    if(isFormActions && res.getVariables()[i].getName().equalsIgnoreCase("formTitle")){

                        processResponse.setFormTitle(res.getVariables()[i].getValue());
                    }

                    if(isFormActions && res.getVariables()[i].getName().equalsIgnoreCase("action")){

                        processResponse.setAction(res.getVariables()[i].getValue());
                    }

                    if(isFormActions && res.getVariables()[i].getName().equalsIgnoreCase("message")){

                        processResponse.setMessage(res.getVariables()[i].getValue());
                    }

                }
            }


            if(isFormActions && !processInstanceId.isEmpty()){

                processResponse.setProcessInstanceId(processInstanceId);

                PayAndCharProcessRuntimeTasksJsonResponse runtimeTasksJsonResponse = getProcessInstanceIdDetails(processInstanceId);
                if(runtimeTasksJsonResponse !=null && runtimeTasksJsonResponse.getData() !=null && runtimeTasksJsonResponse.getData().length >0){

                    processResponse.setTaskId(runtimeTasksJsonResponse.getData()[0].getId());
                }
            }

        }

        return processResponse;
    }



    private PayAndCharProcessRuntimeTasksJsonResponse getProcessInstanceIdDetails(String processInstanceId){

        ObjectMapper mapper = new ObjectMapper();

        String url = "http://localhost:8080/flowable-rest/service/runtime/tasks?processInstanceId="+processInstanceId;
        //String url = "http://dx10463:20001/flowable-rest/service/runtime/tasks?processInstanceId="+processInstanceId;

        LinkedHashMap response = (LinkedHashMap) utility.callGetJson(url, PayAndCharProcessRuntimeTasksJsonResponse.class);
        PayAndCharProcessRuntimeTasksJsonResponse res = null;
        if(response!=null){
            res = mapper.convertValue(response, new TypeReference<PayAndCharProcessRuntimeTasksJsonResponse>(){});

            return res;
        }

        return null;

    }







    @Override
    public PaymentAndChargeNavigateProcessResponse navigateProcess(PaymentAndChargeNavigateProcessRequest request) {

        ObjectMapper mapper = new ObjectMapper();
        String url = "http://localhost:8080/flowable-rest/service/runtime/tasks/"+request.getTaskId();
        //String url = "http://dx10463:20001/flowable-rest/service/runtime/tasks/"+request.getTaskId();

        PaymentAndChargeNavigateProcessResponse response = new PaymentAndChargeNavigateProcessResponse();

        PayAndCharNavProcessRunTaskJsonRequest jsonRequest = new PayAndCharNavProcessRunTaskJsonRequest();
        jsonRequest.setAction("complete");

        PayAndCharNavProcessRunTaskJsonRequest.Variables[] variables = new PayAndCharNavProcessRunTaskJsonRequest.Variables[2];
        if(request.getSelectedData() !=null && request.getSelectedData().length >0){

            for(int i = 0; i<request.getSelectedData().length ; i++){

                if(request.getSelectedData()[i].getName().equalsIgnoreCase("action")){

                    variables[0] = new PayAndCharNavProcessRunTaskJsonRequest.Variables();
                    variables[0].setName("action");
                    variables[0].setValue(request.getSelectedData()[i].getValue());


                }
            }

            variables[1] = new PayAndCharNavProcessRunTaskJsonRequest.Variables();
            variables[1].setName("selectedScenario");
            variables[1].setValue(request.getScenario());



            jsonRequest.setVariables(variables);



        }

        LinkedHashMap res = (LinkedHashMap) utility.callPostJson(url, utility.setAuthHeaders(), jsonRequest, PaymentAndChargeNavigateProcessResponse.class);
        //PayAndCharNavProcessRunTaskJsonResponse jsonResponse = null;
        //if(res!=null){

            PayAndCharProcessRuntimeTasksJsonResponse runtimeTasksJsonResponse = getProcessInstanceIdDetailsForNavigation(request.getProcessInstanceId());
            if(runtimeTasksJsonResponse !=null && runtimeTasksJsonResponse.getData().length >0){
                Boolean isFormActions = false;
                String faqType = "";
                String faqKey = "";
                String complaintNatureCode = "";
                String complaintTypeCode = "";
                String skillNo = "";
                String CBAType = "";
                response.setFormCode("NOTNULL");

                    if(runtimeTasksJsonResponse.getData()[0].getVariables() !=null && runtimeTasksJsonResponse.getData()[0].getVariables().length >0){

                        for(int k=0; k<runtimeTasksJsonResponse.getData()[0].getVariables().length; k++){

                            if(runtimeTasksJsonResponse.getData()[0].getVariables()[k].getName().equalsIgnoreCase("formActions")){


                                if(runtimeTasksJsonResponse.getData()[0].getVariables()[k].getValue() != null &&
                                        runtimeTasksJsonResponse.getData()[0].getVariables()[k].getValue().contains("#:#")){
                                    isFormActions = true;
                                    response.setFormActions(runtimeTasksJsonResponse.getData()[0].getVariables()[k].getValue().split("#:#"));

                                }else if(runtimeTasksJsonResponse.getData()[0].getVariables()[k].getValue() != null){
                                    isFormActions = true;
                                    response.setFormActions(new String[]{runtimeTasksJsonResponse.getData()[0].getVariables()[k].getValue()});
                                }

                            }

                        }


                        for(int j=0; j<runtimeTasksJsonResponse.getData()[0].getVariables().length; j++){



                            if(isFormActions && runtimeTasksJsonResponse.getData()[0].getVariables()[j].getName().equalsIgnoreCase("formCode")){
                                response.setFormCode(runtimeTasksJsonResponse.getData()[0].getVariables()[j].getValue());

                                if("WAIVERS_PASSED".equalsIgnoreCase(response.getFormCode())){

                                    PaymentAndChargesStartProcessRequest req = new PaymentAndChargesStartProcessRequest();
                                    req.setTransactionId(this.transactionId);
                                    req.setMsisdn(this.msisdn);
                                    thirdPartyService.manageSrCreateComplaint(req);
                                }
                            }

                            if(isFormActions && runtimeTasksJsonResponse.getData()[0].getVariables()[j].getName().equalsIgnoreCase("formTitle")){
                                response.setFormCode(runtimeTasksJsonResponse.getData()[0].getVariables()[j].getValue());
                            }

                            if(isFormActions && runtimeTasksJsonResponse.getData()[0].getVariables()[j].getName().equalsIgnoreCase("faqType")){
                                faqType = runtimeTasksJsonResponse.getData()[0].getVariables()[j].getValue();
                            }

                            if(isFormActions && runtimeTasksJsonResponse.getData()[0].getVariables()[j].getName().equalsIgnoreCase("faqKey")){
                                faqKey = runtimeTasksJsonResponse.getData()[0].getVariables()[j].getValue();
                            }

                            if(isFormActions && runtimeTasksJsonResponse.getData()[0].getVariables()[j].getName().equalsIgnoreCase("complaintNatureCode")){
                                complaintNatureCode = runtimeTasksJsonResponse.getData()[0].getVariables()[j].getValue();
                            }

                            if(isFormActions && runtimeTasksJsonResponse.getData()[0].getVariables()[j].getName().equalsIgnoreCase("complaintTypeCode")){
                                complaintTypeCode = runtimeTasksJsonResponse.getData()[0].getVariables()[j].getValue();
                            }

                            if(isFormActions && runtimeTasksJsonResponse.getData()[0].getVariables()[j].getName().equalsIgnoreCase("skillNo")){
                                skillNo = runtimeTasksJsonResponse.getData()[0].getVariables()[j].getValue();
                            }
                            if(isFormActions && runtimeTasksJsonResponse.getData()[0].getVariables()[j].getName().equalsIgnoreCase("CBAType")){
                                CBAType = runtimeTasksJsonResponse.getData()[0].getVariables()[j].getValue();
                            }

                        }

                        if(response.getFormCode() != null && response.getFormCode().equalsIgnoreCase("FAQs") || response.getFormCode().equalsIgnoreCase("SUBS_EVIDENCE")
                                || response.getFormCode().equalsIgnoreCase("USAGEANALYSIS_FRM")){

                            response.setFaqType(faqType);
                            response.setFaqKey(faqKey);
                        }


                        if(response.getFormCode() != null && response.getFormCode().equalsIgnoreCase("FRM_FAILOVER")){

                            response.setFaqType(faqType);
                            response.setFaqKey(faqKey);
                            response.setComplaintNatureCode(complaintNatureCode);
                            response.setComplaintTypeCode(complaintTypeCode);
                            response.setSkillNo(skillNo);
                            response.setCBAType(CBAType);

                        }

                    }


                    if(isFormActions){
                        response.setTaskId(runtimeTasksJsonResponse.getData()[0].getId());
                    }

                    if(!isFormActions){
                        response.setFormCode(null);
                    }

                }

           // }

        return response;
    }

    private PayAndCharProcessRuntimeTasksJsonResponse getProcessInstanceIdDetailsForNavigation(String processInstanceId){

        ObjectMapper mapper = new ObjectMapper();
        String url = "http://localhost:8080/flowable-rest/service/runtime/tasks?processInstanceId="+processInstanceId+"&includeProcessVariables=true";
       //String url = "http://dx10463:20001/flowable-rest/service/runtime/tasks?processInstanceId="+processInstanceId+"&includeProcessVariables=true";

        LinkedHashMap response = (LinkedHashMap) utility.callGetJson(url, PayAndCharProcessRuntimeTasksJsonResponse.class);
        PayAndCharProcessRuntimeTasksJsonResponse res = null;
        if(response!=null){
            res = mapper.convertValue(response, new TypeReference<PayAndCharProcessRuntimeTasksJsonResponse>(){});

            return res;
        }

        return null;

    }








}
