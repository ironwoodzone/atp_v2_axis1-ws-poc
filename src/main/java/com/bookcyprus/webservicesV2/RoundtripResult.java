/**
 * RoundtripResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class RoundtripResult  implements java.io.Serializable {
    private int roundtripId;

    private java.lang.String roundtripName;

    private java.lang.String imagePath;

    private com.bookcyprus.webservicesV2.RoundtripAvailability[] roundtripAvailabilities;

    public RoundtripResult() {
    }

    public RoundtripResult(
           int roundtripId,
           java.lang.String roundtripName,
           java.lang.String imagePath,
           com.bookcyprus.webservicesV2.RoundtripAvailability[] roundtripAvailabilities) {
           this.roundtripId = roundtripId;
           this.roundtripName = roundtripName;
           this.imagePath = imagePath;
           this.roundtripAvailabilities = roundtripAvailabilities;
    }


    /**
     * Gets the roundtripId value for this RoundtripResult.
     * 
     * @return roundtripId
     */
    public int getRoundtripId() {
        return roundtripId;
    }


    /**
     * Sets the roundtripId value for this RoundtripResult.
     * 
     * @param roundtripId
     */
    public void setRoundtripId(int roundtripId) {
        this.roundtripId = roundtripId;
    }


    /**
     * Gets the roundtripName value for this RoundtripResult.
     * 
     * @return roundtripName
     */
    public java.lang.String getRoundtripName() {
        return roundtripName;
    }


    /**
     * Sets the roundtripName value for this RoundtripResult.
     * 
     * @param roundtripName
     */
    public void setRoundtripName(java.lang.String roundtripName) {
        this.roundtripName = roundtripName;
    }


    /**
     * Gets the imagePath value for this RoundtripResult.
     * 
     * @return imagePath
     */
    public java.lang.String getImagePath() {
        return imagePath;
    }


    /**
     * Sets the imagePath value for this RoundtripResult.
     * 
     * @param imagePath
     */
    public void setImagePath(java.lang.String imagePath) {
        this.imagePath = imagePath;
    }


    /**
     * Gets the roundtripAvailabilities value for this RoundtripResult.
     * 
     * @return roundtripAvailabilities
     */
    public com.bookcyprus.webservicesV2.RoundtripAvailability[] getRoundtripAvailabilities() {
        return roundtripAvailabilities;
    }


    /**
     * Sets the roundtripAvailabilities value for this RoundtripResult.
     * 
     * @param roundtripAvailabilities
     */
    public void setRoundtripAvailabilities(com.bookcyprus.webservicesV2.RoundtripAvailability[] roundtripAvailabilities) {
        this.roundtripAvailabilities = roundtripAvailabilities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoundtripResult)) return false;
        RoundtripResult other = (RoundtripResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.roundtripId == other.getRoundtripId() &&
            ((this.roundtripName==null && other.getRoundtripName()==null) || 
             (this.roundtripName!=null &&
              this.roundtripName.equals(other.getRoundtripName()))) &&
            ((this.imagePath==null && other.getImagePath()==null) || 
             (this.imagePath!=null &&
              this.imagePath.equals(other.getImagePath()))) &&
            ((this.roundtripAvailabilities==null && other.getRoundtripAvailabilities()==null) || 
             (this.roundtripAvailabilities!=null &&
              java.util.Arrays.equals(this.roundtripAvailabilities, other.getRoundtripAvailabilities())));
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
        _hashCode += getRoundtripId();
        if (getRoundtripName() != null) {
            _hashCode += getRoundtripName().hashCode();
        }
        if (getImagePath() != null) {
            _hashCode += getImagePath().hashCode();
        }
        if (getRoundtripAvailabilities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoundtripAvailabilities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoundtripAvailabilities(), i);
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
        new org.apache.axis.description.TypeDesc(RoundtripResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundtripId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundtripName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imagePath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ImagePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundtripAvailabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripAvailabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripAvailability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripAvailability"));
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
