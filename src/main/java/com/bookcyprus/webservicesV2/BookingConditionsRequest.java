/**
 * BookingConditionsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class BookingConditionsRequest  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.RequestBase baseRequest;

    private com.bookcyprus.webservicesV2.HotelReservationRequest[] hotelRequests;

    private com.bookcyprus.webservicesV2.CarReservationRequest[] carRequests;

    private com.bookcyprus.webservicesV2.TransferReservationRequest[] transferRequests;

    private com.bookcyprus.webservicesV2.ExcursionReservationRequest[] excursionRequests;

    private com.bookcyprus.webservicesV2.RoundtripReservationRequest roundtripRequest;

    public BookingConditionsRequest() {
    }

    public BookingConditionsRequest(
           com.bookcyprus.webservicesV2.RequestBase baseRequest,
           com.bookcyprus.webservicesV2.HotelReservationRequest[] hotelRequests,
           com.bookcyprus.webservicesV2.CarReservationRequest[] carRequests,
           com.bookcyprus.webservicesV2.TransferReservationRequest[] transferRequests,
           com.bookcyprus.webservicesV2.ExcursionReservationRequest[] excursionRequests,
           com.bookcyprus.webservicesV2.RoundtripReservationRequest roundtripRequest) {
           this.baseRequest = baseRequest;
           this.hotelRequests = hotelRequests;
           this.carRequests = carRequests;
           this.transferRequests = transferRequests;
           this.excursionRequests = excursionRequests;
           this.roundtripRequest = roundtripRequest;
    }


    /**
     * Gets the baseRequest value for this BookingConditionsRequest.
     * 
     * @return baseRequest
     */
    public com.bookcyprus.webservicesV2.RequestBase getBaseRequest() {
        return baseRequest;
    }


    /**
     * Sets the baseRequest value for this BookingConditionsRequest.
     * 
     * @param baseRequest
     */
    public void setBaseRequest(com.bookcyprus.webservicesV2.RequestBase baseRequest) {
        this.baseRequest = baseRequest;
    }


    /**
     * Gets the hotelRequests value for this BookingConditionsRequest.
     * 
     * @return hotelRequests
     */
    public com.bookcyprus.webservicesV2.HotelReservationRequest[] getHotelRequests() {
        return hotelRequests;
    }


    /**
     * Sets the hotelRequests value for this BookingConditionsRequest.
     * 
     * @param hotelRequests
     */
    public void setHotelRequests(com.bookcyprus.webservicesV2.HotelReservationRequest[] hotelRequests) {
        this.hotelRequests = hotelRequests;
    }


    /**
     * Gets the carRequests value for this BookingConditionsRequest.
     * 
     * @return carRequests
     */
    public com.bookcyprus.webservicesV2.CarReservationRequest[] getCarRequests() {
        return carRequests;
    }


    /**
     * Sets the carRequests value for this BookingConditionsRequest.
     * 
     * @param carRequests
     */
    public void setCarRequests(com.bookcyprus.webservicesV2.CarReservationRequest[] carRequests) {
        this.carRequests = carRequests;
    }


    /**
     * Gets the transferRequests value for this BookingConditionsRequest.
     * 
     * @return transferRequests
     */
    public com.bookcyprus.webservicesV2.TransferReservationRequest[] getTransferRequests() {
        return transferRequests;
    }


    /**
     * Sets the transferRequests value for this BookingConditionsRequest.
     * 
     * @param transferRequests
     */
    public void setTransferRequests(com.bookcyprus.webservicesV2.TransferReservationRequest[] transferRequests) {
        this.transferRequests = transferRequests;
    }


    /**
     * Gets the excursionRequests value for this BookingConditionsRequest.
     * 
     * @return excursionRequests
     */
    public com.bookcyprus.webservicesV2.ExcursionReservationRequest[] getExcursionRequests() {
        return excursionRequests;
    }


    /**
     * Sets the excursionRequests value for this BookingConditionsRequest.
     * 
     * @param excursionRequests
     */
    public void setExcursionRequests(com.bookcyprus.webservicesV2.ExcursionReservationRequest[] excursionRequests) {
        this.excursionRequests = excursionRequests;
    }


    /**
     * Gets the roundtripRequest value for this BookingConditionsRequest.
     * 
     * @return roundtripRequest
     */
    public com.bookcyprus.webservicesV2.RoundtripReservationRequest getRoundtripRequest() {
        return roundtripRequest;
    }


    /**
     * Sets the roundtripRequest value for this BookingConditionsRequest.
     * 
     * @param roundtripRequest
     */
    public void setRoundtripRequest(com.bookcyprus.webservicesV2.RoundtripReservationRequest roundtripRequest) {
        this.roundtripRequest = roundtripRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookingConditionsRequest)) return false;
        BookingConditionsRequest other = (BookingConditionsRequest) obj;
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
            ((this.hotelRequests==null && other.getHotelRequests()==null) || 
             (this.hotelRequests!=null &&
              java.util.Arrays.equals(this.hotelRequests, other.getHotelRequests()))) &&
            ((this.carRequests==null && other.getCarRequests()==null) || 
             (this.carRequests!=null &&
              java.util.Arrays.equals(this.carRequests, other.getCarRequests()))) &&
            ((this.transferRequests==null && other.getTransferRequests()==null) || 
             (this.transferRequests!=null &&
              java.util.Arrays.equals(this.transferRequests, other.getTransferRequests()))) &&
            ((this.excursionRequests==null && other.getExcursionRequests()==null) || 
             (this.excursionRequests!=null &&
              java.util.Arrays.equals(this.excursionRequests, other.getExcursionRequests()))) &&
            ((this.roundtripRequest==null && other.getRoundtripRequest()==null) || 
             (this.roundtripRequest!=null &&
              this.roundtripRequest.equals(other.getRoundtripRequest())));
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
        if (getHotelRequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHotelRequests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHotelRequests(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCarRequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCarRequests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCarRequests(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferRequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferRequests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferRequests(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcursionRequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcursionRequests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcursionRequests(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoundtripRequest() != null) {
            _hashCode += getRoundtripRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookingConditionsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingConditionsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RequestBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelReservationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelReservationRequest"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarReservationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarReservationRequest"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferReservationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferReservationRequest"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionReservationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionReservationRequest"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundtripRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripReservationRequest"));
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
