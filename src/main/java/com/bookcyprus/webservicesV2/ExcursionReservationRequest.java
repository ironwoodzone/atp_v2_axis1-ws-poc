/**
 * ExcursionReservationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ExcursionReservationRequest  implements java.io.Serializable {
    private int pickupLocationId;

    private int excursionId;

    private int adults;

    private int children;

    private int infants;

    private int seniors;

    private int youths;

    private int numberOfVehicles;

    private java.util.Calendar travelDate;

    private java.util.Calendar startTime;

    private java.lang.String excursionGradeCode;

    private java.lang.String excursionGradeLanguageCode;

    private com.bookcyprus.webservicesV2.ExcursionPassenger[] passengers;

    private com.bookcyprus.webservicesV2.ExcursionQuestionAnswer[] questionAnswers;

    public ExcursionReservationRequest() {
    }

    public ExcursionReservationRequest(
           int pickupLocationId,
           int excursionId,
           int adults,
           int children,
           int infants,
           int seniors,
           int youths,
           int numberOfVehicles,
           java.util.Calendar travelDate,
           java.util.Calendar startTime,
           java.lang.String excursionGradeCode,
           java.lang.String excursionGradeLanguageCode,
           com.bookcyprus.webservicesV2.ExcursionPassenger[] passengers,
           com.bookcyprus.webservicesV2.ExcursionQuestionAnswer[] questionAnswers) {
           this.pickupLocationId = pickupLocationId;
           this.excursionId = excursionId;
           this.adults = adults;
           this.children = children;
           this.infants = infants;
           this.seniors = seniors;
           this.youths = youths;
           this.numberOfVehicles = numberOfVehicles;
           this.travelDate = travelDate;
           this.startTime = startTime;
           this.excursionGradeCode = excursionGradeCode;
           this.excursionGradeLanguageCode = excursionGradeLanguageCode;
           this.passengers = passengers;
           this.questionAnswers = questionAnswers;
    }


    /**
     * Gets the pickupLocationId value for this ExcursionReservationRequest.
     * 
     * @return pickupLocationId
     */
    public int getPickupLocationId() {
        return pickupLocationId;
    }


    /**
     * Sets the pickupLocationId value for this ExcursionReservationRequest.
     * 
     * @param pickupLocationId
     */
    public void setPickupLocationId(int pickupLocationId) {
        this.pickupLocationId = pickupLocationId;
    }


    /**
     * Gets the excursionId value for this ExcursionReservationRequest.
     * 
     * @return excursionId
     */
    public int getExcursionId() {
        return excursionId;
    }


    /**
     * Sets the excursionId value for this ExcursionReservationRequest.
     * 
     * @param excursionId
     */
    public void setExcursionId(int excursionId) {
        this.excursionId = excursionId;
    }


    /**
     * Gets the adults value for this ExcursionReservationRequest.
     * 
     * @return adults
     */
    public int getAdults() {
        return adults;
    }


    /**
     * Sets the adults value for this ExcursionReservationRequest.
     * 
     * @param adults
     */
    public void setAdults(int adults) {
        this.adults = adults;
    }


    /**
     * Gets the children value for this ExcursionReservationRequest.
     * 
     * @return children
     */
    public int getChildren() {
        return children;
    }


    /**
     * Sets the children value for this ExcursionReservationRequest.
     * 
     * @param children
     */
    public void setChildren(int children) {
        this.children = children;
    }


    /**
     * Gets the infants value for this ExcursionReservationRequest.
     * 
     * @return infants
     */
    public int getInfants() {
        return infants;
    }


    /**
     * Sets the infants value for this ExcursionReservationRequest.
     * 
     * @param infants
     */
    public void setInfants(int infants) {
        this.infants = infants;
    }


    /**
     * Gets the seniors value for this ExcursionReservationRequest.
     * 
     * @return seniors
     */
    public int getSeniors() {
        return seniors;
    }


    /**
     * Sets the seniors value for this ExcursionReservationRequest.
     * 
     * @param seniors
     */
    public void setSeniors(int seniors) {
        this.seniors = seniors;
    }


    /**
     * Gets the youths value for this ExcursionReservationRequest.
     * 
     * @return youths
     */
    public int getYouths() {
        return youths;
    }


    /**
     * Sets the youths value for this ExcursionReservationRequest.
     * 
     * @param youths
     */
    public void setYouths(int youths) {
        this.youths = youths;
    }


    /**
     * Gets the numberOfVehicles value for this ExcursionReservationRequest.
     * 
     * @return numberOfVehicles
     */
    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }


    /**
     * Sets the numberOfVehicles value for this ExcursionReservationRequest.
     * 
     * @param numberOfVehicles
     */
    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }


    /**
     * Gets the travelDate value for this ExcursionReservationRequest.
     * 
     * @return travelDate
     */
    public java.util.Calendar getTravelDate() {
        return travelDate;
    }


    /**
     * Sets the travelDate value for this ExcursionReservationRequest.
     * 
     * @param travelDate
     */
    public void setTravelDate(java.util.Calendar travelDate) {
        this.travelDate = travelDate;
    }


    /**
     * Gets the startTime value for this ExcursionReservationRequest.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this ExcursionReservationRequest.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the excursionGradeCode value for this ExcursionReservationRequest.
     * 
     * @return excursionGradeCode
     */
    public java.lang.String getExcursionGradeCode() {
        return excursionGradeCode;
    }


    /**
     * Sets the excursionGradeCode value for this ExcursionReservationRequest.
     * 
     * @param excursionGradeCode
     */
    public void setExcursionGradeCode(java.lang.String excursionGradeCode) {
        this.excursionGradeCode = excursionGradeCode;
    }


    /**
     * Gets the excursionGradeLanguageCode value for this ExcursionReservationRequest.
     * 
     * @return excursionGradeLanguageCode
     */
    public java.lang.String getExcursionGradeLanguageCode() {
        return excursionGradeLanguageCode;
    }


    /**
     * Sets the excursionGradeLanguageCode value for this ExcursionReservationRequest.
     * 
     * @param excursionGradeLanguageCode
     */
    public void setExcursionGradeLanguageCode(java.lang.String excursionGradeLanguageCode) {
        this.excursionGradeLanguageCode = excursionGradeLanguageCode;
    }


    /**
     * Gets the passengers value for this ExcursionReservationRequest.
     * 
     * @return passengers
     */
    public com.bookcyprus.webservicesV2.ExcursionPassenger[] getPassengers() {
        return passengers;
    }


    /**
     * Sets the passengers value for this ExcursionReservationRequest.
     * 
     * @param passengers
     */
    public void setPassengers(com.bookcyprus.webservicesV2.ExcursionPassenger[] passengers) {
        this.passengers = passengers;
    }


    /**
     * Gets the questionAnswers value for this ExcursionReservationRequest.
     * 
     * @return questionAnswers
     */
    public com.bookcyprus.webservicesV2.ExcursionQuestionAnswer[] getQuestionAnswers() {
        return questionAnswers;
    }


    /**
     * Sets the questionAnswers value for this ExcursionReservationRequest.
     * 
     * @param questionAnswers
     */
    public void setQuestionAnswers(com.bookcyprus.webservicesV2.ExcursionQuestionAnswer[] questionAnswers) {
        this.questionAnswers = questionAnswers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExcursionReservationRequest)) return false;
        ExcursionReservationRequest other = (ExcursionReservationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.pickupLocationId == other.getPickupLocationId() &&
            this.excursionId == other.getExcursionId() &&
            this.adults == other.getAdults() &&
            this.children == other.getChildren() &&
            this.infants == other.getInfants() &&
            this.seniors == other.getSeniors() &&
            this.youths == other.getYouths() &&
            this.numberOfVehicles == other.getNumberOfVehicles() &&
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
            ((this.passengers==null && other.getPassengers()==null) || 
             (this.passengers!=null &&
              java.util.Arrays.equals(this.passengers, other.getPassengers()))) &&
            ((this.questionAnswers==null && other.getQuestionAnswers()==null) || 
             (this.questionAnswers!=null &&
              java.util.Arrays.equals(this.questionAnswers, other.getQuestionAnswers())));
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
        _hashCode += getPickupLocationId();
        _hashCode += getExcursionId();
        _hashCode += getAdults();
        _hashCode += getChildren();
        _hashCode += getInfants();
        _hashCode += getSeniors();
        _hashCode += getYouths();
        _hashCode += getNumberOfVehicles();
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
        if (getPassengers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPassengers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPassengers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuestionAnswers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuestionAnswers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuestionAnswers(), i);
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
        new org.apache.axis.description.TypeDesc(ExcursionReservationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionReservationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PickupLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionId"));
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
        elemField.setFieldName("numberOfVehicles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "NumberOfVehicles"));
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
        elemField.setFieldName("passengers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Passengers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionPassenger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionPassenger"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionAnswers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "QuestionAnswers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionQuestionAnswer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionQuestionAnswer"));
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
