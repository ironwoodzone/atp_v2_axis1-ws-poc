/**
 * CarService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class CarService  implements java.io.Serializable {
    private int carServiceId;

    private java.lang.String carServiceName;

    private com.bookcyprus.webservicesV2.CarGroup[] availableCars;

    public CarService() {
    }

    public CarService(
           int carServiceId,
           java.lang.String carServiceName,
           com.bookcyprus.webservicesV2.CarGroup[] availableCars) {
           this.carServiceId = carServiceId;
           this.carServiceName = carServiceName;
           this.availableCars = availableCars;
    }


    /**
     * Gets the carServiceId value for this CarService.
     * 
     * @return carServiceId
     */
    public int getCarServiceId() {
        return carServiceId;
    }


    /**
     * Sets the carServiceId value for this CarService.
     * 
     * @param carServiceId
     */
    public void setCarServiceId(int carServiceId) {
        this.carServiceId = carServiceId;
    }


    /**
     * Gets the carServiceName value for this CarService.
     * 
     * @return carServiceName
     */
    public java.lang.String getCarServiceName() {
        return carServiceName;
    }


    /**
     * Sets the carServiceName value for this CarService.
     * 
     * @param carServiceName
     */
    public void setCarServiceName(java.lang.String carServiceName) {
        this.carServiceName = carServiceName;
    }


    /**
     * Gets the availableCars value for this CarService.
     * 
     * @return availableCars
     */
    public com.bookcyprus.webservicesV2.CarGroup[] getAvailableCars() {
        return availableCars;
    }


    /**
     * Sets the availableCars value for this CarService.
     * 
     * @param availableCars
     */
    public void setAvailableCars(com.bookcyprus.webservicesV2.CarGroup[] availableCars) {
        this.availableCars = availableCars;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarService)) return false;
        CarService other = (CarService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.carServiceId == other.getCarServiceId() &&
            ((this.carServiceName==null && other.getCarServiceName()==null) || 
             (this.carServiceName!=null &&
              this.carServiceName.equals(other.getCarServiceName()))) &&
            ((this.availableCars==null && other.getAvailableCars()==null) || 
             (this.availableCars!=null &&
              java.util.Arrays.equals(this.availableCars, other.getAvailableCars())));
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
        _hashCode += getCarServiceId();
        if (getCarServiceName() != null) {
            _hashCode += getCarServiceName().hashCode();
        }
        if (getAvailableCars() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableCars());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableCars(), i);
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
        new org.apache.axis.description.TypeDesc(CarService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carServiceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableCars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "AvailableCars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarGroup"));
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
