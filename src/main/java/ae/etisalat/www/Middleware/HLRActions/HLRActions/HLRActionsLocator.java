/**
 * HLRActionsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.HLRActions.HLRActions;

public class HLRActionsLocator extends org.apache.axis.client.Service implements HLRActions {

    public HLRActionsLocator() {
    }


    public HLRActionsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HLRActionsLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for QueryHLREndpoint0
    private String QueryHLREndpoint0_address = "http://khilt-1524:8078/mockQueryHLREndpoint0Binding";

    public String getQueryHLREndpoint0Address() {
        return QueryHLREndpoint0_address;
    }

    // The WSDD service name defaults to the port name.
    private String QueryHLREndpoint0WSDDServiceName = "QueryHLREndpoint0";

    public String getQueryHLREndpoint0WSDDServiceName() {
        return QueryHLREndpoint0WSDDServiceName;
    }

    public void setQueryHLREndpoint0WSDDServiceName(String name) {
        QueryHLREndpoint0WSDDServiceName = name;
    }

    public QueryHLR getQueryHLREndpoint0() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(QueryHLREndpoint0_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getQueryHLREndpoint0(endpoint);
    }

    public QueryHLR getQueryHLREndpoint0(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ae.etisalat.www.Middleware.HLRActions.HLRActions.QueryHLREndpoint0BindingStub _stub = new ae.etisalat.www.Middleware.HLRActions.HLRActions.QueryHLREndpoint0BindingStub(portAddress, this);
            _stub.setPortName(getQueryHLREndpoint0WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setQueryHLREndpoint0EndpointAddress(String address) {
        QueryHLREndpoint0_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (QueryHLR.class.isAssignableFrom(serviceEndpointInterface)) {
                ae.etisalat.www.Middleware.HLRActions.HLRActions.QueryHLREndpoint0BindingStub _stub = new ae.etisalat.www.Middleware.HLRActions.HLRActions.QueryHLREndpoint0BindingStub(new java.net.URL(QueryHLREndpoint0_address), this);
                _stub.setPortName(getQueryHLREndpoint0WSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("QueryHLREndpoint0".equals(inputPortName)) {
            return getQueryHLREndpoint0();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/HLRActions", "HLRActions");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/HLRActions", "QueryHLREndpoint0"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("QueryHLREndpoint0".equals(portName)) {
            setQueryHLREndpoint0EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
