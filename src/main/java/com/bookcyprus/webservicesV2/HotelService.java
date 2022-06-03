/**
 * HotelService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class HotelService  implements java.io.Serializable {
    private int hotelId;

    private java.lang.String hotelName;

    private int locationId;

    private java.lang.String locationName;

    private int starClassId;

    private java.lang.String starClassName;

    private java.lang.String landingURL;

    private com.bookcyprus.webservicesV2.HotelResult[] availableRooms;

    private java.math.BigDecimal lowestPrice;

    public HotelService() {
    }

    public HotelService(
           int hotelId,
           java.lang.String hotelName,
           int locationId,
           java.lang.String locationName,
           int starClassId,
           java.lang.String starClassName,
           java.lang.String landingURL,
           com.bookcyprus.webservicesV2.HotelResult[] availableRooms,
           java.math.BigDecimal lowestPrice) {
           this.hotelId = hotelId;
           this.hotelName = hotelName;
           this.locationId = locationId;
           this.locationName = locationName;
           this.starClassId = starClassId;
           this.starClassName = starClassName;
           this.landingURL = landingURL;
           this.availableRooms = availableRooms;
           this.lowestPrice = lowestPrice;
    }


    /**
     * Gets the hotelId value for this HotelService.
     * 
     * @return hotelId
     */
    public int getHotelId() {
        return hotelId;
    }


    /**
     * Sets the hotelId value for this HotelService.
     * 
     * @param hotelId
     */
    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }


    /**
     * Gets the hotelName value for this HotelService.
     * 
     * @return hotelName
     */
    public java.lang.String getHotelName() {
        return hotelName;
    }


    /**
     * Sets the hotelName value for this HotelService.
     * 
     * @param hotelName
     */
    public void setHotelName(java.lang.String hotelName) {
        this.hotelName = hotelName;
    }


    /**
     * Gets the locationId value for this HotelService.
     * 
     * @return locationId
     */
    public int getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this HotelService.
     * 
     * @param locationId
     */
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the locationName value for this HotelService.
     * 
     * @return locationName
     */
    public java.lang.String getLocationName() {
        return locationName;
    }


    /**
     * Sets the locationName value for this HotelService.
     * 
     * @param locationName
     */
    public void setLocationName(java.lang.String locationName) {
        this.locationName = locationName;
    }


    /**
     * Gets the starClassId value for this HotelService.
     * 
     * @return starClassId
     */
    public int getStarClassId() {
        return starClassId;
    }


    /**
     * Sets the starClassId value for this HotelService.
     * 
     * @param starClassId
     */
    public void setStarClassId(int starClassId) {
        this.starClassId = starClassId;
    }


    /**
     * Gets the starClassName value for this HotelService.
     * 
     * @return starClassName
     */
    public java.lang.String getStarClassName() {
        return starClassName;
    }


    /**
     * Sets the starClassName value for this HotelService.
     * 
     * @param starClassName
     */
    public void setStarClassName(java.lang.String starClassName) {
        this.starClassName = starClassName;
    }


    /**
     * Gets the landingURL value for this HotelService.
     * 
     * @return landingURL
     */
    public java.lang.String getLandingURL() {
        return landingURL;
    }


    /**
     * Sets the landingURL value for this HotelService.
     * 
     * @param landingURL
     */
    public void setLandingURL(java.lang.String landingURL) {
        this.landingURL = landingURL;
    }


    /**
     * Gets the availableRooms value for this HotelService.
     * 
     * @return availableRooms
     */
    public com.bookcyprus.webservicesV2.HotelResult[] getAvailableRooms() {
        return availableRooms;
    }


    /**
     * Sets the availableRooms value for this HotelService.
     * 
     * @param availableRooms
     */
    public void setAvailableRooms(com.bookcyprus.webservicesV2.HotelResult[] availableRooms) {
        this.availableRooms = availableRooms;
    }


    /**
     * Gets the lowestPrice value for this HotelService.
     * 
     * @return lowestPrice
     */
    public java.math.BigDecimal getLowestPrice() {
        return lowestPrice;
    }


    /**
     * Sets the lowestPrice value for this HotelService.
     * 
     * @param lowestPrice
     */
    public void setLowestPrice(java.math.BigDecimal lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HotelService)) return false;
        HotelService other = (HotelService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.hotelId == other.getHotelId() &&
            ((this.hotelName==null && other.getHotelName()==null) || 
             (this.hotelName!=null &&
              this.hotelName.equals(other.getHotelName()))) &&
            this.locationId == other.getLocationId() &&
            ((this.locationName==null && other.getLocationName()==null) || 
             (this.locationName!=null &&
              this.locationName.equals(other.getLocationName()))) &&
            this.starClassId == other.getStarClassId() &&
            ((this.starClassName==null && other.getStarClassName()==null) || 
             (this.starClassName!=null &&
              this.starClassName.equals(other.getStarClassName()))) &&
            ((this.landingURL==null && other.getLandingURL()==null) || 
             (this.landingURL!=null &&
              this.landingURL.equals(other.getLandingURL()))) &&
            ((this.availableRooms==null && other.getAvailableRooms()==null) || 
             (this.availableRooms!=null &&
              java.util.Arrays.equals(this.availableRooms, other.getAvailableRooms()))) &&
            ((this.lowestPrice==null && other.getLowestPrice()==null) || 
             (this.lowestPrice!=null &&
              this.lowestPrice.equals(other.getLowestPrice())));
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
        if (getHotelName() != null) {
            _hashCode += getHotelName().hashCode();
        }
        _hashCode += getLocationId();
        if (getLocationName() != null) {
            _hashCode += getLocationName().hashCode();
        }
        _hashCode += getStarClassId();
        if (getStarClassName() != null) {
            _hashCode += getStarClassName().hashCode();
        }
        if (getLandingURL() != null) {
            _hashCode += getLandingURL().hashCode();
        }
        if (getAvailableRooms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableRooms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableRooms(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLowestPrice() != null) {
            _hashCode += getLowestPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HotelService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "LocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "LocationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("starClassId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "StarClassId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("starClassName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "StarClassName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landingURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "LandingURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableRooms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "AvailableRooms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelResult"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowestPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "LowestPrice"));
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
