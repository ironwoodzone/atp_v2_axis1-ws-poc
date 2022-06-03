/**
 * ItineraryService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ItineraryService  implements java.io.Serializable {
    private int itineraryServiceId;

    private int itineraryId;

    private java.lang.String supplierType;

    private java.math.BigDecimal priceDiff;

    private com.bookcyprus.webservicesV2.HotelItineraryService hotel;

    private com.bookcyprus.webservicesV2.ExcursionItineraryService excursion;

    private com.bookcyprus.webservicesV2.TransferItineraryService transfer;

    private com.bookcyprus.webservicesV2.MiscellaneousItineraryService miscellaneous;

    private int sortOrder;

    private boolean isCustomisable;

    private boolean isAdditionalService;

    private boolean isRemovable;

    private int parentItineraryServiceId;

    public ItineraryService() {
    }

    public ItineraryService(
           int itineraryServiceId,
           int itineraryId,
           java.lang.String supplierType,
           java.math.BigDecimal priceDiff,
           com.bookcyprus.webservicesV2.HotelItineraryService hotel,
           com.bookcyprus.webservicesV2.ExcursionItineraryService excursion,
           com.bookcyprus.webservicesV2.TransferItineraryService transfer,
           com.bookcyprus.webservicesV2.MiscellaneousItineraryService miscellaneous,
           int sortOrder,
           boolean isCustomisable,
           boolean isAdditionalService,
           boolean isRemovable,
           int parentItineraryServiceId) {
           this.itineraryServiceId = itineraryServiceId;
           this.itineraryId = itineraryId;
           this.supplierType = supplierType;
           this.priceDiff = priceDiff;
           this.hotel = hotel;
           this.excursion = excursion;
           this.transfer = transfer;
           this.miscellaneous = miscellaneous;
           this.sortOrder = sortOrder;
           this.isCustomisable = isCustomisable;
           this.isAdditionalService = isAdditionalService;
           this.isRemovable = isRemovable;
           this.parentItineraryServiceId = parentItineraryServiceId;
    }


    /**
     * Gets the itineraryServiceId value for this ItineraryService.
     * 
     * @return itineraryServiceId
     */
    public int getItineraryServiceId() {
        return itineraryServiceId;
    }


    /**
     * Sets the itineraryServiceId value for this ItineraryService.
     * 
     * @param itineraryServiceId
     */
    public void setItineraryServiceId(int itineraryServiceId) {
        this.itineraryServiceId = itineraryServiceId;
    }


    /**
     * Gets the itineraryId value for this ItineraryService.
     * 
     * @return itineraryId
     */
    public int getItineraryId() {
        return itineraryId;
    }


    /**
     * Sets the itineraryId value for this ItineraryService.
     * 
     * @param itineraryId
     */
    public void setItineraryId(int itineraryId) {
        this.itineraryId = itineraryId;
    }


    /**
     * Gets the supplierType value for this ItineraryService.
     * 
     * @return supplierType
     */
    public java.lang.String getSupplierType() {
        return supplierType;
    }


    /**
     * Sets the supplierType value for this ItineraryService.
     * 
     * @param supplierType
     */
    public void setSupplierType(java.lang.String supplierType) {
        this.supplierType = supplierType;
    }


    /**
     * Gets the priceDiff value for this ItineraryService.
     * 
     * @return priceDiff
     */
    public java.math.BigDecimal getPriceDiff() {
        return priceDiff;
    }


    /**
     * Sets the priceDiff value for this ItineraryService.
     * 
     * @param priceDiff
     */
    public void setPriceDiff(java.math.BigDecimal priceDiff) {
        this.priceDiff = priceDiff;
    }


    /**
     * Gets the hotel value for this ItineraryService.
     * 
     * @return hotel
     */
    public com.bookcyprus.webservicesV2.HotelItineraryService getHotel() {
        return hotel;
    }


    /**
     * Sets the hotel value for this ItineraryService.
     * 
     * @param hotel
     */
    public void setHotel(com.bookcyprus.webservicesV2.HotelItineraryService hotel) {
        this.hotel = hotel;
    }


    /**
     * Gets the excursion value for this ItineraryService.
     * 
     * @return excursion
     */
    public com.bookcyprus.webservicesV2.ExcursionItineraryService getExcursion() {
        return excursion;
    }


    /**
     * Sets the excursion value for this ItineraryService.
     * 
     * @param excursion
     */
    public void setExcursion(com.bookcyprus.webservicesV2.ExcursionItineraryService excursion) {
        this.excursion = excursion;
    }


    /**
     * Gets the transfer value for this ItineraryService.
     * 
     * @return transfer
     */
    public com.bookcyprus.webservicesV2.TransferItineraryService getTransfer() {
        return transfer;
    }


    /**
     * Sets the transfer value for this ItineraryService.
     * 
     * @param transfer
     */
    public void setTransfer(com.bookcyprus.webservicesV2.TransferItineraryService transfer) {
        this.transfer = transfer;
    }


    /**
     * Gets the miscellaneous value for this ItineraryService.
     * 
     * @return miscellaneous
     */
    public com.bookcyprus.webservicesV2.MiscellaneousItineraryService getMiscellaneous() {
        return miscellaneous;
    }


    /**
     * Sets the miscellaneous value for this ItineraryService.
     * 
     * @param miscellaneous
     */
    public void setMiscellaneous(com.bookcyprus.webservicesV2.MiscellaneousItineraryService miscellaneous) {
        this.miscellaneous = miscellaneous;
    }


    /**
     * Gets the sortOrder value for this ItineraryService.
     * 
     * @return sortOrder
     */
    public int getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this ItineraryService.
     * 
     * @param sortOrder
     */
    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the isCustomisable value for this ItineraryService.
     * 
     * @return isCustomisable
     */
    public boolean isIsCustomisable() {
        return isCustomisable;
    }


    /**
     * Sets the isCustomisable value for this ItineraryService.
     * 
     * @param isCustomisable
     */
    public void setIsCustomisable(boolean isCustomisable) {
        this.isCustomisable = isCustomisable;
    }


    /**
     * Gets the isAdditionalService value for this ItineraryService.
     * 
     * @return isAdditionalService
     */
    public boolean isIsAdditionalService() {
        return isAdditionalService;
    }


    /**
     * Sets the isAdditionalService value for this ItineraryService.
     * 
     * @param isAdditionalService
     */
    public void setIsAdditionalService(boolean isAdditionalService) {
        this.isAdditionalService = isAdditionalService;
    }


    /**
     * Gets the isRemovable value for this ItineraryService.
     * 
     * @return isRemovable
     */
    public boolean isIsRemovable() {
        return isRemovable;
    }


    /**
     * Sets the isRemovable value for this ItineraryService.
     * 
     * @param isRemovable
     */
    public void setIsRemovable(boolean isRemovable) {
        this.isRemovable = isRemovable;
    }


    /**
     * Gets the parentItineraryServiceId value for this ItineraryService.
     * 
     * @return parentItineraryServiceId
     */
    public int getParentItineraryServiceId() {
        return parentItineraryServiceId;
    }


    /**
     * Sets the parentItineraryServiceId value for this ItineraryService.
     * 
     * @param parentItineraryServiceId
     */
    public void setParentItineraryServiceId(int parentItineraryServiceId) {
        this.parentItineraryServiceId = parentItineraryServiceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItineraryService)) return false;
        ItineraryService other = (ItineraryService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.itineraryServiceId == other.getItineraryServiceId() &&
            this.itineraryId == other.getItineraryId() &&
            ((this.supplierType==null && other.getSupplierType()==null) || 
             (this.supplierType!=null &&
              this.supplierType.equals(other.getSupplierType()))) &&
            ((this.priceDiff==null && other.getPriceDiff()==null) || 
             (this.priceDiff!=null &&
              this.priceDiff.equals(other.getPriceDiff()))) &&
            ((this.hotel==null && other.getHotel()==null) || 
             (this.hotel!=null &&
              this.hotel.equals(other.getHotel()))) &&
            ((this.excursion==null && other.getExcursion()==null) || 
             (this.excursion!=null &&
              this.excursion.equals(other.getExcursion()))) &&
            ((this.transfer==null && other.getTransfer()==null) || 
             (this.transfer!=null &&
              this.transfer.equals(other.getTransfer()))) &&
            ((this.miscellaneous==null && other.getMiscellaneous()==null) || 
             (this.miscellaneous!=null &&
              this.miscellaneous.equals(other.getMiscellaneous()))) &&
            this.sortOrder == other.getSortOrder() &&
            this.isCustomisable == other.isIsCustomisable() &&
            this.isAdditionalService == other.isIsAdditionalService() &&
            this.isRemovable == other.isIsRemovable() &&
            this.parentItineraryServiceId == other.getParentItineraryServiceId();
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
        _hashCode += getItineraryServiceId();
        _hashCode += getItineraryId();
        if (getSupplierType() != null) {
            _hashCode += getSupplierType().hashCode();
        }
        if (getPriceDiff() != null) {
            _hashCode += getPriceDiff().hashCode();
        }
        if (getHotel() != null) {
            _hashCode += getHotel().hashCode();
        }
        if (getExcursion() != null) {
            _hashCode += getExcursion().hashCode();
        }
        if (getTransfer() != null) {
            _hashCode += getTransfer().hashCode();
        }
        if (getMiscellaneous() != null) {
            _hashCode += getMiscellaneous().hashCode();
        }
        _hashCode += getSortOrder();
        _hashCode += (isIsCustomisable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsAdditionalService() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsRemovable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getParentItineraryServiceId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItineraryService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ItineraryService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itineraryServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ItineraryServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itineraryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ItineraryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SupplierType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PriceDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Hotel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelItineraryService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Excursion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionItineraryService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transfer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Transfer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferItineraryService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miscellaneous");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Miscellaneous"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "MiscellaneousItineraryService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCustomisable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "IsCustomisable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAdditionalService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "IsAdditionalService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRemovable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "IsRemovable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentItineraryServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ParentItineraryServiceId"));
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
