/**
 * BookingConditionItemDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class BookingConditionItemDetail  implements java.io.Serializable {
    private int fromDays;

    private int toDays;

    private java.math.BigDecimal fullPaymentPercentage;

    private int cancellationStays;

    public BookingConditionItemDetail() {
    }

    public BookingConditionItemDetail(
           int fromDays,
           int toDays,
           java.math.BigDecimal fullPaymentPercentage,
           int cancellationStays) {
           this.fromDays = fromDays;
           this.toDays = toDays;
           this.fullPaymentPercentage = fullPaymentPercentage;
           this.cancellationStays = cancellationStays;
    }


    /**
     * Gets the fromDays value for this BookingConditionItemDetail.
     * 
     * @return fromDays
     */
    public int getFromDays() {
        return fromDays;
    }


    /**
     * Sets the fromDays value for this BookingConditionItemDetail.
     * 
     * @param fromDays
     */
    public void setFromDays(int fromDays) {
        this.fromDays = fromDays;
    }


    /**
     * Gets the toDays value for this BookingConditionItemDetail.
     * 
     * @return toDays
     */
    public int getToDays() {
        return toDays;
    }


    /**
     * Sets the toDays value for this BookingConditionItemDetail.
     * 
     * @param toDays
     */
    public void setToDays(int toDays) {
        this.toDays = toDays;
    }


    /**
     * Gets the fullPaymentPercentage value for this BookingConditionItemDetail.
     * 
     * @return fullPaymentPercentage
     */
    public java.math.BigDecimal getFullPaymentPercentage() {
        return fullPaymentPercentage;
    }


    /**
     * Sets the fullPaymentPercentage value for this BookingConditionItemDetail.
     * 
     * @param fullPaymentPercentage
     */
    public void setFullPaymentPercentage(java.math.BigDecimal fullPaymentPercentage) {
        this.fullPaymentPercentage = fullPaymentPercentage;
    }


    /**
     * Gets the cancellationStays value for this BookingConditionItemDetail.
     * 
     * @return cancellationStays
     */
    public int getCancellationStays() {
        return cancellationStays;
    }


    /**
     * Sets the cancellationStays value for this BookingConditionItemDetail.
     * 
     * @param cancellationStays
     */
    public void setCancellationStays(int cancellationStays) {
        this.cancellationStays = cancellationStays;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookingConditionItemDetail)) return false;
        BookingConditionItemDetail other = (BookingConditionItemDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.fromDays == other.getFromDays() &&
            this.toDays == other.getToDays() &&
            ((this.fullPaymentPercentage==null && other.getFullPaymentPercentage()==null) || 
             (this.fullPaymentPercentage!=null &&
              this.fullPaymentPercentage.equals(other.getFullPaymentPercentage()))) &&
            this.cancellationStays == other.getCancellationStays();
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
        _hashCode += getFromDays();
        _hashCode += getToDays();
        if (getFullPaymentPercentage() != null) {
            _hashCode += getFullPaymentPercentage().hashCode();
        }
        _hashCode += getCancellationStays();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookingConditionItemDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingConditionItemDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "FromDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ToDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullPaymentPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "FullPaymentPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancellationStays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CancellationStays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
