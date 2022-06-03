/**
 * EBookingServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class EBookingServiceLocator extends org.apache.axis.client.Service implements com.bookcyprus.webservicesV2.EBookingService {

    public EBookingServiceLocator() {
    }


    public EBookingServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EBookingServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for eBookingServiceSoap
    private java.lang.String eBookingServiceSoap_address = "https://ws-premiere.beta.belugga.net/eBookingService.asmx";

    public java.lang.String geteBookingServiceSoapAddress() {
        return eBookingServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String eBookingServiceSoapWSDDServiceName = "eBookingServiceSoap";

    public java.lang.String geteBookingServiceSoapWSDDServiceName() {
        return eBookingServiceSoapWSDDServiceName;
    }

    public void seteBookingServiceSoapWSDDServiceName(java.lang.String name) {
        eBookingServiceSoapWSDDServiceName = name;
    }

    public com.bookcyprus.webservicesV2.EBookingServiceSoap geteBookingServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(eBookingServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return geteBookingServiceSoap(endpoint);
    }

    public com.bookcyprus.webservicesV2.EBookingServiceSoap geteBookingServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.bookcyprus.webservicesV2.EBookingServiceSoapStub _stub = new com.bookcyprus.webservicesV2.EBookingServiceSoapStub(portAddress, this);
            _stub.setPortName(geteBookingServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void seteBookingServiceSoapEndpointAddress(java.lang.String address) {
        eBookingServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.bookcyprus.webservicesV2.EBookingServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.bookcyprus.webservicesV2.EBookingServiceSoapStub _stub = new com.bookcyprus.webservicesV2.EBookingServiceSoapStub(new java.net.URL(eBookingServiceSoap_address), this);
                _stub.setPortName(geteBookingServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
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
        java.lang.String inputPortName = portName.getLocalPart();
        if ("eBookingServiceSoap".equals(inputPortName)) {
            return geteBookingServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "eBookingService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "eBookingServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("eBookingServiceSoap".equals(portName)) {
            seteBookingServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
