/**
 * TransferReservationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class TransferReservationResponse  implements java.io.Serializable {
    private int reservationDetailId;

    private int transferServiceId;

    private java.lang.String transferServiceName;

    private int vehicleId;

    private java.lang.String vehicleTypeName;

    private com.bookcyprus.webservicesV2.Location fromLocation;

    private com.bookcyprus.webservicesV2.Location toLocation;

    private int fromHotelId;

    private java.lang.String fromHotelName;

    private int toHotelId;

    private java.lang.String toHotelName;

    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    private int numberOfVehicles;

    private boolean isOneWay;

    private java.math.BigDecimal amount;

    private java.lang.String status;

    private java.lang.String externalData;

    private com.bookcyprus.webservicesV2.BookingConditionItemDetail[] cancellationPolicy;

    public TransferReservationResponse() {
    }

    public TransferReservationResponse(
           int reservationDetailId,
           int transferServiceId,
           java.lang.String transferServiceName,
           int vehicleId,
           java.lang.String vehicleTypeName,
           com.bookcyprus.webservicesV2.Location fromLocation,
           com.bookcyprus.webservicesV2.Location toLocation,
           int fromHotelId,
           java.lang.String fromHotelName,
           int toHotelId,
           java.lang.String toHotelName,
           java.util.Calendar fromDate,
           java.util.Calendar toDate,
           int numberOfVehicles,
           boolean isOneWay,
           java.math.BigDecimal amount,
           java.lang.String status,
           java.lang.String externalData,
           com.bookcyprus.webservicesV2.BookingConditionItemDetail[] cancellationPolicy) {
           this.reservationDetailId = reservationDetailId;
           this.transferServiceId = transferServiceId;
           this.transferServiceName = transferServiceName;
           this.vehicleId = vehicleId;
           this.vehicleTypeName = vehicleTypeName;
           this.fromLocation = fromLocation;
           this.toLocation = toLocation;
           this.fromHotelId = fromHotelId;
           this.fromHotelName = fromHotelName;
           this.toHotelId = toHotelId;
           this.toHotelName = toHotelName;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.numberOfVehicles = numberOfVehicles;
           this.isOneWay = isOneWay;
           this.amount = amount;
           this.status = status;
           this.externalData = externalData;
           this.cancellationPolicy = cancellationPolicy;
    }


    /**
     * Gets the reservationDetailId value for this TransferReservationResponse.
     * 
     * @return reservationDetailId
     */
    public int getReservationDetailId() {
        return reservationDetailId;
    }


    /**
     * Sets the reservationDetailId value for this TransferReservationResponse.
     * 
     * @param reservationDetailId
     */
    public void setReservationDetailId(int reservationDetailId) {
        this.reservationDetailId = reservationDetailId;
    }


    /**
     * Gets the transferServiceId value for this TransferReservationResponse.
     * 
     * @return transferServiceId
     */
    public int getTransferServiceId() {
        return transferServiceId;
    }


    /**
     * Sets the transferServiceId value for this TransferReservationResponse.
     * 
     * @param transferServiceId
     */
    public void setTransferServiceId(int transferServiceId) {
        this.transferServiceId = transferServiceId;
    }


    /**
     * Gets the transferServiceName value for this TransferReservationResponse.
     * 
     * @return transferServiceName
     */
    public java.lang.String getTransferServiceName() {
        return transferServiceName;
    }


    /**
     * Sets the transferServiceName value for this TransferReservationResponse.
     * 
     * @param transferServiceName
     */
    public void setTransferServiceName(java.lang.String transferServiceName) {
        this.transferServiceName = transferServiceName;
    }


    /**
     * Gets the vehicleId value for this TransferReservationResponse.
     * 
     * @return vehicleId
     */
    public int getVehicleId() {
        return vehicleId;
    }


    /**
     * Sets the vehicleId value for this TransferReservationResponse.
     * 
     * @param vehicleId
     */
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }


    /**
     * Gets the vehicleTypeName value for this TransferReservationResponse.
     * 
     * @return vehicleTypeName
     */
    public java.lang.String getVehicleTypeName() {
        return vehicleTypeName;
    }


    /**
     * Sets the vehicleTypeName value for this TransferReservationResponse.
     * 
     * @param vehicleTypeName
     */
    public void setVehicleTypeName(java.lang.String vehicleTypeName) {
        this.vehicleTypeName = vehicleTypeName;
    }


    /**
     * Gets the fromLocation value for this TransferReservationResponse.
     * 
     * @return fromLocation
     */
    public com.bookcyprus.webservicesV2.Location getFromLocation() {
        return fromLocation;
    }


    /**
     * Sets the fromLocation value for this TransferReservationResponse.
     * 
     * @param fromLocation
     */
    public void setFromLocation(com.bookcyprus.webservicesV2.Location fromLocation) {
        this.fromLocation = fromLocation;
    }


    /**
     * Gets the toLocation value for this TransferReservationResponse.
     * 
     * @return toLocation
     */
    public com.bookcyprus.webservicesV2.Location getToLocation() {
        return toLocation;
    }


    /**
     * Sets the toLocation value for this TransferReservationResponse.
     * 
     * @param toLocation
     */
    public void setToLocation(com.bookcyprus.webservicesV2.Location toLocation) {
        this.toLocation = toLocation;
    }


    /**
     * Gets the fromHotelId value for this TransferReservationResponse.
     * 
     * @return fromHotelId
     */
    public int getFromHotelId() {
        return fromHotelId;
    }


    /**
     * Sets the fromHotelId value for this TransferReservationResponse.
     * 
     * @param fromHotelId
     */
    public void setFromHotelId(int fromHotelId) {
        this.fromHotelId = fromHotelId;
    }


    /**
     * Gets the fromHotelName value for this TransferReservationResponse.
     * 
     * @return fromHotelName
     */
    public java.lang.String getFromHotelName() {
        return fromHotelName;
    }


    /**
     * Sets the fromHotelName value for this TransferReservationResponse.
     * 
     * @param fromHotelName
     */
    public void setFromHotelName(java.lang.String fromHotelName) {
        this.fromHotelName = fromHotelName;
    }


    /**
     * Gets the toHotelId value for this TransferReservationResponse.
     * 
     * @return toHotelId
     */
    public int getToHotelId() {
        return toHotelId;
    }


    /**
     * Sets the toHotelId value for this TransferReservationResponse.
     * 
     * @param toHotelId
     */
    public void setToHotelId(int toHotelId) {
        this.toHotelId = toHotelId;
    }


    /**
     * Gets the toHotelName value for this TransferReservationResponse.
     * 
     * @return toHotelName
     */
    public java.lang.String getToHotelName() {
        return toHotelName;
    }


    /**
     * Sets the toHotelName value for this TransferReservationResponse.
     * 
     * @param toHotelName
     */
    public void setToHotelName(java.lang.String toHotelName) {
        this.toHotelName = toHotelName;
    }


    /**
     * Gets the fromDate value for this TransferReservationResponse.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this TransferReservationResponse.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this TransferReservationResponse.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this TransferReservationResponse.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the numberOfVehicles value for this TransferReservationResponse.
     * 
     * @return numberOfVehicles
     */
    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }


    /**
     * Sets the numberOfVehicles value for this TransferReservationResponse.
     * 
     * @param numberOfVehicles
     */
    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }


    /**
     * Gets the isOneWay value for this TransferReservationResponse.
     * 
     * @return isOneWay
     */
    public boolean isIsOneWay() {
        return isOneWay;
    }


    /**
     * Sets the isOneWay value for this TransferReservationResponse.
     * 
     * @param isOneWay
     */
    public void setIsOneWay(boolean isOneWay) {
        this.isOneWay = isOneWay;
    }


    /**
     * Gets the amount value for this TransferReservationResponse.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransferReservationResponse.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the status value for this TransferReservationResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TransferReservationResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the externalData value for this TransferReservationResponse.
     * 
     * @return externalData
     */
    public java.lang.String getExternalData() {
        return externalData;
    }


    /**
     * Sets the externalData value for this TransferReservationResponse.
     * 
     * @param externalData
     */
    public void setExternalData(java.lang.String externalData) {
        this.externalData = externalData;
    }


    /**
     * Gets the cancellationPolicy value for this TransferReservationResponse.
     * 
     * @return cancellationPolicy
     */
    public com.bookcyprus.webservicesV2.BookingConditionItemDetail[] getCancellationPolicy() {
        return cancellationPolicy;
    }


    /**
     * Sets the cancellationPolicy value for this TransferReservationResponse.
     * 
     * @param cancellationPolicy
     */
    public void setCancellationPolicy(com.bookcyprus.webservicesV2.BookingConditionItemDetail[] cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferReservationResponse)) return false;
        TransferReservationResponse other = (TransferReservationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.reservationDetailId == other.getReservationDetailId() &&
            this.transferServiceId == other.getTransferServiceId() &&
            ((this.transferServiceName==null && other.getTransferServiceName()==null) || 
             (this.transferServiceName!=null &&
              this.transferServiceName.equals(other.getTransferServiceName()))) &&
            this.vehicleId == other.getVehicleId() &&
            ((this.vehicleTypeName==null && other.getVehicleTypeName()==null) || 
             (this.vehicleTypeName!=null &&
              this.vehicleTypeName.equals(other.getVehicleTypeName()))) &&
            ((this.fromLocation==null && other.getFromLocation()==null) || 
             (this.fromLocation!=null &&
              this.fromLocation.equals(other.getFromLocation()))) &&
            ((this.toLocation==null && other.getToLocation()==null) || 
             (this.toLocation!=null &&
              this.toLocation.equals(other.getToLocation()))) &&
            this.fromHotelId == other.getFromHotelId() &&
            ((this.fromHotelName==null && other.getFromHotelName()==null) || 
             (this.fromHotelName!=null &&
              this.fromHotelName.equals(other.getFromHotelName()))) &&
            this.toHotelId == other.getToHotelId() &&
            ((this.toHotelName==null && other.getToHotelName()==null) || 
             (this.toHotelName!=null &&
              this.toHotelName.equals(other.getToHotelName()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            this.numberOfVehicles == other.getNumberOfVehicles() &&
            this.isOneWay == other.isIsOneWay() &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.externalData==null && other.getExternalData()==null) || 
             (this.externalData!=null &&
              this.externalData.equals(other.getExternalData()))) &&
            ((this.cancellationPolicy==null && other.getCancellationPolicy()==null) || 
             (this.cancellationPolicy!=null &&
              java.util.Arrays.equals(this.cancellationPolicy, other.getCancellationPolicy())));
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
        _hashCode += getReservationDetailId();
        _hashCode += getTransferServiceId();
        if (getTransferServiceName() != null) {
            _hashCode += getTransferServiceName().hashCode();
        }
        _hashCode += getVehicleId();
        if (getVehicleTypeName() != null) {
            _hashCode += getVehicleTypeName().hashCode();
        }
        if (getFromLocation() != null) {
            _hashCode += getFromLocation().hashCode();
        }
        if (getToLocation() != null) {
            _hashCode += getToLocation().hashCode();
        }
        _hashCode += getFromHotelId();
        if (getFromHotelName() != null) {
            _hashCode += getFromHotelName().hashCode();
        }
        _hashCode += getToHotelId();
        if (getToHotelName() != null) {
            _hashCode += getToHotelName().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        _hashCode += getNumberOfVehicles();
        _hashCode += (isIsOneWay() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getExternalData() != null) {
            _hashCode += getExternalData().hashCode();
        }
        if (getCancellationPolicy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCancellationPolicy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCancellationPolicy(), i);
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
        new org.apache.axis.description.TypeDesc(TransferReservationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferReservationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationDetailId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationDetailId"));
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
        elemField.setFieldName("transferServiceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "VehicleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "VehicleTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "FromLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Location"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ToLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Location"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromHotelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "FromHotelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromHotelName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "FromHotelName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toHotelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ToHotelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toHotelName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ToHotelName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("cancellationPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CancellationPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingConditionItemDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingConditionItemDetail"));
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
