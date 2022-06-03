/**
 * TransferAvailabilityResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class TransferAvailabilityResponse  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.ResponseBase baseResponse;

    private int resultCount;

    private java.lang.String currency;

    private java.lang.String token;

    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    private com.bookcyprus.webservicesV2.Location fromLocation;

    private com.bookcyprus.webservicesV2.Location toLocation;

    private int fromHotelId;

    private java.lang.String fromHotelName;

    private int toHotelId;

    private java.lang.String toHotelName;

    private boolean isOneWay;

    private int passengers;

    private com.bookcyprus.webservicesV2.TransferService[] transferServices;

    public TransferAvailabilityResponse() {
    }

    public TransferAvailabilityResponse(
           com.bookcyprus.webservicesV2.ResponseBase baseResponse,
           int resultCount,
           java.lang.String currency,
           java.lang.String token,
           java.util.Calendar fromDate,
           java.util.Calendar toDate,
           com.bookcyprus.webservicesV2.Location fromLocation,
           com.bookcyprus.webservicesV2.Location toLocation,
           int fromHotelId,
           java.lang.String fromHotelName,
           int toHotelId,
           java.lang.String toHotelName,
           boolean isOneWay,
           int passengers,
           com.bookcyprus.webservicesV2.TransferService[] transferServices) {
           this.baseResponse = baseResponse;
           this.resultCount = resultCount;
           this.currency = currency;
           this.token = token;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.fromLocation = fromLocation;
           this.toLocation = toLocation;
           this.fromHotelId = fromHotelId;
           this.fromHotelName = fromHotelName;
           this.toHotelId = toHotelId;
           this.toHotelName = toHotelName;
           this.isOneWay = isOneWay;
           this.passengers = passengers;
           this.transferServices = transferServices;
    }


    /**
     * Gets the baseResponse value for this TransferAvailabilityResponse.
     * 
     * @return baseResponse
     */
    public com.bookcyprus.webservicesV2.ResponseBase getBaseResponse() {
        return baseResponse;
    }


    /**
     * Sets the baseResponse value for this TransferAvailabilityResponse.
     * 
     * @param baseResponse
     */
    public void setBaseResponse(com.bookcyprus.webservicesV2.ResponseBase baseResponse) {
        this.baseResponse = baseResponse;
    }


    /**
     * Gets the resultCount value for this TransferAvailabilityResponse.
     * 
     * @return resultCount
     */
    public int getResultCount() {
        return resultCount;
    }


    /**
     * Sets the resultCount value for this TransferAvailabilityResponse.
     * 
     * @param resultCount
     */
    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }


    /**
     * Gets the currency value for this TransferAvailabilityResponse.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this TransferAvailabilityResponse.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the token value for this TransferAvailabilityResponse.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this TransferAvailabilityResponse.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the fromDate value for this TransferAvailabilityResponse.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this TransferAvailabilityResponse.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this TransferAvailabilityResponse.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this TransferAvailabilityResponse.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the fromLocation value for this TransferAvailabilityResponse.
     * 
     * @return fromLocation
     */
    public com.bookcyprus.webservicesV2.Location getFromLocation() {
        return fromLocation;
    }


    /**
     * Sets the fromLocation value for this TransferAvailabilityResponse.
     * 
     * @param fromLocation
     */
    public void setFromLocation(com.bookcyprus.webservicesV2.Location fromLocation) {
        this.fromLocation = fromLocation;
    }


    /**
     * Gets the toLocation value for this TransferAvailabilityResponse.
     * 
     * @return toLocation
     */
    public com.bookcyprus.webservicesV2.Location getToLocation() {
        return toLocation;
    }


    /**
     * Sets the toLocation value for this TransferAvailabilityResponse.
     * 
     * @param toLocation
     */
    public void setToLocation(com.bookcyprus.webservicesV2.Location toLocation) {
        this.toLocation = toLocation;
    }


    /**
     * Gets the fromHotelId value for this TransferAvailabilityResponse.
     * 
     * @return fromHotelId
     */
    public int getFromHotelId() {
        return fromHotelId;
    }


    /**
     * Sets the fromHotelId value for this TransferAvailabilityResponse.
     * 
     * @param fromHotelId
     */
    public void setFromHotelId(int fromHotelId) {
        this.fromHotelId = fromHotelId;
    }


    /**
     * Gets the fromHotelName value for this TransferAvailabilityResponse.
     * 
     * @return fromHotelName
     */
    public java.lang.String getFromHotelName() {
        return fromHotelName;
    }


    /**
     * Sets the fromHotelName value for this TransferAvailabilityResponse.
     * 
     * @param fromHotelName
     */
    public void setFromHotelName(java.lang.String fromHotelName) {
        this.fromHotelName = fromHotelName;
    }


    /**
     * Gets the toHotelId value for this TransferAvailabilityResponse.
     * 
     * @return toHotelId
     */
    public int getToHotelId() {
        return toHotelId;
    }


    /**
     * Sets the toHotelId value for this TransferAvailabilityResponse.
     * 
     * @param toHotelId
     */
    public void setToHotelId(int toHotelId) {
        this.toHotelId = toHotelId;
    }


    /**
     * Gets the toHotelName value for this TransferAvailabilityResponse.
     * 
     * @return toHotelName
     */
    public java.lang.String getToHotelName() {
        return toHotelName;
    }


    /**
     * Sets the toHotelName value for this TransferAvailabilityResponse.
     * 
     * @param toHotelName
     */
    public void setToHotelName(java.lang.String toHotelName) {
        this.toHotelName = toHotelName;
    }


    /**
     * Gets the isOneWay value for this TransferAvailabilityResponse.
     * 
     * @return isOneWay
     */
    public boolean isIsOneWay() {
        return isOneWay;
    }


    /**
     * Sets the isOneWay value for this TransferAvailabilityResponse.
     * 
     * @param isOneWay
     */
    public void setIsOneWay(boolean isOneWay) {
        this.isOneWay = isOneWay;
    }


    /**
     * Gets the passengers value for this TransferAvailabilityResponse.
     * 
     * @return passengers
     */
    public int getPassengers() {
        return passengers;
    }


    /**
     * Sets the passengers value for this TransferAvailabilityResponse.
     * 
     * @param passengers
     */
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }


    /**
     * Gets the transferServices value for this TransferAvailabilityResponse.
     * 
     * @return transferServices
     */
    public com.bookcyprus.webservicesV2.TransferService[] getTransferServices() {
        return transferServices;
    }


    /**
     * Sets the transferServices value for this TransferAvailabilityResponse.
     * 
     * @param transferServices
     */
    public void setTransferServices(com.bookcyprus.webservicesV2.TransferService[] transferServices) {
        this.transferServices = transferServices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferAvailabilityResponse)) return false;
        TransferAvailabilityResponse other = (TransferAvailabilityResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseResponse==null && other.getBaseResponse()==null) || 
             (this.baseResponse!=null &&
              this.baseResponse.equals(other.getBaseResponse()))) &&
            this.resultCount == other.getResultCount() &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
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
            this.isOneWay == other.isIsOneWay() &&
            this.passengers == other.getPassengers() &&
            ((this.transferServices==null && other.getTransferServices()==null) || 
             (this.transferServices!=null &&
              java.util.Arrays.equals(this.transferServices, other.getTransferServices())));
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
        if (getBaseResponse() != null) {
            _hashCode += getBaseResponse().hashCode();
        }
        _hashCode += getResultCount();
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
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
        _hashCode += (isIsOneWay() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getPassengers();
        if (getTransferServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferServices(), i);
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
        new org.apache.axis.description.TypeDesc(TransferAvailabilityResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferAvailabilityResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ResponseBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ResultCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Token"));
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
        elemField.setFieldName("transferServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferService"));
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
