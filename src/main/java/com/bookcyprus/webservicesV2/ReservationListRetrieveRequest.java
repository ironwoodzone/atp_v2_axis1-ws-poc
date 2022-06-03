/**
 * ReservationListRetrieveRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ReservationListRetrieveRequest  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.RequestBase baseRequest;

    private java.util.Calendar bookingDateStart;

    private java.util.Calendar bookingDateEnd;

    private java.util.Calendar travelDateStart;

    private java.util.Calendar travelDateEnd;

    public ReservationListRetrieveRequest() {
    }

    public ReservationListRetrieveRequest(
           com.bookcyprus.webservicesV2.RequestBase baseRequest,
           java.util.Calendar bookingDateStart,
           java.util.Calendar bookingDateEnd,
           java.util.Calendar travelDateStart,
           java.util.Calendar travelDateEnd) {
           this.baseRequest = baseRequest;
           this.bookingDateStart = bookingDateStart;
           this.bookingDateEnd = bookingDateEnd;
           this.travelDateStart = travelDateStart;
           this.travelDateEnd = travelDateEnd;
    }


    /**
     * Gets the baseRequest value for this ReservationListRetrieveRequest.
     * 
     * @return baseRequest
     */
    public com.bookcyprus.webservicesV2.RequestBase getBaseRequest() {
        return baseRequest;
    }


    /**
     * Sets the baseRequest value for this ReservationListRetrieveRequest.
     * 
     * @param baseRequest
     */
    public void setBaseRequest(com.bookcyprus.webservicesV2.RequestBase baseRequest) {
        this.baseRequest = baseRequest;
    }


    /**
     * Gets the bookingDateStart value for this ReservationListRetrieveRequest.
     * 
     * @return bookingDateStart
     */
    public java.util.Calendar getBookingDateStart() {
        return bookingDateStart;
    }


    /**
     * Sets the bookingDateStart value for this ReservationListRetrieveRequest.
     * 
     * @param bookingDateStart
     */
    public void setBookingDateStart(java.util.Calendar bookingDateStart) {
        this.bookingDateStart = bookingDateStart;
    }


    /**
     * Gets the bookingDateEnd value for this ReservationListRetrieveRequest.
     * 
     * @return bookingDateEnd
     */
    public java.util.Calendar getBookingDateEnd() {
        return bookingDateEnd;
    }


    /**
     * Sets the bookingDateEnd value for this ReservationListRetrieveRequest.
     * 
     * @param bookingDateEnd
     */
    public void setBookingDateEnd(java.util.Calendar bookingDateEnd) {
        this.bookingDateEnd = bookingDateEnd;
    }


    /**
     * Gets the travelDateStart value for this ReservationListRetrieveRequest.
     * 
     * @return travelDateStart
     */
    public java.util.Calendar getTravelDateStart() {
        return travelDateStart;
    }


    /**
     * Sets the travelDateStart value for this ReservationListRetrieveRequest.
     * 
     * @param travelDateStart
     */
    public void setTravelDateStart(java.util.Calendar travelDateStart) {
        this.travelDateStart = travelDateStart;
    }


    /**
     * Gets the travelDateEnd value for this ReservationListRetrieveRequest.
     * 
     * @return travelDateEnd
     */
    public java.util.Calendar getTravelDateEnd() {
        return travelDateEnd;
    }


    /**
     * Sets the travelDateEnd value for this ReservationListRetrieveRequest.
     * 
     * @param travelDateEnd
     */
    public void setTravelDateEnd(java.util.Calendar travelDateEnd) {
        this.travelDateEnd = travelDateEnd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationListRetrieveRequest)) return false;
        ReservationListRetrieveRequest other = (ReservationListRetrieveRequest) obj;
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
            ((this.bookingDateStart==null && other.getBookingDateStart()==null) || 
             (this.bookingDateStart!=null &&
              this.bookingDateStart.equals(other.getBookingDateStart()))) &&
            ((this.bookingDateEnd==null && other.getBookingDateEnd()==null) || 
             (this.bookingDateEnd!=null &&
              this.bookingDateEnd.equals(other.getBookingDateEnd()))) &&
            ((this.travelDateStart==null && other.getTravelDateStart()==null) || 
             (this.travelDateStart!=null &&
              this.travelDateStart.equals(other.getTravelDateStart()))) &&
            ((this.travelDateEnd==null && other.getTravelDateEnd()==null) || 
             (this.travelDateEnd!=null &&
              this.travelDateEnd.equals(other.getTravelDateEnd())));
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
        if (getBookingDateStart() != null) {
            _hashCode += getBookingDateStart().hashCode();
        }
        if (getBookingDateEnd() != null) {
            _hashCode += getBookingDateEnd().hashCode();
        }
        if (getTravelDateStart() != null) {
            _hashCode += getTravelDateStart().hashCode();
        }
        if (getTravelDateEnd() != null) {
            _hashCode += getTravelDateEnd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationListRetrieveRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationListRetrieveRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RequestBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingDateStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingDateStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingDateEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingDateEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelDateStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TravelDateStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelDateEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TravelDateEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
