/**
 * HotelResultRoom.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class HotelResultRoom  implements java.io.Serializable {
    private int roomId;

    private java.lang.String room;

    private java.lang.String description;

    private java.lang.String[] ammenities;

    private int roomCnt;

    private boolean isOnRequest;

    private com.bookcyprus.webservicesV2.ServiceRate[] roomRates;

    public HotelResultRoom() {
    }

    public HotelResultRoom(
           int roomId,
           java.lang.String room,
           java.lang.String description,
           java.lang.String[] ammenities,
           int roomCnt,
           boolean isOnRequest,
           com.bookcyprus.webservicesV2.ServiceRate[] roomRates) {
           this.roomId = roomId;
           this.room = room;
           this.description = description;
           this.ammenities = ammenities;
           this.roomCnt = roomCnt;
           this.isOnRequest = isOnRequest;
           this.roomRates = roomRates;
    }


    /**
     * Gets the roomId value for this HotelResultRoom.
     * 
     * @return roomId
     */
    public int getRoomId() {
        return roomId;
    }


    /**
     * Sets the roomId value for this HotelResultRoom.
     * 
     * @param roomId
     */
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }


    /**
     * Gets the room value for this HotelResultRoom.
     * 
     * @return room
     */
    public java.lang.String getRoom() {
        return room;
    }


    /**
     * Sets the room value for this HotelResultRoom.
     * 
     * @param room
     */
    public void setRoom(java.lang.String room) {
        this.room = room;
    }


    /**
     * Gets the description value for this HotelResultRoom.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this HotelResultRoom.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the ammenities value for this HotelResultRoom.
     * 
     * @return ammenities
     */
    public java.lang.String[] getAmmenities() {
        return ammenities;
    }


    /**
     * Sets the ammenities value for this HotelResultRoom.
     * 
     * @param ammenities
     */
    public void setAmmenities(java.lang.String[] ammenities) {
        this.ammenities = ammenities;
    }


    /**
     * Gets the roomCnt value for this HotelResultRoom.
     * 
     * @return roomCnt
     */
    public int getRoomCnt() {
        return roomCnt;
    }


    /**
     * Sets the roomCnt value for this HotelResultRoom.
     * 
     * @param roomCnt
     */
    public void setRoomCnt(int roomCnt) {
        this.roomCnt = roomCnt;
    }


    /**
     * Gets the isOnRequest value for this HotelResultRoom.
     * 
     * @return isOnRequest
     */
    public boolean isIsOnRequest() {
        return isOnRequest;
    }


    /**
     * Sets the isOnRequest value for this HotelResultRoom.
     * 
     * @param isOnRequest
     */
    public void setIsOnRequest(boolean isOnRequest) {
        this.isOnRequest = isOnRequest;
    }


    /**
     * Gets the roomRates value for this HotelResultRoom.
     * 
     * @return roomRates
     */
    public com.bookcyprus.webservicesV2.ServiceRate[] getRoomRates() {
        return roomRates;
    }


    /**
     * Sets the roomRates value for this HotelResultRoom.
     * 
     * @param roomRates
     */
    public void setRoomRates(com.bookcyprus.webservicesV2.ServiceRate[] roomRates) {
        this.roomRates = roomRates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HotelResultRoom)) return false;
        HotelResultRoom other = (HotelResultRoom) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.roomId == other.getRoomId() &&
            ((this.room==null && other.getRoom()==null) || 
             (this.room!=null &&
              this.room.equals(other.getRoom()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.ammenities==null && other.getAmmenities()==null) || 
             (this.ammenities!=null &&
              java.util.Arrays.equals(this.ammenities, other.getAmmenities()))) &&
            this.roomCnt == other.getRoomCnt() &&
            this.isOnRequest == other.isIsOnRequest() &&
            ((this.roomRates==null && other.getRoomRates()==null) || 
             (this.roomRates!=null &&
              java.util.Arrays.equals(this.roomRates, other.getRoomRates())));
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
        _hashCode += getRoomId();
        if (getRoom() != null) {
            _hashCode += getRoom().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAmmenities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmmenities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmmenities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getRoomCnt();
        _hashCode += (isIsOnRequest() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRoomRates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoomRates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoomRates(), i);
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
        new org.apache.axis.description.TypeDesc(HotelResultRoom.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelResultRoom"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ammenities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Ammenities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomCnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoomCnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOnRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "IsOnRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomRates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoomRates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ServiceRate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ServiceRate"));
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
