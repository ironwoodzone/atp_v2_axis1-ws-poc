/**
 * Itinerary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class Itinerary  implements java.io.Serializable {
    private int itineraryId;

    private java.lang.String title;

    private int startDay;

    private int stays;

    private java.lang.String imagePath;

    private com.bookcyprus.webservicesV2.ItineraryService[] itineraryServices;

    private com.bookcyprus.webservicesV2.ItineraryService[] alternativeItineraryServices;

    private java.lang.String description;

    public Itinerary() {
    }

    public Itinerary(
           int itineraryId,
           java.lang.String title,
           int startDay,
           int stays,
           java.lang.String imagePath,
           com.bookcyprus.webservicesV2.ItineraryService[] itineraryServices,
           com.bookcyprus.webservicesV2.ItineraryService[] alternativeItineraryServices,
           java.lang.String description) {
           this.itineraryId = itineraryId;
           this.title = title;
           this.startDay = startDay;
           this.stays = stays;
           this.imagePath = imagePath;
           this.itineraryServices = itineraryServices;
           this.alternativeItineraryServices = alternativeItineraryServices;
           this.description = description;
    }


    /**
     * Gets the itineraryId value for this Itinerary.
     * 
     * @return itineraryId
     */
    public int getItineraryId() {
        return itineraryId;
    }


    /**
     * Sets the itineraryId value for this Itinerary.
     * 
     * @param itineraryId
     */
    public void setItineraryId(int itineraryId) {
        this.itineraryId = itineraryId;
    }


    /**
     * Gets the title value for this Itinerary.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Itinerary.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the startDay value for this Itinerary.
     * 
     * @return startDay
     */
    public int getStartDay() {
        return startDay;
    }


    /**
     * Sets the startDay value for this Itinerary.
     * 
     * @param startDay
     */
    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }


    /**
     * Gets the stays value for this Itinerary.
     * 
     * @return stays
     */
    public int getStays() {
        return stays;
    }


    /**
     * Sets the stays value for this Itinerary.
     * 
     * @param stays
     */
    public void setStays(int stays) {
        this.stays = stays;
    }


    /**
     * Gets the imagePath value for this Itinerary.
     * 
     * @return imagePath
     */
    public java.lang.String getImagePath() {
        return imagePath;
    }


    /**
     * Sets the imagePath value for this Itinerary.
     * 
     * @param imagePath
     */
    public void setImagePath(java.lang.String imagePath) {
        this.imagePath = imagePath;
    }


    /**
     * Gets the itineraryServices value for this Itinerary.
     * 
     * @return itineraryServices
     */
    public com.bookcyprus.webservicesV2.ItineraryService[] getItineraryServices() {
        return itineraryServices;
    }


    /**
     * Sets the itineraryServices value for this Itinerary.
     * 
     * @param itineraryServices
     */
    public void setItineraryServices(com.bookcyprus.webservicesV2.ItineraryService[] itineraryServices) {
        this.itineraryServices = itineraryServices;
    }


    /**
     * Gets the alternativeItineraryServices value for this Itinerary.
     * 
     * @return alternativeItineraryServices
     */
    public com.bookcyprus.webservicesV2.ItineraryService[] getAlternativeItineraryServices() {
        return alternativeItineraryServices;
    }


    /**
     * Sets the alternativeItineraryServices value for this Itinerary.
     * 
     * @param alternativeItineraryServices
     */
    public void setAlternativeItineraryServices(com.bookcyprus.webservicesV2.ItineraryService[] alternativeItineraryServices) {
        this.alternativeItineraryServices = alternativeItineraryServices;
    }


    /**
     * Gets the description value for this Itinerary.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Itinerary.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Itinerary)) return false;
        Itinerary other = (Itinerary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.itineraryId == other.getItineraryId() &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            this.startDay == other.getStartDay() &&
            this.stays == other.getStays() &&
            ((this.imagePath==null && other.getImagePath()==null) || 
             (this.imagePath!=null &&
              this.imagePath.equals(other.getImagePath()))) &&
            ((this.itineraryServices==null && other.getItineraryServices()==null) || 
             (this.itineraryServices!=null &&
              java.util.Arrays.equals(this.itineraryServices, other.getItineraryServices()))) &&
            ((this.alternativeItineraryServices==null && other.getAlternativeItineraryServices()==null) || 
             (this.alternativeItineraryServices!=null &&
              java.util.Arrays.equals(this.alternativeItineraryServices, other.getAlternativeItineraryServices()))) &&
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
        _hashCode += getItineraryId();
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        _hashCode += getStartDay();
        _hashCode += getStays();
        if (getImagePath() != null) {
            _hashCode += getImagePath().hashCode();
        }
        if (getItineraryServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItineraryServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItineraryServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAlternativeItineraryServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlternativeItineraryServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlternativeItineraryServices(), i);
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
        new org.apache.axis.description.TypeDesc(Itinerary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Itinerary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itineraryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ItineraryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "StartDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Stays"));
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
        elemField.setFieldName("itineraryServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ItineraryServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ItineraryService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ItineraryService"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternativeItineraryServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "AlternativeItineraryServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ItineraryService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ItineraryService"));
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
