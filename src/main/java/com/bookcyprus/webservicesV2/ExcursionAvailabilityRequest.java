/**
 * ExcursionAvailabilityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ExcursionAvailabilityRequest  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.RequestBase baseRequest;

    private int locationId;

    private int[] multiLocationIds;

    private int[] multiExcursionIds;

    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    private int excursionId;

    public ExcursionAvailabilityRequest() {
    }

    public ExcursionAvailabilityRequest(
           com.bookcyprus.webservicesV2.RequestBase baseRequest,
           int locationId,
           int[] multiLocationIds,
           int[] multiExcursionIds,
           java.util.Calendar fromDate,
           java.util.Calendar toDate,
           int excursionId) {
           this.baseRequest = baseRequest;
           this.locationId = locationId;
           this.multiLocationIds = multiLocationIds;
           this.multiExcursionIds = multiExcursionIds;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.excursionId = excursionId;
    }


    /**
     * Gets the baseRequest value for this ExcursionAvailabilityRequest.
     * 
     * @return baseRequest
     */
    public com.bookcyprus.webservicesV2.RequestBase getBaseRequest() {
        return baseRequest;
    }


    /**
     * Sets the baseRequest value for this ExcursionAvailabilityRequest.
     * 
     * @param baseRequest
     */
    public void setBaseRequest(com.bookcyprus.webservicesV2.RequestBase baseRequest) {
        this.baseRequest = baseRequest;
    }


    /**
     * Gets the locationId value for this ExcursionAvailabilityRequest.
     * 
     * @return locationId
     */
    public int getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this ExcursionAvailabilityRequest.
     * 
     * @param locationId
     */
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the multiLocationIds value for this ExcursionAvailabilityRequest.
     * 
     * @return multiLocationIds
     */
    public int[] getMultiLocationIds() {
        return multiLocationIds;
    }


    /**
     * Sets the multiLocationIds value for this ExcursionAvailabilityRequest.
     * 
     * @param multiLocationIds
     */
    public void setMultiLocationIds(int[] multiLocationIds) {
        this.multiLocationIds = multiLocationIds;
    }


    /**
     * Gets the multiExcursionIds value for this ExcursionAvailabilityRequest.
     * 
     * @return multiExcursionIds
     */
    public int[] getMultiExcursionIds() {
        return multiExcursionIds;
    }


    /**
     * Sets the multiExcursionIds value for this ExcursionAvailabilityRequest.
     * 
     * @param multiExcursionIds
     */
    public void setMultiExcursionIds(int[] multiExcursionIds) {
        this.multiExcursionIds = multiExcursionIds;
    }


    /**
     * Gets the fromDate value for this ExcursionAvailabilityRequest.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this ExcursionAvailabilityRequest.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this ExcursionAvailabilityRequest.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this ExcursionAvailabilityRequest.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the excursionId value for this ExcursionAvailabilityRequest.
     * 
     * @return excursionId
     */
    public int getExcursionId() {
        return excursionId;
    }


    /**
     * Sets the excursionId value for this ExcursionAvailabilityRequest.
     * 
     * @param excursionId
     */
    public void setExcursionId(int excursionId) {
        this.excursionId = excursionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExcursionAvailabilityRequest)) return false;
        ExcursionAvailabilityRequest other = (ExcursionAvailabilityRequest) obj;
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
            this.locationId == other.getLocationId() &&
            ((this.multiLocationIds==null && other.getMultiLocationIds()==null) || 
             (this.multiLocationIds!=null &&
              java.util.Arrays.equals(this.multiLocationIds, other.getMultiLocationIds()))) &&
            ((this.multiExcursionIds==null && other.getMultiExcursionIds()==null) || 
             (this.multiExcursionIds!=null &&
              java.util.Arrays.equals(this.multiExcursionIds, other.getMultiExcursionIds()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            this.excursionId == other.getExcursionId();
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
        _hashCode += getLocationId();
        if (getMultiLocationIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMultiLocationIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMultiLocationIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMultiExcursionIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMultiExcursionIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMultiExcursionIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        _hashCode += getExcursionId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExcursionAvailabilityRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionAvailabilityRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RequestBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "LocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiLocationIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "MultiLocationIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiExcursionIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "MultiExcursionIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "FromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ToDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
