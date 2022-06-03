/**
 * SupplierCancellationPolicyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class SupplierCancellationPolicyResponse  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.ResponseBase baseResponse;

    private com.bookcyprus.webservicesV2.SupplierCancellationPolicyItem[] items;

    private int supplierId;

    private java.util.Calendar checkinDate;

    private java.math.BigDecimal indicativeServiceAmount;

    public SupplierCancellationPolicyResponse() {
    }

    public SupplierCancellationPolicyResponse(
           com.bookcyprus.webservicesV2.ResponseBase baseResponse,
           com.bookcyprus.webservicesV2.SupplierCancellationPolicyItem[] items,
           int supplierId,
           java.util.Calendar checkinDate,
           java.math.BigDecimal indicativeServiceAmount) {
           this.baseResponse = baseResponse;
           this.items = items;
           this.supplierId = supplierId;
           this.checkinDate = checkinDate;
           this.indicativeServiceAmount = indicativeServiceAmount;
    }


    /**
     * Gets the baseResponse value for this SupplierCancellationPolicyResponse.
     * 
     * @return baseResponse
     */
    public com.bookcyprus.webservicesV2.ResponseBase getBaseResponse() {
        return baseResponse;
    }


    /**
     * Sets the baseResponse value for this SupplierCancellationPolicyResponse.
     * 
     * @param baseResponse
     */
    public void setBaseResponse(com.bookcyprus.webservicesV2.ResponseBase baseResponse) {
        this.baseResponse = baseResponse;
    }


    /**
     * Gets the items value for this SupplierCancellationPolicyResponse.
     * 
     * @return items
     */
    public com.bookcyprus.webservicesV2.SupplierCancellationPolicyItem[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this SupplierCancellationPolicyResponse.
     * 
     * @param items
     */
    public void setItems(com.bookcyprus.webservicesV2.SupplierCancellationPolicyItem[] items) {
        this.items = items;
    }


    /**
     * Gets the supplierId value for this SupplierCancellationPolicyResponse.
     * 
     * @return supplierId
     */
    public int getSupplierId() {
        return supplierId;
    }


    /**
     * Sets the supplierId value for this SupplierCancellationPolicyResponse.
     * 
     * @param supplierId
     */
    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }


    /**
     * Gets the checkinDate value for this SupplierCancellationPolicyResponse.
     * 
     * @return checkinDate
     */
    public java.util.Calendar getCheckinDate() {
        return checkinDate;
    }


    /**
     * Sets the checkinDate value for this SupplierCancellationPolicyResponse.
     * 
     * @param checkinDate
     */
    public void setCheckinDate(java.util.Calendar checkinDate) {
        this.checkinDate = checkinDate;
    }


    /**
     * Gets the indicativeServiceAmount value for this SupplierCancellationPolicyResponse.
     * 
     * @return indicativeServiceAmount
     */
    public java.math.BigDecimal getIndicativeServiceAmount() {
        return indicativeServiceAmount;
    }


    /**
     * Sets the indicativeServiceAmount value for this SupplierCancellationPolicyResponse.
     * 
     * @param indicativeServiceAmount
     */
    public void setIndicativeServiceAmount(java.math.BigDecimal indicativeServiceAmount) {
        this.indicativeServiceAmount = indicativeServiceAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupplierCancellationPolicyResponse)) return false;
        SupplierCancellationPolicyResponse other = (SupplierCancellationPolicyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseResponse==null && other.getBaseResponse()==null) || 
             (this.baseResponse!=null &&
              this.baseResponse.equals(other.getBaseResponse()))) &&
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems()))) &&
            this.supplierId == other.getSupplierId() &&
            ((this.checkinDate==null && other.getCheckinDate()==null) || 
             (this.checkinDate!=null &&
              this.checkinDate.equals(other.getCheckinDate()))) &&
            ((this.indicativeServiceAmount==null && other.getIndicativeServiceAmount()==null) || 
             (this.indicativeServiceAmount!=null &&
              this.indicativeServiceAmount.equals(other.getIndicativeServiceAmount())));
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
        if (getBaseResponse() != null) {
            _hashCode += getBaseResponse().hashCode();
        }
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getSupplierId();
        if (getCheckinDate() != null) {
            _hashCode += getCheckinDate().hashCode();
        }
        if (getIndicativeServiceAmount() != null) {
            _hashCode += getIndicativeServiceAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupplierCancellationPolicyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SupplierCancellationPolicyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ResponseBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SupplierCancellationPolicyItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SupplierCancellationPolicyItem"));
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
