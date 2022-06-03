/**
 * HotelAvailabilityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class HotelAvailabilityRequest  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.RequestBase baseRequest;

    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    private com.bookcyprus.webservicesV2.HotelOccupancy[] occupancy;

    private int locationId;

    private int regionId;

    private int starClassificationId;

    private int hotelId;

    private java.lang.String searchGroup;

    private int[] multiHotelIds;

    private java.lang.String trackingCode;

    private int maxRatePlanCount;

    private com.bookcyprus.webservicesV2.ClientNationalityInfo clientNationality;

    public HotelAvailabilityRequest() {
    }

    public HotelAvailabilityRequest(
           com.bookcyprus.webservicesV2.RequestBase baseRequest,
           java.util.Calendar fromDate,
           java.util.Calendar toDate,
           com.bookcyprus.webservicesV2.HotelOccupancy[] occupancy,
           int locationId,
           int regionId,
           int starClassificationId,
           int hotelId,
           java.lang.String searchGroup,
           int[] multiHotelIds,
           java.lang.String trackingCode,
           int maxRatePlanCount,
           com.bookcyprus.webservicesV2.ClientNationalityInfo clientNationality) {
           this.baseRequest = baseRequest;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.occupancy = occupancy;
           this.locationId = locationId;
           this.regionId = regionId;
           this.starClassificationId = starClassificationId;
           this.hotelId = hotelId;
           this.searchGroup = searchGroup;
           this.multiHotelIds = multiHotelIds;
           this.trackingCode = trackingCode;
           this.maxRatePlanCount = maxRatePlanCount;
           this.clientNationality = clientNationality;
    }


    /**
     * Gets the baseRequest value for this HotelAvailabilityRequest.
     * 
     * @return baseRequest
     */
    public com.bookcyprus.webservicesV2.RequestBase getBaseRequest() {
        return baseRequest;
    }


    /**
     * Sets the baseRequest value for this HotelAvailabilityRequest.
     * 
     * @param baseRequest
     */
    public void setBaseRequest(com.bookcyprus.webservicesV2.RequestBase baseRequest) {
        this.baseRequest = baseRequest;
    }


    /**
     * Gets the fromDate value for this HotelAvailabilityRequest.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this HotelAvailabilityRequest.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this HotelAvailabilityRequest.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this HotelAvailabilityRequest.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the occupancy value for this HotelAvailabilityRequest.
     * 
     * @return occupancy
     */
    public com.bookcyprus.webservicesV2.HotelOccupancy[] getOccupancy() {
        return occupancy;
    }


    /**
     * Sets the occupancy value for this HotelAvailabilityRequest.
     * 
     * @param occupancy
     */
    public void setOccupancy(com.bookcyprus.webservicesV2.HotelOccupancy[] occupancy) {
        this.occupancy = occupancy;
    }


    /**
     * Gets the locationId value for this HotelAvailabilityRequest.
     * 
     * @return locationId
     */
    public int getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this HotelAvailabilityRequest.
     * 
     * @param locationId
     */
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the regionId value for this HotelAvailabilityRequest.
     * 
     * @return regionId
     */
    public int getRegionId() {
        return regionId;
    }


    /**
     * Sets the regionId value for this HotelAvailabilityRequest.
     * 
     * @param regionId
     */
    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }


    /**
     * Gets the starClassificationId value for this HotelAvailabilityRequest.
     * 
     * @return starClassificationId
     */
    public int getStarClassificationId() {
        return starClassificationId;
    }


    /**
     * Sets the starClassificationId value for this HotelAvailabilityRequest.
     * 
     * @param starClassificationId
     */
    public void setStarClassificationId(int starClassificationId) {
        this.starClassificationId = starClassificationId;
    }


    /**
     * Gets the hotelId value for this HotelAvailabilityRequest.
     * 
     * @return hotelId
     */
    public int getHotelId() {
        return hotelId;
    }


    /**
     * Sets the hotelId value for this HotelAvailabilityRequest.
     * 
     * @param hotelId
     */
    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }


    /**
     * Gets the searchGroup value for this HotelAvailabilityRequest.
     * 
     * @return searchGroup
     */
    public java.lang.String getSearchGroup() {
        return searchGroup;
    }


    /**
     * Sets the searchGroup value for this HotelAvailabilityRequest.
     * 
     * @param searchGroup
     */
    public void setSearchGroup(java.lang.String searchGroup) {
        this.searchGroup = searchGroup;
    }


    /**
     * Gets the multiHotelIds value for this HotelAvailabilityRequest.
     * 
     * @return multiHotelIds
     */
    public int[] getMultiHotelIds() {
        return multiHotelIds;
    }


    /**
     * Sets the multiHotelIds value for this HotelAvailabilityRequest.
     * 
     * @param multiHotelIds
     */
    public void setMultiHotelIds(int[] multiHotelIds) {
        this.multiHotelIds = multiHotelIds;
    }


    /**
     * Gets the trackingCode value for this HotelAvailabilityRequest.
     * 
     * @return trackingCode
     */
    public java.lang.String getTrackingCode() {
        return trackingCode;
    }


    /**
     * Sets the trackingCode value for this HotelAvailabilityRequest.
     * 
     * @param trackingCode
     */
    public void setTrackingCode(java.lang.String trackingCode) {
        this.trackingCode = trackingCode;
    }


    /**
     * Gets the maxRatePlanCount value for this HotelAvailabilityRequest.
     * 
     * @return maxRatePlanCount
     */
    public int getMaxRatePlanCount() {
        return maxRatePlanCount;
    }


    /**
     * Sets the maxRatePlanCount value for this HotelAvailabilityRequest.
     * 
     * @param maxRatePlanCount
     */
    public void setMaxRatePlanCount(int maxRatePlanCount) {
        this.maxRatePlanCount = maxRatePlanCount;
    }


    /**
     * Gets the clientNationality value for this HotelAvailabilityRequest.
     * 
     * @return clientNationality
     */
    public com.bookcyprus.webservicesV2.ClientNationalityInfo getClientNationality() {
        return clientNationality;
    }


    /**
     * Sets the clientNationality value for this HotelAvailabilityRequest.
     * 
     * @param clientNationality
     */
    public void setClientNationality(com.bookcyprus.webservicesV2.ClientNationalityInfo clientNationality) {
        this.clientNationality = clientNationality;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HotelAvailabilityRequest)) return false;
        HotelAvailabilityRequest other = (HotelAvailabilityRequest) obj;
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
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            ((this.occupancy==null && other.getOccupancy()==null) || 
             (this.occupancy!=null &&
              java.util.Arrays.equals(this.occupancy, other.getOccupancy()))) &&
            this.locationId == other.getLocationId() &&
            this.regionId == other.getRegionId() &&
            this.starClassificationId == other.getStarClassificationId() &&
            this.hotelId == other.getHotelId() &&
            ((this.searchGroup==null && other.getSearchGroup()==null) || 
             (this.searchGroup!=null &&
              this.searchGroup.equals(other.getSearchGroup()))) &&
            ((this.multiHotelIds==null && other.getMultiHotelIds()==null) || 
             (this.multiHotelIds!=null &&
              java.util.Arrays.equals(this.multiHotelIds, other.getMultiHotelIds()))) &&
            ((this.trackingCode==null && other.getTrackingCode()==null) || 
             (this.trackingCode!=null &&
              this.trackingCode.equals(other.getTrackingCode()))) &&
            this.maxRatePlanCount == other.getMaxRatePlanCount() &&
            ((this.clientNationality==null && other.getClientNationality()==null) || 
             (this.clientNationality!=null &&
              this.clientNationality.equals(other.getClientNationality())));
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
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getOccupancy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOccupancy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOccupancy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getLocationId();
        _hashCode += getRegionId();
        _hashCode += getStarClassificationId();
        _hashCode += getHotelId();
        if (getSearchGroup() != null) {
            _hashCode += getSearchGroup().hashCode();
        }
        if (getMultiHotelIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMultiHotelIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMultiHotelIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrackingCode() != null) {
            _hashCode += getTrackingCode().hashCode();
        }
        _hashCode += getMaxRatePlanCount();
        if (getClientNationality() != null) {
            _hashCode += getClientNationality().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HotelAvailabilityRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelAvailabilityRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RequestBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("occupancy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Occupancy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelOccupancy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelOccupancy"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "LocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RegionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("starClassificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "StarClassificationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SearchGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiHotelIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "MultiHotelIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TrackingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRatePlanCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "MaxRatePlanCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientNationality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ClientNationality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ClientNationalityInfo"));
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
