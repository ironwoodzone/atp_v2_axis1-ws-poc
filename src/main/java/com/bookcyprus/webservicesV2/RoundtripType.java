/**
 * RoundtripType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class RoundtripType  implements java.io.Serializable {
    private int typeId;

    private java.lang.String typeName;

    private com.bookcyprus.webservicesV2.RoundtripGroup group;

    public RoundtripType() {
    }

    public RoundtripType(
           int typeId,
           java.lang.String typeName,
           com.bookcyprus.webservicesV2.RoundtripGroup group) {
           this.typeId = typeId;
           this.typeName = typeName;
           this.group = group;
    }


    /**
     * Gets the typeId value for this RoundtripType.
     * 
     * @return typeId
     */
    public int getTypeId() {
        return typeId;
    }


    /**
     * Sets the typeId value for this RoundtripType.
     * 
     * @param typeId
     */
    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }


    /**
     * Gets the typeName value for this RoundtripType.
     * 
     * @return typeName
     */
    public java.lang.String getTypeName() {
        return typeName;
    }


    /**
     * Sets the typeName value for this RoundtripType.
     * 
     * @param typeName
     */
    public void setTypeName(java.lang.String typeName) {
        this.typeName = typeName;
    }


    /**
     * Gets the group value for this RoundtripType.
     * 
     * @return group
     */
    public com.bookcyprus.webservicesV2.RoundtripGroup getGroup() {
        return group;
    }


    /**
     * Sets the group value for this RoundtripType.
     * 
     * @param group
     */
    public void setGroup(com.bookcyprus.webservicesV2.RoundtripGroup group) {
        this.group = group;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoundtripType)) return false;
        RoundtripType other = (RoundtripType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.typeId == other.getTypeId() &&
            ((this.typeName==null && other.getTypeName()==null) || 
             (this.typeName!=null &&
              this.typeName.equals(other.getTypeName()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup())));
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
        _hashCode += getTypeId();
        if (getTypeName() != null) {
            _hashCode += getTypeName().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoundtripType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripGroup"));
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
