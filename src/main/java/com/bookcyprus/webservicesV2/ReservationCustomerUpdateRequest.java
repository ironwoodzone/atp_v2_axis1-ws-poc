/**
 * ReservationCustomerUpdateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ReservationCustomerUpdateRequest  implements java.io.Serializable {
    private int reservationId;

    private java.lang.String reservationCode;

    private com.bookcyprus.webservicesV2.RequestBase baseRequest;

    private com.bookcyprus.webservicesV2.ReservationClientDetails clientDetails;

    public ReservationCustomerUpdateRequest() {
    }

    public ReservationCustomerUpdateRequest(
           int reservationId,
           java.lang.String reservationCode,
           com.bookcyprus.webservicesV2.RequestBase baseRequest,
           com.bookcyprus.webservicesV2.ReservationClientDetails clientDetails) {
           this.reservationId = reservationId;
           this.reservationCode = reservationCode;
           this.baseRequest = baseRequest;
           this.clientDetails = clientDetails;
    }


    /**
     * Gets the reservationId value for this ReservationCustomerUpdateRequest.
     * 
     * @return reservationId
     */
    public int getReservationId() {
        return reservationId;
    }


    /**
     * Sets the reservationId value for this ReservationCustomerUpdateRequest.
     * 
     * @param reservationId
     */
    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }


    /**
     * Gets the reservationCode value for this ReservationCustomerUpdateRequest.
     * 
     * @return reservationCode
     */
    public java.lang.String getReservationCode() {
        return reservationCode;
    }


    /**
     * Sets the reservationCode value for this ReservationCustomerUpdateRequest.
     * 
     * @param reservationCode
     */
    public void setReservationCode(java.lang.String reservationCode) {
        this.reservationCode = reservationCode;
    }


    /**
     * Gets the baseRequest value for this ReservationCustomerUpdateRequest.
     * 
     * @return baseRequest
     */
    public com.bookcyprus.webservicesV2.RequestBase getBaseRequest() {
        return baseRequest;
    }


    /**
     * Sets the baseRequest value for this ReservationCustomerUpdateRequest.
     * 
     * @param baseRequest
     */
    public void setBaseRequest(com.bookcyprus.webservicesV2.RequestBase baseRequest) {
        this.baseRequest = baseRequest;
    }


    /**
     * Gets the clientDetails value for this ReservationCustomerUpdateRequest.
     * 
     * @return clientDetails
     */
    public com.bookcyprus.webservicesV2.ReservationClientDetails getClientDetails() {
        return clientDetails;
    }


    /**
     * Sets the clientDetails value for this ReservationCustomerUpdateRequest.
     * 
     * @param clientDetails
     */
    public void setClientDetails(com.bookcyprus.webservicesV2.ReservationClientDetails clientDetails) {
        this.clientDetails = clientDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationCustomerUpdateRequest)) return false;
        ReservationCustomerUpdateRequest other = (ReservationCustomerUpdateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.reservationId == other.getReservationId() &&
            ((this.reservationCode==null && other.getReservationCode()==null) || 
             (this.reservationCode!=null &&
              this.reservationCode.equals(other.getReservationCode()))) &&
            ((this.baseRequest==null && other.getBaseRequest()==null) || 
             (this.baseRequest!=null &&
              this.baseRequest.equals(other.getBaseRequest()))) &&
            ((this.clientDetails==null && other.getClientDetails()==null) || 
             (this.clientDetails!=null &&
              this.clientDetails.equals(other.getClientDetails())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getReservationId();
        if (getReservationCode() != null) {
            _hashCode += getReservationCode().hashCode();
        }
        if (getBaseRequest() != null) {
            _hashCode += getBaseRequest().hashCode();
        }
        if (getClientDetails() != null) {
            _hashCode += getClientDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationCustomerUpdateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationCustomerUpdateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RequestBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ClientDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationClientDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
