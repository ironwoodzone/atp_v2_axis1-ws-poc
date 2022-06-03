/**
 * AccountDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class AccountDetailsResponse  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.ResponseBase baseResponse;

    private java.lang.String customerName;

    private java.math.BigDecimal accountCurrentBalance;

    private java.math.BigDecimal creditLimit;

    private java.lang.String currency;

    private com.bookcyprus.webservicesV2.PrepaymentPolicyResponse[] prepaymentPolicies;

    private com.bookcyprus.webservicesV2.CancellationPolicyResponse[] cancellationPolicies;

    public AccountDetailsResponse() {
    }

    public AccountDetailsResponse(
           com.bookcyprus.webservicesV2.ResponseBase baseResponse,
           java.lang.String customerName,
           java.math.BigDecimal accountCurrentBalance,
           java.math.BigDecimal creditLimit,
           java.lang.String currency,
           com.bookcyprus.webservicesV2.PrepaymentPolicyResponse[] prepaymentPolicies,
           com.bookcyprus.webservicesV2.CancellationPolicyResponse[] cancellationPolicies) {
           this.baseResponse = baseResponse;
           this.customerName = customerName;
           this.accountCurrentBalance = accountCurrentBalance;
           this.creditLimit = creditLimit;
           this.currency = currency;
           this.prepaymentPolicies = prepaymentPolicies;
           this.cancellationPolicies = cancellationPolicies;
    }


    /**
     * Gets the baseResponse value for this AccountDetailsResponse.
     * 
     * @return baseResponse
     */
    public com.bookcyprus.webservicesV2.ResponseBase getBaseResponse() {
        return baseResponse;
    }


    /**
     * Sets the baseResponse value for this AccountDetailsResponse.
     * 
     * @param baseResponse
     */
    public void setBaseResponse(com.bookcyprus.webservicesV2.ResponseBase baseResponse) {
        this.baseResponse = baseResponse;
    }


    /**
     * Gets the customerName value for this AccountDetailsResponse.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this AccountDetailsResponse.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the accountCurrentBalance value for this AccountDetailsResponse.
     * 
     * @return accountCurrentBalance
     */
    public java.math.BigDecimal getAccountCurrentBalance() {
        return accountCurrentBalance;
    }


    /**
     * Sets the accountCurrentBalance value for this AccountDetailsResponse.
     * 
     * @param accountCurrentBalance
     */
    public void setAccountCurrentBalance(java.math.BigDecimal accountCurrentBalance) {
        this.accountCurrentBalance = accountCurrentBalance;
    }


    /**
     * Gets the creditLimit value for this AccountDetailsResponse.
     * 
     * @return creditLimit
     */
    public java.math.BigDecimal getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this AccountDetailsResponse.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.math.BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the currency value for this AccountDetailsResponse.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this AccountDetailsResponse.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the prepaymentPolicies value for this AccountDetailsResponse.
     * 
     * @return prepaymentPolicies
     */
    public com.bookcyprus.webservicesV2.PrepaymentPolicyResponse[] getPrepaymentPolicies() {
        return prepaymentPolicies;
    }


    /**
     * Sets the prepaymentPolicies value for this AccountDetailsResponse.
     * 
     * @param prepaymentPolicies
     */
    public void setPrepaymentPolicies(com.bookcyprus.webservicesV2.PrepaymentPolicyResponse[] prepaymentPolicies) {
        this.prepaymentPolicies = prepaymentPolicies;
    }


    /**
     * Gets the cancellationPolicies value for this AccountDetailsResponse.
     * 
     * @return cancellationPolicies
     */
    public com.bookcyprus.webservicesV2.CancellationPolicyResponse[] getCancellationPolicies() {
        return cancellationPolicies;
    }


    /**
     * Sets the cancellationPolicies value for this AccountDetailsResponse.
     * 
     * @param cancellationPolicies
     */
    public void setCancellationPolicies(com.bookcyprus.webservicesV2.CancellationPolicyResponse[] cancellationPolicies) {
        this.cancellationPolicies = cancellationPolicies;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountDetailsResponse)) return false;
        AccountDetailsResponse other = (AccountDetailsResponse) obj;
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
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.accountCurrentBalance==null && other.getAccountCurrentBalance()==null) || 
             (this.accountCurrentBalance!=null &&
              this.accountCurrentBalance.equals(other.getAccountCurrentBalance()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.prepaymentPolicies==null && other.getPrepaymentPolicies()==null) || 
             (this.prepaymentPolicies!=null &&
              java.util.Arrays.equals(this.prepaymentPolicies, other.getPrepaymentPolicies()))) &&
            ((this.cancellationPolicies==null && other.getCancellationPolicies()==null) || 
             (this.cancellationPolicies!=null &&
              java.util.Arrays.equals(this.cancellationPolicies, other.getCancellationPolicies())));
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
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getAccountCurrentBalance() != null) {
            _hashCode += getAccountCurrentBalance().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getPrepaymentPolicies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrepaymentPolicies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrepaymentPolicies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCancellationPolicies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCancellationPolicies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCancellationPolicies(), i);
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
        new org.apache.axis.description.TypeDesc(AccountDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "AccountDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ResponseBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CustomerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCurrentBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "AccountCurrentBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CreditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaymentPolicies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PrepaymentPolicies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PrepaymentPolicyResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PrepaymentPolicyResponse"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancellationPolicies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CancellationPolicies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CancellationPolicyResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CancellationPolicyResponse"));
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
