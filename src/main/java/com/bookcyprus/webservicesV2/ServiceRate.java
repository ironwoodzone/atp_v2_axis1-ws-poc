/**
 * ServiceRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ServiceRate  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.math.BigDecimal netAmount;

    private java.math.BigDecimal taxAmount;

    private int providerId;

    private com.bookcyprus.webservicesV2.ServiceRateDetail[] details;

    private com.bookcyprus.webservicesV2.ServiceRateDetail[] nonPayableFees;

    private java.lang.String groupIdentifier;

    private com.bookcyprus.webservicesV2.EssentialInformationDetail[] essentialInformation;

    private com.bookcyprus.webservicesV2.BookingConditionItemDetail[] cancellationPolicy;

    private java.lang.String uniqueRoomCode;

    private int mealId;  // attribute

    private java.lang.String meal;  // attribute

    private java.lang.String mealName;  // attribute

    private boolean isNonRef;  // attribute

    private boolean freeCancellation;  // attribute

    private java.lang.String paymentType;  // attribute

    public ServiceRate() {
    }

    public ServiceRate(
           java.math.BigDecimal amount,
           java.math.BigDecimal netAmount,
           java.math.BigDecimal taxAmount,
           int providerId,
           com.bookcyprus.webservicesV2.ServiceRateDetail[] details,
           com.bookcyprus.webservicesV2.ServiceRateDetail[] nonPayableFees,
           java.lang.String groupIdentifier,
           com.bookcyprus.webservicesV2.EssentialInformationDetail[] essentialInformation,
           com.bookcyprus.webservicesV2.BookingConditionItemDetail[] cancellationPolicy,
           java.lang.String uniqueRoomCode,
           int mealId,
           java.lang.String meal,
           java.lang.String mealName,
           boolean isNonRef,
           boolean freeCancellation,
           java.lang.String paymentType) {
           this.amount = amount;
           this.netAmount = netAmount;
           this.taxAmount = taxAmount;
           this.providerId = providerId;
           this.details = details;
           this.nonPayableFees = nonPayableFees;
           this.groupIdentifier = groupIdentifier;
           this.essentialInformation = essentialInformation;
           this.cancellationPolicy = cancellationPolicy;
           this.uniqueRoomCode = uniqueRoomCode;
           this.mealId = mealId;
           this.meal = meal;
           this.mealName = mealName;
           this.isNonRef = isNonRef;
           this.freeCancellation = freeCancellation;
           this.paymentType = paymentType;
    }


    /**
     * Gets the amount value for this ServiceRate.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ServiceRate.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the netAmount value for this ServiceRate.
     * 
     * @return netAmount
     */
    public java.math.BigDecimal getNetAmount() {
        return netAmount;
    }


    /**
     * Sets the netAmount value for this ServiceRate.
     * 
     * @param netAmount
     */
    public void setNetAmount(java.math.BigDecimal netAmount) {
        this.netAmount = netAmount;
    }


    /**
     * Gets the taxAmount value for this ServiceRate.
     * 
     * @return taxAmount
     */
    public java.math.BigDecimal getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this ServiceRate.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.math.BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the providerId value for this ServiceRate.
     * 
     * @return providerId
     */
    public int getProviderId() {
        return providerId;
    }


    /**
     * Sets the providerId value for this ServiceRate.
     * 
     * @param providerId
     */
    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }


    /**
     * Gets the details value for this ServiceRate.
     * 
     * @return details
     */
    public com.bookcyprus.webservicesV2.ServiceRateDetail[] getDetails() {
        return details;
    }


    /**
     * Sets the details value for this ServiceRate.
     * 
     * @param details
     */
    public void setDetails(com.bookcyprus.webservicesV2.ServiceRateDetail[] details) {
        this.details = details;
    }


    /**
     * Gets the nonPayableFees value for this ServiceRate.
     * 
     * @return nonPayableFees
     */
    public com.bookcyprus.webservicesV2.ServiceRateDetail[] getNonPayableFees() {
        return nonPayableFees;
    }


    /**
     * Sets the nonPayableFees value for this ServiceRate.
     * 
     * @param nonPayableFees
     */
    public void setNonPayableFees(com.bookcyprus.webservicesV2.ServiceRateDetail[] nonPayableFees) {
        this.nonPayableFees = nonPayableFees;
    }


    /**
     * Gets the groupIdentifier value for this ServiceRate.
     * 
     * @return groupIdentifier
     */
    public java.lang.String getGroupIdentifier() {
        return groupIdentifier;
    }


    /**
     * Sets the groupIdentifier value for this ServiceRate.
     * 
     * @param groupIdentifier
     */
    public void setGroupIdentifier(java.lang.String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
    }


    /**
     * Gets the essentialInformation value for this ServiceRate.
     * 
     * @return essentialInformation
     */
    public com.bookcyprus.webservicesV2.EssentialInformationDetail[] getEssentialInformation() {
        return essentialInformation;
    }


    /**
     * Sets the essentialInformation value for this ServiceRate.
     * 
     * @param essentialInformation
     */
    public void setEssentialInformation(com.bookcyprus.webservicesV2.EssentialInformationDetail[] essentialInformation) {
        this.essentialInformation = essentialInformation;
    }


    /**
     * Gets the cancellationPolicy value for this ServiceRate.
     * 
     * @return cancellationPolicy
     */
    public com.bookcyprus.webservicesV2.BookingConditionItemDetail[] getCancellationPolicy() {
        return cancellationPolicy;
    }


    /**
     * Sets the cancellationPolicy value for this ServiceRate.
     * 
     * @param cancellationPolicy
     */
    public void setCancellationPolicy(com.bookcyprus.webservicesV2.BookingConditionItemDetail[] cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }


    /**
     * Gets the uniqueRoomCode value for this ServiceRate.
     * 
     * @return uniqueRoomCode
     */
    public java.lang.String getUniqueRoomCode() {
        return uniqueRoomCode;
    }


    /**
     * Sets the uniqueRoomCode value for this ServiceRate.
     * 
     * @param uniqueRoomCode
     */
    public void setUniqueRoomCode(java.lang.String uniqueRoomCode) {
        this.uniqueRoomCode = uniqueRoomCode;
    }


    /**
     * Gets the mealId value for this ServiceRate.
     * 
     * @return mealId
     */
    public int getMealId() {
        return mealId;
    }


    /**
     * Sets the mealId value for this ServiceRate.
     * 
     * @param mealId
     */
    public void setMealId(int mealId) {
        this.mealId = mealId;
    }


    /**
     * Gets the meal value for this ServiceRate.
     * 
     * @return meal
     */
    public java.lang.String getMeal() {
        return meal;
    }


    /**
     * Sets the meal value for this ServiceRate.
     * 
     * @param meal
     */
    public void setMeal(java.lang.String meal) {
        this.meal = meal;
    }


    /**
     * Gets the mealName value for this ServiceRate.
     * 
     * @return mealName
     */
    public java.lang.String getMealName() {
        return mealName;
    }


    /**
     * Sets the mealName value for this ServiceRate.
     * 
     * @param mealName
     */
    public void setMealName(java.lang.String mealName) {
        this.mealName = mealName;
    }


    /**
     * Gets the isNonRef value for this ServiceRate.
     * 
     * @return isNonRef
     */
    public boolean isIsNonRef() {
        return isNonRef;
    }


    /**
     * Sets the isNonRef value for this ServiceRate.
     * 
     * @param isNonRef
     */
    public void setIsNonRef(boolean isNonRef) {
        this.isNonRef = isNonRef;
    }


    /**
     * Gets the freeCancellation value for this ServiceRate.
     * 
     * @return freeCancellation
     */
    public boolean isFreeCancellation() {
        return freeCancellation;
    }


    /**
     * Sets the freeCancellation value for this ServiceRate.
     * 
     * @param freeCancellation
     */
    public void setFreeCancellation(boolean freeCancellation) {
        this.freeCancellation = freeCancellation;
    }


    /**
     * Gets the paymentType value for this ServiceRate.
     * 
     * @return paymentType
     */
    public java.lang.String getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this ServiceRate.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.String paymentType) {
        this.paymentType = paymentType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceRate)) return false;
        ServiceRate other = (ServiceRate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.netAmount==null && other.getNetAmount()==null) || 
             (this.netAmount!=null &&
              this.netAmount.equals(other.getNetAmount()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            this.providerId == other.getProviderId() &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              java.util.Arrays.equals(this.details, other.getDetails()))) &&
            ((this.nonPayableFees==null && other.getNonPayableFees()==null) || 
             (this.nonPayableFees!=null &&
              java.util.Arrays.equals(this.nonPayableFees, other.getNonPayableFees()))) &&
            ((this.groupIdentifier==null && other.getGroupIdentifier()==null) || 
             (this.groupIdentifier!=null &&
              this.groupIdentifier.equals(other.getGroupIdentifier()))) &&
            ((this.essentialInformation==null && other.getEssentialInformation()==null) || 
             (this.essentialInformation!=null &&
              java.util.Arrays.equals(this.essentialInformation, other.getEssentialInformation()))) &&
            ((this.cancellationPolicy==null && other.getCancellationPolicy()==null) || 
             (this.cancellationPolicy!=null &&
              java.util.Arrays.equals(this.cancellationPolicy, other.getCancellationPolicy()))) &&
            ((this.uniqueRoomCode==null && other.getUniqueRoomCode()==null) || 
             (this.uniqueRoomCode!=null &&
              this.uniqueRoomCode.equals(other.getUniqueRoomCode()))) &&
            this.mealId == other.getMealId() &&
            ((this.meal==null && other.getMeal()==null) || 
             (this.meal!=null &&
              this.meal.equals(other.getMeal()))) &&
            ((this.mealName==null && other.getMealName()==null) || 
             (this.mealName!=null &&
              this.mealName.equals(other.getMealName()))) &&
            this.isNonRef == other.isIsNonRef() &&
            this.freeCancellation == other.isFreeCancellation() &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getNetAmount() != null) {
            _hashCode += getNetAmount().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        _hashCode += getProviderId();
        if (getDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNonPayableFees() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNonPayableFees());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNonPayableFees(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroupIdentifier() != null) {
            _hashCode += getGroupIdentifier().hashCode();
        }
        if (getEssentialInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEssentialInformation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEssentialInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getUniqueRoomCode() != null) {
            _hashCode += getUniqueRoomCode().hashCode();
        }
        _hashCode += getMealId();
        if (getMeal() != null) {
            _hashCode += getMeal().hashCode();
        }
        if (getMealName() != null) {
            _hashCode += getMealName().hashCode();
        }
        _hashCode += (isIsNonRef() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFreeCancellation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ServiceRate"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("mealId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MealId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("meal");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Meal"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("mealName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MealName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isNonRef");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsNonRef"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("freeCancellation");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FreeCancellation"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("paymentType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PaymentType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "NetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ProviderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ServiceRateDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ServiceRateDetail"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonPayableFees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "NonPayableFees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ServiceRateDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ServiceRateDetail"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GroupIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("essentialInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "EssentialInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "EssentialInformationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "EssentialInformationDetail"));
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
        elemField.setFieldName("uniqueRoomCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "UniqueRoomCode"));
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
