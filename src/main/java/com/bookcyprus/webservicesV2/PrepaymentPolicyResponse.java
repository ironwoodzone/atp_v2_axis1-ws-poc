/**
 * PrepaymentPolicyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class PrepaymentPolicyResponse  implements java.io.Serializable {
    private java.math.BigDecimal minAmount;

    private java.math.BigDecimal maxAmount;

    private int minDays;

    private java.math.BigDecimal percent;

    public PrepaymentPolicyResponse() {
    }

    public PrepaymentPolicyResponse(
           java.math.BigDecimal minAmount,
           java.math.BigDecimal maxAmount,
           int minDays,
           java.math.BigDecimal percent) {
           this.minAmount = minAmount;
           this.maxAmount = maxAmount;
           this.minDays = minDays;
           this.percent = percent;
    }


    /**
     * Gets the minAmount value for this PrepaymentPolicyResponse.
     * 
     * @return minAmount
     */
    public java.math.BigDecimal getMinAmount() {
        return minAmount;
    }


    /**
     * Sets the minAmount value for this PrepaymentPolicyResponse.
     * 
     * @param minAmount
     */
    public void setMinAmount(java.math.BigDecimal minAmount) {
        this.minAmount = minAmount;
    }


    /**
     * Gets the maxAmount value for this PrepaymentPolicyResponse.
     * 
     * @return maxAmount
     */
    public java.math.BigDecimal getMaxAmount() {
        return maxAmount;
    }


    /**
     * Sets the maxAmount value for this PrepaymentPolicyResponse.
     * 
     * @param maxAmount
     */
    public void setMaxAmount(java.math.BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }


    /**
     * Gets the minDays value for this PrepaymentPolicyResponse.
     * 
     * @return minDays
     */
    public int getMinDays() {
        return minDays;
    }


    /**
     * Sets the minDays value for this PrepaymentPolicyResponse.
     * 
     * @param minDays
     */
    public void setMinDays(int minDays) {
        this.minDays = minDays;
    }


    /**
     * Gets the percent value for this PrepaymentPolicyResponse.
     * 
     * @return percent
     */
    public java.math.BigDecimal getPercent() {
        return percent;
    }


    /**
     * Sets the percent value for this PrepaymentPolicyResponse.
     * 
     * @param percent
     */
    public void setPercent(java.math.BigDecimal percent) {
        this.percent = percent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrepaymentPolicyResponse)) return false;
        PrepaymentPolicyResponse other = (PrepaymentPolicyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.minAmount==null && other.getMinAmount()==null) || 
             (this.minAmount!=null &&
              this.minAmount.equals(other.getMinAmount()))) &&
            ((this.maxAmount==null && other.getMaxAmount()==null) || 
             (this.maxAmount!=null &&
              this.maxAmount.equals(other.getMaxAmount()))) &&
            this.minDays == other.getMinDays() &&
            ((this.percent==null && other.getPercent()==null) || 
             (this.percent!=null &&
              this.percent.equals(other.getPercent())));
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
        if (getMinAmount() != null) {
            _hashCode += getMinAmount().hashCode();
        }
        if (getMaxAmount() != null) {
            _hashCode += getMaxAmount().hashCode();
        }
        _hashCode += getMinDays();
        if (getPercent() != null) {
            _hashCode += getPercent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrepaymentPolicyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PrepaymentPolicyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "MinAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "MaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "MinDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Percent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
