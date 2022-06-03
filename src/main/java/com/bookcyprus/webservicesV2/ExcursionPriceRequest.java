/**
 * ExcursionPriceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ExcursionPriceRequest  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.RequestBase baseRequest;

    private int excursionId;

    private int locationId;

    private int adults;

    private int children;

    private int infants;

    private int seniors;

    private int youths;

    private java.util.Calendar travelDate;

    private java.util.Calendar startTime;

    private int vehicles;

    private java.lang.String excursionGradeCode;

    private java.lang.String excursionGradeLanguageCode;

    public ExcursionPriceRequest() {
    }

    public ExcursionPriceRequest(
           com.bookcyprus.webservicesV2.RequestBase baseRequest,
           int excursionId,
           int locationId,
           int adults,
           int children,
           int infants,
           int seniors,
           int youths,
           java.util.Calendar travelDate,
           java.util.Calendar startTime,
           int vehicles,
           java.lang.String excursionGradeCode,
           java.lang.String excursionGradeLanguageCode) {
           this.baseRequest = baseRequest;
           this.excursionId = excursionId;
           this.locationId = locationId;
           this.adults = adults;
           this.children = children;
           this.infants = infants;
           this.seniors = seniors;
           this.youths = youths;
           this.travelDate = travelDate;
           this.startTime = startTime;
           this.vehicles = vehicles;
           this.excursionGradeCode = excursionGradeCode;
           this.excursionGradeLanguageCode = excursionGradeLanguageCode;
    }


    /**
     * Gets the baseRequest value for this ExcursionPriceRequest.
     * 
     * @return baseRequest
     */
    public com.bookcyprus.webservicesV2.RequestBase getBaseRequest() {
        return baseRequest;
    }


    /**
     * Sets the baseRequest value for this ExcursionPriceRequest.
     * 
     * @param baseRequest
     */
    public void setBaseRequest(com.bookcyprus.webservicesV2.RequestBase baseRequest) {
        this.baseRequest = baseRequest;
    }


    /**
     * Gets the excursionId value for this ExcursionPriceRequest.
     * 
     * @return excursionId
     */
    public int getExcursionId() {
        return excursionId;
    }


    /**
     * Sets the excursionId value for this ExcursionPriceRequest.
     * 
     * @param excursionId
     */
    public void setExcursionId(int excursionId) {
        this.excursionId = excursionId;
    }


    /**
     * Gets the locationId value for this ExcursionPriceRequest.
     * 
     * @return locationId
     */
    public int getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this ExcursionPriceRequest.
     * 
     * @param locationId
     */
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the adults value for this ExcursionPriceRequest.
     * 
     * @return adults
     */
    public int getAdults() {
        return adults;
    }


    /**
     * Sets the adults value for this ExcursionPriceRequest.
     * 
     * @param adults
     */
    public void setAdults(int adults) {
        this.adults = adults;
    }


    /**
     * Gets the children value for this ExcursionPriceRequest.
     * 
     * @return children
     */
    public int getChildren() {
        return children;
    }


    /**
     * Sets the children value for this ExcursionPriceRequest.
     * 
     * @param children
     */
    public void setChildren(int children) {
        this.children = children;
    }


    /**
     * Gets the infants value for this ExcursionPriceRequest.
     * 
     * @return infants
     */
    public int getInfants() {
        return infants;
    }


    /**
     * Sets the infants value for this ExcursionPriceRequest.
     * 
     * @param infants
     */
    public void setInfants(int infants) {
        this.infants = infants;
    }


    /**
     * Gets the seniors value for this ExcursionPriceRequest.
     * 
     * @return seniors
     */
    public int getSeniors() {
        return seniors;
    }


    /**
     * Sets the seniors value for this ExcursionPriceRequest.
     * 
     * @param seniors
     */
    public void setSeniors(int seniors) {
        this.seniors = seniors;
    }


    /**
     * Gets the youths value for this ExcursionPriceRequest.
     * 
     * @return youths
     */
    public int getYouths() {
        return youths;
    }


    /**
     * Sets the youths value for this ExcursionPriceRequest.
     * 
     * @param youths
     */
    public void setYouths(int youths) {
        this.youths = youths;
    }


    /**
     * Gets the travelDate value for this ExcursionPriceRequest.
     * 
     * @return travelDate
     */
    public java.util.Calendar getTravelDate() {
        return travelDate;
    }


    /**
     * Sets the travelDate value for this ExcursionPriceRequest.
     * 
     * @param travelDate
     */
    public void setTravelDate(java.util.Calendar travelDate) {
        this.travelDate = travelDate;
    }


    /**
     * Gets the startTime value for this ExcursionPriceRequest.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this ExcursionPriceRequest.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the vehicles value for this ExcursionPriceRequest.
     * 
     * @return vehicles
     */
    public int getVehicles() {
        return vehicles;
    }


    /**
     * Sets the vehicles value for this ExcursionPriceRequest.
     * 
     * @param vehicles
     */
    public void setVehicles(int vehicles) {
        this.vehicles = vehicles;
    }


    /**
     * Gets the excursionGradeCode value for this ExcursionPriceRequest.
     * 
     * @return excursionGradeCode
     */
    public java.lang.String getExcursionGradeCode() {
        return excursionGradeCode;
    }


    /**
     * Sets the excursionGradeCode value for this ExcursionPriceRequest.
     * 
     * @param excursionGradeCode
     */
    public void setExcursionGradeCode(java.lang.String excursionGradeCode) {
        this.excursionGradeCode = excursionGradeCode;
    }


    /**
     * Gets the excursionGradeLanguageCode value for this ExcursionPriceRequest.
     * 
     * @return excursionGradeLanguageCode
     */
    public java.lang.String getExcursionGradeLanguageCode() {
        return excursionGradeLanguageCode;
    }


    /**
     * Sets the excursionGradeLanguageCode value for this ExcursionPriceRequest.
     * 
     * @param excursionGradeLanguageCode
     */
    public void setExcursionGradeLanguageCode(java.lang.String excursionGradeLanguageCode) {
        this.excursionGradeLanguageCode = excursionGradeLanguageCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExcursionPriceRequest)) return false;
        ExcursionPriceRequest other = (ExcursionPriceRequest) obj;
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
            this.excursionId == other.getExcursionId() &&
            this.locationId == other.getLocationId() &&
            this.adults == other.getAdults() &&
            this.children == other.getChildren() &&
            this.infants == other.getInfants() &&
            this.seniors == other.getSeniors() &&
            this.youths == other.getYouths() &&
            ((this.travelDate==null && other.getTravelDate()==null) || 
             (this.travelDate!=null &&
              this.travelDate.equals(other.getTravelDate()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            this.vehicles == other.getVehicles() &&
            ((this.excursionGradeCode==null && other.getExcursionGradeCode()==null) || 
             (this.excursionGradeCode!=null &&
              this.excursionGradeCode.equals(other.getExcursionGradeCode()))) &&
            ((this.excursionGradeLanguageCode==null && other.getExcursionGradeLanguageCode()==null) || 
             (this.excursionGradeLanguageCode!=null &&
              this.excursionGradeLanguageCode.equals(other.getExcursionGradeLanguageCode())));
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
        _hashCode += getExcursionId();
        _hashCode += getLocationId();
        _hashCode += getAdults();
        _hashCode += getChildren();
        _hashCode += getInfants();
        _hashCode += getSeniors();
        _hashCode += getYouths();
        if (getTravelDate() != null) {
            _hashCode += getTravelDate().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        _hashCode += getVehicles();
        if (getExcursionGradeCode() != null) {
            _hashCode += getExcursionGradeCode().hashCode();
        }
        if (getExcursionGradeLanguageCode() != null) {
            _hashCode += getExcursionGradeLanguageCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExcursionPriceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionPriceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RequestBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "LocationId"));
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
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infants");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Infants"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seniors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Seniors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("youths");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Youths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TravelDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Vehicles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionGradeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionGradeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionGradeLanguageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionGradeLanguageCode"));
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
