/**
 * SupplierCancellationPolicyRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class SupplierCancellationPolicyRequest  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.RequestBase baseRequest;

    private int supplierId;

    private java.util.Calendar checkinDate;

    private java.math.BigDecimal indicativeServiceAmount;

    private com.bookcyprus.webservicesV2.HotelReservationRequest[] hotelRequests;

    public SupplierCancellationPolicyRequest() {
    }

    public SupplierCancellationPolicyRequest(
           com.bookcyprus.webservicesV2.RequestBase baseRequest,
           int supplierId,
           java.util.Calendar checkinDate,
           java.math.BigDecimal indicativeServiceAmount,
           com.bookcyprus.webservicesV2.HotelReservationRequest[] hotelRequests) {
           this.baseRequest = baseRequest;
           this.supplierId = supplierId;
           this.checkinDate = checkinDate;
           this.indicativeServiceAmount = indicativeServiceAmount;
           this.hotelRequests = hotelRequests;
    }


    /**
     * Gets the baseRequest value for this SupplierCancellationPolicyRequest.
     * 
     * @return baseRequest
     */
    public com.bookcyprus.webservicesV2.RequestBase getBaseRequest() {
        return baseRequest;
    }


    /**
     * Sets the baseRequest value for this SupplierCancellationPolicyRequest.
     * 
     * @param baseRequest
     */
    public void setBaseRequest(com.bookcyprus.webservicesV2.RequestBase baseRequest) {
        this.baseRequest = baseRequest;
    }


    /**
     * Gets the supplierId value for this SupplierCancellationPolicyRequest.
     * 
     * @return supplierId
     */
    public int getSupplierId() {
        return supplierId;
    }


    /**
     * Sets the supplierId value for this SupplierCancellationPolicyRequest.
     * 
     * @param supplierId
     */
    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }


    /**
     * Gets the checkinDate value for this SupplierCancellationPolicyRequest.
     * 
     * @return checkinDate
     */
    public java.util.Calendar getCheckinDate() {
        return checkinDate;
    }


    /**
     * Sets the checkinDate value for this SupplierCancellationPolicyRequest.
     * 
     * @param checkinDate
     */
    public void setCheckinDate(java.util.Calendar checkinDate) {
        this.checkinDate = checkinDate;
    }


    /**
     * Gets the indicativeServiceAmount value for this SupplierCancellationPolicyRequest.
     * 
     * @return indicativeServiceAmount
     */
    public java.math.BigDecimal getIndicativeServiceAmount() {
        return indicativeServiceAmount;
    }


    /**
     * Sets the indicativeServiceAmount value for this SupplierCancellationPolicyRequest.
     * 
     * @param indicativeServiceAmount
     */
    public void setIndicativeServiceAmount(java.math.BigDecimal indicativeServiceAmount) {
        this.indicativeServiceAmount = indicativeServiceAmount;
    }


    /**
     * Gets the hotelRequests value for this SupplierCancellationPolicyRequest.
     * 
     * @return hotelRequests
     */
    public com.bookcyprus.webservicesV2.HotelReservationRequest[] getHotelRequests() {
        return hotelRequests;
    }


    /**
     * Sets the hotelRequests value for this SupplierCancellationPolicyRequest.
     * 
     * @param hotelRequests
     */
    public void setHotelRequests(com.bookcyprus.webservicesV2.HotelReservationRequest[] hotelRequests) {
        this.hotelRequests = hotelRequests;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupplierCancellationPolicyRequest)) return false;
        SupplierCancellationPolicyRequest other = (SupplierCancellationPolicyRequest) obj;
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
            this.supplierId == other.getSupplierId() &&
            ((this.checkinDate==null && other.getCheckinDate()==null) || 
             (this.checkinDate!=null &&
              this.checkinDate.equals(other.getCheckinDate()))) &&
            ((this.indicativeServiceAmount==null && other.getIndicativeServiceAmount()==null) || 
             (this.indicativeServiceAmount!=null &&
              this.indicativeServiceAmount.equals(other.getIndicativeServiceAmount()))) &&
            ((this.hotelRequests==null && other.getHotelRequests()==null) || 
             (this.hotelRequests!=null &&
              java.util.Arrays.equals(this.hotelRequests, other.getHotelRequests())));
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
        _hashCode += getSupplierId();
        if (getCheckinDate() != null) {
            _hashCode += getCheckinDate().hashCode();
        }
        if (getIndicativeServiceAmount() != null) {
            _hashCode += getIndicativeServiceAmount().hashCode();
        }
        if (getHotelRequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHotelRequests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHotelRequests(), i);
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
        new org.apache.axis.description.TypeDesc(SupplierCancellationPolicyRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SupplierCancellationPolicyRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RequestBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SupplierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkinDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CheckinDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicativeServiceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "IndicativeServiceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelReservationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelReservationRequest"));
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
