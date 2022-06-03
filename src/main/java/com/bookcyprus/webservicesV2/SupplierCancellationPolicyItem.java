/**
 * SupplierCancellationPolicyItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class SupplierCancellationPolicyItem  implements java.io.Serializable {
    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    private java.math.BigDecimal calculatedFee;

    private java.math.BigDecimal prepaymentPercentage;

    private java.math.BigDecimal fullPaymentPercentage;

    private java.lang.String cancellationStays;

    private java.lang.String noShows;

    private java.lang.String cancellationPolicyMessage;

    public SupplierCancellationPolicyItem() {
    }

    public SupplierCancellationPolicyItem(
           java.util.Calendar fromDate,
           java.util.Calendar toDate,
           java.math.BigDecimal calculatedFee,
           java.math.BigDecimal prepaymentPercentage,
           java.math.BigDecimal fullPaymentPercentage,
           java.lang.String cancellationStays,
           java.lang.String noShows,
           java.lang.String cancellationPolicyMessage) {
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.calculatedFee = calculatedFee;
           this.prepaymentPercentage = prepaymentPercentage;
           this.fullPaymentPercentage = fullPaymentPercentage;
           this.cancellationStays = cancellationStays;
           this.noShows = noShows;
           this.cancellationPolicyMessage = cancellationPolicyMessage;
    }


    /**
     * Gets the fromDate value for this SupplierCancellationPolicyItem.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this SupplierCancellationPolicyItem.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this SupplierCancellationPolicyItem.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this SupplierCancellationPolicyItem.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the calculatedFee value for this SupplierCancellationPolicyItem.
     * 
     * @return calculatedFee
     */
    public java.math.BigDecimal getCalculatedFee() {
        return calculatedFee;
    }


    /**
     * Sets the calculatedFee value for this SupplierCancellationPolicyItem.
     * 
     * @param calculatedFee
     */
    public void setCalculatedFee(java.math.BigDecimal calculatedFee) {
        this.calculatedFee = calculatedFee;
    }


    /**
     * Gets the prepaymentPercentage value for this SupplierCancellationPolicyItem.
     * 
     * @return prepaymentPercentage
     */
    public java.math.BigDecimal getPrepaymentPercentage() {
        return prepaymentPercentage;
    }


    /**
     * Sets the prepaymentPercentage value for this SupplierCancellationPolicyItem.
     * 
     * @param prepaymentPercentage
     */
    public void setPrepaymentPercentage(java.math.BigDecimal prepaymentPercentage) {
        this.prepaymentPercentage = prepaymentPercentage;
    }


    /**
     * Gets the fullPaymentPercentage value for this SupplierCancellationPolicyItem.
     * 
     * @return fullPaymentPercentage
     */
    public java.math.BigDecimal getFullPaymentPercentage() {
        return fullPaymentPercentage;
    }


    /**
     * Sets the fullPaymentPercentage value for this SupplierCancellationPolicyItem.
     * 
     * @param fullPaymentPercentage
     */
    public void setFullPaymentPercentage(java.math.BigDecimal fullPaymentPercentage) {
        this.fullPaymentPercentage = fullPaymentPercentage;
    }


    /**
     * Gets the cancellationStays value for this SupplierCancellationPolicyItem.
     * 
     * @return cancellationStays
     */
    public java.lang.String getCancellationStays() {
        return cancellationStays;
    }


    /**
     * Sets the cancellationStays value for this SupplierCancellationPolicyItem.
     * 
     * @param cancellationStays
     */
    public void setCancellationStays(java.lang.String cancellationStays) {
        this.cancellationStays = cancellationStays;
    }


    /**
     * Gets the noShows value for this SupplierCancellationPolicyItem.
     * 
     * @return noShows
     */
    public java.lang.String getNoShows() {
        return noShows;
    }


    /**
     * Sets the noShows value for this SupplierCancellationPolicyItem.
     * 
     * @param noShows
     */
    public void setNoShows(java.lang.String noShows) {
        this.noShows = noShows;
    }


    /**
     * Gets the cancellationPolicyMessage value for this SupplierCancellationPolicyItem.
     * 
     * @return cancellationPolicyMessage
     */
    public java.lang.String getCancellationPolicyMessage() {
        return cancellationPolicyMessage;
    }


    /**
     * Sets the cancellationPolicyMessage value for this SupplierCancellationPolicyItem.
     * 
     * @param cancellationPolicyMessage
     */
    public void setCancellationPolicyMessage(java.lang.String cancellationPolicyMessage) {
        this.cancellationPolicyMessage = cancellationPolicyMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupplierCancellationPolicyItem)) return false;
        SupplierCancellationPolicyItem other = (SupplierCancellationPolicyItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            ((this.calculatedFee==null && other.getCalculatedFee()==null) || 
             (this.calculatedFee!=null &&
              this.calculatedFee.equals(other.getCalculatedFee()))) &&
            ((this.prepaymentPercentage==null && other.getPrepaymentPercentage()==null) || 
             (this.prepaymentPercentage!=null &&
              this.prepaymentPercentage.equals(other.getPrepaymentPercentage()))) &&
            ((this.fullPaymentPercentage==null && other.getFullPaymentPercentage()==null) || 
             (this.fullPaymentPercentage!=null &&
              this.fullPaymentPercentage.equals(other.getFullPaymentPercentage()))) &&
            ((this.cancellationStays==null && other.getCancellationStays()==null) || 
             (this.cancellationStays!=null &&
              this.cancellationStays.equals(other.getCancellationStays()))) &&
            ((this.noShows==null && other.getNoShows()==null) || 
             (this.noShows!=null &&
              this.noShows.equals(other.getNoShows()))) &&
            ((this.cancellationPolicyMessage==null && other.getCancellationPolicyMessage()==null) || 
             (this.cancellationPolicyMessage!=null &&
              this.cancellationPolicyMessage.equals(other.getCancellationPolicyMessage())));
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
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getCalculatedFee() != null) {
            _hashCode += getCalculatedFee().hashCode();
        }
        if (getPrepaymentPercentage() != null) {
            _hashCode += getPrepaymentPercentage().hashCode();
        }
        if (getFullPaymentPercentage() != null) {
            _hashCode += getFullPaymentPercentage().hashCode();
        }
        if (getCancellationStays() != null) {
            _hashCode += getCancellationStays().hashCode();
        }
        if (getNoShows() != null) {
            _hashCode += getNoShows().hashCode();
        }
        if (getCancellationPolicyMessage() != null) {
            _hashCode += getCancellationPolicyMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupplierCancellationPolicyItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SupplierCancellationPolicyItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("calculatedFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CalculatedFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaymentPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PrepaymentPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullPaymentPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "FullPaymentPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancellationStays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CancellationStays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noShows");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "NoShows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancellationPolicyMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CancellationPolicyMessage"));
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
