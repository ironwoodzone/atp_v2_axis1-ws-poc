/**
 * ExcursionStartTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ExcursionStartTime  implements java.io.Serializable {
    private int excursionStartTimeId;

    private int excursionId;

    private java.util.Calendar startTime;

    private java.lang.String startTimeLabel;

    public ExcursionStartTime() {
    }

    public ExcursionStartTime(
           int excursionStartTimeId,
           int excursionId,
           java.util.Calendar startTime,
           java.lang.String startTimeLabel) {
           this.excursionStartTimeId = excursionStartTimeId;
           this.excursionId = excursionId;
           this.startTime = startTime;
           this.startTimeLabel = startTimeLabel;
    }


    /**
     * Gets the excursionStartTimeId value for this ExcursionStartTime.
     * 
     * @return excursionStartTimeId
     */
    public int getExcursionStartTimeId() {
        return excursionStartTimeId;
    }


    /**
     * Sets the excursionStartTimeId value for this ExcursionStartTime.
     * 
     * @param excursionStartTimeId
     */
    public void setExcursionStartTimeId(int excursionStartTimeId) {
        this.excursionStartTimeId = excursionStartTimeId;
    }


    /**
     * Gets the excursionId value for this ExcursionStartTime.
     * 
     * @return excursionId
     */
    public int getExcursionId() {
        return excursionId;
    }


    /**
     * Sets the excursionId value for this ExcursionStartTime.
     * 
     * @param excursionId
     */
    public void setExcursionId(int excursionId) {
        this.excursionId = excursionId;
    }


    /**
     * Gets the startTime value for this ExcursionStartTime.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this ExcursionStartTime.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the startTimeLabel value for this ExcursionStartTime.
     * 
     * @return startTimeLabel
     */
    public java.lang.String getStartTimeLabel() {
        return startTimeLabel;
    }


    /**
     * Sets the startTimeLabel value for this ExcursionStartTime.
     * 
     * @param startTimeLabel
     */
    public void setStartTimeLabel(java.lang.String startTimeLabel) {
        this.startTimeLabel = startTimeLabel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExcursionStartTime)) return false;
        ExcursionStartTime other = (ExcursionStartTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.excursionStartTimeId == other.getExcursionStartTimeId() &&
            this.excursionId == other.getExcursionId() &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.startTimeLabel==null && other.getStartTimeLabel()==null) || 
             (this.startTimeLabel!=null &&
              this.startTimeLabel.equals(other.getStartTimeLabel())));
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
        _hashCode += getExcursionStartTimeId();
        _hashCode += getExcursionId();
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getStartTimeLabel() != null) {
            _hashCode += getStartTimeLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExcursionStartTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionStartTime"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionStartTimeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionStartTimeId"));
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
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTimeLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "StartTimeLabel"));
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
