/**
 * CancellationPolicyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class CancellationPolicyResponse  implements java.io.Serializable {
    private int minDays;

    private java.math.BigDecimal percentIfPendingSettlemet;

    private java.math.BigDecimal percentIfPaid;

    public CancellationPolicyResponse() {
    }

    public CancellationPolicyResponse(
           int minDays,
           java.math.BigDecimal percentIfPendingSettlemet,
           java.math.BigDecimal percentIfPaid) {
           this.minDays = minDays;
           this.percentIfPendingSettlemet = percentIfPendingSettlemet;
           this.percentIfPaid = percentIfPaid;
    }


    /**
     * Gets the minDays value for this CancellationPolicyResponse.
     * 
     * @return minDays
     */
    public int getMinDays() {
        return minDays;
    }


    /**
     * Sets the minDays value for this CancellationPolicyResponse.
     * 
     * @param minDays
     */
    public void setMinDays(int minDays) {
        this.minDays = minDays;
    }


    /**
     * Gets the percentIfPendingSettlemet value for this CancellationPolicyResponse.
     * 
     * @return percentIfPendingSettlemet
     */
    public java.math.BigDecimal getPercentIfPendingSettlemet() {
        return percentIfPendingSettlemet;
    }


    /**
     * Sets the percentIfPendingSettlemet value for this CancellationPolicyResponse.
     * 
     * @param percentIfPendingSettlemet
     */
    public void setPercentIfPendingSettlemet(java.math.BigDecimal percentIfPendingSettlemet) {
        this.percentIfPendingSettlemet = percentIfPendingSettlemet;
    }


    /**
     * Gets the percentIfPaid value for this CancellationPolicyResponse.
     * 
     * @return percentIfPaid
     */
    public java.math.BigDecimal getPercentIfPaid() {
        return percentIfPaid;
    }


    /**
     * Sets the percentIfPaid value for this CancellationPolicyResponse.
     * 
     * @param percentIfPaid
     */
    public void setPercentIfPaid(java.math.BigDecimal percentIfPaid) {
        this.percentIfPaid = percentIfPaid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancellationPolicyResponse)) return false;
        CancellationPolicyResponse other = (CancellationPolicyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.minDays == other.getMinDays() &&
            ((this.percentIfPendingSettlemet==null && other.getPercentIfPendingSettlemet()==null) || 
             (this.percentIfPendingSettlemet!=null &&
              this.percentIfPendingSettlemet.equals(other.getPercentIfPendingSettlemet()))) &&
            ((this.percentIfPaid==null && other.getPercentIfPaid()==null) || 
             (this.percentIfPaid!=null &&
              this.percentIfPaid.equals(other.getPercentIfPaid())));
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
        _hashCode += getMinDays();
        if (getPercentIfPendingSettlemet() != null) {
            _hashCode += getPercentIfPendingSettlemet().hashCode();
        }
        if (getPercentIfPaid() != null) {
            _hashCode += getPercentIfPaid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancellationPolicyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CancellationPolicyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "MinDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentIfPendingSettlemet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PercentIfPendingSettlemet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentIfPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PercentIfPaid"));
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
