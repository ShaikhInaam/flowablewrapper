/**
 * ManageSRInterfaceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.xmlns._1414677435101;

import java.net.MalformedURLException;
import java.net.URL;

public class ManageSRInterfaceBindingStub extends org.apache.axis.client.Stub implements ManageSRInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("opGetNatureAndTypeDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsRequest.xsd", "GetNatureAndTypeDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsRequest.xsd", ">GetNatureAndTypeDetailsRequest"), ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsRequest_xsd.GetNatureAndTypeDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">GetNatureAndTypeDetailsResponse"));
        oper.setReturnClass(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "GetNatureAndTypeDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/ManageSRFaultResponse.xsd", "ManageSRFault"),
                      "ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault",
                      new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/ManageSRFaultResponse.xsd", ">ManageSRFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("opGetThirdPartyComplaintDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsRequest.xsd", "GetThirdPartyComplaintDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsRequest.xsd", ">GetThirdPartyComplaintDtlsRequest"), ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsRequest_xsd.GetThirdPartyComplaintDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", ">GetThirdPartyComplaintDtlsResponse"));
        oper.setReturnClass(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "GetThirdPartyComplaintDtlsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/ManageSRFaultResponse.xsd", "ManageSRFault"),
                      "ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault",
                      new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/ManageSRFaultResponse.xsd", ">ManageSRFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OpUpdateComplaint");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintRequest.xsd", "UpdateComplaintDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintRequest.xsd", ">UpdateComplaintDtlsRequest"), ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.UpdateComplaintRequest_xsd.UpdateComplaintDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintResponse.xsd", ">UpdateComplaintDtlsResponse"));
        oper.setReturnClass(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.UpdateComplaintResponse_xsd.UpdateComplaintDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintResponse.xsd", "UpdateComplaintDtlsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/ManageSRFaultResponse.xsd", "ManageSRFault"),
                      "ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault",
                      new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/ManageSRFaultResponse.xsd", ">ManageSRFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("opCreateComplaint");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "CreateComplaintRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", ">CreateComplaintRequest"), ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd.CreateComplaintRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintResponse.xsd", ">CreateComplaintResponse"));
        oper.setReturnClass(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintResponse_xsd.CreateComplaintResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintResponse.xsd", "CreateComplaintResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/ManageSRFaultResponse.xsd", "ManageSRFault"),
                      "ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault",
                      new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/ManageSRFaultResponse.xsd", ">ManageSRFault"), 
                      true
                     ));
        _operations[3] = oper;

    }

    public ManageSRInterfaceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
        try {
            super.cachedEndpoint = new URL("http://localhost:8073/mockManageSRInterfaceBinding");
            //super.cachedEndpoint = new URL("https://tibcononprd.etisalat.corp.ae:9059/BusinessServices/ManageSRService");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public ManageSRInterfaceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ManageSRInterfaceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", ">>>CreateComplaintRequest>DataHeader>AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd.CreateComplaintRequestDataHeaderAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", ">>>CreateComplaintRequest>DataHeader>AdjustmentDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd.CreateComplaintRequestDataHeaderAdjustmentDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", ">>>CreateComplaintRequest>DataHeader>AttachmentDetailsArray");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd.CreateComplaintRequestDataHeaderAttachmentDetailsArray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", ">>>CreateComplaintRequest>DataHeader>ContactDetailsArray");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd.CreateComplaintRequestDataHeaderContactDetailsArray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", ">>>CreateComplaintRequest>DataHeader>ElifeTechnicalDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd.CreateComplaintRequestDataHeaderElifeTechnicalDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", ">>CreateComplaintRequest>DataHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd.CreateComplaintRequestDataHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", ">CreateComplaintRequest");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd.CreateComplaintRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintResponse.xsd", ">>CreateComplaintResponse>AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintResponse_xsd.CreateComplaintResponseAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintResponse.xsd", ">CreateComplaintResponse");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintResponse_xsd.CreateComplaintResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsRequest.xsd", ">>>GetNatureAndTypeDetailsRequest>DataHeader>AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsRequest_xsd.GetNatureAndTypeDetailsRequestDataHeaderAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsRequest.xsd", ">>>GetNatureAndTypeDetailsRequest>DataHeader>RefundDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsRequest_xsd.GetNatureAndTypeDetailsRequestDataHeaderRefundDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsRequest.xsd", ">>GetNatureAndTypeDetailsRequest>DataHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsRequest_xsd.GetNatureAndTypeDetailsRequestDataHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsRequest.xsd", ">GetNatureAndTypeDetailsRequest");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsRequest_xsd.GetNatureAndTypeDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">>>GetNatureAndTypeDetailsResponse>DOPDetails>Nature");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponseDOPDetailsNature.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">>>GetNatureAndTypeDetailsResponse>DOPDetails>Type");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponseDOPDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">>>GetNatureAndTypeDetailsResponse>GetNatureAndTypeDetails>ComplaintTypeDetailsArray");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">>>GetNatureAndTypeDetailsResponse>GetNatureAndTypeDetails>RequestTypeDetailsArray");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">>GetNatureAndTypeDetailsResponse>DOPDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponseDOPDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">>GetNatureAndTypeDetailsResponse>GetNatureAndTypeDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">GetNatureAndTypeDetailsResponse");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsRequest.xsd", ">>>GetThirdPartyComplaintDtlsRequest>DataHeader>AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsRequest_xsd.GetThirdPartyComplaintDtlsRequestDataHeaderAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsRequest.xsd", ">>GetThirdPartyComplaintDtlsRequest>DataHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsRequest_xsd.GetThirdPartyComplaintDtlsRequestDataHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsRequest.xsd", ">GetThirdPartyComplaintDtlsRequest");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsRequest_xsd.GetThirdPartyComplaintDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", ">>>GetThirdPartyComplaintDtlsResponse>ComplaintDetailsArray>AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", ">>>GetThirdPartyComplaintDtlsResponse>ComplaintDetailsArray>ContactDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", ">>GetThirdPartyComplaintDtlsResponse>ComplaintDetailsArray");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", ">GetThirdPartyComplaintDtlsResponse");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/ManageSRFaultResponse.xsd", ">ManageSRFault");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintRequest.xsd", ">>>UpdateComplaintDtlsRequest>DataHeader>AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.UpdateComplaintRequest_xsd.UpdateComplaintDtlsRequestDataHeaderAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintRequest.xsd", ">>UpdateComplaintDtlsRequest>DataHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.UpdateComplaintRequest_xsd.UpdateComplaintDtlsRequestDataHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintRequest.xsd", ">UpdateComplaintDtlsRequest");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.UpdateComplaintRequest_xsd.UpdateComplaintDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintResponse.xsd", ">UpdateComplaintDtlsResponse");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.UpdateComplaintResponse_xsd.UpdateComplaintDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.tibco.com/schemas/Middleware/SharedResources/Schemas/CommonSchema/ApplicationHeader.xsd", ">ApplicationHeader");
            cachedSerQNames.add(qName);
            cls = com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchema.ApplicationHeader_xsd.ApplicationHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.tibco.com/schemas/Middleware/SharedResources/Schemas/CommonSchemas/AckMessage.xsd", ">AckMessage");
            cachedSerQNames.add(qName);
            cls = com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchemas.AckMessage_xsd.AckMessage.class;
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
            _call.setProperty(USERNAME_PROPERTY, "mobileapp");
            _call.setProperty(PASSWORD_PROPERTY, "mobileapp");
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponse opGetNatureAndTypeDetails(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsRequest_xsd.GetNatureAndTypeDetailsRequest getNatureAndTypeDetailsRequest) throws java.rmi.RemoteException, ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/BusinessServices/ManageSRService.serviceagent/ManageSRInterface/opGetNatureAndTypeDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "opGetNatureAndTypeDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getNatureAndTypeDetailsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponse) _resp;
            } catch (Exception _exception) {
                return (ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault) {
              throw (ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponse opGetThirdPartyComplaintDtls(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsRequest_xsd.GetThirdPartyComplaintDtlsRequest getThirdPartyComplaintDtlsRequest) throws java.rmi.RemoteException, ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/BusinessServices/ManageSRService.serviceagent/ManageSRInterface/opGetThirdPartyComplaintDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "opGetThirdPartyComplaintDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getThirdPartyComplaintDtlsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponse) _resp;
            } catch (Exception _exception) {
                return (ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault) {
              throw (ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.UpdateComplaintResponse_xsd.UpdateComplaintDtlsResponse opUpdateComplaint(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.UpdateComplaintRequest_xsd.UpdateComplaintDtlsRequest updateComplaintRequest) throws java.rmi.RemoteException, ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/BusinessServices/ManageSRService.serviceagent//OpUpdateComplaint");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OpUpdateComplaint"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {updateComplaintRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.UpdateComplaintResponse_xsd.UpdateComplaintDtlsResponse) _resp;
            } catch (Exception _exception) {
                return (ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.UpdateComplaintResponse_xsd.UpdateComplaintDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.UpdateComplaintResponse_xsd.UpdateComplaintDtlsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault) {
              throw (ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintResponse_xsd.CreateComplaintResponse opCreateComplaint(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd.CreateComplaintRequest createComplaintRequest) throws java.rmi.RemoteException, ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/BusinessServices/ManageSRService.serviceagent/ManageSRInterface/opCreateComplaint");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "opCreateComplaint"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {createComplaintRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintResponse_xsd.CreateComplaintResponse) _resp;
            } catch (Exception _exception) {
                return (ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintResponse_xsd.CreateComplaintResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintResponse_xsd.CreateComplaintResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault) {
              throw (ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.ManageSRFaultResponse_xsd.ManageSRFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
