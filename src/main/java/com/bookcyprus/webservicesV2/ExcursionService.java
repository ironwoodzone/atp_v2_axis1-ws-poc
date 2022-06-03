/**
 * ExcursionService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ExcursionService  implements java.io.Serializable {
    private int excursionId;

    private java.lang.String excursionName;

    private java.lang.String excursionTypeName;

    private int excursionTypeId;

    private com.bookcyprus.webservicesV2.ExcursionSearchLocation[] locations;

    private com.bookcyprus.webservicesV2.ExcursionStartTime[] excursionStartTimes;

    private com.bookcyprus.webservicesV2.ExcursionDate[] excursionDates;

    private com.bookcyprus.webservicesV2.ExcursionGrade[] excursionGrades;

    private java.lang.String fromPrice;

    private boolean onRequest;

    private boolean isAdultsAllowed;

    private boolean isChildrenAllowed;

    private boolean isInfantsAllowed;

    private boolean isSeniorsAllowed;

    private boolean isYouthsAllowed;

    private java.lang.String adultAgeRange;

    private java.lang.String childAgeRange;

    private java.lang.String infantAgeRange;

    private java.lang.String seniorAgeRange;

    private java.lang.String youthsAgeRange;

    private java.lang.String vehicleCapacity;

    public ExcursionService() {
    }

    public ExcursionService(
           int excursionId,
           java.lang.String excursionName,
           java.lang.String excursionTypeName,
           int excursionTypeId,
           com.bookcyprus.webservicesV2.ExcursionSearchLocation[] locations,
           com.bookcyprus.webservicesV2.ExcursionStartTime[] excursionStartTimes,
           com.bookcyprus.webservicesV2.ExcursionDate[] excursionDates,
           com.bookcyprus.webservicesV2.ExcursionGrade[] excursionGrades,
           java.lang.String fromPrice,
           boolean onRequest,
           boolean isAdultsAllowed,
           boolean isChildrenAllowed,
           boolean isInfantsAllowed,
           boolean isSeniorsAllowed,
           boolean isYouthsAllowed,
           java.lang.String adultAgeRange,
           java.lang.String childAgeRange,
           java.lang.String infantAgeRange,
           java.lang.String seniorAgeRange,
           java.lang.String youthsAgeRange,
           java.lang.String vehicleCapacity) {
           this.excursionId = excursionId;
           this.excursionName = excursionName;
           this.excursionTypeName = excursionTypeName;
           this.excursionTypeId = excursionTypeId;
           this.locations = locations;
           this.excursionStartTimes = excursionStartTimes;
           this.excursionDates = excursionDates;
           this.excursionGrades = excursionGrades;
           this.fromPrice = fromPrice;
           this.onRequest = onRequest;
           this.isAdultsAllowed = isAdultsAllowed;
           this.isChildrenAllowed = isChildrenAllowed;
           this.isInfantsAllowed = isInfantsAllowed;
           this.isSeniorsAllowed = isSeniorsAllowed;
           this.isYouthsAllowed = isYouthsAllowed;
           this.adultAgeRange = adultAgeRange;
           this.childAgeRange = childAgeRange;
           this.infantAgeRange = infantAgeRange;
           this.seniorAgeRange = seniorAgeRange;
           this.youthsAgeRange = youthsAgeRange;
           this.vehicleCapacity = vehicleCapacity;
    }


    /**
     * Gets the excursionId value for this ExcursionService.
     * 
     * @return excursionId
     */
    public int getExcursionId() {
        return excursionId;
    }


    /**
     * Sets the excursionId value for this ExcursionService.
     * 
     * @param excursionId
     */
    public void setExcursionId(int excursionId) {
        this.excursionId = excursionId;
    }


    /**
     * Gets the excursionName value for this ExcursionService.
     * 
     * @return excursionName
     */
    public java.lang.String getExcursionName() {
        return excursionName;
    }


    /**
     * Sets the excursionName value for this ExcursionService.
     * 
     * @param excursionName
     */
    public void setExcursionName(java.lang.String excursionName) {
        this.excursionName = excursionName;
    }


    /**
     * Gets the excursionTypeName value for this ExcursionService.
     * 
     * @return excursionTypeName
     */
    public java.lang.String getExcursionTypeName() {
        return excursionTypeName;
    }


    /**
     * Sets the excursionTypeName value for this ExcursionService.
     * 
     * @param excursionTypeName
     */
    public void setExcursionTypeName(java.lang.String excursionTypeName) {
        this.excursionTypeName = excursionTypeName;
    }


    /**
     * Gets the excursionTypeId value for this ExcursionService.
     * 
     * @return excursionTypeId
     */
    public int getExcursionTypeId() {
        return excursionTypeId;
    }


    /**
     * Sets the excursionTypeId value for this ExcursionService.
     * 
     * @param excursionTypeId
     */
    public void setExcursionTypeId(int excursionTypeId) {
        this.excursionTypeId = excursionTypeId;
    }


    /**
     * Gets the locations value for this ExcursionService.
     * 
     * @return locations
     */
    public com.bookcyprus.webservicesV2.ExcursionSearchLocation[] getLocations() {
        return locations;
    }


    /**
     * Sets the locations value for this ExcursionService.
     * 
     * @param locations
     */
    public void setLocations(com.bookcyprus.webservicesV2.ExcursionSearchLocation[] locations) {
        this.locations = locations;
    }


    /**
     * Gets the excursionStartTimes value for this ExcursionService.
     * 
     * @return excursionStartTimes
     */
    public com.bookcyprus.webservicesV2.ExcursionStartTime[] getExcursionStartTimes() {
        return excursionStartTimes;
    }


    /**
     * Sets the excursionStartTimes value for this ExcursionService.
     * 
     * @param excursionStartTimes
     */
    public void setExcursionStartTimes(com.bookcyprus.webservicesV2.ExcursionStartTime[] excursionStartTimes) {
        this.excursionStartTimes = excursionStartTimes;
    }


    /**
     * Gets the excursionDates value for this ExcursionService.
     * 
     * @return excursionDates
     */
    public com.bookcyprus.webservicesV2.ExcursionDate[] getExcursionDates() {
        return excursionDates;
    }


    /**
     * Sets the excursionDates value for this ExcursionService.
     * 
     * @param excursionDates
     */
    public void setExcursionDates(com.bookcyprus.webservicesV2.ExcursionDate[] excursionDates) {
        this.excursionDates = excursionDates;
    }


    /**
     * Gets the excursionGrades value for this ExcursionService.
     * 
     * @return excursionGrades
     */
    public com.bookcyprus.webservicesV2.ExcursionGrade[] getExcursionGrades() {
        return excursionGrades;
    }


    /**
     * Sets the excursionGrades value for this ExcursionService.
     * 
     * @param excursionGrades
     */
    public void setExcursionGrades(com.bookcyprus.webservicesV2.ExcursionGrade[] excursionGrades) {
        this.excursionGrades = excursionGrades;
    }


    /**
     * Gets the fromPrice value for this ExcursionService.
     * 
     * @return fromPrice
     */
    public java.lang.String getFromPrice() {
        return fromPrice;
    }


    /**
     * Sets the fromPrice value for this ExcursionService.
     * 
     * @param fromPrice
     */
    public void setFromPrice(java.lang.String fromPrice) {
        this.fromPrice = fromPrice;
    }


    /**
     * Gets the onRequest value for this ExcursionService.
     * 
     * @return onRequest
     */
    public boolean isOnRequest() {
        return onRequest;
    }


    /**
     * Sets the onRequest value for this ExcursionService.
     * 
     * @param onRequest
     */
    public void setOnRequest(boolean onRequest) {
        this.onRequest = onRequest;
    }


    /**
     * Gets the isAdultsAllowed value for this ExcursionService.
     * 
     * @return isAdultsAllowed
     */
    public boolean isIsAdultsAllowed() {
        return isAdultsAllowed;
    }


    /**
     * Sets the isAdultsAllowed value for this ExcursionService.
     * 
     * @param isAdultsAllowed
     */
    public void setIsAdultsAllowed(boolean isAdultsAllowed) {
        this.isAdultsAllowed = isAdultsAllowed;
    }


    /**
     * Gets the isChildrenAllowed value for this ExcursionService.
     * 
     * @return isChildrenAllowed
     */
    public boolean isIsChildrenAllowed() {
        return isChildrenAllowed;
    }


    /**
     * Sets the isChildrenAllowed value for this ExcursionService.
     * 
     * @param isChildrenAllowed
     */
    public void setIsChildrenAllowed(boolean isChildrenAllowed) {
        this.isChildrenAllowed = isChildrenAllowed;
    }


    /**
     * Gets the isInfantsAllowed value for this ExcursionService.
     * 
     * @return isInfantsAllowed
     */
    public boolean isIsInfantsAllowed() {
        return isInfantsAllowed;
    }


    /**
     * Sets the isInfantsAllowed value for this ExcursionService.
     * 
     * @param isInfantsAllowed
     */
    public void setIsInfantsAllowed(boolean isInfantsAllowed) {
        this.isInfantsAllowed = isInfantsAllowed;
    }


    /**
     * Gets the isSeniorsAllowed value for this ExcursionService.
     * 
     * @return isSeniorsAllowed
     */
    public boolean isIsSeniorsAllowed() {
        return isSeniorsAllowed;
    }


    /**
     * Sets the isSeniorsAllowed value for this ExcursionService.
     * 
     * @param isSeniorsAllowed
     */
    public void setIsSeniorsAllowed(boolean isSeniorsAllowed) {
        this.isSeniorsAllowed = isSeniorsAllowed;
    }


    /**
     * Gets the isYouthsAllowed value for this ExcursionService.
     * 
     * @return isYouthsAllowed
     */
    public boolean isIsYouthsAllowed() {
        return isYouthsAllowed;
    }


    /**
     * Sets the isYouthsAllowed value for this ExcursionService.
     * 
     * @param isYouthsAllowed
     */
    public void setIsYouthsAllowed(boolean isYouthsAllowed) {
        this.isYouthsAllowed = isYouthsAllowed;
    }


    /**
     * Gets the adultAgeRange value for this ExcursionService.
     * 
     * @return adultAgeRange
     */
    public java.lang.String getAdultAgeRange() {
        return adultAgeRange;
    }


    /**
     * Sets the adultAgeRange value for this ExcursionService.
     * 
     * @param adultAgeRange
     */
    public void setAdultAgeRange(java.lang.String adultAgeRange) {
        this.adultAgeRange = adultAgeRange;
    }


    /**
     * Gets the childAgeRange value for this ExcursionService.
     * 
     * @return childAgeRange
     */
    public java.lang.String getChildAgeRange() {
        return childAgeRange;
    }


    /**
     * Sets the childAgeRange value for this ExcursionService.
     * 
     * @param childAgeRange
     */
    public void setChildAgeRange(java.lang.String childAgeRange) {
        this.childAgeRange = childAgeRange;
    }


    /**
     * Gets the infantAgeRange value for this ExcursionService.
     * 
     * @return infantAgeRange
     */
    public java.lang.String getInfantAgeRange() {
        return infantAgeRange;
    }


    /**
     * Sets the infantAgeRange value for this ExcursionService.
     * 
     * @param infantAgeRange
     */
    public void setInfantAgeRange(java.lang.String infantAgeRange) {
        this.infantAgeRange = infantAgeRange;
    }


    /**
     * Gets the seniorAgeRange value for this ExcursionService.
     * 
     * @return seniorAgeRange
     */
    public java.lang.String getSeniorAgeRange() {
        return seniorAgeRange;
    }


    /**
     * Sets the seniorAgeRange value for this ExcursionService.
     * 
     * @param seniorAgeRange
     */
    public void setSeniorAgeRange(java.lang.String seniorAgeRange) {
        this.seniorAgeRange = seniorAgeRange;
    }


    /**
     * Gets the youthsAgeRange value for this ExcursionService.
     * 
     * @return youthsAgeRange
     */
    public java.lang.String getYouthsAgeRange() {
        return youthsAgeRange;
    }


    /**
     * Sets the youthsAgeRange value for this ExcursionService.
     * 
     * @param youthsAgeRange
     */
    public void setYouthsAgeRange(java.lang.String youthsAgeRange) {
        this.youthsAgeRange = youthsAgeRange;
    }


    /**
     * Gets the vehicleCapacity value for this ExcursionService.
     * 
     * @return vehicleCapacity
     */
    public java.lang.String getVehicleCapacity() {
        return vehicleCapacity;
    }


    /**
     * Sets the vehicleCapacity value for this ExcursionService.
     * 
     * @param vehicleCapacity
     */
    public void setVehicleCapacity(java.lang.String vehicleCapacity) {
        this.vehicleCapacity = vehicleCapacity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExcursionService)) return false;
        ExcursionService other = (ExcursionService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.excursionId == other.getExcursionId() &&
            ((this.excursionName==null && other.getExcursionName()==null) || 
             (this.excursionName!=null &&
              this.excursionName.equals(other.getExcursionName()))) &&
            ((this.excursionTypeName==null && other.getExcursionTypeName()==null) || 
             (this.excursionTypeName!=null &&
              this.excursionTypeName.equals(other.getExcursionTypeName()))) &&
            this.excursionTypeId == other.getExcursionTypeId() &&
            ((this.locations==null && other.getLocations()==null) || 
             (this.locations!=null &&
              java.util.Arrays.equals(this.locations, other.getLocations()))) &&
            ((this.excursionStartTimes==null && other.getExcursionStartTimes()==null) || 
             (this.excursionStartTimes!=null &&
              java.util.Arrays.equals(this.excursionStartTimes, other.getExcursionStartTimes()))) &&
            ((this.excursionDates==null && other.getExcursionDates()==null) || 
             (this.excursionDates!=null &&
              java.util.Arrays.equals(this.excursionDates, other.getExcursionDates()))) &&
            ((this.excursionGrades==null && other.getExcursionGrades()==null) || 
             (this.excursionGrades!=null &&
              java.util.Arrays.equals(this.excursionGrades, other.getExcursionGrades()))) &&
            ((this.fromPrice==null && other.getFromPrice()==null) || 
             (this.fromPrice!=null &&
              this.fromPrice.equals(other.getFromPrice()))) &&
            this.onRequest == other.isOnRequest() &&
            this.isAdultsAllowed == other.isIsAdultsAllowed() &&
            this.isChildrenAllowed == other.isIsChildrenAllowed() &&
            this.isInfantsAllowed == other.isIsInfantsAllowed() &&
            this.isSeniorsAllowed == other.isIsSeniorsAllowed() &&
            this.isYouthsAllowed == other.isIsYouthsAllowed() &&
            ((this.adultAgeRange==null && other.getAdultAgeRange()==null) || 
             (this.adultAgeRange!=null &&
              this.adultAgeRange.equals(other.getAdultAgeRange()))) &&
            ((this.childAgeRange==null && other.getChildAgeRange()==null) || 
             (this.childAgeRange!=null &&
              this.childAgeRange.equals(other.getChildAgeRange()))) &&
            ((this.infantAgeRange==null && other.getInfantAgeRange()==null) || 
             (this.infantAgeRange!=null &&
              this.infantAgeRange.equals(other.getInfantAgeRange()))) &&
            ((this.seniorAgeRange==null && other.getSeniorAgeRange()==null) || 
             (this.seniorAgeRange!=null &&
              this.seniorAgeRange.equals(other.getSeniorAgeRange()))) &&
            ((this.youthsAgeRange==null && other.getYouthsAgeRange()==null) || 
             (this.youthsAgeRange!=null &&
              this.youthsAgeRange.equals(other.getYouthsAgeRange()))) &&
            ((this.vehicleCapacity==null && other.getVehicleCapacity()==null) || 
             (this.vehicleCapacity!=null &&
              this.vehicleCapacity.equals(other.getVehicleCapacity())));
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
        _hashCode += getExcursionId();
        if (getExcursionName() != null) {
            _hashCode += getExcursionName().hashCode();
        }
        if (getExcursionTypeName() != null) {
            _hashCode += getExcursionTypeName().hashCode();
        }
        _hashCode += getExcursionTypeId();
        if (getLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcursionStartTimes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcursionStartTimes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcursionStartTimes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcursionDates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcursionDates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcursionDates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcursionGrades() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcursionGrades());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcursionGrades(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFromPrice() != null) {
            _hashCode += getFromPrice().hashCode();
        }
        _hashCode += (isOnRequest() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsAdultsAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsChildrenAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsInfantsAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsSeniorsAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsYouthsAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAdultAgeRange() != null) {
            _hashCode += getAdultAgeRange().hashCode();
        }
        if (getChildAgeRange() != null) {
            _hashCode += getChildAgeRange().hashCode();
        }
        if (getInfantAgeRange() != null) {
            _hashCode += getInfantAgeRange().hashCode();
        }
        if (getSeniorAgeRange() != null) {
            _hashCode += getSeniorAgeRange().hashCode();
        }
        if (getYouthsAgeRange() != null) {
            _hashCode += getYouthsAgeRange().hashCode();
        }
        if (getVehicleCapacity() != null) {
            _hashCode += getVehicleCapacity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExcursionService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("excursionTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Locations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionSearchLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionSearchLocation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionStartTimes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionStartTimes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionStartTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionStartTime"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionDates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionDates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionDate"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionGrades");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionGrades"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionGrade"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionGrade"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "FromPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "OnRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAdultsAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "IsAdultsAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isChildrenAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "IsChildrenAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInfantsAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "IsInfantsAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSeniorsAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "IsSeniorsAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isYouthsAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "IsYouthsAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adultAgeRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "AdultAgeRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childAgeRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ChildAgeRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infantAgeRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "InfantAgeRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seniorAgeRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SeniorAgeRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("youthsAgeRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "YouthsAgeRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "VehicleCapacity"));
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
