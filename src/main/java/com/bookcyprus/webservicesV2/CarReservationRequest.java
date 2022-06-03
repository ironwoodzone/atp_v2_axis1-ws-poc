/**
 * CarReservationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class CarReservationRequest  implements java.io.Serializable {
    private int vehicleId;

    private int carServiceId;

    private int pickupPointLocationId;

    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    private java.lang.String timeFrom;

    private java.lang.String timeTo;

    private int driverAge;

    private int[] supplementIds;

    private java.lang.String externalData;

    public CarReservationRequest() {
    }

    public CarReservationRequest(
           int vehicleId,
           int carServiceId,
           int pickupPointLocationId,
           java.util.Calendar fromDate,
           java.util.Calendar toDate,
           java.lang.String timeFrom,
           java.lang.String timeTo,
           int driverAge,
           int[] supplementIds,
           java.lang.String externalData) {
           this.vehicleId = vehicleId;
           this.carServiceId = carServiceId;
           this.pickupPointLocationId = pickupPointLocationId;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.timeFrom = timeFrom;
           this.timeTo = timeTo;
           this.driverAge = driverAge;
           this.supplementIds = supplementIds;
           this.externalData = externalData;
    }


    /**
     * Gets the vehicleId value for this CarReservationRequest.
     * 
     * @return vehicleId
     */
    public int getVehicleId() {
        return vehicleId;
    }


    /**
     * Sets the vehicleId value for this CarReservationRequest.
     * 
     * @param vehicleId
     */
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }


    /**
     * Gets the carServiceId value for this CarReservationRequest.
     * 
     * @return carServiceId
     */
    public int getCarServiceId() {
        return carServiceId;
    }


    /**
     * Sets the carServiceId value for this CarReservationRequest.
     * 
     * @param carServiceId
     */
    public void setCarServiceId(int carServiceId) {
        this.carServiceId = carServiceId;
    }


    /**
     * Gets the pickupPointLocationId value for this CarReservationRequest.
     * 
     * @return pickupPointLocationId
     */
    public int getPickupPointLocationId() {
        return pickupPointLocationId;
    }


    /**
     * Sets the pickupPointLocationId value for this CarReservationRequest.
     * 
     * @param pickupPointLocationId
     */
    public void setPickupPointLocationId(int pickupPointLocationId) {
        this.pickupPointLocationId = pickupPointLocationId;
    }


    /**
     * Gets the fromDate value for this CarReservationRequest.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this CarReservationRequest.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this CarReservationRequest.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this CarReservationRequest.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the timeFrom value for this CarReservationRequest.
     * 
     * @return timeFrom
     */
    public java.lang.String getTimeFrom() {
        return timeFrom;
    }


    /**
     * Sets the timeFrom value for this CarReservationRequest.
     * 
     * @param timeFrom
     */
    public void setTimeFrom(java.lang.String timeFrom) {
        this.timeFrom = timeFrom;
    }


    /**
     * Gets the timeTo value for this CarReservationRequest.
     * 
     * @return timeTo
     */
    public java.lang.String getTimeTo() {
        return timeTo;
    }


    /**
     * Sets the timeTo value for this CarReservationRequest.
     * 
     * @param timeTo
     */
    public void setTimeTo(java.lang.String timeTo) {
        this.timeTo = timeTo;
    }


    /**
     * Gets the driverAge value for this CarReservationRequest.
     * 
     * @return driverAge
     */
    public int getDriverAge() {
        return driverAge;
    }


    /**
     * Sets the driverAge value for this CarReservationRequest.
     * 
     * @param driverAge
     */
    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }


    /**
     * Gets the supplementIds value for this CarReservationRequest.
     * 
     * @return supplementIds
     */
    public int[] getSupplementIds() {
        return supplementIds;
    }


    /**
     * Sets the supplementIds value for this CarReservationRequest.
     * 
     * @param supplementIds
     */
    public void setSupplementIds(int[] supplementIds) {
        this.supplementIds = supplementIds;
    }


    /**
     * Gets the externalData value for this CarReservationRequest.
     * 
     * @return externalData
     */
    public java.lang.String getExternalData() {
        return externalData;
    }


    /**
     * Sets the externalData value for this CarReservationRequest.
     * 
     * @param externalData
     */
    public void setExternalData(java.lang.String externalData) {
        this.externalData = externalData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarReservationRequest)) return false;
        CarReservationRequest other = (CarReservationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.vehicleId == other.getVehicleId() &&
            this.carServiceId == other.getCarServiceId() &&
            this.pickupPointLocationId == other.getPickupPointLocationId() &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            ((this.timeFrom==null && other.getTimeFrom()==null) || 
             (this.timeFrom!=null &&
              this.timeFrom.equals(other.getTimeFrom()))) &&
            ((this.timeTo==null && other.getTimeTo()==null) || 
             (this.timeTo!=null &&
              this.timeTo.equals(other.getTimeTo()))) &&
            this.driverAge == other.getDriverAge() &&
            ((this.supplementIds==null && other.getSupplementIds()==null) || 
             (this.supplementIds!=null &&
              java.util.Arrays.equals(this.supplementIds, other.getSupplementIds()))) &&
            ((this.externalData==null && other.getExternalData()==null) || 
             (this.externalData!=null &&
              this.externalData.equals(other.getExternalData())));
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
        _hashCode += getCarServiceId();
        _hashCode += getPickupPointLocationId();
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getTimeFrom() != null) {
            _hashCode += getTimeFrom().hashCode();
        }
        if (getTimeTo() != null) {
            _hashCode += getTimeTo().hashCode();
        }
        _hashCode += getDriverAge();
        if (getSupplementIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupplementIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupplementIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalData() != null) {
            _hashCode += getExternalData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarReservationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarReservationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "VehicleId"));
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
        elemField.setFieldName("pickupPointLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PickupPointLocationId"));
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
        elemField.setFieldName("timeFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TimeFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TimeTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driverAge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "DriverAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplementIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SupplementIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExternalData"));
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
