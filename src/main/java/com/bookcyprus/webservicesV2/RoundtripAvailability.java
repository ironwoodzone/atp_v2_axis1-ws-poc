/**
 * RoundtripAvailability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class RoundtripAvailability  implements java.io.Serializable {
    private java.util.Calendar departureDate;

    private com.bookcyprus.webservicesV2.Language language;

    private java.math.BigDecimal totalPrice;

    private boolean isOnRequest;

    private com.bookcyprus.webservicesV2.Itinerary[] optionals;

    public RoundtripAvailability() {
    }

    public RoundtripAvailability(
           java.util.Calendar departureDate,
           com.bookcyprus.webservicesV2.Language language,
           java.math.BigDecimal totalPrice,
           boolean isOnRequest,
           com.bookcyprus.webservicesV2.Itinerary[] optionals) {
           this.departureDate = departureDate;
           this.language = language;
           this.totalPrice = totalPrice;
           this.isOnRequest = isOnRequest;
           this.optionals = optionals;
    }


    /**
     * Gets the departureDate value for this RoundtripAvailability.
     * 
     * @return departureDate
     */
    public java.util.Calendar getDepartureDate() {
        return departureDate;
    }


    /**
     * Sets the departureDate value for this RoundtripAvailability.
     * 
     * @param departureDate
     */
    public void setDepartureDate(java.util.Calendar departureDate) {
        this.departureDate = departureDate;
    }


    /**
     * Gets the language value for this RoundtripAvailability.
     * 
     * @return language
     */
    public com.bookcyprus.webservicesV2.Language getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this RoundtripAvailability.
     * 
     * @param language
     */
    public void setLanguage(com.bookcyprus.webservicesV2.Language language) {
        this.language = language;
    }


    /**
     * Gets the totalPrice value for this RoundtripAvailability.
     * 
     * @return totalPrice
     */
    public java.math.BigDecimal getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this RoundtripAvailability.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(java.math.BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * Gets the isOnRequest value for this RoundtripAvailability.
     * 
     * @return isOnRequest
     */
    public boolean isIsOnRequest() {
        return isOnRequest;
    }


    /**
     * Sets the isOnRequest value for this RoundtripAvailability.
     * 
     * @param isOnRequest
     */
    public void setIsOnRequest(boolean isOnRequest) {
        this.isOnRequest = isOnRequest;
    }


    /**
     * Gets the optionals value for this RoundtripAvailability.
     * 
     * @return optionals
     */
    public com.bookcyprus.webservicesV2.Itinerary[] getOptionals() {
        return optionals;
    }


    /**
     * Sets the optionals value for this RoundtripAvailability.
     * 
     * @param optionals
     */
    public void setOptionals(com.bookcyprus.webservicesV2.Itinerary[] optionals) {
        this.optionals = optionals;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoundtripAvailability)) return false;
        RoundtripAvailability other = (RoundtripAvailability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.departureDate==null && other.getDepartureDate()==null) || 
             (this.departureDate!=null &&
              this.departureDate.equals(other.getDepartureDate()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.totalPrice==null && other.getTotalPrice()==null) || 
             (this.totalPrice!=null &&
              this.totalPrice.equals(other.getTotalPrice()))) &&
            this.isOnRequest == other.isIsOnRequest() &&
            ((this.optionals==null && other.getOptionals()==null) || 
             (this.optionals!=null &&
              java.util.Arrays.equals(this.optionals, other.getOptionals())));
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
        if (getDepartureDate() != null) {
            _hashCode += getDepartureDate().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getTotalPrice() != null) {
            _hashCode += getTotalPrice().hashCode();
        }
        _hashCode += (isIsOnRequest() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOptionals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptionals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptionals(), i);
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
        new org.apache.axis.description.TypeDesc(RoundtripAvailability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripAvailability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "DepartureDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Language"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TotalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOnRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "IsOnRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Optionals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Itinerary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Itinerary"));
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
