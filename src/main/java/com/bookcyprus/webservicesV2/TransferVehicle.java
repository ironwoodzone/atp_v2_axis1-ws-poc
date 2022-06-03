/**
 * TransferVehicle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class TransferVehicle  implements java.io.Serializable {
    private int vehicleId;

    private java.lang.String vehicleType;

    private java.lang.String vehicleTypeDescription;

    private int vehicleTypeId;

    private int supplierId;

    private boolean isOneWay;

    private java.math.BigDecimal amount;

    private int numberOfVehicles;

    private boolean isPerPax;

    public TransferVehicle() {
    }

    public TransferVehicle(
           int vehicleId,
           java.lang.String vehicleType,
           java.lang.String vehicleTypeDescription,
           int vehicleTypeId,
           int supplierId,
           boolean isOneWay,
           java.math.BigDecimal amount,
           int numberOfVehicles,
           boolean isPerPax) {
           this.vehicleId = vehicleId;
           this.vehicleType = vehicleType;
           this.vehicleTypeDescription = vehicleTypeDescription;
           this.vehicleTypeId = vehicleTypeId;
           this.supplierId = supplierId;
           this.isOneWay = isOneWay;
           this.amount = amount;
           this.numberOfVehicles = numberOfVehicles;
           this.isPerPax = isPerPax;
    }


    /**
     * Gets the vehicleId value for this TransferVehicle.
     * 
     * @return vehicleId
     */
    public int getVehicleId() {
        return vehicleId;
    }


    /**
     * Sets the vehicleId value for this TransferVehicle.
     * 
     * @param vehicleId
     */
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }


    /**
     * Gets the vehicleType value for this TransferVehicle.
     * 
     * @return vehicleType
     */
    public java.lang.String getVehicleType() {
        return vehicleType;
    }


    /**
     * Sets the vehicleType value for this TransferVehicle.
     * 
     * @param vehicleType
     */
    public void setVehicleType(java.lang.String vehicleType) {
        this.vehicleType = vehicleType;
    }


    /**
     * Gets the vehicleTypeDescription value for this TransferVehicle.
     * 
     * @return vehicleTypeDescription
     */
    public java.lang.String getVehicleTypeDescription() {
        return vehicleTypeDescription;
    }


    /**
     * Sets the vehicleTypeDescription value for this TransferVehicle.
     * 
     * @param vehicleTypeDescription
     */
    public void setVehicleTypeDescription(java.lang.String vehicleTypeDescription) {
        this.vehicleTypeDescription = vehicleTypeDescription;
    }


    /**
     * Gets the vehicleTypeId value for this TransferVehicle.
     * 
     * @return vehicleTypeId
     */
    public int getVehicleTypeId() {
        return vehicleTypeId;
    }


    /**
     * Sets the vehicleTypeId value for this TransferVehicle.
     * 
     * @param vehicleTypeId
     */
    public void setVehicleTypeId(int vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }


    /**
     * Gets the supplierId value for this TransferVehicle.
     * 
     * @return supplierId
     */
    public int getSupplierId() {
        return supplierId;
    }


    /**
     * Sets the supplierId value for this TransferVehicle.
     * 
     * @param supplierId
     */
    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }


    /**
     * Gets the isOneWay value for this TransferVehicle.
     * 
     * @return isOneWay
     */
    public boolean isIsOneWay() {
        return isOneWay;
    }


    /**
     * Sets the isOneWay value for this TransferVehicle.
     * 
     * @param isOneWay
     */
    public void setIsOneWay(boolean isOneWay) {
        this.isOneWay = isOneWay;
    }


    /**
     * Gets the amount value for this TransferVehicle.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransferVehicle.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the numberOfVehicles value for this TransferVehicle.
     * 
     * @return numberOfVehicles
     */
    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }


    /**
     * Sets the numberOfVehicles value for this TransferVehicle.
     * 
     * @param numberOfVehicles
     */
    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }


    /**
     * Gets the isPerPax value for this TransferVehicle.
     * 
     * @return isPerPax
     */
    public boolean isIsPerPax() {
        return isPerPax;
    }


    /**
     * Sets the isPerPax value for this TransferVehicle.
     * 
     * @param isPerPax
     */
    public void setIsPerPax(boolean isPerPax) {
        this.isPerPax = isPerPax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferVehicle)) return false;
        TransferVehicle other = (TransferVehicle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.vehicleId == other.getVehicleId() &&
            ((this.vehicleType==null && other.getVehicleType()==null) || 
             (this.vehicleType!=null &&
              this.vehicleType.equals(other.getVehicleType()))) &&
            ((this.vehicleTypeDescription==null && other.getVehicleTypeDescription()==null) || 
             (this.vehicleTypeDescription!=null &&
              this.vehicleTypeDescription.equals(other.getVehicleTypeDescription()))) &&
            this.vehicleTypeId == other.getVehicleTypeId() &&
            this.supplierId == other.getSupplierId() &&
            this.isOneWay == other.isIsOneWay() &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            this.numberOfVehicles == other.getNumberOfVehicles() &&
            this.isPerPax == other.isIsPerPax();
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
        _hashCode += getVehicleId();
        if (getVehicleType() != null) {
            _hashCode += getVehicleType().hashCode();
        }
        if (getVehicleTypeDescription() != null) {
            _hashCode += getVehicleTypeDescription().hashCode();
        }
        _hashCode += getVehicleTypeId();
        _hashCode += getSupplierId();
        _hashCode += (isIsOneWay() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        _hashCode += getNumberOfVehicles();
        _hashCode += (isIsPerPax() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferVehicle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferVehicle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "VehicleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "VehicleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleTypeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "VehicleTypeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "VehicleTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SupplierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOneWay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "IsOneWay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfVehicles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "NumberOfVehicles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPerPax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "IsPerPax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
