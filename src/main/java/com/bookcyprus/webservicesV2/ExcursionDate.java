/**
 * ExcursionDate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ExcursionDate  implements java.io.Serializable {
    private int excursionDateId;

    private int excursionId;

    private java.util.Calendar excursionDate;

    private java.lang.String adultUniqueCode;

    private java.lang.String childUniqueCode;

    private java.lang.String infantUniqueCode;

    private java.lang.String seniorUniqueCode;

    private java.lang.String youthUniqueCode;

    public ExcursionDate() {
    }

    public ExcursionDate(
           int excursionDateId,
           int excursionId,
           java.util.Calendar excursionDate,
           java.lang.String adultUniqueCode,
           java.lang.String childUniqueCode,
           java.lang.String infantUniqueCode,
           java.lang.String seniorUniqueCode,
           java.lang.String youthUniqueCode) {
           this.excursionDateId = excursionDateId;
           this.excursionId = excursionId;
           this.excursionDate = excursionDate;
           this.adultUniqueCode = adultUniqueCode;
           this.childUniqueCode = childUniqueCode;
           this.infantUniqueCode = infantUniqueCode;
           this.seniorUniqueCode = seniorUniqueCode;
           this.youthUniqueCode = youthUniqueCode;
    }


    /**
     * Gets the excursionDateId value for this ExcursionDate.
     * 
     * @return excursionDateId
     */
    public int getExcursionDateId() {
        return excursionDateId;
    }


    /**
     * Sets the excursionDateId value for this ExcursionDate.
     * 
     * @param excursionDateId
     */
    public void setExcursionDateId(int excursionDateId) {
        this.excursionDateId = excursionDateId;
    }


    /**
     * Gets the excursionId value for this ExcursionDate.
     * 
     * @return excursionId
     */
    public int getExcursionId() {
        return excursionId;
    }


    /**
     * Sets the excursionId value for this ExcursionDate.
     * 
     * @param excursionId
     */
    public void setExcursionId(int excursionId) {
        this.excursionId = excursionId;
    }


    /**
     * Gets the excursionDate value for this ExcursionDate.
     * 
     * @return excursionDate
     */
    public java.util.Calendar getExcursionDate() {
        return excursionDate;
    }


    /**
     * Sets the excursionDate value for this ExcursionDate.
     * 
     * @param excursionDate
     */
    public void setExcursionDate(java.util.Calendar excursionDate) {
        this.excursionDate = excursionDate;
    }


    /**
     * Gets the adultUniqueCode value for this ExcursionDate.
     * 
     * @return adultUniqueCode
     */
    public java.lang.String getAdultUniqueCode() {
        return adultUniqueCode;
    }


    /**
     * Sets the adultUniqueCode value for this ExcursionDate.
     * 
     * @param adultUniqueCode
     */
    public void setAdultUniqueCode(java.lang.String adultUniqueCode) {
        this.adultUniqueCode = adultUniqueCode;
    }


    /**
     * Gets the childUniqueCode value for this ExcursionDate.
     * 
     * @return childUniqueCode
     */
    public java.lang.String getChildUniqueCode() {
        return childUniqueCode;
    }


    /**
     * Sets the childUniqueCode value for this ExcursionDate.
     * 
     * @param childUniqueCode
     */
    public void setChildUniqueCode(java.lang.String childUniqueCode) {
        this.childUniqueCode = childUniqueCode;
    }


    /**
     * Gets the infantUniqueCode value for this ExcursionDate.
     * 
     * @return infantUniqueCode
     */
    public java.lang.String getInfantUniqueCode() {
        return infantUniqueCode;
    }


    /**
     * Sets the infantUniqueCode value for this ExcursionDate.
     * 
     * @param infantUniqueCode
     */
    public void setInfantUniqueCode(java.lang.String infantUniqueCode) {
        this.infantUniqueCode = infantUniqueCode;
    }


    /**
     * Gets the seniorUniqueCode value for this ExcursionDate.
     * 
     * @return seniorUniqueCode
     */
    public java.lang.String getSeniorUniqueCode() {
        return seniorUniqueCode;
    }


    /**
     * Sets the seniorUniqueCode value for this ExcursionDate.
     * 
     * @param seniorUniqueCode
     */
    public void setSeniorUniqueCode(java.lang.String seniorUniqueCode) {
        this.seniorUniqueCode = seniorUniqueCode;
    }


    /**
     * Gets the youthUniqueCode value for this ExcursionDate.
     * 
     * @return youthUniqueCode
     */
    public java.lang.String getYouthUniqueCode() {
        return youthUniqueCode;
    }


    /**
     * Sets the youthUniqueCode value for this ExcursionDate.
     * 
     * @param youthUniqueCode
     */
    public void setYouthUniqueCode(java.lang.String youthUniqueCode) {
        this.youthUniqueCode = youthUniqueCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExcursionDate)) return false;
        ExcursionDate other = (ExcursionDate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.excursionDateId == other.getExcursionDateId() &&
            this.excursionId == other.getExcursionId() &&
            ((this.excursionDate==null && other.getExcursionDate()==null) || 
             (this.excursionDate!=null &&
              this.excursionDate.equals(other.getExcursionDate()))) &&
            ((this.adultUniqueCode==null && other.getAdultUniqueCode()==null) || 
             (this.adultUniqueCode!=null &&
              this.adultUniqueCode.equals(other.getAdultUniqueCode()))) &&
            ((this.childUniqueCode==null && other.getChildUniqueCode()==null) || 
             (this.childUniqueCode!=null &&
              this.childUniqueCode.equals(other.getChildUniqueCode()))) &&
            ((this.infantUniqueCode==null && other.getInfantUniqueCode()==null) || 
             (this.infantUniqueCode!=null &&
              this.infantUniqueCode.equals(other.getInfantUniqueCode()))) &&
            ((this.seniorUniqueCode==null && other.getSeniorUniqueCode()==null) || 
             (this.seniorUniqueCode!=null &&
              this.seniorUniqueCode.equals(other.getSeniorUniqueCode()))) &&
            ((this.youthUniqueCode==null && other.getYouthUniqueCode()==null) || 
             (this.youthUniqueCode!=null &&
              this.youthUniqueCode.equals(other.getYouthUniqueCode())));
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
        _hashCode += getExcursionDateId();
        _hashCode += getExcursionId();
        if (getExcursionDate() != null) {
            _hashCode += getExcursionDate().hashCode();
        }
        if (getAdultUniqueCode() != null) {
            _hashCode += getAdultUniqueCode().hashCode();
        }
        if (getChildUniqueCode() != null) {
            _hashCode += getChildUniqueCode().hashCode();
        }
        if (getInfantUniqueCode() != null) {
            _hashCode += getInfantUniqueCode().hashCode();
        }
        if (getSeniorUniqueCode() != null) {
            _hashCode += getSeniorUniqueCode().hashCode();
        }
        if (getYouthUniqueCode() != null) {
            _hashCode += getYouthUniqueCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExcursionDate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionDate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionDateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionDateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adultUniqueCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "AdultUniqueCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childUniqueCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ChildUniqueCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infantUniqueCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "InfantUniqueCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seniorUniqueCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SeniorUniqueCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("youthUniqueCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "YouthUniqueCode"));
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
