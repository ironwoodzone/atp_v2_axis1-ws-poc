/**
 * TransferReservationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class TransferReservationRequest  implements java.io.Serializable {
    private int vehicleId;

    private int transferServiceId;

    private int fromLocationId;

    private int toLocationId;

    private int fromHotelId;

    private int toHotelId;

    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    private java.lang.String fromTimeString;

    private java.lang.String toTimeString;

    private int numberOfVehicles;

    private boolean isOneWay;

    private int passengers;

    private java.lang.String externalData;

    private com.bookcyprus.webservicesV2.TransferReservationData transferData;

    public TransferReservationRequest() {
    }

    public TransferReservationRequest(
           int vehicleId,
           int transferServiceId,
           int fromLocationId,
           int toLocationId,
           int fromHotelId,
           int toHotelId,
           java.util.Calendar fromDate,
           java.util.Calendar toDate,
           java.lang.String fromTimeString,
           java.lang.String toTimeString,
           int numberOfVehicles,
           boolean isOneWay,
           int passengers,
           java.lang.String externalData,
           com.bookcyprus.webservicesV2.TransferReservationData transferData) {
           this.vehicleId = vehicleId;
           this.transferServiceId = transferServiceId;
           this.fromLocationId = fromLocationId;
           this.toLocationId = toLocationId;
           this.fromHotelId = fromHotelId;
           this.toHotelId = toHotelId;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.fromTimeString = fromTimeString;
           this.toTimeString = toTimeString;
           this.numberOfVehicles = numberOfVehicles;
           this.isOneWay = isOneWay;
           this.passengers = passengers;
           this.externalData = externalData;
           this.transferData = transferData;
    }


    /**
     * Gets the vehicleId value for this TransferReservationRequest.
     * 
     * @return vehicleId
     */
    public int getVehicleId() {
        return vehicleId;
    }


    /**
     * Sets the vehicleId value for this TransferReservationRequest.
     * 
     * @param vehicleId
     */
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }


    /**
     * Gets the transferServiceId value for this TransferReservationRequest.
     * 
     * @return transferServiceId
     */
    public int getTransferServiceId() {
        return transferServiceId;
    }


    /**
     * Sets the transferServiceId value for this TransferReservationRequest.
     * 
     * @param transferServiceId
     */
    public void setTransferServiceId(int transferServiceId) {
        this.transferServiceId = transferServiceId;
    }


    /**
     * Gets the fromLocationId value for this TransferReservationRequest.
     * 
     * @return fromLocationId
     */
    public int getFromLocationId() {
        return fromLocationId;
    }


    /**
     * Sets the fromLocationId value for this TransferReservationRequest.
     * 
     * @param fromLocationId
     */
    public void setFromLocationId(int fromLocationId) {
        this.fromLocationId = fromLocationId;
    }


    /**
     * Gets the toLocationId value for this TransferReservationRequest.
     * 
     * @return toLocationId
     */
    public int getToLocationId() {
        return toLocationId;
    }


    /**
     * Sets the toLocationId value for this TransferReservationRequest.
     * 
     * @param toLocationId
     */
    public void setToLocationId(int toLocationId) {
        this.toLocationId = toLocationId;
    }


    /**
     * Gets the fromHotelId value for this TransferReservationRequest.
     * 
     * @return fromHotelId
     */
    public int getFromHotelId() {
        return fromHotelId;
    }


    /**
     * Sets the fromHotelId value for this TransferReservationRequest.
     * 
     * @param fromHotelId
     */
    public void setFromHotelId(int fromHotelId) {
        this.fromHotelId = fromHotelId;
    }


    /**
     * Gets the toHotelId value for this TransferReservationRequest.
     * 
     * @return toHotelId
     */
    public int getToHotelId() {
        return toHotelId;
    }


    /**
     * Sets the toHotelId value for this TransferReservationRequest.
     * 
     * @param toHotelId
     */
    public void setToHotelId(int toHotelId) {
        this.toHotelId = toHotelId;
    }


    /**
     * Gets the fromDate value for this TransferReservationRequest.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this TransferReservationRequest.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this TransferReservationRequest.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this TransferReservationRequest.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the fromTimeString value for this TransferReservationRequest.
     * 
     * @return fromTimeString
     */
    public java.lang.String getFromTimeString() {
        return fromTimeString;
    }


    /**
     * Sets the fromTimeString value for this TransferReservationRequest.
     * 
     * @param fromTimeString
     */
    public void setFromTimeString(java.lang.String fromTimeString) {
        this.fromTimeString = fromTimeString;
    }


    /**
     * Gets the toTimeString value for this TransferReservationRequest.
     * 
     * @return toTimeString
     */
    public java.lang.String getToTimeString() {
        return toTimeString;
    }


    /**
     * Sets the toTimeString value for this TransferReservationRequest.
     * 
     * @param toTimeString
     */
    public void setToTimeString(java.lang.String toTimeString) {
        this.toTimeString = toTimeString;
    }


    /**
     * Gets the numberOfVehicles value for this TransferReservationRequest.
     * 
     * @return numberOfVehicles
     */
    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }


    /**
     * Sets the numberOfVehicles value for this TransferReservationRequest.
     * 
     * @param numberOfVehicles
     */
    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }


    /**
     * Gets the isOneWay value for this TransferReservationRequest.
     * 
     * @return isOneWay
     */
    public boolean isIsOneWay() {
        return isOneWay;
    }


    /**
     * Sets the isOneWay value for this TransferReservationRequest.
     * 
     * @param isOneWay
     */
    public void setIsOneWay(boolean isOneWay) {
        this.isOneWay = isOneWay;
    }


    /**
     * Gets the passengers value for this TransferReservationRequest.
     * 
     * @return passengers
     */
    public int getPassengers() {
        return passengers;
    }


    /**
     * Sets the passengers value for this TransferReservationRequest.
     * 
     * @param passengers
     */
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }


    /**
     * Gets the externalData value for this TransferReservationRequest.
     * 
     * @return externalData
     */
    public java.lang.String getExternalData() {
        return externalData;
    }


    /**
     * Sets the externalData value for this TransferReservationRequest.
     * 
     * @param externalData
     */
    public void setExternalData(java.lang.String externalData) {
        this.externalData = externalData;
    }


    /**
     * Gets the transferData value for this TransferReservationRequest.
     * 
     * @return transferData
     */
    public com.bookcyprus.webservicesV2.TransferReservationData getTransferData() {
        return transferData;
    }


    /**
     * Sets the transferData value for this TransferReservationRequest.
     * 
     * @param transferData
     */
    public void setTransferData(com.bookcyprus.webservicesV2.TransferReservationData transferData) {
        this.transferData = transferData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferReservationRequest)) return false;
        TransferReservationRequest other = (TransferReservationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.vehicleId == other.getVehicleId() &&
            this.transferServiceId == other.getTransferServiceId() &&
            this.fromLocationId == other.getFromLocationId() &&
            this.toLocationId == other.getToLocationId() &&
            this.fromHotelId == other.getFromHotelId() &&
            this.toHotelId == other.getToHotelId() &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            ((this.fromTimeString==null && other.getFromTimeString()==null) || 
             (this.fromTimeString!=null &&
              this.fromTimeString.equals(other.getFromTimeString()))) &&
            ((this.toTimeString==null && other.getToTimeString()==null) || 
             (this.toTimeString!=null &&
              this.toTimeString.equals(other.getToTimeString()))) &&
            this.numberOfVehicles == other.getNumberOfVehicles() &&
            this.isOneWay == other.isIsOneWay() &&
            this.passengers == other.getPassengers() &&
            ((this.externalData==null && other.getExternalData()==null) || 
             (this.externalData!=null &&
              this.externalData.equals(other.getExternalData()))) &&
            ((this.transferData==null && other.getTransferData()==null) || 
             (this.transferData!=null &&
              this.transferData.equals(other.getTransferData())));
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
        _hashCode += getTransferServiceId();
        _hashCode += getFromLocationId();
        _hashCode += getToLocationId();
        _hashCode += getFromHotelId();
        _hashCode += getToHotelId();
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getFromTimeString() != null) {
            _hashCode += getFromTimeString().hashCode();
        }
        if (getToTimeString() != null) {
            _hashCode += getToTimeString().hashCode();
        }
        _hashCode += getNumberOfVehicles();
        _hashCode += (isIsOneWay() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getPassengers();
        if (getExternalData() != null) {
            _hashCode += getExternalData().hashCode();
        }
        if (getTransferData() != null) {
            _hashCode += getTransferData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferReservationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferReservationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "VehicleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "FromLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ToLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromHotelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "FromHotelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toHotelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ToHotelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "FromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ToDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromTimeString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "FromTimeString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toTimeString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ToTimeString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfVehicles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "NumberOfVehicles"));
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
        elemField.setFieldName("passengers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Passengers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExternalData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferReservationData"));
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
