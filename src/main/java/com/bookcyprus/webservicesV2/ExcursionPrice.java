/**
 * ExcursionPrice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ExcursionPrice  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private int excursionId;

    private int locationId;

    private boolean onRequest;

    private int adults;

    private int children;

    private int infants;

    private int seniors;

    private int youths;

    private int vehicles;

    private java.util.Calendar travelDate;

    private java.util.Calendar startTime;

    private java.lang.String excursionGradeCode;

    private java.lang.String excursionGradeLanguageCode;

    private com.bookcyprus.webservicesV2.ExcursionQuestion[] excursionQuestions;

    public ExcursionPrice() {
    }

    public ExcursionPrice(
           java.math.BigDecimal amount,
           int excursionId,
           int locationId,
           boolean onRequest,
           int adults,
           int children,
           int infants,
           int seniors,
           int youths,
           int vehicles,
           java.util.Calendar travelDate,
           java.util.Calendar startTime,
           java.lang.String excursionGradeCode,
           java.lang.String excursionGradeLanguageCode,
           com.bookcyprus.webservicesV2.ExcursionQuestion[] excursionQuestions) {
           this.amount = amount;
           this.excursionId = excursionId;
           this.locationId = locationId;
           this.onRequest = onRequest;
           this.adults = adults;
           this.children = children;
           this.infants = infants;
           this.seniors = seniors;
           this.youths = youths;
           this.vehicles = vehicles;
           this.travelDate = travelDate;
           this.startTime = startTime;
           this.excursionGradeCode = excursionGradeCode;
           this.excursionGradeLanguageCode = excursionGradeLanguageCode;
           this.excursionQuestions = excursionQuestions;
    }


    /**
     * Gets the amount value for this ExcursionPrice.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ExcursionPrice.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the excursionId value for this ExcursionPrice.
     * 
     * @return excursionId
     */
    public int getExcursionId() {
        return excursionId;
    }


    /**
     * Sets the excursionId value for this ExcursionPrice.
     * 
     * @param excursionId
     */
    public void setExcursionId(int excursionId) {
        this.excursionId = excursionId;
    }


    /**
     * Gets the locationId value for this ExcursionPrice.
     * 
     * @return locationId
     */
    public int getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this ExcursionPrice.
     * 
     * @param locationId
     */
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the onRequest value for this ExcursionPrice.
     * 
     * @return onRequest
     */
    public boolean isOnRequest() {
        return onRequest;
    }


    /**
     * Sets the onRequest value for this ExcursionPrice.
     * 
     * @param onRequest
     */
    public void setOnRequest(boolean onRequest) {
        this.onRequest = onRequest;
    }


    /**
     * Gets the adults value for this ExcursionPrice.
     * 
     * @return adults
     */
    public int getAdults() {
        return adults;
    }


    /**
     * Sets the adults value for this ExcursionPrice.
     * 
     * @param adults
     */
    public void setAdults(int adults) {
        this.adults = adults;
    }


    /**
     * Gets the children value for this ExcursionPrice.
     * 
     * @return children
     */
    public int getChildren() {
        return children;
    }


    /**
     * Sets the children value for this ExcursionPrice.
     * 
     * @param children
     */
    public void setChildren(int children) {
        this.children = children;
    }


    /**
     * Gets the infants value for this ExcursionPrice.
     * 
     * @return infants
     */
    public int getInfants() {
        return infants;
    }


    /**
     * Sets the infants value for this ExcursionPrice.
     * 
     * @param infants
     */
    public void setInfants(int infants) {
        this.infants = infants;
    }


    /**
     * Gets the seniors value for this ExcursionPrice.
     * 
     * @return seniors
     */
    public int getSeniors() {
        return seniors;
    }


    /**
     * Sets the seniors value for this ExcursionPrice.
     * 
     * @param seniors
     */
    public void setSeniors(int seniors) {
        this.seniors = seniors;
    }


    /**
     * Gets the youths value for this ExcursionPrice.
     * 
     * @return youths
     */
    public int getYouths() {
        return youths;
    }


    /**
     * Sets the youths value for this ExcursionPrice.
     * 
     * @param youths
     */
    public void setYouths(int youths) {
        this.youths = youths;
    }


    /**
     * Gets the vehicles value for this ExcursionPrice.
     * 
     * @return vehicles
     */
    public int getVehicles() {
        return vehicles;
    }


    /**
     * Sets the vehicles value for this ExcursionPrice.
     * 
     * @param vehicles
     */
    public void setVehicles(int vehicles) {
        this.vehicles = vehicles;
    }


    /**
     * Gets the travelDate value for this ExcursionPrice.
     * 
     * @return travelDate
     */
    public java.util.Calendar getTravelDate() {
        return travelDate;
    }


    /**
     * Sets the travelDate value for this ExcursionPrice.
     * 
     * @param travelDate
     */
    public void setTravelDate(java.util.Calendar travelDate) {
        this.travelDate = travelDate;
    }


    /**
     * Gets the startTime value for this ExcursionPrice.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this ExcursionPrice.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the excursionGradeCode value for this ExcursionPrice.
     * 
     * @return excursionGradeCode
     */
    public java.lang.String getExcursionGradeCode() {
        return excursionGradeCode;
    }


    /**
     * Sets the excursionGradeCode value for this ExcursionPrice.
     * 
     * @param excursionGradeCode
     */
    public void setExcursionGradeCode(java.lang.String excursionGradeCode) {
        this.excursionGradeCode = excursionGradeCode;
    }


    /**
     * Gets the excursionGradeLanguageCode value for this ExcursionPrice.
     * 
     * @return excursionGradeLanguageCode
     */
    public java.lang.String getExcursionGradeLanguageCode() {
        return excursionGradeLanguageCode;
    }


    /**
     * Sets the excursionGradeLanguageCode value for this ExcursionPrice.
     * 
     * @param excursionGradeLanguageCode
     */
    public void setExcursionGradeLanguageCode(java.lang.String excursionGradeLanguageCode) {
        this.excursionGradeLanguageCode = excursionGradeLanguageCode;
    }


    /**
     * Gets the excursionQuestions value for this ExcursionPrice.
     * 
     * @return excursionQuestions
     */
    public com.bookcyprus.webservicesV2.ExcursionQuestion[] getExcursionQuestions() {
        return excursionQuestions;
    }


    /**
     * Sets the excursionQuestions value for this ExcursionPrice.
     * 
     * @param excursionQuestions
     */
    public void setExcursionQuestions(com.bookcyprus.webservicesV2.ExcursionQuestion[] excursionQuestions) {
        this.excursionQuestions = excursionQuestions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExcursionPrice)) return false;
        ExcursionPrice other = (ExcursionPrice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            this.excursionId == other.getExcursionId() &&
            this.locationId == other.getLocationId() &&
            this.onRequest == other.isOnRequest() &&
            this.adults == other.getAdults() &&
            this.children == other.getChildren() &&
            this.infants == other.getInfants() &&
            this.seniors == other.getSeniors() &&
            this.youths == other.getYouths() &&
            this.vehicles == other.getVehicles() &&
            ((this.travelDate==null && other.getTravelDate()==null) || 
             (this.travelDate!=null &&
              this.travelDate.equals(other.getTravelDate()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.excursionGradeCode==null && other.getExcursionGradeCode()==null) || 
             (this.excursionGradeCode!=null &&
              this.excursionGradeCode.equals(other.getExcursionGradeCode()))) &&
            ((this.excursionGradeLanguageCode==null && other.getExcursionGradeLanguageCode()==null) || 
             (this.excursionGradeLanguageCode!=null &&
              this.excursionGradeLanguageCode.equals(other.getExcursionGradeLanguageCode()))) &&
            ((this.excursionQuestions==null && other.getExcursionQuestions()==null) || 
             (this.excursionQuestions!=null &&
              java.util.Arrays.equals(this.excursionQuestions, other.getExcursionQuestions())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        _hashCode += getExcursionId();
        _hashCode += getLocationId();
        _hashCode += (isOnRequest() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getAdults();
        _hashCode += getChildren();
        _hashCode += getInfants();
        _hashCode += getSeniors();
        _hashCode += getYouths();
        _hashCode += getVehicles();
        if (getTravelDate() != null) {
            _hashCode += getTravelDate().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getExcursionGradeCode() != null) {
            _hashCode += getExcursionGradeCode().hashCode();
        }
        if (getExcursionGradeLanguageCode() != null) {
            _hashCode += getExcursionGradeLanguageCode().hashCode();
        }
        if (getExcursionQuestions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcursionQuestions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcursionQuestions(), i);
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
        new org.apache.axis.description.TypeDesc(ExcursionPrice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionPrice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("onRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "OnRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("vehicles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Vehicles"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionQuestions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionQuestions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionQuestion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionQuestion"));
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
