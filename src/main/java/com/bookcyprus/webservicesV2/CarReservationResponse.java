/**
 * CarReservationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class CarReservationResponse  implements java.io.Serializable {
    private int reservationDetailId;

    private int carServiceId;

    private java.lang.String carServiceName;

    private int vehicleId;

    private java.lang.String vehicleDescription;

    private com.bookcyprus.webservicesV2.CarGroupSupplement[] supplements;

    private com.bookcyprus.webservicesV2.Location pickupPointLocation;

    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    private java.math.BigDecimal amount;

    private java.lang.String status;

    private java.lang.String externalData;

    private com.bookcyprus.webservicesV2.BookingConditionItemDetail[] cancellationPolicy;

    public CarReservationResponse() {
    }

    public CarReservationResponse(
           int reservationDetailId,
           int carServiceId,
           java.lang.String carServiceName,
           int vehicleId,
           java.lang.String vehicleDescription,
           com.bookcyprus.webservicesV2.CarGroupSupplement[] supplements,
           com.bookcyprus.webservicesV2.Location pickupPointLocation,
           java.util.Calendar fromDate,
           java.util.Calendar toDate,
           java.math.BigDecimal amount,
           java.lang.String status,
           java.lang.String externalData,
           com.bookcyprus.webservicesV2.BookingConditionItemDetail[] cancellationPolicy) {
           this.reservationDetailId = reservationDetailId;
           this.carServiceId = carServiceId;
           this.carServiceName = carServiceName;
           this.vehicleId = vehicleId;
           this.vehicleDescription = vehicleDescription;
           this.supplements = supplements;
           this.pickupPointLocation = pickupPointLocation;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.amount = amount;
           this.status = status;
           this.externalData = externalData;
           this.cancellationPolicy = cancellationPolicy;
    }


    /**
     * Gets the reservationDetailId value for this CarReservationResponse.
     * 
     * @return reservationDetailId
     */
    public int getReservationDetailId() {
        return reservationDetailId;
    }


    /**
     * Sets the reservationDetailId value for this CarReservationResponse.
     * 
     * @param reservationDetailId
     */
    public void setReservationDetailId(int reservationDetailId) {
        this.reservationDetailId = reservationDetailId;
    }


    /**
     * Gets the carServiceId value for this CarReservationResponse.
     * 
     * @return carServiceId
     */
    public int getCarServiceId() {
        return carServiceId;
    }


    /**
     * Sets the carServiceId value for this CarReservationResponse.
     * 
     * @param carServiceId
     */
    public void setCarServiceId(int carServiceId) {
        this.carServiceId = carServiceId;
    }


    /**
     * Gets the carServiceName value for this CarReservationResponse.
     * 
     * @return carServiceName
     */
    public java.lang.String getCarServiceName() {
        return carServiceName;
    }


    /**
     * Sets the carServiceName value for this CarReservationResponse.
     * 
     * @param carServiceName
     */
    public void setCarServiceName(java.lang.String carServiceName) {
        this.carServiceName = carServiceName;
    }


    /**
     * Gets the vehicleId value for this CarReservationResponse.
     * 
     * @return vehicleId
     */
    public int getVehicleId() {
        return vehicleId;
    }


    /**
     * Sets the vehicleId value for this CarReservationResponse.
     * 
     * @param vehicleId
     */
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }


    /**
     * Gets the vehicleDescription value for this CarReservationResponse.
     * 
     * @return vehicleDescription
     */
    public java.lang.String getVehicleDescription() {
        return vehicleDescription;
    }


    /**
     * Sets the vehicleDescription value for this CarReservationResponse.
     * 
     * @param vehicleDescription
     */
    public void setVehicleDescription(java.lang.String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }


    /**
     * Gets the supplements value for this CarReservationResponse.
     * 
     * @return supplements
     */
    public com.bookcyprus.webservicesV2.CarGroupSupplement[] getSupplements() {
        return supplements;
    }


    /**
     * Sets the supplements value for this CarReservationResponse.
     * 
     * @param supplements
     */
    public void setSupplements(com.bookcyprus.webservicesV2.CarGroupSupplement[] supplements) {
        this.supplements = supplements;
    }


    /**
     * Gets the pickupPointLocation value for this CarReservationResponse.
     * 
     * @return pickupPointLocation
     */
    public com.bookcyprus.webservicesV2.Location getPickupPointLocation() {
        return pickupPointLocation;
    }


    /**
     * Sets the pickupPointLocation value for this CarReservationResponse.
     * 
     * @param pickupPointLocation
     */
    public void setPickupPointLocation(com.bookcyprus.webservicesV2.Location pickupPointLocation) {
        this.pickupPointLocation = pickupPointLocation;
    }


    /**
     * Gets the fromDate value for this CarReservationResponse.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this CarReservationResponse.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this CarReservationResponse.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this CarReservationResponse.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the amount value for this CarReservationResponse.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CarReservationResponse.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the status value for this CarReservationResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CarReservationResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the externalData value for this CarReservationResponse.
     * 
     * @return externalData
     */
    public java.lang.String getExternalData() {
        return externalData;
    }


    /**
     * Sets the externalData value for this CarReservationResponse.
     * 
     * @param externalData
     */
    public void setExternalData(java.lang.String externalData) {
        this.externalData = externalData;
    }


    /**
     * Gets the cancellationPolicy value for this CarReservationResponse.
     * 
     * @return cancellationPolicy
     */
    public com.bookcyprus.webservicesV2.BookingConditionItemDetail[] getCancellationPolicy() {
        return cancellationPolicy;
    }


    /**
     * Sets the cancellationPolicy value for this CarReservationResponse.
     * 
     * @param cancellationPolicy
     */
    public void setCancellationPolicy(com.bookcyprus.webservicesV2.BookingConditionItemDetail[] cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarReservationResponse)) return false;
        CarReservationResponse other = (CarReservationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.reservationDetailId == other.getReservationDetailId() &&
            this.carServiceId == other.getCarServiceId() &&
            ((this.carServiceName==null && other.getCarServiceName()==null) || 
             (this.carServiceName!=null &&
              this.carServiceName.equals(other.getCarServiceName()))) &&
            this.vehicleId == other.getVehicleId() &&
            ((this.vehicleDescription==null && other.getVehicleDescription()==null) || 
             (this.vehicleDescription!=null &&
              this.vehicleDescription.equals(other.getVehicleDescription()))) &&
            ((this.supplements==null && other.getSupplements()==null) || 
             (this.supplements!=null &&
              java.util.Arrays.equals(this.supplements, other.getSupplements()))) &&
            ((this.pickupPointLocation==null && other.getPickupPointLocation()==null) || 
             (this.pickupPointLocation!=null &&
              this.pickupPointLocation.equals(other.getPickupPointLocation()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
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
        _hashCode += getCarServiceId();
        if (getCarServiceName() != null) {
            _hashCode += getCarServiceName().hashCode();
        }
        _hashCode += getVehicleId();
        if (getVehicleDescription() != null) {
            _hashCode += getVehicleDescription().hashCode();
        }
        if (getSupplements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupplements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupplements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPickupPointLocation() != null) {
            _hashCode += getPickupPointLocation().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(CarReservationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarReservationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationDetailId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationDetailId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("vehicleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "VehicleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "VehicleDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Supplements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarGroupSupplement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarGroupSupplement"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupPointLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PickupPointLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Location"));
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
