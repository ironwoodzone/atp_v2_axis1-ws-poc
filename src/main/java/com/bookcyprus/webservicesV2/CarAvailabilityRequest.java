/**
 * CarAvailabilityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class CarAvailabilityRequest  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.RequestBase baseRequest;

    private int locationId;

    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    private java.lang.String timeFrom;

    private java.lang.String timeTo;

    private int driverAge;

    public CarAvailabilityRequest() {
    }

    public CarAvailabilityRequest(
           com.bookcyprus.webservicesV2.RequestBase baseRequest,
           int locationId,
           java.util.Calendar fromDate,
           java.util.Calendar toDate,
           java.lang.String timeFrom,
           java.lang.String timeTo,
           int driverAge) {
           this.baseRequest = baseRequest;
           this.locationId = locationId;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.timeFrom = timeFrom;
           this.timeTo = timeTo;
           this.driverAge = driverAge;
    }


    /**
     * Gets the baseRequest value for this CarAvailabilityRequest.
     * 
     * @return baseRequest
     */
    public com.bookcyprus.webservicesV2.RequestBase getBaseRequest() {
        return baseRequest;
    }


    /**
     * Sets the baseRequest value for this CarAvailabilityRequest.
     * 
     * @param baseRequest
     */
    public void setBaseRequest(com.bookcyprus.webservicesV2.RequestBase baseRequest) {
        this.baseRequest = baseRequest;
    }


    /**
     * Gets the locationId value for this CarAvailabilityRequest.
     * 
     * @return locationId
     */
    public int getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this CarAvailabilityRequest.
     * 
     * @param locationId
     */
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the fromDate value for this CarAvailabilityRequest.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this CarAvailabilityRequest.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this CarAvailabilityRequest.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this CarAvailabilityRequest.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the timeFrom value for this CarAvailabilityRequest.
     * 
     * @return timeFrom
     */
    public java.lang.String getTimeFrom() {
        return timeFrom;
    }


    /**
     * Sets the timeFrom value for this CarAvailabilityRequest.
     * 
     * @param timeFrom
     */
    public void setTimeFrom(java.lang.String timeFrom) {
        this.timeFrom = timeFrom;
    }


    /**
     * Gets the timeTo value for this CarAvailabilityRequest.
     * 
     * @return timeTo
     */
    public java.lang.String getTimeTo() {
        return timeTo;
    }


    /**
     * Sets the timeTo value for this CarAvailabilityRequest.
     * 
     * @param timeTo
     */
    public void setTimeTo(java.lang.String timeTo) {
        this.timeTo = timeTo;
    }


    /**
     * Gets the driverAge value for this CarAvailabilityRequest.
     * 
     * @return driverAge
     */
    public int getDriverAge() {
        return driverAge;
    }


    /**
     * Sets the driverAge value for this CarAvailabilityRequest.
     * 
     * @param driverAge
     */
    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarAvailabilityRequest)) return false;
        CarAvailabilityRequest other = (CarAvailabilityRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseRequest==null && other.getBaseRequest()==null) || 
             (this.baseRequest!=null &&
              this.baseRequest.equals(other.getBaseRequest()))) &&
            this.locationId == other.getLocationId() &&
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
            this.driverAge == other.getDriverAge();
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
        if (getBaseRequest() != null) {
            _hashCode += getBaseRequest().hashCode();
        }
        _hashCode += getLocationId();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarAvailabilityRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarAvailabilityRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RequestBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "LocationId"));
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
