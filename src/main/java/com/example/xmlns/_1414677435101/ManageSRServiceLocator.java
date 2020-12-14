/**
 * ManageSRServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.xmlns._1414677435101;

public class ManageSRServiceLocator extends org.apache.axis.client.Service implements ManageSRService {

    public ManageSRServiceLocator() {
    }


    public ManageSRServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManageSRServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManageSRInterface
    private String ManageSRInterface_address = "http://khilt-1524:8073/mockManageSRInterfaceBinding";

    public String getManageSRInterfaceAddress() {
        return ManageSRInterface_address;
    }

    // The WSDD service name defaults to the port name.
    private String ManageSRInterfaceWSDDServiceName = "ManageSRInterface";

    public String getManageSRInterfaceWSDDServiceName() {
        return ManageSRInterfaceWSDDServiceName;
    }

    public void setManageSRInterfaceWSDDServiceName(String name) {
        ManageSRInterfaceWSDDServiceName = name;
    }

    public com.example.xmlns._1414677435101.ManageSRInterface getManageSRInterface() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManageSRInterface_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManageSRInterface(endpoint);
    }

    public com.example.xmlns._1414677435101.ManageSRInterface getManageSRInterface(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.xmlns._1414677435101.ManageSRInterfaceBindingStub _stub = new com.example.xmlns._1414677435101.ManageSRInterfaceBindingStub(portAddress, this);
            _stub.setPortName(getManageSRInterfaceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManageSRInterfaceEndpointAddress(String address) {
        ManageSRInterface_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.xmlns._1414677435101.ManageSRInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.xmlns._1414677435101.ManageSRInterfaceBindingStub _stub = new com.example.xmlns._1414677435101.ManageSRInterfaceBindingStub(new java.net.URL(ManageSRInterface_address), this);
                _stub.setPortName(getManageSRInterfaceWSDDServiceName());
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
        if ("ManageSRInterface".equals(inputPortName)) {
            return getManageSRInterface();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xmlns.example.com/1414677435101", "ManageSRService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xmlns.example.com/1414677435101", "ManageSRInterface"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("ManageSRInterface".equals(portName)) {
            setManageSRInterfaceEndpointAddress(address);
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
