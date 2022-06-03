/**
 * TransferAvailabilityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class TransferAvailabilityRequest  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.RequestBase baseRequest;

    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    private int fromLocationId;

    private int toLocationId;

    private int fromHotelId;

    private int toHotelId;

    private boolean isOneWay;

    private int passengers;

    public TransferAvailabilityRequest() {
    }

    public TransferAvailabilityRequest(
           com.bookcyprus.webservicesV2.RequestBase baseRequest,
           java.util.Calendar fromDate,
           java.util.Calendar toDate,
           int fromLocationId,
           int toLocationId,
           int fromHotelId,
           int toHotelId,
           boolean isOneWay,
           int passengers) {
           this.baseRequest = baseRequest;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.fromLocationId = fromLocationId;
           this.toLocationId = toLocationId;
           this.fromHotelId = fromHotelId;
           this.toHotelId = toHotelId;
           this.isOneWay = isOneWay;
           this.passengers = passengers;
    }


    /**
     * Gets the baseRequest value for this TransferAvailabilityRequest.
     * 
     * @return baseRequest
     */
    public com.bookcyprus.webservicesV2.RequestBase getBaseRequest() {
        return baseRequest;
    }


    /**
     * Sets the baseRequest value for this TransferAvailabilityRequest.
     * 
     * @param baseRequest
     */
    public void setBaseRequest(com.bookcyprus.webservicesV2.RequestBase baseRequest) {
        this.baseRequest = baseRequest;
    }


    /**
     * Gets the fromDate value for this TransferAvailabilityRequest.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this TransferAvailabilityRequest.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this TransferAvailabilityRequest.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this TransferAvailabilityRequest.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the fromLocationId value for this TransferAvailabilityRequest.
     * 
     * @return fromLocationId
     */
    public int getFromLocationId() {
        return fromLocationId;
    }


    /**
     * Sets the fromLocationId value for this TransferAvailabilityRequest.
     * 
     * @param fromLocationId
     */
    public void setFromLocationId(int fromLocationId) {
        this.fromLocationId = fromLocationId;
    }


    /**
     * Gets the toLocationId value for this TransferAvailabilityRequest.
     * 
     * @return toLocationId
     */
    public int getToLocationId() {
        return toLocationId;
    }


    /**
     * Sets the toLocationId value for this TransferAvailabilityRequest.
     * 
     * @param toLocationId
     */
    public void setToLocationId(int toLocationId) {
        this.toLocationId = toLocationId;
    }


    /**
     * Gets the fromHotelId value for this TransferAvailabilityRequest.
     * 
     * @return fromHotelId
     */
    public int getFromHotelId() {
        return fromHotelId;
    }


    /**
     * Sets the fromHotelId value for this TransferAvailabilityRequest.
     * 
     * @param fromHotelId
     */
    public void setFromHotelId(int fromHotelId) {
        this.fromHotelId = fromHotelId;
    }


    /**
     * Gets the toHotelId value for this TransferAvailabilityRequest.
     * 
     * @return toHotelId
     */
    public int getToHotelId() {
        return toHotelId;
    }


    /**
     * Sets the toHotelId value for this TransferAvailabilityRequest.
     * 
     * @param toHotelId
     */
    public void setToHotelId(int toHotelId) {
        this.toHotelId = toHotelId;
    }


    /**
     * Gets the isOneWay value for this TransferAvailabilityRequest.
     * 
     * @return isOneWay
     */
    public boolean isIsOneWay() {
        return isOneWay;
    }


    /**
     * Sets the isOneWay value for this TransferAvailabilityRequest.
     * 
     * @param isOneWay
     */
    public void setIsOneWay(boolean isOneWay) {
        this.isOneWay = isOneWay;
    }


    /**
     * Gets the passengers value for this TransferAvailabilityRequest.
     * 
     * @return passengers
     */
    public int getPassengers() {
        return passengers;
    }


    /**
     * Sets the passengers value for this TransferAvailabilityRequest.
     * 
     * @param passengers
     */
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferAvailabilityRequest)) return false;
        TransferAvailabilityRequest other = (TransferAvailabilityRequest) obj;
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
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            this.fromLocationId == other.getFromLocationId() &&
            this.toLocationId == other.getToLocationId() &&
            this.fromHotelId == other.getFromHotelId() &&
            this.toHotelId == other.getToHotelId() &&
            this.isOneWay == other.isIsOneWay() &&
            this.passengers == other.getPassengers();
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
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        _hashCode += getFromLocationId();
        _hashCode += getToLocationId();
        _hashCode += getFromHotelId();
        _hashCode += getToHotelId();
        _hashCode += (isIsOneWay() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getPassengers();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferAvailabilityRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferAvailabilityRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RequestBase"));
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
