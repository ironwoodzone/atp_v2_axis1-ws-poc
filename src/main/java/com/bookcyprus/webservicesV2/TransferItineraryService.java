/**
 * TransferItineraryService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class TransferItineraryService  implements java.io.Serializable {
    private java.lang.String vehicle;

    private java.lang.String fromLocation;

    private java.lang.String toLocation;

    public TransferItineraryService() {
    }

    public TransferItineraryService(
           java.lang.String vehicle,
           java.lang.String fromLocation,
           java.lang.String toLocation) {
           this.vehicle = vehicle;
           this.fromLocation = fromLocation;
           this.toLocation = toLocation;
    }


    /**
     * Gets the vehicle value for this TransferItineraryService.
     * 
     * @return vehicle
     */
    public java.lang.String getVehicle() {
        return vehicle;
    }


    /**
     * Sets the vehicle value for this TransferItineraryService.
     * 
     * @param vehicle
     */
    public void setVehicle(java.lang.String vehicle) {
        this.vehicle = vehicle;
    }


    /**
     * Gets the fromLocation value for this TransferItineraryService.
     * 
     * @return fromLocation
     */
    public java.lang.String getFromLocation() {
        return fromLocation;
    }


    /**
     * Sets the fromLocation value for this TransferItineraryService.
     * 
     * @param fromLocation
     */
    public void setFromLocation(java.lang.String fromLocation) {
        this.fromLocation = fromLocation;
    }


    /**
     * Gets the toLocation value for this TransferItineraryService.
     * 
     * @return toLocation
     */
    public java.lang.String getToLocation() {
        return toLocation;
    }


    /**
     * Sets the toLocation value for this TransferItineraryService.
     * 
     * @param toLocation
     */
    public void setToLocation(java.lang.String toLocation) {
        this.toLocation = toLocation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferItineraryService)) return false;
        TransferItineraryService other = (TransferItineraryService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vehicle==null && other.getVehicle()==null) || 
             (this.vehicle!=null &&
              this.vehicle.equals(other.getVehicle()))) &&
            ((this.fromLocation==null && other.getFromLocation()==null) || 
             (this.fromLocation!=null &&
              this.fromLocation.equals(other.getFromLocation()))) &&
            ((this.toLocation==null && other.getToLocation()==null) || 
             (this.toLocation!=null &&
              this.toLocation.equals(other.getToLocation())));
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
        if (getVehicle() != null) {
            _hashCode += getVehicle().hashCode();
        }
        if (getFromLocation() != null) {
            _hashCode += getFromLocation().hashCode();
        }
        if (getToLocation() != null) {
            _hashCode += getToLocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferItineraryService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferItineraryService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Vehicle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "FromLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ToLocation"));
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
