/**
 * RoundtripReservationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class RoundtripReservationResponse  implements java.io.Serializable {
    private int roundtripId;

    private java.lang.String roundtripName;

    private boolean isOnRequest;

    private java.util.Calendar startDate;

    private java.math.BigDecimal totalPrice;

    private com.bookcyprus.webservicesV2.HotelOccupancy[] roomOccupancies;

    private java.math.BigDecimal cancellationFeeIfCancelledToday;

    public RoundtripReservationResponse() {
    }

    public RoundtripReservationResponse(
           int roundtripId,
           java.lang.String roundtripName,
           boolean isOnRequest,
           java.util.Calendar startDate,
           java.math.BigDecimal totalPrice,
           com.bookcyprus.webservicesV2.HotelOccupancy[] roomOccupancies,
           java.math.BigDecimal cancellationFeeIfCancelledToday) {
           this.roundtripId = roundtripId;
           this.roundtripName = roundtripName;
           this.isOnRequest = isOnRequest;
           this.startDate = startDate;
           this.totalPrice = totalPrice;
           this.roomOccupancies = roomOccupancies;
           this.cancellationFeeIfCancelledToday = cancellationFeeIfCancelledToday;
    }


    /**
     * Gets the roundtripId value for this RoundtripReservationResponse.
     * 
     * @return roundtripId
     */
    public int getRoundtripId() {
        return roundtripId;
    }


    /**
     * Sets the roundtripId value for this RoundtripReservationResponse.
     * 
     * @param roundtripId
     */
    public void setRoundtripId(int roundtripId) {
        this.roundtripId = roundtripId;
    }


    /**
     * Gets the roundtripName value for this RoundtripReservationResponse.
     * 
     * @return roundtripName
     */
    public java.lang.String getRoundtripName() {
        return roundtripName;
    }


    /**
     * Sets the roundtripName value for this RoundtripReservationResponse.
     * 
     * @param roundtripName
     */
    public void setRoundtripName(java.lang.String roundtripName) {
        this.roundtripName = roundtripName;
    }


    /**
     * Gets the isOnRequest value for this RoundtripReservationResponse.
     * 
     * @return isOnRequest
     */
    public boolean isIsOnRequest() {
        return isOnRequest;
    }


    /**
     * Sets the isOnRequest value for this RoundtripReservationResponse.
     * 
     * @param isOnRequest
     */
    public void setIsOnRequest(boolean isOnRequest) {
        this.isOnRequest = isOnRequest;
    }


    /**
     * Gets the startDate value for this RoundtripReservationResponse.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this RoundtripReservationResponse.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the totalPrice value for this RoundtripReservationResponse.
     * 
     * @return totalPrice
     */
    public java.math.BigDecimal getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this RoundtripReservationResponse.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(java.math.BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * Gets the roomOccupancies value for this RoundtripReservationResponse.
     * 
     * @return roomOccupancies
     */
    public com.bookcyprus.webservicesV2.HotelOccupancy[] getRoomOccupancies() {
        return roomOccupancies;
    }


    /**
     * Sets the roomOccupancies value for this RoundtripReservationResponse.
     * 
     * @param roomOccupancies
     */
    public void setRoomOccupancies(com.bookcyprus.webservicesV2.HotelOccupancy[] roomOccupancies) {
        this.roomOccupancies = roomOccupancies;
    }


    /**
     * Gets the cancellationFeeIfCancelledToday value for this RoundtripReservationResponse.
     * 
     * @return cancellationFeeIfCancelledToday
     */
    public java.math.BigDecimal getCancellationFeeIfCancelledToday() {
        return cancellationFeeIfCancelledToday;
    }


    /**
     * Sets the cancellationFeeIfCancelledToday value for this RoundtripReservationResponse.
     * 
     * @param cancellationFeeIfCancelledToday
     */
    public void setCancellationFeeIfCancelledToday(java.math.BigDecimal cancellationFeeIfCancelledToday) {
        this.cancellationFeeIfCancelledToday = cancellationFeeIfCancelledToday;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoundtripReservationResponse)) return false;
        RoundtripReservationResponse other = (RoundtripReservationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.roundtripId == other.getRoundtripId() &&
            ((this.roundtripName==null && other.getRoundtripName()==null) || 
             (this.roundtripName!=null &&
              this.roundtripName.equals(other.getRoundtripName()))) &&
            this.isOnRequest == other.isIsOnRequest() &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.totalPrice==null && other.getTotalPrice()==null) || 
             (this.totalPrice!=null &&
              this.totalPrice.equals(other.getTotalPrice()))) &&
            ((this.roomOccupancies==null && other.getRoomOccupancies()==null) || 
             (this.roomOccupancies!=null &&
              java.util.Arrays.equals(this.roomOccupancies, other.getRoomOccupancies()))) &&
            ((this.cancellationFeeIfCancelledToday==null && other.getCancellationFeeIfCancelledToday()==null) || 
             (this.cancellationFeeIfCancelledToday!=null &&
              this.cancellationFeeIfCancelledToday.equals(other.getCancellationFeeIfCancelledToday())));
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
        _hashCode += getRoundtripId();
        if (getRoundtripName() != null) {
            _hashCode += getRoundtripName().hashCode();
        }
        _hashCode += (isIsOnRequest() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getTotalPrice() != null) {
            _hashCode += getTotalPrice().hashCode();
        }
        if (getRoomOccupancies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoomOccupancies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoomOccupancies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCancellationFeeIfCancelledToday() != null) {
            _hashCode += getCancellationFeeIfCancelledToday().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoundtripReservationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripReservationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundtripId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundtripName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripName"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TotalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomOccupancies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoomOccupancies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelOccupancy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelOccupancy"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancellationFeeIfCancelledToday");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CancellationFeeIfCancelledToday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
