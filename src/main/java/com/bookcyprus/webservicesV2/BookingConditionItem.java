/**
 * BookingConditionItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class BookingConditionItem  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.HotelReservationRequest hotelRequest;

    private com.bookcyprus.webservicesV2.CarReservationRequest carRequest;

    private com.bookcyprus.webservicesV2.TransferReservationRequest transferRequest;

    private com.bookcyprus.webservicesV2.ExcursionReservationRequest excursionRequest;

    private com.bookcyprus.webservicesV2.RoundtripReservationRequest roundtripRequest;

    private com.bookcyprus.webservicesV2.BookingConditionItemDetail[] details;

    public BookingConditionItem() {
    }

    public BookingConditionItem(
           com.bookcyprus.webservicesV2.HotelReservationRequest hotelRequest,
           com.bookcyprus.webservicesV2.CarReservationRequest carRequest,
           com.bookcyprus.webservicesV2.TransferReservationRequest transferRequest,
           com.bookcyprus.webservicesV2.ExcursionReservationRequest excursionRequest,
           com.bookcyprus.webservicesV2.RoundtripReservationRequest roundtripRequest,
           com.bookcyprus.webservicesV2.BookingConditionItemDetail[] details) {
           this.hotelRequest = hotelRequest;
           this.carRequest = carRequest;
           this.transferRequest = transferRequest;
           this.excursionRequest = excursionRequest;
           this.roundtripRequest = roundtripRequest;
           this.details = details;
    }


    /**
     * Gets the hotelRequest value for this BookingConditionItem.
     * 
     * @return hotelRequest
     */
    public com.bookcyprus.webservicesV2.HotelReservationRequest getHotelRequest() {
        return hotelRequest;
    }


    /**
     * Sets the hotelRequest value for this BookingConditionItem.
     * 
     * @param hotelRequest
     */
    public void setHotelRequest(com.bookcyprus.webservicesV2.HotelReservationRequest hotelRequest) {
        this.hotelRequest = hotelRequest;
    }


    /**
     * Gets the carRequest value for this BookingConditionItem.
     * 
     * @return carRequest
     */
    public com.bookcyprus.webservicesV2.CarReservationRequest getCarRequest() {
        return carRequest;
    }


    /**
     * Sets the carRequest value for this BookingConditionItem.
     * 
     * @param carRequest
     */
    public void setCarRequest(com.bookcyprus.webservicesV2.CarReservationRequest carRequest) {
        this.carRequest = carRequest;
    }


    /**
     * Gets the transferRequest value for this BookingConditionItem.
     * 
     * @return transferRequest
     */
    public com.bookcyprus.webservicesV2.TransferReservationRequest getTransferRequest() {
        return transferRequest;
    }


    /**
     * Sets the transferRequest value for this BookingConditionItem.
     * 
     * @param transferRequest
     */
    public void setTransferRequest(com.bookcyprus.webservicesV2.TransferReservationRequest transferRequest) {
        this.transferRequest = transferRequest;
    }


    /**
     * Gets the excursionRequest value for this BookingConditionItem.
     * 
     * @return excursionRequest
     */
    public com.bookcyprus.webservicesV2.ExcursionReservationRequest getExcursionRequest() {
        return excursionRequest;
    }


    /**
     * Sets the excursionRequest value for this BookingConditionItem.
     * 
     * @param excursionRequest
     */
    public void setExcursionRequest(com.bookcyprus.webservicesV2.ExcursionReservationRequest excursionRequest) {
        this.excursionRequest = excursionRequest;
    }


    /**
     * Gets the roundtripRequest value for this BookingConditionItem.
     * 
     * @return roundtripRequest
     */
    public com.bookcyprus.webservicesV2.RoundtripReservationRequest getRoundtripRequest() {
        return roundtripRequest;
    }


    /**
     * Sets the roundtripRequest value for this BookingConditionItem.
     * 
     * @param roundtripRequest
     */
    public void setRoundtripRequest(com.bookcyprus.webservicesV2.RoundtripReservationRequest roundtripRequest) {
        this.roundtripRequest = roundtripRequest;
    }


    /**
     * Gets the details value for this BookingConditionItem.
     * 
     * @return details
     */
    public com.bookcyprus.webservicesV2.BookingConditionItemDetail[] getDetails() {
        return details;
    }


    /**
     * Sets the details value for this BookingConditionItem.
     * 
     * @param details
     */
    public void setDetails(com.bookcyprus.webservicesV2.BookingConditionItemDetail[] details) {
        this.details = details;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookingConditionItem)) return false;
        BookingConditionItem other = (BookingConditionItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hotelRequest==null && other.getHotelRequest()==null) || 
             (this.hotelRequest!=null &&
              this.hotelRequest.equals(other.getHotelRequest()))) &&
            ((this.carRequest==null && other.getCarRequest()==null) || 
             (this.carRequest!=null &&
              this.carRequest.equals(other.getCarRequest()))) &&
            ((this.transferRequest==null && other.getTransferRequest()==null) || 
             (this.transferRequest!=null &&
              this.transferRequest.equals(other.getTransferRequest()))) &&
            ((this.excursionRequest==null && other.getExcursionRequest()==null) || 
             (this.excursionRequest!=null &&
              this.excursionRequest.equals(other.getExcursionRequest()))) &&
            ((this.roundtripRequest==null && other.getRoundtripRequest()==null) || 
             (this.roundtripRequest!=null &&
              this.roundtripRequest.equals(other.getRoundtripRequest()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              java.util.Arrays.equals(this.details, other.getDetails())));
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
        if (getHotelRequest() != null) {
            _hashCode += getHotelRequest().hashCode();
        }
        if (getCarRequest() != null) {
            _hashCode += getCarRequest().hashCode();
        }
        if (getTransferRequest() != null) {
            _hashCode += getTransferRequest().hashCode();
        }
        if (getExcursionRequest() != null) {
            _hashCode += getExcursionRequest().hashCode();
        }
        if (getRoundtripRequest() != null) {
            _hashCode += getRoundtripRequest().hashCode();
        }
        if (getDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetails(), i);
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
        new org.apache.axis.description.TypeDesc(BookingConditionItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingConditionItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelReservationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarReservationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferReservationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionReservationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundtripRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripReservationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Details"));
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
