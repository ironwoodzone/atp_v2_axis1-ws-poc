/**
 * ExcursionPriceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ExcursionPriceResponse  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.ResponseBase baseResponse;

    private com.bookcyprus.webservicesV2.ExcursionPrice excursionPrice;

    public ExcursionPriceResponse() {
    }

    public ExcursionPriceResponse(
           com.bookcyprus.webservicesV2.ResponseBase baseResponse,
           com.bookcyprus.webservicesV2.ExcursionPrice excursionPrice) {
           this.baseResponse = baseResponse;
           this.excursionPrice = excursionPrice;
    }


    /**
     * Gets the baseResponse value for this ExcursionPriceResponse.
     * 
     * @return baseResponse
     */
    public com.bookcyprus.webservicesV2.ResponseBase getBaseResponse() {
        return baseResponse;
    }


    /**
     * Sets the baseResponse value for this ExcursionPriceResponse.
     * 
     * @param baseResponse
     */
    public void setBaseResponse(com.bookcyprus.webservicesV2.ResponseBase baseResponse) {
        this.baseResponse = baseResponse;
    }


    /**
     * Gets the excursionPrice value for this ExcursionPriceResponse.
     * 
     * @return excursionPrice
     */
    public com.bookcyprus.webservicesV2.ExcursionPrice getExcursionPrice() {
        return excursionPrice;
    }


    /**
     * Sets the excursionPrice value for this ExcursionPriceResponse.
     * 
     * @param excursionPrice
     */
    public void setExcursionPrice(com.bookcyprus.webservicesV2.ExcursionPrice excursionPrice) {
        this.excursionPrice = excursionPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExcursionPriceResponse)) return false;
        ExcursionPriceResponse other = (ExcursionPriceResponse) obj;
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
            ((this.excursionPrice==null && other.getExcursionPrice()==null) || 
             (this.excursionPrice!=null &&
              this.excursionPrice.equals(other.getExcursionPrice())));
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
        if (getExcursionPrice() != null) {
            _hashCode += getExcursionPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExcursionPriceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionPriceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ResponseBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionPrice"));
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
