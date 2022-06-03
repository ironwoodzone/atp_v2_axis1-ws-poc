/**
 * ReservationCancelRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ReservationCancelRequest  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.RequestBase baseRequest;

    private int reservationId;

    private java.lang.String reservationCode;

    private int reservationDetailId;

    private java.lang.String clientReservationReference;

    public ReservationCancelRequest() {
    }

    public ReservationCancelRequest(
           com.bookcyprus.webservicesV2.RequestBase baseRequest,
           int reservationId,
           java.lang.String reservationCode,
           int reservationDetailId,
           java.lang.String clientReservationReference) {
           this.baseRequest = baseRequest;
           this.reservationId = reservationId;
           this.reservationCode = reservationCode;
           this.reservationDetailId = reservationDetailId;
           this.clientReservationReference = clientReservationReference;
    }


    /**
     * Gets the baseRequest value for this ReservationCancelRequest.
     * 
     * @return baseRequest
     */
    public com.bookcyprus.webservicesV2.RequestBase getBaseRequest() {
        return baseRequest;
    }


    /**
     * Sets the baseRequest value for this ReservationCancelRequest.
     * 
     * @param baseRequest
     */
    public void setBaseRequest(com.bookcyprus.webservicesV2.RequestBase baseRequest) {
        this.baseRequest = baseRequest;
    }


    /**
     * Gets the reservationId value for this ReservationCancelRequest.
     * 
     * @return reservationId
     */
    public int getReservationId() {
        return reservationId;
    }


    /**
     * Sets the reservationId value for this ReservationCancelRequest.
     * 
     * @param reservationId
     */
    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }


    /**
     * Gets the reservationCode value for this ReservationCancelRequest.
     * 
     * @return reservationCode
     */
    public java.lang.String getReservationCode() {
        return reservationCode;
    }


    /**
     * Sets the reservationCode value for this ReservationCancelRequest.
     * 
     * @param reservationCode
     */
    public void setReservationCode(java.lang.String reservationCode) {
        this.reservationCode = reservationCode;
    }


    /**
     * Gets the reservationDetailId value for this ReservationCancelRequest.
     * 
     * @return reservationDetailId
     */
    public int getReservationDetailId() {
        return reservationDetailId;
    }


    /**
     * Sets the reservationDetailId value for this ReservationCancelRequest.
     * 
     * @param reservationDetailId
     */
    public void setReservationDetailId(int reservationDetailId) {
        this.reservationDetailId = reservationDetailId;
    }


    /**
     * Gets the clientReservationReference value for this ReservationCancelRequest.
     * 
     * @return clientReservationReference
     */
    public java.lang.String getClientReservationReference() {
        return clientReservationReference;
    }


    /**
     * Sets the clientReservationReference value for this ReservationCancelRequest.
     * 
     * @param clientReservationReference
     */
    public void setClientReservationReference(java.lang.String clientReservationReference) {
        this.clientReservationReference = clientReservationReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationCancelRequest)) return false;
        ReservationCancelRequest other = (ReservationCancelRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseRequest==null && other.getBaseRequest()==null) || 
             (this.baseRequest!=null &&
              this.baseRequest.equals(other.getBaseRequest()))) &&
            this.reservationId == other.getReservationId() &&
            ((this.reservationCode==null && other.getReservationCode()==null) || 
             (this.reservationCode!=null &&
              this.reservationCode.equals(other.getReservationCode()))) &&
            this.reservationDetailId == other.getReservationDetailId() &&
            ((this.clientReservationReference==null && other.getClientReservationReference()==null) || 
             (this.clientReservationReference!=null &&
              this.clientReservationReference.equals(other.getClientReservationReference())));
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
        if (getBaseRequest() != null) {
            _hashCode += getBaseRequest().hashCode();
        }
        _hashCode += getReservationId();
        if (getReservationCode() != null) {
            _hashCode += getReservationCode().hashCode();
        }
        _hashCode += getReservationDetailId();
        if (getClientReservationReference() != null) {
            _hashCode += getClientReservationReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationCancelRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationCancelRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RequestBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("reservationDetailId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationDetailId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientReservationReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ClientReservationReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
