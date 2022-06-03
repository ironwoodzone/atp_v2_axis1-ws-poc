/**
 * HotelReservationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class HotelReservationResponse  implements java.io.Serializable {
    private int reservationDetailId;

    private int hotelId;

    private java.lang.String hotel;

    private int roomId;

    private java.lang.String room;

    private boolean isOnRequest;

    private java.lang.String roomIndx;

    private int mealId;

    private java.lang.String meal;

    private com.bookcyprus.webservicesV2.HotelOccupancy occupancy;

    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    private java.math.BigDecimal amount;

    private java.lang.String status;

    private java.lang.String groupIdentifier;

    private int providerId;

    private boolean isNonRef;

    private java.math.BigDecimal cancellationFeePaid;

    private java.math.BigDecimal cancellationFeeIfCancelledToday;

    private com.bookcyprus.webservicesV2.BookingConditionItemDetail[] cancellationPolicy;

    public HotelReservationResponse() {
    }

    public HotelReservationResponse(
           int reservationDetailId,
           int hotelId,
           java.lang.String hotel,
           int roomId,
           java.lang.String room,
           boolean isOnRequest,
           java.lang.String roomIndx,
           int mealId,
           java.lang.String meal,
           com.bookcyprus.webservicesV2.HotelOccupancy occupancy,
           java.util.Calendar fromDate,
           java.util.Calendar toDate,
           java.math.BigDecimal amount,
           java.lang.String status,
           java.lang.String groupIdentifier,
           int providerId,
           boolean isNonRef,
           java.math.BigDecimal cancellationFeePaid,
           java.math.BigDecimal cancellationFeeIfCancelledToday,
           com.bookcyprus.webservicesV2.BookingConditionItemDetail[] cancellationPolicy) {
           this.reservationDetailId = reservationDetailId;
           this.hotelId = hotelId;
           this.hotel = hotel;
           this.roomId = roomId;
           this.room = room;
           this.isOnRequest = isOnRequest;
           this.roomIndx = roomIndx;
           this.mealId = mealId;
           this.meal = meal;
           this.occupancy = occupancy;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.amount = amount;
           this.status = status;
           this.groupIdentifier = groupIdentifier;
           this.providerId = providerId;
           this.isNonRef = isNonRef;
           this.cancellationFeePaid = cancellationFeePaid;
           this.cancellationFeeIfCancelledToday = cancellationFeeIfCancelledToday;
           this.cancellationPolicy = cancellationPolicy;
    }


    /**
     * Gets the reservationDetailId value for this HotelReservationResponse.
     * 
     * @return reservationDetailId
     */
    public int getReservationDetailId() {
        return reservationDetailId;
    }


    /**
     * Sets the reservationDetailId value for this HotelReservationResponse.
     * 
     * @param reservationDetailId
     */
    public void setReservationDetailId(int reservationDetailId) {
        this.reservationDetailId = reservationDetailId;
    }


    /**
     * Gets the hotelId value for this HotelReservationResponse.
     * 
     * @return hotelId
     */
    public int getHotelId() {
        return hotelId;
    }


    /**
     * Sets the hotelId value for this HotelReservationResponse.
     * 
     * @param hotelId
     */
    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }


    /**
     * Gets the hotel value for this HotelReservationResponse.
     * 
     * @return hotel
     */
    public java.lang.String getHotel() {
        return hotel;
    }


    /**
     * Sets the hotel value for this HotelReservationResponse.
     * 
     * @param hotel
     */
    public void setHotel(java.lang.String hotel) {
        this.hotel = hotel;
    }


    /**
     * Gets the roomId value for this HotelReservationResponse.
     * 
     * @return roomId
     */
    public int getRoomId() {
        return roomId;
    }


    /**
     * Sets the roomId value for this HotelReservationResponse.
     * 
     * @param roomId
     */
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }


    /**
     * Gets the room value for this HotelReservationResponse.
     * 
     * @return room
     */
    public java.lang.String getRoom() {
        return room;
    }


    /**
     * Sets the room value for this HotelReservationResponse.
     * 
     * @param room
     */
    public void setRoom(java.lang.String room) {
        this.room = room;
    }


    /**
     * Gets the isOnRequest value for this HotelReservationResponse.
     * 
     * @return isOnRequest
     */
    public boolean isIsOnRequest() {
        return isOnRequest;
    }


    /**
     * Sets the isOnRequest value for this HotelReservationResponse.
     * 
     * @param isOnRequest
     */
    public void setIsOnRequest(boolean isOnRequest) {
        this.isOnRequest = isOnRequest;
    }


    /**
     * Gets the roomIndx value for this HotelReservationResponse.
     * 
     * @return roomIndx
     */
    public java.lang.String getRoomIndx() {
        return roomIndx;
    }


    /**
     * Sets the roomIndx value for this HotelReservationResponse.
     * 
     * @param roomIndx
     */
    public void setRoomIndx(java.lang.String roomIndx) {
        this.roomIndx = roomIndx;
    }


    /**
     * Gets the mealId value for this HotelReservationResponse.
     * 
     * @return mealId
     */
    public int getMealId() {
        return mealId;
    }


    /**
     * Sets the mealId value for this HotelReservationResponse.
     * 
     * @param mealId
     */
    public void setMealId(int mealId) {
        this.mealId = mealId;
    }


    /**
     * Gets the meal value for this HotelReservationResponse.
     * 
     * @return meal
     */
    public java.lang.String getMeal() {
        return meal;
    }


    /**
     * Sets the meal value for this HotelReservationResponse.
     * 
     * @param meal
     */
    public void setMeal(java.lang.String meal) {
        this.meal = meal;
    }


    /**
     * Gets the occupancy value for this HotelReservationResponse.
     * 
     * @return occupancy
     */
    public com.bookcyprus.webservicesV2.HotelOccupancy getOccupancy() {
        return occupancy;
    }


    /**
     * Sets the occupancy value for this HotelReservationResponse.
     * 
     * @param occupancy
     */
    public void setOccupancy(com.bookcyprus.webservicesV2.HotelOccupancy occupancy) {
        this.occupancy = occupancy;
    }


    /**
     * Gets the fromDate value for this HotelReservationResponse.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this HotelReservationResponse.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this HotelReservationResponse.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this HotelReservationResponse.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the amount value for this HotelReservationResponse.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this HotelReservationResponse.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the status value for this HotelReservationResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this HotelReservationResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the groupIdentifier value for this HotelReservationResponse.
     * 
     * @return groupIdentifier
     */
    public java.lang.String getGroupIdentifier() {
        return groupIdentifier;
    }


    /**
     * Sets the groupIdentifier value for this HotelReservationResponse.
     * 
     * @param groupIdentifier
     */
    public void setGroupIdentifier(java.lang.String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
    }


    /**
     * Gets the providerId value for this HotelReservationResponse.
     * 
     * @return providerId
     */
    public int getProviderId() {
        return providerId;
    }


    /**
     * Sets the providerId value for this HotelReservationResponse.
     * 
     * @param providerId
     */
    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }


    /**
     * Gets the isNonRef value for this HotelReservationResponse.
     * 
     * @return isNonRef
     */
    public boolean isIsNonRef() {
        return isNonRef;
    }


    /**
     * Sets the isNonRef value for this HotelReservationResponse.
     * 
     * @param isNonRef
     */
    public void setIsNonRef(boolean isNonRef) {
        this.isNonRef = isNonRef;
    }


    /**
     * Gets the cancellationFeePaid value for this HotelReservationResponse.
     * 
     * @return cancellationFeePaid
     */
    public java.math.BigDecimal getCancellationFeePaid() {
        return cancellationFeePaid;
    }


    /**
     * Sets the cancellationFeePaid value for this HotelReservationResponse.
     * 
     * @param cancellationFeePaid
     */
    public void setCancellationFeePaid(java.math.BigDecimal cancellationFeePaid) {
        this.cancellationFeePaid = cancellationFeePaid;
    }


    /**
     * Gets the cancellationFeeIfCancelledToday value for this HotelReservationResponse.
     * 
     * @return cancellationFeeIfCancelledToday
     */
    public java.math.BigDecimal getCancellationFeeIfCancelledToday() {
        return cancellationFeeIfCancelledToday;
    }


    /**
     * Sets the cancellationFeeIfCancelledToday value for this HotelReservationResponse.
     * 
     * @param cancellationFeeIfCancelledToday
     */
    public void setCancellationFeeIfCancelledToday(java.math.BigDecimal cancellationFeeIfCancelledToday) {
        this.cancellationFeeIfCancelledToday = cancellationFeeIfCancelledToday;
    }


    /**
     * Gets the cancellationPolicy value for this HotelReservationResponse.
     * 
     * @return cancellationPolicy
     */
    public com.bookcyprus.webservicesV2.BookingConditionItemDetail[] getCancellationPolicy() {
        return cancellationPolicy;
    }


    /**
     * Sets the cancellationPolicy value for this HotelReservationResponse.
     * 
     * @param cancellationPolicy
     */
    public void setCancellationPolicy(com.bookcyprus.webservicesV2.BookingConditionItemDetail[] cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HotelReservationResponse)) return false;
        HotelReservationResponse other = (HotelReservationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.reservationDetailId == other.getReservationDetailId() &&
            this.hotelId == other.getHotelId() &&
            ((this.hotel==null && other.getHotel()==null) || 
             (this.hotel!=null &&
              this.hotel.equals(other.getHotel()))) &&
            this.roomId == other.getRoomId() &&
            ((this.room==null && other.getRoom()==null) || 
             (this.room!=null &&
              this.room.equals(other.getRoom()))) &&
            this.isOnRequest == other.isIsOnRequest() &&
            ((this.roomIndx==null && other.getRoomIndx()==null) || 
             (this.roomIndx!=null &&
              this.roomIndx.equals(other.getRoomIndx()))) &&
            this.mealId == other.getMealId() &&
            ((this.meal==null && other.getMeal()==null) || 
             (this.meal!=null &&
              this.meal.equals(other.getMeal()))) &&
            ((this.occupancy==null && other.getOccupancy()==null) || 
             (this.occupancy!=null &&
              this.occupancy.equals(other.getOccupancy()))) &&
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
            ((this.groupIdentifier==null && other.getGroupIdentifier()==null) || 
             (this.groupIdentifier!=null &&
              this.groupIdentifier.equals(other.getGroupIdentifier()))) &&
            this.providerId == other.getProviderId() &&
            this.isNonRef == other.isIsNonRef() &&
            ((this.cancellationFeePaid==null && other.getCancellationFeePaid()==null) || 
             (this.cancellationFeePaid!=null &&
              this.cancellationFeePaid.equals(other.getCancellationFeePaid()))) &&
            ((this.cancellationFeeIfCancelledToday==null && other.getCancellationFeeIfCancelledToday()==null) || 
             (this.cancellationFeeIfCancelledToday!=null &&
              this.cancellationFeeIfCancelledToday.equals(other.getCancellationFeeIfCancelledToday()))) &&
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
        _hashCode += getHotelId();
        if (getHotel() != null) {
            _hashCode += getHotel().hashCode();
        }
        _hashCode += getRoomId();
        if (getRoom() != null) {
            _hashCode += getRoom().hashCode();
        }
        _hashCode += (isIsOnRequest() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRoomIndx() != null) {
            _hashCode += getRoomIndx().hashCode();
        }
        _hashCode += getMealId();
        if (getMeal() != null) {
            _hashCode += getMeal().hashCode();
        }
        if (getOccupancy() != null) {
            _hashCode += getOccupancy().hashCode();
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
        if (getGroupIdentifier() != null) {
            _hashCode += getGroupIdentifier().hashCode();
        }
        _hashCode += getProviderId();
        _hashCode += (isIsNonRef() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCancellationFeePaid() != null) {
            _hashCode += getCancellationFeePaid().hashCode();
        }
        if (getCancellationFeeIfCancelledToday() != null) {
            _hashCode += getCancellationFeeIfCancelledToday().hashCode();
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
        new org.apache.axis.description.TypeDesc(HotelReservationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelReservationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationDetailId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationDetailId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Hotel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoomId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("room");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Room"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOnRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "IsOnRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomIndx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoomIndx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mealId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "MealId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Meal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("groupIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GroupIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ProviderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNonRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "IsNonRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancellationFeePaid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CancellationFeePaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancellationFeeIfCancelledToday");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CancellationFeeIfCancelledToday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
