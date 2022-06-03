/**
 * CarGroupSupplement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class CarGroupSupplement  implements java.io.Serializable {
    private int supplementId;

    private java.lang.String supplementName;

    private boolean isMandatory;

    private boolean isPerDay;

    private java.math.BigDecimal amount;

    public CarGroupSupplement() {
    }

    public CarGroupSupplement(
           int supplementId,
           java.lang.String supplementName,
           boolean isMandatory,
           boolean isPerDay,
           java.math.BigDecimal amount) {
           this.supplementId = supplementId;
           this.supplementName = supplementName;
           this.isMandatory = isMandatory;
           this.isPerDay = isPerDay;
           this.amount = amount;
    }


    /**
     * Gets the supplementId value for this CarGroupSupplement.
     * 
     * @return supplementId
     */
    public int getSupplementId() {
        return supplementId;
    }


    /**
     * Sets the supplementId value for this CarGroupSupplement.
     * 
     * @param supplementId
     */
    public void setSupplementId(int supplementId) {
        this.supplementId = supplementId;
    }


    /**
     * Gets the supplementName value for this CarGroupSupplement.
     * 
     * @return supplementName
     */
    public java.lang.String getSupplementName() {
        return supplementName;
    }


    /**
     * Sets the supplementName value for this CarGroupSupplement.
     * 
     * @param supplementName
     */
    public void setSupplementName(java.lang.String supplementName) {
        this.supplementName = supplementName;
    }


    /**
     * Gets the isMandatory value for this CarGroupSupplement.
     * 
     * @return isMandatory
     */
    public boolean isIsMandatory() {
        return isMandatory;
    }


    /**
     * Sets the isMandatory value for this CarGroupSupplement.
     * 
     * @param isMandatory
     */
    public void setIsMandatory(boolean isMandatory) {
        this.isMandatory = isMandatory;
    }


    /**
     * Gets the isPerDay value for this CarGroupSupplement.
     * 
     * @return isPerDay
     */
    public boolean isIsPerDay() {
        return isPerDay;
    }


    /**
     * Sets the isPerDay value for this CarGroupSupplement.
     * 
     * @param isPerDay
     */
    public void setIsPerDay(boolean isPerDay) {
        this.isPerDay = isPerDay;
    }


    /**
     * Gets the amount value for this CarGroupSupplement.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CarGroupSupplement.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarGroupSupplement)) return false;
        CarGroupSupplement other = (CarGroupSupplement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.supplementId == other.getSupplementId() &&
            ((this.supplementName==null && other.getSupplementName()==null) || 
             (this.supplementName!=null &&
              this.supplementName.equals(other.getSupplementName()))) &&
            this.isMandatory == other.isIsMandatory() &&
            this.isPerDay == other.isIsPerDay() &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount())));
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
        _hashCode += getSupplementId();
        if (getSupplementName() != null) {
            _hashCode += getSupplementName().hashCode();
        }
        _hashCode += (isIsMandatory() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsPerDay() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarGroupSupplement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarGroupSupplement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplementId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SupplementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplementName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SupplementName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMandatory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "IsMandatory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPerDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "IsPerDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Amount"));
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
