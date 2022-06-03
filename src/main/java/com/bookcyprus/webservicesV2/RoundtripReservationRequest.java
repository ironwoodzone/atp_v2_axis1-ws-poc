/**
 * RoundtripReservationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class RoundtripReservationRequest  implements java.io.Serializable {
    private int roundtripId;

    private java.util.Calendar startDate;

    private com.bookcyprus.webservicesV2.HotelOccupancy[] roomOccupancies;

    private com.bookcyprus.webservicesV2.Itinerary[] customItineraries;

    private com.bookcyprus.webservicesV2.Language language;

    private com.bookcyprus.webservicesV2.Traveller[] travellers;

    public RoundtripReservationRequest() {
    }

    public RoundtripReservationRequest(
           int roundtripId,
           java.util.Calendar startDate,
           com.bookcyprus.webservicesV2.HotelOccupancy[] roomOccupancies,
           com.bookcyprus.webservicesV2.Itinerary[] customItineraries,
           com.bookcyprus.webservicesV2.Language language,
           com.bookcyprus.webservicesV2.Traveller[] travellers) {
           this.roundtripId = roundtripId;
           this.startDate = startDate;
           this.roomOccupancies = roomOccupancies;
           this.customItineraries = customItineraries;
           this.language = language;
           this.travellers = travellers;
    }


    /**
     * Gets the roundtripId value for this RoundtripReservationRequest.
     * 
     * @return roundtripId
     */
    public int getRoundtripId() {
        return roundtripId;
    }


    /**
     * Sets the roundtripId value for this RoundtripReservationRequest.
     * 
     * @param roundtripId
     */
    public void setRoundtripId(int roundtripId) {
        this.roundtripId = roundtripId;
    }


    /**
     * Gets the startDate value for this RoundtripReservationRequest.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this RoundtripReservationRequest.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the roomOccupancies value for this RoundtripReservationRequest.
     * 
     * @return roomOccupancies
     */
    public com.bookcyprus.webservicesV2.HotelOccupancy[] getRoomOccupancies() {
        return roomOccupancies;
    }


    /**
     * Sets the roomOccupancies value for this RoundtripReservationRequest.
     * 
     * @param roomOccupancies
     */
    public void setRoomOccupancies(com.bookcyprus.webservicesV2.HotelOccupancy[] roomOccupancies) {
        this.roomOccupancies = roomOccupancies;
    }


    /**
     * Gets the customItineraries value for this RoundtripReservationRequest.
     * 
     * @return customItineraries
     */
    public com.bookcyprus.webservicesV2.Itinerary[] getCustomItineraries() {
        return customItineraries;
    }


    /**
     * Sets the customItineraries value for this RoundtripReservationRequest.
     * 
     * @param customItineraries
     */
    public void setCustomItineraries(com.bookcyprus.webservicesV2.Itinerary[] customItineraries) {
        this.customItineraries = customItineraries;
    }


    /**
     * Gets the language value for this RoundtripReservationRequest.
     * 
     * @return language
     */
    public com.bookcyprus.webservicesV2.Language getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this RoundtripReservationRequest.
     * 
     * @param language
     */
    public void setLanguage(com.bookcyprus.webservicesV2.Language language) {
        this.language = language;
    }


    /**
     * Gets the travellers value for this RoundtripReservationRequest.
     * 
     * @return travellers
     */
    public com.bookcyprus.webservicesV2.Traveller[] getTravellers() {
        return travellers;
    }


    /**
     * Sets the travellers value for this RoundtripReservationRequest.
     * 
     * @param travellers
     */
    public void setTravellers(com.bookcyprus.webservicesV2.Traveller[] travellers) {
        this.travellers = travellers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoundtripReservationRequest)) return false;
        RoundtripReservationRequest other = (RoundtripReservationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
              this.language.equals(other.getLanguage()))) &&
            ((this.travellers==null && other.getTravellers()==null) || 
             (this.travellers!=null &&
              java.util.Arrays.equals(this.travellers, other.getTravellers())));
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
        if (getTravellers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTravellers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTravellers(), i);
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
        new org.apache.axis.description.TypeDesc(RoundtripReservationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripReservationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travellers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Travellers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Traveller"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Traveller"));
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
