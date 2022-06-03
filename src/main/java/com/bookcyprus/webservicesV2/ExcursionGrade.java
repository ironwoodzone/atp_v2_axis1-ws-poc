/**
 * ExcursionGrade.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ExcursionGrade  implements java.io.Serializable {
    private java.lang.String excursionGradeCode;

    private java.lang.String title;

    private java.lang.String description;

    private java.math.BigDecimal fromPrice;

    private com.bookcyprus.webservicesV2.ExcursionGradeLanguage[] excursionGradeLanguages;

    public ExcursionGrade() {
    }

    public ExcursionGrade(
           java.lang.String excursionGradeCode,
           java.lang.String title,
           java.lang.String description,
           java.math.BigDecimal fromPrice,
           com.bookcyprus.webservicesV2.ExcursionGradeLanguage[] excursionGradeLanguages) {
           this.excursionGradeCode = excursionGradeCode;
           this.title = title;
           this.description = description;
           this.fromPrice = fromPrice;
           this.excursionGradeLanguages = excursionGradeLanguages;
    }


    /**
     * Gets the excursionGradeCode value for this ExcursionGrade.
     * 
     * @return excursionGradeCode
     */
    public java.lang.String getExcursionGradeCode() {
        return excursionGradeCode;
    }


    /**
     * Sets the excursionGradeCode value for this ExcursionGrade.
     * 
     * @param excursionGradeCode
     */
    public void setExcursionGradeCode(java.lang.String excursionGradeCode) {
        this.excursionGradeCode = excursionGradeCode;
    }


    /**
     * Gets the title value for this ExcursionGrade.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ExcursionGrade.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the description value for this ExcursionGrade.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ExcursionGrade.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the fromPrice value for this ExcursionGrade.
     * 
     * @return fromPrice
     */
    public java.math.BigDecimal getFromPrice() {
        return fromPrice;
    }


    /**
     * Sets the fromPrice value for this ExcursionGrade.
     * 
     * @param fromPrice
     */
    public void setFromPrice(java.math.BigDecimal fromPrice) {
        this.fromPrice = fromPrice;
    }


    /**
     * Gets the excursionGradeLanguages value for this ExcursionGrade.
     * 
     * @return excursionGradeLanguages
     */
    public com.bookcyprus.webservicesV2.ExcursionGradeLanguage[] getExcursionGradeLanguages() {
        return excursionGradeLanguages;
    }


    /**
     * Sets the excursionGradeLanguages value for this ExcursionGrade.
     * 
     * @param excursionGradeLanguages
     */
    public void setExcursionGradeLanguages(com.bookcyprus.webservicesV2.ExcursionGradeLanguage[] excursionGradeLanguages) {
        this.excursionGradeLanguages = excursionGradeLanguages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExcursionGrade)) return false;
        ExcursionGrade other = (ExcursionGrade) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.excursionGradeCode==null && other.getExcursionGradeCode()==null) || 
             (this.excursionGradeCode!=null &&
              this.excursionGradeCode.equals(other.getExcursionGradeCode()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.fromPrice==null && other.getFromPrice()==null) || 
             (this.fromPrice!=null &&
              this.fromPrice.equals(other.getFromPrice()))) &&
            ((this.excursionGradeLanguages==null && other.getExcursionGradeLanguages()==null) || 
             (this.excursionGradeLanguages!=null &&
              java.util.Arrays.equals(this.excursionGradeLanguages, other.getExcursionGradeLanguages())));
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
        if (getExcursionGradeCode() != null) {
            _hashCode += getExcursionGradeCode().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFromPrice() != null) {
            _hashCode += getFromPrice().hashCode();
        }
        if (getExcursionGradeLanguages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcursionGradeLanguages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcursionGradeLanguages(), i);
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
        new org.apache.axis.description.TypeDesc(ExcursionGrade.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionGrade"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionGradeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionGradeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "FromPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionGradeLanguages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionGradeLanguages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionGradeLanguage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionGradeLanguage"));
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
