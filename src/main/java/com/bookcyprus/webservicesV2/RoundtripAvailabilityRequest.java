/**
 * RoundtripAvailabilityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class RoundtripAvailabilityRequest  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.RequestBase baseRequest;

    private int roundtripId;

    private java.util.Calendar startDate;

    private com.bookcyprus.webservicesV2.HotelOccupancy[] roomOccupancies;

    private com.bookcyprus.webservicesV2.Itinerary[] customItineraries;

    private com.bookcyprus.webservicesV2.Language language;

    public RoundtripAvailabilityRequest() {
    }

    public RoundtripAvailabilityRequest(
           com.bookcyprus.webservicesV2.RequestBase baseRequest,
           int roundtripId,
           java.util.Calendar startDate,
           com.bookcyprus.webservicesV2.HotelOccupancy[] roomOccupancies,
           com.bookcyprus.webservicesV2.Itinerary[] customItineraries,
           com.bookcyprus.webservicesV2.Language language) {
           this.baseRequest = baseRequest;
           this.roundtripId = roundtripId;
           this.startDate = startDate;
           this.roomOccupancies = roomOccupancies;
           this.customItineraries = customItineraries;
           this.language = language;
    }


    /**
     * Gets the baseRequest value for this RoundtripAvailabilityRequest.
     * 
     * @return baseRequest
     */
    public com.bookcyprus.webservicesV2.RequestBase getBaseRequest() {
        return baseRequest;
    }


    /**
     * Sets the baseRequest value for this RoundtripAvailabilityRequest.
     * 
     * @param baseRequest
     */
    public void setBaseRequest(com.bookcyprus.webservicesV2.RequestBase baseRequest) {
        this.baseRequest = baseRequest;
    }


    /**
     * Gets the roundtripId value for this RoundtripAvailabilityRequest.
     * 
     * @return roundtripId
     */
    public int getRoundtripId() {
        return roundtripId;
    }


    /**
     * Sets the roundtripId value for this RoundtripAvailabilityRequest.
     * 
     * @param roundtripId
     */
    public void setRoundtripId(int roundtripId) {
        this.roundtripId = roundtripId;
    }


    /**
     * Gets the startDate value for this RoundtripAvailabilityRequest.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this RoundtripAvailabilityRequest.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the roomOccupancies value for this RoundtripAvailabilityRequest.
     * 
     * @return roomOccupancies
     */
    public com.bookcyprus.webservicesV2.HotelOccupancy[] getRoomOccupancies() {
        return roomOccupancies;
    }


    /**
     * Sets the roomOccupancies value for this RoundtripAvailabilityRequest.
     * 
     * @param roomOccupancies
     */
    public void setRoomOccupancies(com.bookcyprus.webservicesV2.HotelOccupancy[] roomOccupancies) {
        this.roomOccupancies = roomOccupancies;
    }


    /**
     * Gets the customItineraries value for this RoundtripAvailabilityRequest.
     * 
     * @return customItineraries
     */
    public com.bookcyprus.webservicesV2.Itinerary[] getCustomItineraries() {
        return customItineraries;
    }


    /**
     * Sets the customItineraries value for this RoundtripAvailabilityRequest.
     * 
     * @param customItineraries
     */
    public void setCustomItineraries(com.bookcyprus.webservicesV2.Itinerary[] customItineraries) {
        this.customItineraries = customItineraries;
    }


    /**
     * Gets the language value for this RoundtripAvailabilityRequest.
     * 
     * @return language
     */
    public com.bookcyprus.webservicesV2.Language getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this RoundtripAvailabilityRequest.
     * 
     * @param language
     */
    public void setLanguage(com.bookcyprus.webservicesV2.Language language) {
        this.language = language;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoundtripAvailabilityRequest)) return false;
        RoundtripAvailabilityRequest other = (RoundtripAvailabilityRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseRequest==null && other.getBaseRequest()==null) || 
             (this.baseRequest!=null &&
              this.baseRequest.equals(other.getBaseRequest()))) &&
            this.roundtripId == other.getRoundtripId() &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.roomOccupancies==null && other.getRoomOccupancies()==null) || 
             (this.roomOccupancies!=null &&
              java.util.Arrays.equals(this.roomOccupancies, other.getRoomOccupancies()))) &&
            ((this.customItineraries==null && other.getCustomItineraries()==null) || 
             (this.customItineraries!=null &&
              java.util.Arrays.equals(this.customItineraries, other.getCustomItineraries()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage())));
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
        if (getBaseRequest() != null) {
            _hashCode += getBaseRequest().hashCode();
        }
        _hashCode += getRoundtripId();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
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
        if (getCustomItineraries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomItineraries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomItineraries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoundtripAvailabilityRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripAvailabilityRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RequestBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundtripId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("customItineraries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CustomItineraries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Itinerary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Itinerary"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Language"));
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
