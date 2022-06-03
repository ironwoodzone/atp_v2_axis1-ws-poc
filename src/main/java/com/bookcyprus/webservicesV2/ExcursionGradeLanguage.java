/**
 * ExcursionGradeLanguage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ExcursionGradeLanguage  implements java.io.Serializable {
    private java.lang.String excursionGradeLanguageCode;

    private java.lang.String name;

    public ExcursionGradeLanguage() {
    }

    public ExcursionGradeLanguage(
           java.lang.String excursionGradeLanguageCode,
           java.lang.String name) {
           this.excursionGradeLanguageCode = excursionGradeLanguageCode;
           this.name = name;
    }


    /**
     * Gets the excursionGradeLanguageCode value for this ExcursionGradeLanguage.
     * 
     * @return excursionGradeLanguageCode
     */
    public java.lang.String getExcursionGradeLanguageCode() {
        return excursionGradeLanguageCode;
    }


    /**
     * Sets the excursionGradeLanguageCode value for this ExcursionGradeLanguage.
     * 
     * @param excursionGradeLanguageCode
     */
    public void setExcursionGradeLanguageCode(java.lang.String excursionGradeLanguageCode) {
        this.excursionGradeLanguageCode = excursionGradeLanguageCode;
    }


    /**
     * Gets the name value for this ExcursionGradeLanguage.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ExcursionGradeLanguage.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExcursionGradeLanguage)) return false;
        ExcursionGradeLanguage other = (ExcursionGradeLanguage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.excursionGradeLanguageCode==null && other.getExcursionGradeLanguageCode()==null) || 
             (this.excursionGradeLanguageCode!=null &&
              this.excursionGradeLanguageCode.equals(other.getExcursionGradeLanguageCode()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getExcursionGradeLanguageCode() != null) {
            _hashCode += getExcursionGradeLanguageCode().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExcursionGradeLanguage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionGradeLanguage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionGradeLanguageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionGradeLanguageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Name"));
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
