/**
 * HotelServiceExtented.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class HotelServiceExtented  extends com.bookcyprus.webservicesV2.HotelService  implements java.io.Serializable {
    private java.lang.String shortDescription;

    private java.lang.String longDescription;

    private java.lang.String roomsDescription;

    private java.lang.String recreationDescription;

    private java.lang.String diningDescription;

    private java.lang.String POIDescription;

    private java.lang.String policies;

    private java.lang.String latitude;

    private java.lang.String longtitue;

    private int popularity;

    private java.lang.String imagePath;

    private com.bookcyprus.webservicesV2.HotelServiceMedia[] media;

    private com.bookcyprus.webservicesV2.HotelResultRoom[] rooms;

    public HotelServiceExtented() {
    }

    public HotelServiceExtented(
           int hotelId,
           java.lang.String hotelName,
           int locationId,
           java.lang.String locationName,
           int starClassId,
           java.lang.String starClassName,
           java.lang.String landingURL,
           com.bookcyprus.webservicesV2.HotelResult[] availableRooms,
           java.math.BigDecimal lowestPrice,
           java.lang.String shortDescription,
           java.lang.String longDescription,
           java.lang.String roomsDescription,
           java.lang.String recreationDescription,
           java.lang.String diningDescription,
           java.lang.String POIDescription,
           java.lang.String policies,
           java.lang.String latitude,
           java.lang.String longtitue,
           int popularity,
           java.lang.String imagePath,
           com.bookcyprus.webservicesV2.HotelServiceMedia[] media,
           com.bookcyprus.webservicesV2.HotelResultRoom[] rooms) {
        super(
            hotelId,
            hotelName,
            locationId,
            locationName,
            starClassId,
            starClassName,
            landingURL,
            availableRooms,
            lowestPrice);
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.roomsDescription = roomsDescription;
        this.recreationDescription = recreationDescription;
        this.diningDescription = diningDescription;
        this.POIDescription = POIDescription;
        this.policies = policies;
        this.latitude = latitude;
        this.longtitue = longtitue;
        this.popularity = popularity;
        this.imagePath = imagePath;
        this.media = media;
        this.rooms = rooms;
    }


    /**
     * Gets the shortDescription value for this HotelServiceExtented.
     * 
     * @return shortDescription
     */
    public java.lang.String getShortDescription() {
        return shortDescription;
    }


    /**
     * Sets the shortDescription value for this HotelServiceExtented.
     * 
     * @param shortDescription
     */
    public void setShortDescription(java.lang.String shortDescription) {
        this.shortDescription = shortDescription;
    }


    /**
     * Gets the longDescription value for this HotelServiceExtented.
     * 
     * @return longDescription
     */
    public java.lang.String getLongDescription() {
        return longDescription;
    }


    /**
     * Sets the longDescription value for this HotelServiceExtented.
     * 
     * @param longDescription
     */
    public void setLongDescription(java.lang.String longDescription) {
        this.longDescription = longDescription;
    }


    /**
     * Gets the roomsDescription value for this HotelServiceExtented.
     * 
     * @return roomsDescription
     */
    public java.lang.String getRoomsDescription() {
        return roomsDescription;
    }


    /**
     * Sets the roomsDescription value for this HotelServiceExtented.
     * 
     * @param roomsDescription
     */
    public void setRoomsDescription(java.lang.String roomsDescription) {
        this.roomsDescription = roomsDescription;
    }


    /**
     * Gets the recreationDescription value for this HotelServiceExtented.
     * 
     * @return recreationDescription
     */
    public java.lang.String getRecreationDescription() {
        return recreationDescription;
    }


    /**
     * Sets the recreationDescription value for this HotelServiceExtented.
     * 
     * @param recreationDescription
     */
    public void setRecreationDescription(java.lang.String recreationDescription) {
        this.recreationDescription = recreationDescription;
    }


    /**
     * Gets the diningDescription value for this HotelServiceExtented.
     * 
     * @return diningDescription
     */
    public java.lang.String getDiningDescription() {
        return diningDescription;
    }


    /**
     * Sets the diningDescription value for this HotelServiceExtented.
     * 
     * @param diningDescription
     */
    public void setDiningDescription(java.lang.String diningDescription) {
        this.diningDescription = diningDescription;
    }


    /**
     * Gets the POIDescription value for this HotelServiceExtented.
     * 
     * @return POIDescription
     */
    public java.lang.String getPOIDescription() {
        return POIDescription;
    }


    /**
     * Sets the POIDescription value for this HotelServiceExtented.
     * 
     * @param POIDescription
     */
    public void setPOIDescription(java.lang.String POIDescription) {
        this.POIDescription = POIDescription;
    }


    /**
     * Gets the policies value for this HotelServiceExtented.
     * 
     * @return policies
     */
    public java.lang.String getPolicies() {
        return policies;
    }


    /**
     * Sets the policies value for this HotelServiceExtented.
     * 
     * @param policies
     */
    public void setPolicies(java.lang.String policies) {
        this.policies = policies;
    }


    /**
     * Gets the latitude value for this HotelServiceExtented.
     * 
     * @return latitude
     */
    public java.lang.String getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this HotelServiceExtented.
     * 
     * @param latitude
     */
    public void setLatitude(java.lang.String latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longtitue value for this HotelServiceExtented.
     * 
     * @return longtitue
     */
    public java.lang.String getLongtitue() {
        return longtitue;
    }


    /**
     * Sets the longtitue value for this HotelServiceExtented.
     * 
     * @param longtitue
     */
    public void setLongtitue(java.lang.String longtitue) {
        this.longtitue = longtitue;
    }


    /**
     * Gets the popularity value for this HotelServiceExtented.
     * 
     * @return popularity
     */
    public int getPopularity() {
        return popularity;
    }


    /**
     * Sets the popularity value for this HotelServiceExtented.
     * 
     * @param popularity
     */
    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }


    /**
     * Gets the imagePath value for this HotelServiceExtented.
     * 
     * @return imagePath
     */
    public java.lang.String getImagePath() {
        return imagePath;
    }


    /**
     * Sets the imagePath value for this HotelServiceExtented.
     * 
     * @param imagePath
     */
    public void setImagePath(java.lang.String imagePath) {
        this.imagePath = imagePath;
    }


    /**
     * Gets the media value for this HotelServiceExtented.
     * 
     * @return media
     */
    public com.bookcyprus.webservicesV2.HotelServiceMedia[] getMedia() {
        return media;
    }


    /**
     * Sets the media value for this HotelServiceExtented.
     * 
     * @param media
     */
    public void setMedia(com.bookcyprus.webservicesV2.HotelServiceMedia[] media) {
        this.media = media;
    }


    /**
     * Gets the rooms value for this HotelServiceExtented.
     * 
     * @return rooms
     */
    public com.bookcyprus.webservicesV2.HotelResultRoom[] getRooms() {
        return rooms;
    }


    /**
     * Sets the rooms value for this HotelServiceExtented.
     * 
     * @param rooms
     */
    public void setRooms(com.bookcyprus.webservicesV2.HotelResultRoom[] rooms) {
        this.rooms = rooms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HotelServiceExtented)) return false;
        HotelServiceExtented other = (HotelServiceExtented) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.shortDescription==null && other.getShortDescription()==null) || 
             (this.shortDescription!=null &&
              this.shortDescription.equals(other.getShortDescription()))) &&
            ((this.longDescription==null && other.getLongDescription()==null) || 
             (this.longDescription!=null &&
              this.longDescription.equals(other.getLongDescription()))) &&
            ((this.roomsDescription==null && other.getRoomsDescription()==null) || 
             (this.roomsDescription!=null &&
              this.roomsDescription.equals(other.getRoomsDescription()))) &&
            ((this.recreationDescription==null && other.getRecreationDescription()==null) || 
             (this.recreationDescription!=null &&
              this.recreationDescription.equals(other.getRecreationDescription()))) &&
            ((this.diningDescription==null && other.getDiningDescription()==null) || 
             (this.diningDescription!=null &&
              this.diningDescription.equals(other.getDiningDescription()))) &&
            ((this.POIDescription==null && other.getPOIDescription()==null) || 
             (this.POIDescription!=null &&
              this.POIDescription.equals(other.getPOIDescription()))) &&
            ((this.policies==null && other.getPolicies()==null) || 
             (this.policies!=null &&
              this.policies.equals(other.getPolicies()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.longtitue==null && other.getLongtitue()==null) || 
             (this.longtitue!=null &&
              this.longtitue.equals(other.getLongtitue()))) &&
            this.popularity == other.getPopularity() &&
            ((this.imagePath==null && other.getImagePath()==null) || 
             (this.imagePath!=null &&
              this.imagePath.equals(other.getImagePath()))) &&
            ((this.media==null && other.getMedia()==null) || 
             (this.media!=null &&
              java.util.Arrays.equals(this.media, other.getMedia()))) &&
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
        int _hashCode = super.hashCode();
        if (getShortDescription() != null) {
            _hashCode += getShortDescription().hashCode();
        }
        if (getLongDescription() != null) {
            _hashCode += getLongDescription().hashCode();
        }
        if (getRoomsDescription() != null) {
            _hashCode += getRoomsDescription().hashCode();
        }
        if (getRecreationDescription() != null) {
            _hashCode += getRecreationDescription().hashCode();
        }
        if (getDiningDescription() != null) {
            _hashCode += getDiningDescription().hashCode();
        }
        if (getPOIDescription() != null) {
            _hashCode += getPOIDescription().hashCode();
        }
        if (getPolicies() != null) {
            _hashCode += getPolicies().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLongtitue() != null) {
            _hashCode += getLongtitue().hashCode();
        }
        _hashCode += getPopularity();
        if (getImagePath() != null) {
            _hashCode += getImagePath().hashCode();
        }
        if (getMedia() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMedia());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMedia(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(HotelServiceExtented.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelServiceExtented"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ShortDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "LongDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomsDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoomsDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recreationDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RecreationDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diningDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "DiningDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POIDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "POIDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Policies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longtitue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Longtitue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("popularity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Popularity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imagePath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ImagePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("media");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Media"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelServiceMedia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelServiceMedia"));
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
