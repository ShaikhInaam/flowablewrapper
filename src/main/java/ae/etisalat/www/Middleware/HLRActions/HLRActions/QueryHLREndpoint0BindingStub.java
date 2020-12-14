/**
 * QueryHLREndpoint0BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.HLRActions.HLRActions;

import java.net.MalformedURLException;
import java.net.URL;

public class QueryHLREndpoint0BindingStub extends org.apache.axis.client.Stub implements QueryHLR {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryHLR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/QueryHLRRequest.xsd", "QueryHLRRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/QueryHLRRequest.xsd", ">QueryHLRRequest"), ae.etisalat.www.Middleware.HLRActions.QueryHLRRequest_xsd.QueryHLRRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/QueryHLRResponse.xsd", ">QueryHLRResponse"));
        oper.setReturnClass(ae.etisalat.www.Middleware.HLRActions.QueryHLRResponse_xsd.QueryHLRResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/QueryHLRResponse.xsd", "QueryHLRResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", "AckMessage"),
                      "ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage",
                      new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", ">AckMessage"), 
                      true
                     ));
        _operations[0] = oper;

    }

    public QueryHLREndpoint0BindingStub() throws org.apache.axis.AxisFault {
         this(null);
         try {
			super.cachedEndpoint = new URL("http://localhost:8078/mockQueryHLREndpoint0Binding");
			//super.cachedEndpoint = new URL("http://tibcononprd.etisalat.corp.ae:9142/middleware/HLRActions");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public QueryHLREndpoint0BindingStub(URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public QueryHLREndpoint0BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/QueryHLRRequest.xsd", ">>QueryHLRRequest>DataHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.HLRActions.QueryHLRRequest_xsd.QueryHLRRequestDataHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/QueryHLRRequest.xsd", ">QueryHLRRequest");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.HLRActions.QueryHLRRequest_xsd.QueryHLRRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/QueryHLRResponse.xsd", ">>>QueryHLRResponse>ResponseHeader>AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.HLRActions.QueryHLRResponse_xsd.QueryHLRResponseResponseHeaderAdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/QueryHLRResponse.xsd", ">>>QueryHLRResponse>ResponseHeader>Details");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.HLRActions.QueryHLRResponse_xsd.QueryHLRResponseResponseHeaderDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/QueryHLRResponse.xsd", ">>QueryHLRResponse>ResponseHeader");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.HLRActions.QueryHLRResponse_xsd.QueryHLRResponseResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/QueryHLRResponse.xsd", ">QueryHLRResponse");
            cachedSerQNames.add(qName);
            cls = ae.etisalat.www.Middleware.HLRActions.QueryHLRResponse_xsd.QueryHLRResponse.class;
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
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public ae.etisalat.www.Middleware.HLRActions.QueryHLRResponse_xsd.QueryHLRResponse queryHLR(ae.etisalat.www.Middleware.HLRActions.QueryHLRRequest_xsd.QueryHLRRequest queryHLRRequest) throws java.rmi.RemoteException, ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/SharedResources/WSDL/Internal/Abstract/HLRActions-service0.serviceagent/QueryHLREndpoint0/QueryHLR");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryHLR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {queryHLRRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ae.etisalat.www.Middleware.HLRActions.QueryHLRResponse_xsd.QueryHLRResponse) _resp;
            } catch (Exception _exception) {
                return (ae.etisalat.www.Middleware.HLRActions.QueryHLRResponse_xsd.QueryHLRResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ae.etisalat.www.Middleware.HLRActions.QueryHLRResponse_xsd.QueryHLRResponse.class);
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
