/**
 * ExcursionReservationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ExcursionReservationResponse  implements java.io.Serializable {
    private int reservationDetailId;

    private int locationId;

    private int excursionId;

    private java.lang.String excursionName;

    private java.lang.String status;

    private int adults;

    private int children;

    private int infants;

    private int seniors;

    private int youths;

    private int numberOfVehicles;

    private java.util.Calendar startTime;

    private java.util.Calendar travelDate;

    private java.math.BigDecimal price;

    private com.bookcyprus.webservicesV2.BookingConditionItemDetail[] cancellationPolicy;

    private java.lang.String excursionGradeCode;

    private java.lang.String excursionGradeLanguageCode;

    public ExcursionReservationResponse() {
    }

    public ExcursionReservationResponse(
           int reservationDetailId,
           int locationId,
           int excursionId,
           java.lang.String excursionName,
           java.lang.String status,
           int adults,
           int children,
           int infants,
           int seniors,
           int youths,
           int numberOfVehicles,
           java.util.Calendar startTime,
           java.util.Calendar travelDate,
           java.math.BigDecimal price,
           com.bookcyprus.webservicesV2.BookingConditionItemDetail[] cancellationPolicy,
           java.lang.String excursionGradeCode,
           java.lang.String excursionGradeLanguageCode) {
           this.reservationDetailId = reservationDetailId;
           this.locationId = locationId;
           this.excursionId = excursionId;
           this.excursionName = excursionName;
           this.status = status;
           this.adults = adults;
           this.children = children;
           this.infants = infants;
           this.seniors = seniors;
           this.youths = youths;
           this.numberOfVehicles = numberOfVehicles;
           this.startTime = startTime;
           this.travelDate = travelDate;
           this.price = price;
           this.cancellationPolicy = cancellationPolicy;
           this.excursionGradeCode = excursionGradeCode;
           this.excursionGradeLanguageCode = excursionGradeLanguageCode;
    }


    /**
     * Gets the reservationDetailId value for this ExcursionReservationResponse.
     * 
     * @return reservationDetailId
     */
    public int getReservationDetailId() {
        return reservationDetailId;
    }


    /**
     * Sets the reservationDetailId value for this ExcursionReservationResponse.
     * 
     * @param reservationDetailId
     */
    public void setReservationDetailId(int reservationDetailId) {
        this.reservationDetailId = reservationDetailId;
    }


    /**
     * Gets the locationId value for this ExcursionReservationResponse.
     * 
     * @return locationId
     */
    public int getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this ExcursionReservationResponse.
     * 
     * @param locationId
     */
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the excursionId value for this ExcursionReservationResponse.
     * 
     * @return excursionId
     */
    public int getExcursionId() {
        return excursionId;
    }


    /**
     * Sets the excursionId value for this ExcursionReservationResponse.
     * 
     * @param excursionId
     */
    public void setExcursionId(int excursionId) {
        this.excursionId = excursionId;
    }


    /**
     * Gets the excursionName value for this ExcursionReservationResponse.
     * 
     * @return excursionName
     */
    public java.lang.String getExcursionName() {
        return excursionName;
    }


    /**
     * Sets the excursionName value for this ExcursionReservationResponse.
     * 
     * @param excursionName
     */
    public void setExcursionName(java.lang.String excursionName) {
        this.excursionName = excursionName;
    }


    /**
     * Gets the status value for this ExcursionReservationResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ExcursionReservationResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the adults value for this ExcursionReservationResponse.
     * 
     * @return adults
     */
    public int getAdults() {
        return adults;
    }


    /**
     * Sets the adults value for this ExcursionReservationResponse.
     * 
     * @param adults
     */
    public void setAdults(int adults) {
        this.adults = adults;
    }


    /**
     * Gets the children value for this ExcursionReservationResponse.
     * 
     * @return children
     */
    public int getChildren() {
        return children;
    }


    /**
     * Sets the children value for this ExcursionReservationResponse.
     * 
     * @param children
     */
    public void setChildren(int children) {
        this.children = children;
    }


    /**
     * Gets the infants value for this ExcursionReservationResponse.
     * 
     * @return infants
     */
    public int getInfants() {
        return infants;
    }


    /**
     * Sets the infants value for this ExcursionReservationResponse.
     * 
     * @param infants
     */
    public void setInfants(int infants) {
        this.infants = infants;
    }


    /**
     * Gets the seniors value for this ExcursionReservationResponse.
     * 
     * @return seniors
     */
    public int getSeniors() {
        return seniors;
    }


    /**
     * Sets the seniors value for this ExcursionReservationResponse.
     * 
     * @param seniors
     */
    public void setSeniors(int seniors) {
        this.seniors = seniors;
    }


    /**
     * Gets the youths value for this ExcursionReservationResponse.
     * 
     * @return youths
     */
    public int getYouths() {
        return youths;
    }


    /**
     * Sets the youths value for this ExcursionReservationResponse.
     * 
     * @param youths
     */
    public void setYouths(int youths) {
        this.youths = youths;
    }


    /**
     * Gets the numberOfVehicles value for this ExcursionReservationResponse.
     * 
     * @return numberOfVehicles
     */
    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }


    /**
     * Sets the numberOfVehicles value for this ExcursionReservationResponse.
     * 
     * @param numberOfVehicles
     */
    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }


    /**
     * Gets the startTime value for this ExcursionReservationResponse.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this ExcursionReservationResponse.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the travelDate value for this ExcursionReservationResponse.
     * 
     * @return travelDate
     */
    public java.util.Calendar getTravelDate() {
        return travelDate;
    }


    /**
     * Sets the travelDate value for this ExcursionReservationResponse.
     * 
     * @param travelDate
     */
    public void setTravelDate(java.util.Calendar travelDate) {
        this.travelDate = travelDate;
    }


    /**
     * Gets the price value for this ExcursionReservationResponse.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ExcursionReservationResponse.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }


    /**
     * Gets the cancellationPolicy value for this ExcursionReservationResponse.
     * 
     * @return cancellationPolicy
     */
    public com.bookcyprus.webservicesV2.BookingConditionItemDetail[] getCancellationPolicy() {
        return cancellationPolicy;
    }


    /**
     * Sets the cancellationPolicy value for this ExcursionReservationResponse.
     * 
     * @param cancellationPolicy
     */
    public void setCancellationPolicy(com.bookcyprus.webservicesV2.BookingConditionItemDetail[] cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }


    /**
     * Gets the excursionGradeCode value for this ExcursionReservationResponse.
     * 
     * @return excursionGradeCode
     */
    public java.lang.String getExcursionGradeCode() {
        return excursionGradeCode;
    }


    /**
     * Sets the excursionGradeCode value for this ExcursionReservationResponse.
     * 
     * @param excursionGradeCode
     */
    public void setExcursionGradeCode(java.lang.String excursionGradeCode) {
        this.excursionGradeCode = excursionGradeCode;
    }


    /**
     * Gets the excursionGradeLanguageCode value for this ExcursionReservationResponse.
     * 
     * @return excursionGradeLanguageCode
     */
    public java.lang.String getExcursionGradeLanguageCode() {
        return excursionGradeLanguageCode;
    }


    /**
     * Sets the excursionGradeLanguageCode value for this ExcursionReservationResponse.
     * 
     * @param excursionGradeLanguageCode
     */
    public void setExcursionGradeLanguageCode(java.lang.String excursionGradeLanguageCode) {
        this.excursionGradeLanguageCode = excursionGradeLanguageCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExcursionReservationResponse)) return false;
        ExcursionReservationResponse other = (ExcursionReservationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.reservationDetailId == other.getReservationDetailId() &&
            this.locationId == other.getLocationId() &&
            this.excursionId == other.getExcursionId() &&
            ((this.excursionName==null && other.getExcursionName()==null) || 
             (this.excursionName!=null &&
              this.excursionName.equals(other.getExcursionName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.adults == other.getAdults() &&
            this.children == other.getChildren() &&
            this.infants == other.getInfants() &&
            this.seniors == other.getSeniors() &&
            this.youths == other.getYouths() &&
            this.numberOfVehicles == other.getNumberOfVehicles() &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.travelDate==null && other.getTravelDate()==null) || 
             (this.travelDate!=null &&
              this.travelDate.equals(other.getTravelDate()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.cancellationPolicy==null && other.getCancellationPolicy()==null) || 
             (this.cancellationPolicy!=null &&
              java.util.Arrays.equals(this.cancellationPolicy, other.getCancellationPolicy()))) &&
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
        _hashCode += getReservationDetailId();
        _hashCode += getLocationId();
        _hashCode += getExcursionId();
        if (getExcursionName() != null) {
            _hashCode += getExcursionName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += getAdults();
        _hashCode += getChildren();
        _hashCode += getInfants();
        _hashCode += getSeniors();
        _hashCode += getYouths();
        _hashCode += getNumberOfVehicles();
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getTravelDate() != null) {
            _hashCode += getTravelDate().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getCancellationPolicy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCancellationPolicy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCancellationPolicy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        new org.apache.axis.description.TypeDesc(ExcursionReservationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionReservationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationDetailId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationDetailId"));
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
        elemField.setFieldName("excursionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TravelDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancellationPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CancellationPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingConditionItemDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingConditionItemDetail"));
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
