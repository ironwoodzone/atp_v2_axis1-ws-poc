/**
 * ResponseBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ResponseBase  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.ResponseCode response;

    private int executionTime;

    private java.lang.String shortMsg;

    private java.lang.String longMsg;

    public ResponseBase() {
    }

    public ResponseBase(
           com.bookcyprus.webservicesV2.ResponseCode response,
           int executionTime,
           java.lang.String shortMsg,
           java.lang.String longMsg) {
           this.response = response;
           this.executionTime = executionTime;
           this.shortMsg = shortMsg;
           this.longMsg = longMsg;
    }


    /**
     * Gets the response value for this ResponseBase.
     * 
     * @return response
     */
    public com.bookcyprus.webservicesV2.ResponseCode getResponse() {
        return response;
    }


    /**
     * Sets the response value for this ResponseBase.
     * 
     * @param response
     */
    public void setResponse(com.bookcyprus.webservicesV2.ResponseCode response) {
        this.response = response;
    }


    /**
     * Gets the executionTime value for this ResponseBase.
     * 
     * @return executionTime
     */
    public int getExecutionTime() {
        return executionTime;
    }


    /**
     * Sets the executionTime value for this ResponseBase.
     * 
     * @param executionTime
     */
    public void setExecutionTime(int executionTime) {
        this.executionTime = executionTime;
    }


    /**
     * Gets the shortMsg value for this ResponseBase.
     * 
     * @return shortMsg
     */
    public java.lang.String getShortMsg() {
        return shortMsg;
    }


    /**
     * Sets the shortMsg value for this ResponseBase.
     * 
     * @param shortMsg
     */
    public void setShortMsg(java.lang.String shortMsg) {
        this.shortMsg = shortMsg;
    }


    /**
     * Gets the longMsg value for this ResponseBase.
     * 
     * @return longMsg
     */
    public java.lang.String getLongMsg() {
        return longMsg;
    }


    /**
     * Sets the longMsg value for this ResponseBase.
     * 
     * @param longMsg
     */
    public void setLongMsg(java.lang.String longMsg) {
        this.longMsg = longMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseBase)) return false;
        ResponseBase other = (ResponseBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse()))) &&
            this.executionTime == other.getExecutionTime() &&
            ((this.shortMsg==null && other.getShortMsg()==null) || 
             (this.shortMsg!=null &&
              this.shortMsg.equals(other.getShortMsg()))) &&
            ((this.longMsg==null && other.getLongMsg()==null) || 
             (this.longMsg!=null &&
              this.longMsg.equals(other.getLongMsg())));
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
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        _hashCode += getExecutionTime();
        if (getShortMsg() != null) {
            _hashCode += getShortMsg().hashCode();
        }
        if (getLongMsg() != null) {
            _hashCode += getLongMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ResponseBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ResponseCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExecutionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ShortMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "LongMsg"));
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
