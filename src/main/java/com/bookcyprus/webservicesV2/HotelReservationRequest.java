/**
 * HotelReservationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class HotelReservationRequest  implements java.io.Serializable {
    private int hotelId;

    private int roomId;

    private int mealId;

    private int providerId;

    private com.bookcyprus.webservicesV2.HotelOccupancy occupancy;

    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    private java.lang.String guestName;

    private java.lang.String groupIdentifier;

    private java.math.BigDecimal expectedBookingPrice;

    private com.bookcyprus.webservicesV2.ClientNationalityInfo clientNationality;

    public HotelReservationRequest() {
    }

    public HotelReservationRequest(
           int hotelId,
           int roomId,
           int mealId,
           int providerId,
           com.bookcyprus.webservicesV2.HotelOccupancy occupancy,
           java.util.Calendar fromDate,
           java.util.Calendar toDate,
           java.lang.String guestName,
           java.lang.String groupIdentifier,
           java.math.BigDecimal expectedBookingPrice,
           com.bookcyprus.webservicesV2.ClientNationalityInfo clientNationality) {
           this.hotelId = hotelId;
           this.roomId = roomId;
           this.mealId = mealId;
           this.providerId = providerId;
           this.occupancy = occupancy;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.guestName = guestName;
           this.groupIdentifier = groupIdentifier;
           this.expectedBookingPrice = expectedBookingPrice;
           this.clientNationality = clientNationality;
    }


    /**
     * Gets the hotelId value for this HotelReservationRequest.
     * 
     * @return hotelId
     */
    public int getHotelId() {
        return hotelId;
    }


    /**
     * Sets the hotelId value for this HotelReservationRequest.
     * 
     * @param hotelId
     */
    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }


    /**
     * Gets the roomId value for this HotelReservationRequest.
     * 
     * @return roomId
     */
    public int getRoomId() {
        return roomId;
    }


    /**
     * Sets the roomId value for this HotelReservationRequest.
     * 
     * @param roomId
     */
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }


    /**
     * Gets the mealId value for this HotelReservationRequest.
     * 
     * @return mealId
     */
    public int getMealId() {
        return mealId;
    }


    /**
     * Sets the mealId value for this HotelReservationRequest.
     * 
     * @param mealId
     */
    public void setMealId(int mealId) {
        this.mealId = mealId;
    }


    /**
     * Gets the providerId value for this HotelReservationRequest.
     * 
     * @return providerId
     */
    public int getProviderId() {
        return providerId;
    }


    /**
     * Sets the providerId value for this HotelReservationRequest.
     * 
     * @param providerId
     */
    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }


    /**
     * Gets the occupancy value for this HotelReservationRequest.
     * 
     * @return occupancy
     */
    public com.bookcyprus.webservicesV2.HotelOccupancy getOccupancy() {
        return occupancy;
    }


    /**
     * Sets the occupancy value for this HotelReservationRequest.
     * 
     * @param occupancy
     */
    public void setOccupancy(com.bookcyprus.webservicesV2.HotelOccupancy occupancy) {
        this.occupancy = occupancy;
    }


    /**
     * Gets the fromDate value for this HotelReservationRequest.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this HotelReservationRequest.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this HotelReservationRequest.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this HotelReservationRequest.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the guestName value for this HotelReservationRequest.
     * 
     * @return guestName
     */
    public java.lang.String getGuestName() {
        return guestName;
    }


    /**
     * Sets the guestName value for this HotelReservationRequest.
     * 
     * @param guestName
     */
    public void setGuestName(java.lang.String guestName) {
        this.guestName = guestName;
    }


    /**
     * Gets the groupIdentifier value for this HotelReservationRequest.
     * 
     * @return groupIdentifier
     */
    public java.lang.String getGroupIdentifier() {
        return groupIdentifier;
    }


    /**
     * Sets the groupIdentifier value for this HotelReservationRequest.
     * 
     * @param groupIdentifier
     */
    public void setGroupIdentifier(java.lang.String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
    }


    /**
     * Gets the expectedBookingPrice value for this HotelReservationRequest.
     * 
     * @return expectedBookingPrice
     */
    public java.math.BigDecimal getExpectedBookingPrice() {
        return expectedBookingPrice;
    }


    /**
     * Sets the expectedBookingPrice value for this HotelReservationRequest.
     * 
     * @param expectedBookingPrice
     */
    public void setExpectedBookingPrice(java.math.BigDecimal expectedBookingPrice) {
        this.expectedBookingPrice = expectedBookingPrice;
    }


    /**
     * Gets the clientNationality value for this HotelReservationRequest.
     * 
     * @return clientNationality
     */
    public com.bookcyprus.webservicesV2.ClientNationalityInfo getClientNationality() {
        return clientNationality;
    }


    /**
     * Sets the clientNationality value for this HotelReservationRequest.
     * 
     * @param clientNationality
     */
    public void setClientNationality(com.bookcyprus.webservicesV2.ClientNationalityInfo clientNationality) {
        this.clientNationality = clientNationality;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HotelReservationRequest)) return false;
        HotelReservationRequest other = (HotelReservationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.hotelId == other.getHotelId() &&
            this.roomId == other.getRoomId() &&
            this.mealId == other.getMealId() &&
            this.providerId == other.getProviderId() &&
            ((this.occupancy==null && other.getOccupancy()==null) || 
             (this.occupancy!=null &&
              this.occupancy.equals(other.getOccupancy()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            ((this.guestName==null && other.getGuestName()==null) || 
             (this.guestName!=null &&
              this.guestName.equals(other.getGuestName()))) &&
            ((this.groupIdentifier==null && other.getGroupIdentifier()==null) || 
             (this.groupIdentifier!=null &&
              this.groupIdentifier.equals(other.getGroupIdentifier()))) &&
            ((this.expectedBookingPrice==null && other.getExpectedBookingPrice()==null) || 
             (this.expectedBookingPrice!=null &&
              this.expectedBookingPrice.equals(other.getExpectedBookingPrice()))) &&
            ((this.clientNationality==null && other.getClientNationality()==null) || 
             (this.clientNationality!=null &&
              this.clientNationality.equals(other.getClientNationality())));
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
        _hashCode += getHotelId();
        _hashCode += getRoomId();
        _hashCode += getMealId();
        _hashCode += getProviderId();
        if (getOccupancy() != null) {
            _hashCode += getOccupancy().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getGuestName() != null) {
            _hashCode += getGuestName().hashCode();
        }
        if (getGroupIdentifier() != null) {
            _hashCode += getGroupIdentifier().hashCode();
        }
        if (getExpectedBookingPrice() != null) {
            _hashCode += getExpectedBookingPrice().hashCode();
        }
        if (getClientNationality() != null) {
            _hashCode += getClientNationality().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HotelReservationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelReservationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoomId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mealId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "MealId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ProviderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occupancy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Occupancy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelOccupancy"));
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
        elemField.setFieldName("guestName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GuestName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GroupIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedBookingPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExpectedBookingPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientNationality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ClientNationality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ClientNationalityInfo"));
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
