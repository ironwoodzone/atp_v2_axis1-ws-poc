/**
 * CarAvailabilityResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class CarAvailabilityResponse  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.ResponseBase baseResponse;

    private int resultCount;

    private java.lang.String currency;

    private java.lang.String token;

    private com.bookcyprus.webservicesV2.Location pickupLocation;

    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    private int driverAge;

    private com.bookcyprus.webservicesV2.CarService[] carServices;

    public CarAvailabilityResponse() {
    }

    public CarAvailabilityResponse(
           com.bookcyprus.webservicesV2.ResponseBase baseResponse,
           int resultCount,
           java.lang.String currency,
           java.lang.String token,
           com.bookcyprus.webservicesV2.Location pickupLocation,
           java.util.Calendar fromDate,
           java.util.Calendar toDate,
           int driverAge,
           com.bookcyprus.webservicesV2.CarService[] carServices) {
           this.baseResponse = baseResponse;
           this.resultCount = resultCount;
           this.currency = currency;
           this.token = token;
           this.pickupLocation = pickupLocation;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.driverAge = driverAge;
           this.carServices = carServices;
    }


    /**
     * Gets the baseResponse value for this CarAvailabilityResponse.
     * 
     * @return baseResponse
     */
    public com.bookcyprus.webservicesV2.ResponseBase getBaseResponse() {
        return baseResponse;
    }


    /**
     * Sets the baseResponse value for this CarAvailabilityResponse.
     * 
     * @param baseResponse
     */
    public void setBaseResponse(com.bookcyprus.webservicesV2.ResponseBase baseResponse) {
        this.baseResponse = baseResponse;
    }


    /**
     * Gets the resultCount value for this CarAvailabilityResponse.
     * 
     * @return resultCount
     */
    public int getResultCount() {
        return resultCount;
    }


    /**
     * Sets the resultCount value for this CarAvailabilityResponse.
     * 
     * @param resultCount
     */
    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }


    /**
     * Gets the currency value for this CarAvailabilityResponse.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this CarAvailabilityResponse.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the token value for this CarAvailabilityResponse.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this CarAvailabilityResponse.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the pickupLocation value for this CarAvailabilityResponse.
     * 
     * @return pickupLocation
     */
    public com.bookcyprus.webservicesV2.Location getPickupLocation() {
        return pickupLocation;
    }


    /**
     * Sets the pickupLocation value for this CarAvailabilityResponse.
     * 
     * @param pickupLocation
     */
    public void setPickupLocation(com.bookcyprus.webservicesV2.Location pickupLocation) {
        this.pickupLocation = pickupLocation;
    }


    /**
     * Gets the fromDate value for this CarAvailabilityResponse.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this CarAvailabilityResponse.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this CarAvailabilityResponse.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this CarAvailabilityResponse.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the driverAge value for this CarAvailabilityResponse.
     * 
     * @return driverAge
     */
    public int getDriverAge() {
        return driverAge;
    }


    /**
     * Sets the driverAge value for this CarAvailabilityResponse.
     * 
     * @param driverAge
     */
    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }


    /**
     * Gets the carServices value for this CarAvailabilityResponse.
     * 
     * @return carServices
     */
    public com.bookcyprus.webservicesV2.CarService[] getCarServices() {
        return carServices;
    }


    /**
     * Sets the carServices value for this CarAvailabilityResponse.
     * 
     * @param carServices
     */
    public void setCarServices(com.bookcyprus.webservicesV2.CarService[] carServices) {
        this.carServices = carServices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarAvailabilityResponse)) return false;
        CarAvailabilityResponse other = (CarAvailabilityResponse) obj;
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
            ((this.pickupLocation==null && other.getPickupLocation()==null) || 
             (this.pickupLocation!=null &&
              this.pickupLocation.equals(other.getPickupLocation()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            this.driverAge == other.getDriverAge() &&
            ((this.carServices==null && other.getCarServices()==null) || 
             (this.carServices!=null &&
              java.util.Arrays.equals(this.carServices, other.getCarServices())));
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
        if (getPickupLocation() != null) {
            _hashCode += getPickupLocation().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        _hashCode += getDriverAge();
        if (getCarServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCarServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCarServices(), i);
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
        new org.apache.axis.description.TypeDesc(CarAvailabilityResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarAvailabilityResponse"));
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
        elemField.setFieldName("pickupLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PickupLocation"));
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
        elemField.setFieldName("driverAge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "DriverAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarService"));
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
