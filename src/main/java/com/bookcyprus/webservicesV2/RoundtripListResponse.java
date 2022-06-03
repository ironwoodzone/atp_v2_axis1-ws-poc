/**
 * RoundtripListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class RoundtripListResponse  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.ResponseBase baseResponse;

    private int resultCount;

    private java.lang.String currency;

    private java.lang.String token;

    private com.bookcyprus.webservicesV2.RoundtripListItem[] roundtripsList;

    public RoundtripListResponse() {
    }

    public RoundtripListResponse(
           com.bookcyprus.webservicesV2.ResponseBase baseResponse,
           int resultCount,
           java.lang.String currency,
           java.lang.String token,
           com.bookcyprus.webservicesV2.RoundtripListItem[] roundtripsList) {
           this.baseResponse = baseResponse;
           this.resultCount = resultCount;
           this.currency = currency;
           this.token = token;
           this.roundtripsList = roundtripsList;
    }


    /**
     * Gets the baseResponse value for this RoundtripListResponse.
     * 
     * @return baseResponse
     */
    public com.bookcyprus.webservicesV2.ResponseBase getBaseResponse() {
        return baseResponse;
    }


    /**
     * Sets the baseResponse value for this RoundtripListResponse.
     * 
     * @param baseResponse
     */
    public void setBaseResponse(com.bookcyprus.webservicesV2.ResponseBase baseResponse) {
        this.baseResponse = baseResponse;
    }


    /**
     * Gets the resultCount value for this RoundtripListResponse.
     * 
     * @return resultCount
     */
    public int getResultCount() {
        return resultCount;
    }


    /**
     * Sets the resultCount value for this RoundtripListResponse.
     * 
     * @param resultCount
     */
    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }


    /**
     * Gets the currency value for this RoundtripListResponse.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this RoundtripListResponse.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the token value for this RoundtripListResponse.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this RoundtripListResponse.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the roundtripsList value for this RoundtripListResponse.
     * 
     * @return roundtripsList
     */
    public com.bookcyprus.webservicesV2.RoundtripListItem[] getRoundtripsList() {
        return roundtripsList;
    }


    /**
     * Sets the roundtripsList value for this RoundtripListResponse.
     * 
     * @param roundtripsList
     */
    public void setRoundtripsList(com.bookcyprus.webservicesV2.RoundtripListItem[] roundtripsList) {
        this.roundtripsList = roundtripsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoundtripListResponse)) return false;
        RoundtripListResponse other = (RoundtripListResponse) obj;
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
            this.resultCount == other.getResultCount() &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.roundtripsList==null && other.getRoundtripsList()==null) || 
             (this.roundtripsList!=null &&
              java.util.Arrays.equals(this.roundtripsList, other.getRoundtripsList())));
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
        _hashCode += getResultCount();
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getRoundtripsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoundtripsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoundtripsList(), i);
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
        new org.apache.axis.description.TypeDesc(RoundtripListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ResponseBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ResultCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundtripsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripListItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripListItem"));
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
