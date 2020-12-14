/**
 * PortTypeEndpoint1BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.xmlns._1436867334942;

import java.net.MalformedURLException;
import java.net.URL;

public class PortTypeEndpoint1BindingStub extends org.apache.axis.client.Stub implements com.example.xmlns._1436867334942.PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OpUpdateComplaintStatusFromUCMS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "UpdateComplaintRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", ">UpdateComplaintRequest"), ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSRequest_xsd.UpdateComplaintRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSResponse.xsd", ">UpdateComplaintStatusFromUCMSResponse"));
        oper.setReturnClass(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSResponse_xsd.UpdateComplaintStatusFromUCMSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSResponse.xsd", "UpdateComplaintStatusFromUCMSResponse"));
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
        oper.setName("OpUpdateComplaintDetailsInUCMS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "UpdateComplaintInUCMSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">UpdateComplaintInUCMSRequest"), ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSResponse.xsd", ">UpdateComplaintInUCMSResponse"));
        oper.setReturnClass(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSResponse_xsd.UpdateComplaintInUCMSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSResponse.xsd", "UpdateComplaintInUCMSResponse"));
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
        oper.setName("OpResolveComplaint");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "ResolveComplaintInUCMSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", ">ResolveComplaintInUCMSRequest"), ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd.ResolveComplaintInUCMSRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintResponse.xsd", ">ResolveComplaintInUCMSResponse"));
        oper.setReturnClass(ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintResponse_xsd.ResolveComplaintInUCMSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintResponse.xsd", "ResolveComplaintInUCMSResponse"));
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
        oper.setName("OpGetComplaintDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsRequest.xsd", "GetComplaintDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsRequest.xsd", ">GetComplaintDetailsRequest"), ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsRequest_xsd.GetComplaintDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">GetComplaintDetailsResponse"));
        oper.setReturnClass(ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", "GetComplaintDetailsResponse"));
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
        oper.setName("OpUpdateComplaintStatusInUCMS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", "UpdateComplaintInUCMSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", ">UpdateComplaintInUCMSRequest"), ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSRequest_xsd.UpdateComplaintInUCMSRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSResponse.xsd", ">UpdateComplaintInUCMSResponse"));
        oper.setReturnClass(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSResponse_xsd.UpdateComplaintInUCMSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSResponse.xsd", "UpdateComplaintInUCMSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", "AckMessage"),
                      "ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage",
                      new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", ">AckMessage"), 
                      true
                     ));
        _operations[4] = oper;

    }

    public PortTypeEndpoint1BindingStub() throws org.apache.axis.AxisFault {
         this(null);
        try {
            super.cachedEndpoint = new URL("http://localhost:8092/mockPortTypeEndpoint1Binding");
            //super.cachedEndpoint = new URL("http://tibcononprd:9144/Middleware/UCMSComplaints");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public PortTypeEndpoint1BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PortTypeEndpoint1BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsRequest.xsd", ">>>GetComplaintDetailsRequest>DataHeader>AddtionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsRequest_xsd.GetComplaintDetailsRequestDataHeaderAddtionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsRequest.xsd", ">>GetComplaintDetailsRequest>DataHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsRequest_xsd.GetComplaintDetailsRequestDataHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsRequest.xsd", ">GetComplaintDetailsRequest");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsRequest_xsd.GetComplaintDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">>>>>>GetComplaintDetailsResponse>ResponseData>ComplaintList>Complaint>WFMData>Address");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">>>>>>GetComplaintDetailsResponse>ResponseData>ComplaintList>Complaint>WFMData>OntDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataOntDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">>>>>>GetComplaintDetailsResponse>ResponseData>ComplaintList>Complaint>WFMData>WFMWorkOrderDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">>>>>GetComplaintDetailsResponse>ResponseData>ComplaintList>Complaint>AssignmentGroup");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataComplaintListComplaintAssignmentGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">>>>>GetComplaintDetailsResponse>ResponseData>ComplaintList>Complaint>LOCNETDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataComplaintListComplaintLOCNETDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">>>>>GetComplaintDetailsResponse>ResponseData>ComplaintList>Complaint>SMITData");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataComplaintListComplaintSMITData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">>>>>GetComplaintDetailsResponse>ResponseData>ComplaintList>Complaint>WFMData");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">>>>GetComplaintDetailsResponse>ResponseData>ComplaintList>Complaint");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataComplaintListComplaint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">>>GetComplaintDetailsResponse>ResponseData>AddtionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataAddtionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">>>GetComplaintDetailsResponse>ResponseData>ComplaintList");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataComplaintListComplaint[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">>>>GetComplaintDetailsResponse>ResponseData>ComplaintList>Complaint");
            qName2 = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", "Complaint");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">>GetComplaintDetailsResponse>ResponseData");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">GetComplaintDetailsResponse");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", ">>>>ResolveComplaintInUCMSRequest>DataHeader>SMSContent>DynamicParameters");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd.ResolveComplaintInUCMSRequestDataHeaderSMSContentDynamicParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", ">>>ResolveComplaintInUCMSRequest>DataHeader>AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd.ResolveComplaintInUCMSRequestDataHeaderAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", ">>>ResolveComplaintInUCMSRequest>DataHeader>SMSContent");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd.ResolveComplaintInUCMSRequestDataHeaderSMSContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", ">>ResolveComplaintInUCMSRequest>DataHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd.ResolveComplaintInUCMSRequestDataHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", ">ResolveComplaintInUCMSRequest");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd.ResolveComplaintInUCMSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintResponse.xsd", ">ResolveComplaintInUCMSResponse");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintResponse_xsd.ResolveComplaintInUCMSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>>UpdateComplaintInUCMSRequest>DataHeader>BistreamFields>BSCustomerAddress");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderBistreamFieldsBSCustomerAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>>UpdateComplaintInUCMSRequest>DataHeader>DataProductsDetails>DataDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>>UpdateComplaintInUCMSRequest>DataHeader>DataProductsDetails>Femtocell");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsFemtocell.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>>UpdateComplaintInUCMSRequest>DataHeader>DataProductsDetails>FrameRelayDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsFrameRelayDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>>UpdateComplaintInUCMSRequest>DataHeader>DataProductsDetails>InternetLeaseLine");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsInternetLeaseLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>>UpdateComplaintInUCMSRequest>DataHeader>DataProductsDetails>IPVPNAssurance");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsIPVPNAssurance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>>UpdateComplaintInUCMSRequest>DataHeader>ElifeAndEVision>STBDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>>UpdateComplaintInUCMSRequest>DataHeader>ElifeAndEVision>Wireless");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>>UpdateComplaintInUCMSRequest>DataHeader>SMSParameters>DynamicParameters");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderSMSParametersDynamicParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>AttachmentList");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderAttachmentList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>BistreamFields");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderBistreamFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>CustomerContactList");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderCustomerContactList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>CustomerLocation");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderCustomerLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>DataProductsDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderDataProductsDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>ElifeAndEVision");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>GPONTestDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderGPONTestDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>LOCNETPMSDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderLOCNETPMSDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>PendingServiceOrderDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>PreviousComplaintHistory");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderPreviousComplaintHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>PSTNAssurance");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>ServiceAuthAndEquipmentDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>SMSParameters");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderSMSParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>UpdateComplaintInUCMSRequest>DataHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">UpdateComplaintInUCMSRequest");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSResponse.xsd", ">UpdateComplaintInUCMSResponse");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSResponse_xsd.UpdateComplaintInUCMSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", ">>>UpdateComplaintRequest>DataHeader>AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSRequest_xsd.UpdateComplaintRequestDataHeaderAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", ">>UpdateComplaintRequest>DataHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSRequest_xsd.UpdateComplaintRequestDataHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", ">UpdateComplaintRequest");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSRequest_xsd.UpdateComplaintRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSResponse.xsd", ">UpdateComplaintStatusFromUCMSResponse");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSResponse_xsd.UpdateComplaintStatusFromUCMSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>CloseCancelComplaintDetails");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", ">>UpdateComplaintInUCMSRequest>DataHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", ">UpdateComplaintInUCMSRequest");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSRequest_xsd.UpdateComplaintInUCMSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSResponse.xsd", ">UpdateComplaintInUCMSResponse");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSResponse_xsd.UpdateComplaintInUCMSResponse.class;
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

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSResponse_xsd.UpdateComplaintStatusFromUCMSResponse opUpdateComplaintStatusFromUCMS(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSRequest_xsd.UpdateComplaintRequest updateComplaintStatusFromUCMSRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OpUpdateComplaintStatusFromUCMS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {updateComplaintStatusFromUCMSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSResponse_xsd.UpdateComplaintStatusFromUCMSResponse) _resp;
            } catch (Exception _exception) {
                return (ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSResponse_xsd.UpdateComplaintStatusFromUCMSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSResponse_xsd.UpdateComplaintStatusFromUCMSResponse.class);
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

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSResponse_xsd.UpdateComplaintInUCMSResponse opUpdateComplaintDetailsInUCMS(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequest updateComplaintDetailsInUCMSRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OpUpdateComplaintDetailsInUCMS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {updateComplaintDetailsInUCMSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSResponse_xsd.UpdateComplaintInUCMSResponse) _resp;
            } catch (Exception _exception) {
                return (ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSResponse_xsd.UpdateComplaintInUCMSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSResponse_xsd.UpdateComplaintInUCMSResponse.class);
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

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintResponse_xsd.ResolveComplaintInUCMSResponse opResolveComplaint(ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd.ResolveComplaintInUCMSRequest resolveComplaintRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/Middleware/UCMSComplaintIntegration/ResolveComplaint");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OpResolveComplaint"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {resolveComplaintRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintResponse_xsd.ResolveComplaintInUCMSResponse) _resp;
            } catch (Exception _exception) {
                return (ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintResponse_xsd.ResolveComplaintInUCMSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintResponse_xsd.ResolveComplaintInUCMSResponse.class);
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

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponse opGetComplaintDtls(ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsRequest_xsd.GetComplaintDetailsRequest getComplaintDtlsRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/Middleware/UCMSComplaintIntegration/GetComplaintDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OpGetComplaintDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getComplaintDtlsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponse) _resp;
            } catch (Exception _exception) {
                return (ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponse.class);
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

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSResponse_xsd.UpdateComplaintInUCMSResponse opUpdateComplaintStatusInUCMS(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSRequest_xsd.UpdateComplaintInUCMSRequest updateComplaintInUCMSRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OpUpdateComplaintStatusInUCMS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {updateComplaintInUCMSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSResponse_xsd.UpdateComplaintInUCMSResponse) _resp;
            } catch (Exception _exception) {
                return (ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSResponse_xsd.UpdateComplaintInUCMSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSResponse_xsd.UpdateComplaintInUCMSResponse.class);
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
