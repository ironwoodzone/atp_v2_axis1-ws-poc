/**
 * ReservationListRetrieveResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ReservationListRetrieveResponse  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.ResponseBase baseResponse;

    private com.bookcyprus.webservicesV2.ReservationResponse[] reservationList;

    public ReservationListRetrieveResponse() {
    }

    public ReservationListRetrieveResponse(
           com.bookcyprus.webservicesV2.ResponseBase baseResponse,
           com.bookcyprus.webservicesV2.ReservationResponse[] reservationList) {
           this.baseResponse = baseResponse;
           this.reservationList = reservationList;
    }


    /**
     * Gets the baseResponse value for this ReservationListRetrieveResponse.
     * 
     * @return baseResponse
     */
    public com.bookcyprus.webservicesV2.ResponseBase getBaseResponse() {
        return baseResponse;
    }


    /**
     * Sets the baseResponse value for this ReservationListRetrieveResponse.
     * 
     * @param baseResponse
     */
    public void setBaseResponse(com.bookcyprus.webservicesV2.ResponseBase baseResponse) {
        this.baseResponse = baseResponse;
    }


    /**
     * Gets the reservationList value for this ReservationListRetrieveResponse.
     * 
     * @return reservationList
     */
    public com.bookcyprus.webservicesV2.ReservationResponse[] getReservationList() {
        return reservationList;
    }


    /**
     * Sets the reservationList value for this ReservationListRetrieveResponse.
     * 
     * @param reservationList
     */
    public void setReservationList(com.bookcyprus.webservicesV2.ReservationResponse[] reservationList) {
        this.reservationList = reservationList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationListRetrieveResponse)) return false;
        ReservationListRetrieveResponse other = (ReservationListRetrieveResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseResponse==null && other.getBaseResponse()==null) || 
             (this.baseResponse!=null &&
              this.baseResponse.equals(other.getBaseResponse()))) &&
            ((this.reservationList==null && other.getReservationList()==null) || 
             (this.reservationList!=null &&
              java.util.Arrays.equals(this.reservationList, other.getReservationList())));
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
        if (getBaseResponse() != null) {
            _hashCode += getBaseResponse().hashCode();
        }
        if (getReservationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReservationList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReservationList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationListRetrieveResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationListRetrieveResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ResponseBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationResponse"));
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
