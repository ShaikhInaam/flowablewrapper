/**
 * UCMSComplaintsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.xmlns._1436867334942;

public class UCMSComplaintsLocator extends org.apache.axis.client.Service implements com.example.xmlns._1436867334942.UCMSComplaints {

    public UCMSComplaintsLocator() {
    }


    public UCMSComplaintsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UCMSComplaintsLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PortTypeEndpoint1
    private String PortTypeEndpoint1_address = "http://khilt-1524:8092/mockPortTypeEndpoint1Binding";

    public String getPortTypeEndpoint1Address() {
        return PortTypeEndpoint1_address;
    }

    // The WSDD service name defaults to the port name.
    private String PortTypeEndpoint1WSDDServiceName = "PortTypeEndpoint1";

    public String getPortTypeEndpoint1WSDDServiceName() {
        return PortTypeEndpoint1WSDDServiceName;
    }

    public void setPortTypeEndpoint1WSDDServiceName(String name) {
        PortTypeEndpoint1WSDDServiceName = name;
    }

    public com.example.xmlns._1436867334942.PortType getPortTypeEndpoint1() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PortTypeEndpoint1_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortTypeEndpoint1(endpoint);
    }

    public com.example.xmlns._1436867334942.PortType getPortTypeEndpoint1(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.xmlns._1436867334942.PortTypeEndpoint1BindingStub _stub = new com.example.xmlns._1436867334942.PortTypeEndpoint1BindingStub(portAddress, this);
            _stub.setPortName(getPortTypeEndpoint1WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortTypeEndpoint1EndpointAddress(String address) {
        PortTypeEndpoint1_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.xmlns._1436867334942.PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.xmlns._1436867334942.PortTypeEndpoint1BindingStub _stub = new com.example.xmlns._1436867334942.PortTypeEndpoint1BindingStub(new java.net.URL(PortTypeEndpoint1_address), this);
                _stub.setPortName(getPortTypeEndpoint1WSDDServiceName());
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
        if ("PortTypeEndpoint1".equals(inputPortName)) {
            return getPortTypeEndpoint1();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xmlns.example.com/1436867334942", "UCMSComplaints");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xmlns.example.com/1436867334942", "PortTypeEndpoint1"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("PortTypeEndpoint1".equals(portName)) {
            setPortTypeEndpoint1EndpointAddress(address);
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
