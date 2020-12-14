/**
 * INCommunicationManagementEndpointBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.xmlns._1433759742497;

import java.net.MalformedURLException;
import java.net.URL;

public class INCommunicationManagementEndpointBindingStub extends org.apache.axis.client.Stub implements com.example.xmlns._1433759742497.INCommunicationManagement {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OpUpdateCSProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "UpdateCSProfileRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", ">UpdateCSProfileRequest"), ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">UpdateCSProfileResponse"));
        oper.setReturnClass(ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "UpdateCSProfileResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", "AckMessage"),
                      "ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage",
                      new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", ">AckMessage"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OpGetDADetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsRequest.xsd", "GetDADetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsRequest.xsd", ">GetDADetailsRequest"), ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsResponse.xsd", ">GetDADetailsResponse"));
        oper.setReturnClass(ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsResponse_xsd.GetDADetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsResponse.xsd", "GetDADetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", "AckMessage"),
                      "ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage",
                      new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", ">AckMessage"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OpGetSuperNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberRequest.xsd", "GetSuperNumberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberRequest.xsd", ">GetSuperNumberRequest"), ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberRequest_xsd.GetSuperNumberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberResponse.xsd", ">GetSuperNumberResponse"));
        oper.setReturnClass(ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberResponse_xsd.GetSuperNumberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberResponse.xsd", "GetSuperNumberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", "AckMessage"),
                      "ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage",
                      new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", ">AckMessage"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OpGetCardDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetCardDetailsRequest.xsd", "GetCardDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetCardDetailsRequest.xsd", ">GetCardDetailsRequest"), ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsRequest_xsd.GetCardDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetCardDetailsResponse.xsd", ">GetCardDetailsResponse"));
        oper.setReturnClass(ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsResponse_xsd.GetCardDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetCardDetailsResponse.xsd", "GetCardDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", "AckMessage"),
                      "ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage",
                      new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", ">AckMessage"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OpSubmitVoucherAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionRequest.xsd", "SubmitVoucherActionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionRequest.xsd", ">SubmitVoucherActionRequest"), ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionRequest_xsd.SubmitVoucherActionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionResponse.xsd", ">SubmitVoucherActionResponse"));
        oper.setReturnClass(ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionResponse.xsd", "SubmitVoucherActionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", "AckMessage"),
                      "ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage",
                      new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", ">AckMessage"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OpGetAccountDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsRequest.xsd", "GetAccountDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsRequest.xsd", ">GetAccountDetailsRequest"), ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsRequest_xsd.GetAccountDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">GetAccountDetailsResponse"));
        oper.setReturnClass(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "GetAccountDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", "AckMessage"),
                      "ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage",
                      new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", ">AckMessage"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OpGetRechargeDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsRequest.xsd", "GetRechargeDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsRequest.xsd", ">GetRechargeDetailsRequest"), ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsRequest_xsd.GetRechargeDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsResponse.xsd", ">GetRechargeDetailsResponse"));
        oper.setReturnClass(ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsResponse.xsd", "GetRechargeDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", "AckMessage"),
                      "ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage",
                      new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", ">AckMessage"), 
                      true
                     ));
        _operations[6] = oper;

    }

    public INCommunicationManagementEndpointBindingStub() throws org.apache.axis.AxisFault {
         this(null);

        try {
            super.cachedEndpoint = new URL("http://localhost:8076/mockINCommunicationManagementEndpointBinding");
            //super.cachedEndpoint = new URL("http://tibcononprd.etisalat.corp.ae:9071/Middleware/INCommunicationManagement");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    public INCommunicationManagementEndpointBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public INCommunicationManagementEndpointBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsRequest.xsd", ">>>GetAccountDetailsRequest>DataHeader>AccountDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsRequest_xsd.GetAccountDetailsRequestDataHeaderAccountDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsRequest.xsd", ">>>GetAccountDetailsRequest>DataHeader>AddtionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsRequest_xsd.GetAccountDetailsRequestDataHeaderAddtionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsRequest.xsd", ">>GetAccountDetailsRequest>DataHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsRequest_xsd.GetAccountDetailsRequestDataHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsRequest.xsd", ">GetAccountDetailsRequest");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsRequest_xsd.GetAccountDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>offerInformationList>attributeInformationList>attributeValueDecimal");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationListAttributeInformationListAttributeValueDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>>OfferInformation>TreeParameterSetInformationList>TreeParameterSetInformation>TreeParameterInformation>TreeParameterValueSchedule>ScheduledDayOfMonthList");
            cachedSerQNames.add(qName);
            cls = String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "ScheduledDayOfMonth");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>>OfferInformation>TreeParameterSetInformationList>TreeParameterSetInformation>TreeParameterInformation>TreeParameterValueSchedule>ScheduledDayOfWeekList");
            cachedSerQNames.add(qName);
            cls = String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "ScheduledDayOfWeek");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>>OfferInformation>TreeParameterSetInformationList>TreeParameterSetInformation>TreeParameterInformation>TreeParameterValueSchedule>ScheduledMonthList");
            cachedSerQNames.add(qName);
            cls = String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "ScheduledMonth");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>offerInformationList>attributeInformationList");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationListAttributeInformationList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>pamInformationList>pamInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate>dedicatedAccountInformation>subDedicatedAccountInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>GetAccountDetailsResponse>ResponseHeader>GetAccumulator>chargingResultInformation>chargingResultInformationService");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulatorChargingResultInformationChargingResultInformationService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>GetAccountDetailsResponse>ResponseHeader>GetUsageThresholdsAndCounter>UsageCounterUsageThresholdInformation>UsageThresholdInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformationUsageThresholdInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>OfferInformation>TreeParameterSetInformationList>TreeParameterSetInformation>TreeParameterInformation>TreeParameterValueDateRange");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>OfferInformation>TreeParameterSetInformationList>TreeParameterSetInformation>TreeParameterInformation>TreeParameterValueDecimal");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>OfferInformation>TreeParameterSetInformationList>TreeParameterSetInformation>TreeParameterInformation>TreeParameterValueSchedule");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>accountFlags");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>AccountFlagsBefore");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlagsBefore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>communityInformationCurrent");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>offerInformationList");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>pamInformationList");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>pamInformationList>pamInformation");
            qName2 = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "pamInformation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>serviceOfferings");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate>accountFlagsAfter");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateAccountFlagsAfter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate>accountFlagsBefore");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateAccountFlagsBefore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate>aggregatedBalanceInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateAggregatedBalanceInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate>ChargingResultInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate>dedicatedAccountInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate>offerInformationList");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>GetAccumulator>accountFlagsAfter");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulatorAccountFlagsAfter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>GetAccumulator>accountFlagsBefore");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulatorAccountFlagsBefore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>GetAccumulator>accumelatorInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>GetAccumulator>chargingResultInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulatorChargingResultInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>GetFaFList>fafInformationList");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>GetUsageThresholdsAndCounter>UsageCounterUsageThresholdInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>OfferInformation>TreeParameterSetInformationList>TreeParameterSetInformation>TreeParameterInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>GetAccountDetailsResponse>ResponseHeader>AccountDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>GetAccountDetailsResponse>ResponseHeader>AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>GetAccountDetailsResponse>ResponseHeader>GetAccumulator");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>GetAccountDetailsResponse>ResponseHeader>GetFaFList");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetFaFList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>GetAccountDetailsResponse>ResponseHeader>GetUsageThresholdsAndCounter");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>GetUsageThresholdsAndCounter>UsageCounterUsageThresholdInformation");
            qName2 = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "UsageCounterUsageThresholdInformation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>OfferInformation>aggregatedOfferInformation>aggregatedBalanceInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationAggregatedOfferInformationAggregatedBalanceInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>OfferInformation>attributeInformationList>attributeValueDecimal");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationAttributeInformationListAttributeValueDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>OfferInformation>TreeParameterSetInformationList>TreeParameterSetInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationTreeParameterSetInformationListTreeParameterSetInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>OfferInformation>usageCounterUsageThresholdInformation>usageThresholdInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>GetAccountDetailsResponse>ResponseHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>OfferInformation>aggregatedOfferInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationAggregatedOfferInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>OfferInformation>attributeInformationList");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationAttributeInformationList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>OfferInformation>dedicatedAccountInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationDedicatedAccountInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>OfferInformation>fafInformationList");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationFafInformationList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>OfferInformation>TreeParameterSetInformationList");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationTreeParameterSetInformationListTreeParameterSetInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>OfferInformation>TreeParameterSetInformationList>TreeParameterSetInformation");
            qName2 = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "TreeParameterSetInformation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>OfferInformation>usageCounterUsageThresholdInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationUsageCounterUsageThresholdInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">GetAccountDetailsResponse");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">OfferInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetCardDetailsRequest.xsd", ">>>GetCardDetailsRequest>DataHeader>AddtionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsRequest_xsd.GetCardDetailsRequestDataHeaderAddtionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetCardDetailsRequest.xsd", ">>GetCardDetailsRequest>DataHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsRequest_xsd.GetCardDetailsRequestDataHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetCardDetailsRequest.xsd", ">GetCardDetailsRequest");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsRequest_xsd.GetCardDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetCardDetailsResponse.xsd", ">>>GetCardDetailsResponse>ResponseHeader>AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsResponse_xsd.GetCardDetailsResponseResponseHeaderAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetCardDetailsResponse.xsd", ">>GetCardDetailsResponse>ResponseHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsResponse_xsd.GetCardDetailsResponseResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetCardDetailsResponse.xsd", ">GetCardDetailsResponse");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsResponse_xsd.GetCardDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsRequest.xsd", ">>>GetDADetailsRequest>DataHeader>AddtionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequestDataHeaderAddtionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsRequest.xsd", ">>>GetDADetailsRequest>DataHeader>DADetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequestDataHeaderDADetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsRequest.xsd", ">>GetDADetailsRequest>DataHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequestDataHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsRequest.xsd", ">GetDADetailsRequest");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsResponse.xsd", ">>>GetDADetailsResponse>ResponseData>AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsResponse_xsd.GetDADetailsResponseResponseDataAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsResponse.xsd", ">>>GetDADetailsResponse>ResponseData>DADetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsResponse_xsd.GetDADetailsResponseResponseDataDADetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsResponse.xsd", ">>GetDADetailsResponse>ResponseData");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsResponse_xsd.GetDADetailsResponseResponseData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsResponse.xsd", ">GetDADetailsResponse");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsResponse_xsd.GetDADetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsRequest.xsd", ">>>GetRechargeDetailsRequest>DataHeader>AddtionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsRequest_xsd.GetRechargeDetailsRequestDataHeaderAddtionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsRequest.xsd", ">>GetRechargeDetailsRequest>DataHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsRequest_xsd.GetRechargeDetailsRequestDataHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsRequest.xsd", ">GetRechargeDetailsRequest");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsRequest_xsd.GetRechargeDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsResponse.xsd", ">>>GetRechargeDetailsResponse>ResponseHeader>AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponseResponseHeaderAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsResponse.xsd", ">>>GetRechargeDetailsResponse>ResponseHeader>BalanceDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponseResponseHeaderBalanceDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsResponse.xsd", ">>GetRechargeDetailsResponse>ResponseHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponseResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsResponse.xsd", ">GetRechargeDetailsResponse");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberRequest.xsd", ">>GetSuperNumberRequest>DataHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberRequest_xsd.GetSuperNumberRequestDataHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberRequest.xsd", ">GetSuperNumberRequest");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberRequest_xsd.GetSuperNumberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberResponse.xsd", ">>>>GetSuperNumberResponse>ResponseData>OfferDetails>SlotDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberResponse_xsd.GetSuperNumberResponseResponseDataOfferDetailsSlotDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberResponse.xsd", ">>>GetSuperNumberResponse>ResponseData>OfferDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberResponse_xsd.GetSuperNumberResponseResponseDataOfferDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberResponse.xsd", ">>GetSuperNumberResponse>ResponseData");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberResponse_xsd.GetSuperNumberResponseResponseData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberResponse.xsd", ">GetSuperNumberResponse");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberResponse_xsd.GetSuperNumberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionRequest.xsd", ">>>SubmitVoucherActionRequest>DataHeader>AddtionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionRequest_xsd.SubmitVoucherActionRequestDataHeaderAddtionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionRequest.xsd", ">>>SubmitVoucherActionRequest>DataHeader>VoucherDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionRequest_xsd.SubmitVoucherActionRequestDataHeaderVoucherDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionRequest.xsd", ">>SubmitVoucherActionRequest>DataHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionRequest_xsd.SubmitVoucherActionRequestDataHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionRequest.xsd", ">SubmitVoucherActionRequest");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionRequest_xsd.SubmitVoucherActionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionResponse.xsd", ">>>SubmitVoucherActionResponse>ResponseHeader>AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponseResponseHeaderAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionResponse.xsd", ">>>SubmitVoucherActionResponse>ResponseHeader>VoucherDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponseResponseHeaderVoucherDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionResponse.xsd", ">>SubmitVoucherActionResponse>ResponseHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponseResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionResponse.xsd", ">SubmitVoucherActionResponse");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", ">>>>UpdateCSProfileRequest>DataHeader>UpdateServiceClass>ChargingRequestInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", ">>>UpdateCSProfileRequest>DataHeader>AccountDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderAccountDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", ">>>UpdateCSProfileRequest>DataHeader>AddtionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderAddtionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", ">>>UpdateCSProfileRequest>DataHeader>DeleteOffer");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderDeleteOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", ">>>UpdateCSProfileRequest>DataHeader>UpdateServiceClass");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderUpdateServiceClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", ">>UpdateCSProfileRequest>DataHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", ">UpdateCSProfileRequest");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer>OfferInformation>AggregatedOfferInformation>AggregatedBalanceInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationAggregatedOfferInformationAggregatedBalanceInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer>OfferInformation>UsageCounterUsageThresholdInformation>UsageThresholdInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer>OfferInformation>AggregatedOfferInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationAggregatedOfferInformationAggregatedBalanceInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer>OfferInformation>AggregatedOfferInformation>AggregatedBalanceInformation");
            qName2 = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "AggregatedBalanceInformation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer>OfferInformation>DedicatedAccountInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationDedicatedAccountInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer>OfferInformation>FafInformationList");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer>OfferInformation>UsageCounterUsageThresholdInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>>UpdateCSProfileResponse>ResponseHeader>UpdateServiceClass>ChargingResultInformation>ChargingResultInformationService");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderUpdateServiceClassChargingResultInformationChargingResultInformationService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer>OfferInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>UpdateCSProfileResponse>ResponseHeader>UpdateServiceClass>AccountFlagsAfter");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsAfter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>UpdateCSProfileResponse>ResponseHeader>UpdateServiceClass>AccountFlagsBefore");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>UpdateCSProfileResponse>ResponseHeader>UpdateServiceClass>ChargingResultInformation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderUpdateServiceClassChargingResultInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>UpdateCSProfileResponse>ResponseHeader>AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderDeleteOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>UpdateCSProfileResponse>ResponseHeader>UpdateServiceClass");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderUpdateServiceClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>UpdateCSProfileResponse>ResponseHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">UpdateCSProfileResponse");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", ">>AckMessage>Status");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessageStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", ">AckMessage");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/ApplicationHeader.xsd", ">ApplicationHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.SharedResources.Common.ApplicationHeader_xsd.ApplicationHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/Common.xsd", ">AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            _call.setProperty(USERNAME_PROPERTY, "digitalapp");
            _call.setProperty(PASSWORD_PROPERTY, "digitalapp");
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponse opUpdateCSProfile(ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequest updateCSProfileRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/Middleware/INCommunicationManagement/UpdateCSProfile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OpUpdateCSProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {updateCSProfileRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponse) _resp;
            } catch (Exception _exception) {
                return (ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage) {
              throw (ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsResponse_xsd.GetDADetailsResponse opGetDADetails(ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequest getDADetailsRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/Middleware/INCommunicationManagement/GetDADetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OpGetDADetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getDADetailsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsResponse_xsd.GetDADetailsResponse) _resp;
            } catch (Exception _exception) {
                return (ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsResponse_xsd.GetDADetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsResponse_xsd.GetDADetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage) {
              throw (ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberResponse_xsd.GetSuperNumberResponse opGetSuperNumber(ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberRequest_xsd.GetSuperNumberRequest getSuperNumberRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/Middleware/INCommunicationManagement/GetSuperNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OpGetSuperNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getSuperNumberRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberResponse_xsd.GetSuperNumberResponse) _resp;
            } catch (Exception _exception) {
                return (ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberResponse_xsd.GetSuperNumberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberResponse_xsd.GetSuperNumberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage) {
              throw (ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsResponse_xsd.GetCardDetailsResponse opGetCardDetails(ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsRequest_xsd.GetCardDetailsRequest getCardDetailsRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/Services/INCommunicationManagementHttps.serviceagent//OpGetCardDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OpGetCardDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getCardDetailsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsResponse_xsd.GetCardDetailsResponse) _resp;
            } catch (Exception _exception) {
                return (ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsResponse_xsd.GetCardDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsResponse_xsd.GetCardDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage) {
              throw (ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponse opSubmitVoucherAction(ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionRequest_xsd.SubmitVoucherActionRequest submitVoucherActionRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/Middleware/INCommunicationManagement/SubmitVoucherAction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OpSubmitVoucherAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {submitVoucherActionRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponse) _resp;
            } catch (Exception _exception) {
                return (ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage) {
              throw (ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponse opGetAccountDetails(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsRequest_xsd.GetAccountDetailsRequest getAccountDetailsRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/Middleware/INCommunicationManagement/GetAccountDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OpGetAccountDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getAccountDetailsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponse) _resp;
            } catch (Exception _exception) {
                return (ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage) {
              throw (ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponse opGetRechargeDetails(ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsRequest_xsd.GetRechargeDetailsRequest getRechargeDetailsRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/Middleware/INCommunicationManagement/GetRechargeDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OpGetRechargeDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getRechargeDetailsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponse) _resp;
            } catch (Exception _exception) {
                return (ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage) {
              throw (ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
