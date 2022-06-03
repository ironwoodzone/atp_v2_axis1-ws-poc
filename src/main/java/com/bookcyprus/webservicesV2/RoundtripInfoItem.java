/**
 * RoundtripInfoItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class RoundtripInfoItem  implements java.io.Serializable {
    private int roundtripId;

    private java.lang.String roundtripName;

    private int minimumPersons;

    private java.math.BigDecimal fromPrice;

    private int duration;

    private com.bookcyprus.webservicesV2.RoundtripLocation[] locations;

    private com.bookcyprus.webservicesV2.RoundtripType[] rountripTypes;

    private com.bookcyprus.webservicesV2.Itinerary[] itineraries;

    private java.lang.String imagePath;

    private com.bookcyprus.webservicesV2.Media[] medias;

    private java.lang.String description;

    public RoundtripInfoItem() {
    }

    public RoundtripInfoItem(
           int roundtripId,
           java.lang.String roundtripName,
           int minimumPersons,
           java.math.BigDecimal fromPrice,
           int duration,
           com.bookcyprus.webservicesV2.RoundtripLocation[] locations,
           com.bookcyprus.webservicesV2.RoundtripType[] rountripTypes,
           com.bookcyprus.webservicesV2.Itinerary[] itineraries,
           java.lang.String imagePath,
           com.bookcyprus.webservicesV2.Media[] medias,
           java.lang.String description) {
           this.roundtripId = roundtripId;
           this.roundtripName = roundtripName;
           this.minimumPersons = minimumPersons;
           this.fromPrice = fromPrice;
           this.duration = duration;
           this.locations = locations;
           this.rountripTypes = rountripTypes;
           this.itineraries = itineraries;
           this.imagePath = imagePath;
           this.medias = medias;
           this.description = description;
    }


    /**
     * Gets the roundtripId value for this RoundtripInfoItem.
     * 
     * @return roundtripId
     */
    public int getRoundtripId() {
        return roundtripId;
    }


    /**
     * Sets the roundtripId value for this RoundtripInfoItem.
     * 
     * @param roundtripId
     */
    public void setRoundtripId(int roundtripId) {
        this.roundtripId = roundtripId;
    }


    /**
     * Gets the roundtripName value for this RoundtripInfoItem.
     * 
     * @return roundtripName
     */
    public java.lang.String getRoundtripName() {
        return roundtripName;
    }


    /**
     * Sets the roundtripName value for this RoundtripInfoItem.
     * 
     * @param roundtripName
     */
    public void setRoundtripName(java.lang.String roundtripName) {
        this.roundtripName = roundtripName;
    }


    /**
     * Gets the minimumPersons value for this RoundtripInfoItem.
     * 
     * @return minimumPersons
     */
    public int getMinimumPersons() {
        return minimumPersons;
    }


    /**
     * Sets the minimumPersons value for this RoundtripInfoItem.
     * 
     * @param minimumPersons
     */
    public void setMinimumPersons(int minimumPersons) {
        this.minimumPersons = minimumPersons;
    }


    /**
     * Gets the fromPrice value for this RoundtripInfoItem.
     * 
     * @return fromPrice
     */
    public java.math.BigDecimal getFromPrice() {
        return fromPrice;
    }


    /**
     * Sets the fromPrice value for this RoundtripInfoItem.
     * 
     * @param fromPrice
     */
    public void setFromPrice(java.math.BigDecimal fromPrice) {
        this.fromPrice = fromPrice;
    }


    /**
     * Gets the duration value for this RoundtripInfoItem.
     * 
     * @return duration
     */
    public int getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this RoundtripInfoItem.
     * 
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }


    /**
     * Gets the locations value for this RoundtripInfoItem.
     * 
     * @return locations
     */
    public com.bookcyprus.webservicesV2.RoundtripLocation[] getLocations() {
        return locations;
    }


    /**
     * Sets the locations value for this RoundtripInfoItem.
     * 
     * @param locations
     */
    public void setLocations(com.bookcyprus.webservicesV2.RoundtripLocation[] locations) {
        this.locations = locations;
    }


    /**
     * Gets the rountripTypes value for this RoundtripInfoItem.
     * 
     * @return rountripTypes
     */
    public com.bookcyprus.webservicesV2.RoundtripType[] getRountripTypes() {
        return rountripTypes;
    }


    /**
     * Sets the rountripTypes value for this RoundtripInfoItem.
     * 
     * @param rountripTypes
     */
    public void setRountripTypes(com.bookcyprus.webservicesV2.RoundtripType[] rountripTypes) {
        this.rountripTypes = rountripTypes;
    }


    /**
     * Gets the itineraries value for this RoundtripInfoItem.
     * 
     * @return itineraries
     */
    public com.bookcyprus.webservicesV2.Itinerary[] getItineraries() {
        return itineraries;
    }


    /**
     * Sets the itineraries value for this RoundtripInfoItem.
     * 
     * @param itineraries
     */
    public void setItineraries(com.bookcyprus.webservicesV2.Itinerary[] itineraries) {
        this.itineraries = itineraries;
    }


    /**
     * Gets the imagePath value for this RoundtripInfoItem.
     * 
     * @return imagePath
     */
    public java.lang.String getImagePath() {
        return imagePath;
    }


    /**
     * Sets the imagePath value for this RoundtripInfoItem.
     * 
     * @param imagePath
     */
    public void setImagePath(java.lang.String imagePath) {
        this.imagePath = imagePath;
    }


    /**
     * Gets the medias value for this RoundtripInfoItem.
     * 
     * @return medias
     */
    public com.bookcyprus.webservicesV2.Media[] getMedias() {
        return medias;
    }


    /**
     * Sets the medias value for this RoundtripInfoItem.
     * 
     * @param medias
     */
    public void setMedias(com.bookcyprus.webservicesV2.Media[] medias) {
        this.medias = medias;
    }


    /**
     * Gets the description value for this RoundtripInfoItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RoundtripInfoItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoundtripInfoItem)) return false;
        RoundtripInfoItem other = (RoundtripInfoItem) obj;
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
            this.minimumPersons == other.getMinimumPersons() &&
            ((this.fromPrice==null && other.getFromPrice()==null) || 
             (this.fromPrice!=null &&
              this.fromPrice.equals(other.getFromPrice()))) &&
            this.duration == other.getDuration() &&
            ((this.locations==null && other.getLocations()==null) || 
             (this.locations!=null &&
              java.util.Arrays.equals(this.locations, other.getLocations()))) &&
            ((this.rountripTypes==null && other.getRountripTypes()==null) || 
             (this.rountripTypes!=null &&
              java.util.Arrays.equals(this.rountripTypes, other.getRountripTypes()))) &&
            ((this.itineraries==null && other.getItineraries()==null) || 
             (this.itineraries!=null &&
              java.util.Arrays.equals(this.itineraries, other.getItineraries()))) &&
            ((this.imagePath==null && other.getImagePath()==null) || 
             (this.imagePath!=null &&
              this.imagePath.equals(other.getImagePath()))) &&
            ((this.medias==null && other.getMedias()==null) || 
             (this.medias!=null &&
              java.util.Arrays.equals(this.medias, other.getMedias()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        _hashCode += getMinimumPersons();
        if (getFromPrice() != null) {
            _hashCode += getFromPrice().hashCode();
        }
        _hashCode += getDuration();
        if (getLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRountripTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRountripTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRountripTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItineraries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItineraries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItineraries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImagePath() != null) {
            _hashCode += getImagePath().hashCode();
        }
        if (getMedias() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMedias());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMedias(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoundtripInfoItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripInfoItem"));
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
        elemField.setFieldName("minimumPersons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "MinimumPersons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "FromPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Locations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripLocation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rountripTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RountripTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itineraries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Itineraries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Itinerary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Itinerary"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imagePath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ImagePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Medias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Media"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Media"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
