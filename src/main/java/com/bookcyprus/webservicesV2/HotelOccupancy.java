/**
 * HotelOccupancy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class HotelOccupancy  implements java.io.Serializable {
    private int roomIndex;

    private int adults;

    private int[] childrenAges;

    public HotelOccupancy() {
    }

    public HotelOccupancy(
           int roomIndex,
           int adults,
           int[] childrenAges) {
           this.roomIndex = roomIndex;
           this.adults = adults;
           this.childrenAges = childrenAges;
    }


    /**
     * Gets the roomIndex value for this HotelOccupancy.
     * 
     * @return roomIndex
     */
    public int getRoomIndex() {
        return roomIndex;
    }


    /**
     * Sets the roomIndex value for this HotelOccupancy.
     * 
     * @param roomIndex
     */
    public void setRoomIndex(int roomIndex) {
        this.roomIndex = roomIndex;
    }


    /**
     * Gets the adults value for this HotelOccupancy.
     * 
     * @return adults
     */
    public int getAdults() {
        return adults;
    }


    /**
     * Sets the adults value for this HotelOccupancy.
     * 
     * @param adults
     */
    public void setAdults(int adults) {
        this.adults = adults;
    }


    /**
     * Gets the childrenAges value for this HotelOccupancy.
     * 
     * @return childrenAges
     */
    public int[] getChildrenAges() {
        return childrenAges;
    }


    /**
     * Sets the childrenAges value for this HotelOccupancy.
     * 
     * @param childrenAges
     */
    public void setChildrenAges(int[] childrenAges) {
        this.childrenAges = childrenAges;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HotelOccupancy)) return false;
        HotelOccupancy other = (HotelOccupancy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.roomIndex == other.getRoomIndex() &&
            this.adults == other.getAdults() &&
            ((this.childrenAges==null && other.getChildrenAges()==null) || 
             (this.childrenAges!=null &&
              java.util.Arrays.equals(this.childrenAges, other.getChildrenAges())));
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
        _hashCode += getRoomIndex();
        _hashCode += getAdults();
        if (getChildrenAges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildrenAges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildrenAges(), i);
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
        new org.apache.axis.description.TypeDesc(HotelOccupancy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelOccupancy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoomIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Adults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childrenAges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ChildrenAges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "int"));
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
