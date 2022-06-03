/**
 * EBookingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

import javax.jws.HandlerChain;

public interface EBookingService extends javax.xml.rpc.Service {
    public java.lang.String geteBookingServiceSoapAddress();

    public com.bookcyprus.webservicesV2.EBookingServiceSoap geteBookingServiceSoap() throws javax.xml.rpc.ServiceException;

    public com.bookcyprus.webservicesV2.EBookingServiceSoap geteBookingServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
