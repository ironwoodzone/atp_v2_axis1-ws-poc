/**
 * TransferService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class TransferService  implements java.io.Serializable {
    private int transferServiceId;

    private java.lang.String transferServiceName;

    private int fromPointId;

    private int toPointId;

    private int distanceKM;

    private int distanceMinutes;

    private com.bookcyprus.webservicesV2.TransferVehicle[] availableVehicles;

    public TransferService() {
    }

    public TransferService(
           int transferServiceId,
           java.lang.String transferServiceName,
           int fromPointId,
           int toPointId,
           int distanceKM,
           int distanceMinutes,
           com.bookcyprus.webservicesV2.TransferVehicle[] availableVehicles) {
           this.transferServiceId = transferServiceId;
           this.transferServiceName = transferServiceName;
           this.fromPointId = fromPointId;
           this.toPointId = toPointId;
           this.distanceKM = distanceKM;
           this.distanceMinutes = distanceMinutes;
           this.availableVehicles = availableVehicles;
    }


    /**
     * Gets the transferServiceId value for this TransferService.
     * 
     * @return transferServiceId
     */
    public int getTransferServiceId() {
        return transferServiceId;
    }


    /**
     * Sets the transferServiceId value for this TransferService.
     * 
     * @param transferServiceId
     */
    public void setTransferServiceId(int transferServiceId) {
        this.transferServiceId = transferServiceId;
    }


    /**
     * Gets the transferServiceName value for this TransferService.
     * 
     * @return transferServiceName
     */
    public java.lang.String getTransferServiceName() {
        return transferServiceName;
    }


    /**
     * Sets the transferServiceName value for this TransferService.
     * 
     * @param transferServiceName
     */
    public void setTransferServiceName(java.lang.String transferServiceName) {
        this.transferServiceName = transferServiceName;
    }


    /**
     * Gets the fromPointId value for this TransferService.
     * 
     * @return fromPointId
     */
    public int getFromPointId() {
        return fromPointId;
    }


    /**
     * Sets the fromPointId value for this TransferService.
     * 
     * @param fromPointId
     */
    public void setFromPointId(int fromPointId) {
        this.fromPointId = fromPointId;
    }


    /**
     * Gets the toPointId value for this TransferService.
     * 
     * @return toPointId
     */
    public int getToPointId() {
        return toPointId;
    }


    /**
     * Sets the toPointId value for this TransferService.
     * 
     * @param toPointId
     */
    public void setToPointId(int toPointId) {
        this.toPointId = toPointId;
    }


    /**
     * Gets the distanceKM value for this TransferService.
     * 
     * @return distanceKM
     */
    public int getDistanceKM() {
        return distanceKM;
    }


    /**
     * Sets the distanceKM value for this TransferService.
     * 
     * @param distanceKM
     */
    public void setDistanceKM(int distanceKM) {
        this.distanceKM = distanceKM;
    }


    /**
     * Gets the distanceMinutes value for this TransferService.
     * 
     * @return distanceMinutes
     */
    public int getDistanceMinutes() {
        return distanceMinutes;
    }


    /**
     * Sets the distanceMinutes value for this TransferService.
     * 
     * @param distanceMinutes
     */
    public void setDistanceMinutes(int distanceMinutes) {
        this.distanceMinutes = distanceMinutes;
    }


    /**
     * Gets the availableVehicles value for this TransferService.
     * 
     * @return availableVehicles
     */
    public com.bookcyprus.webservicesV2.TransferVehicle[] getAvailableVehicles() {
        return availableVehicles;
    }


    /**
     * Sets the availableVehicles value for this TransferService.
     * 
     * @param availableVehicles
     */
    public void setAvailableVehicles(com.bookcyprus.webservicesV2.TransferVehicle[] availableVehicles) {
        this.availableVehicles = availableVehicles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferService)) return false;
        TransferService other = (TransferService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.transferServiceId == other.getTransferServiceId() &&
            ((this.transferServiceName==null && other.getTransferServiceName()==null) || 
             (this.transferServiceName!=null &&
              this.transferServiceName.equals(other.getTransferServiceName()))) &&
            this.fromPointId == other.getFromPointId() &&
            this.toPointId == other.getToPointId() &&
            this.distanceKM == other.getDistanceKM() &&
            this.distanceMinutes == other.getDistanceMinutes() &&
            ((this.availableVehicles==null && other.getAvailableVehicles()==null) || 
             (this.availableVehicles!=null &&
              java.util.Arrays.equals(this.availableVehicles, other.getAvailableVehicles())));
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
        _hashCode += getTransferServiceId();
        if (getTransferServiceName() != null) {
            _hashCode += getTransferServiceName().hashCode();
        }
        _hashCode += getFromPointId();
        _hashCode += getToPointId();
        _hashCode += getDistanceKM();
        _hashCode += getDistanceMinutes();
        if (getAvailableVehicles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableVehicles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableVehicles(), i);
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
        new org.apache.axis.description.TypeDesc(TransferService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferServiceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromPointId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "FromPointId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toPointId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ToPointId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distanceKM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "DistanceKM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distanceMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "DistanceMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableVehicles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "AvailableVehicles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferVehicle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferVehicle"));
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
