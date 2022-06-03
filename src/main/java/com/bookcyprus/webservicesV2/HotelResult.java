/**
 * HotelResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class HotelResult  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.HotelOccupancy occupancy;

    private com.bookcyprus.webservicesV2.HotelResultRoom[] rooms;

    public HotelResult() {
    }

    public HotelResult(
           com.bookcyprus.webservicesV2.HotelOccupancy occupancy,
           com.bookcyprus.webservicesV2.HotelResultRoom[] rooms) {
           this.occupancy = occupancy;
           this.rooms = rooms;
    }


    /**
     * Gets the occupancy value for this HotelResult.
     * 
     * @return occupancy
     */
    public com.bookcyprus.webservicesV2.HotelOccupancy getOccupancy() {
        return occupancy;
    }


    /**
     * Sets the occupancy value for this HotelResult.
     * 
     * @param occupancy
     */
    public void setOccupancy(com.bookcyprus.webservicesV2.HotelOccupancy occupancy) {
        this.occupancy = occupancy;
    }


    /**
     * Gets the rooms value for this HotelResult.
     * 
     * @return rooms
     */
    public com.bookcyprus.webservicesV2.HotelResultRoom[] getRooms() {
        return rooms;
    }


    /**
     * Sets the rooms value for this HotelResult.
     * 
     * @param rooms
     */
    public void setRooms(com.bookcyprus.webservicesV2.HotelResultRoom[] rooms) {
        this.rooms = rooms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HotelResult)) return false;
        HotelResult other = (HotelResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.occupancy==null && other.getOccupancy()==null) || 
             (this.occupancy!=null &&
              this.occupancy.equals(other.getOccupancy()))) &&
            ((this.rooms==null && other.getRooms()==null) || 
             (this.rooms!=null &&
              java.util.Arrays.equals(this.rooms, other.getRooms())));
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
        if (getOccupancy() != null) {
            _hashCode += getOccupancy().hashCode();
        }
        if (getRooms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRooms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRooms(), i);
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
        new org.apache.axis.description.TypeDesc(HotelResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occupancy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Occupancy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelOccupancy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rooms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Rooms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelResultRoom"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelResultRoom"));
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
