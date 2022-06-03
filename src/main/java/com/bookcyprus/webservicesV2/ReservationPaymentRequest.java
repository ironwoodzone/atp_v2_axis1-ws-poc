/**
 * ReservationPaymentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ReservationPaymentRequest  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.RequestBase baseRequest;

    private com.bookcyprus.webservicesV2.PaymentMethodCode paymentMethod;

    private int reservationId;

    private java.lang.String reservationCode;

    private java.lang.String creditCardNumber;

    private java.lang.String creditCardCVV;

    private java.lang.String creditCardExpiryMonth;

    private java.lang.String creditCardExpiryYear;

    private com.bookcyprus.webservicesV2.ReservationClientDetails clientDetails;

    public ReservationPaymentRequest() {
    }

    public ReservationPaymentRequest(
           com.bookcyprus.webservicesV2.RequestBase baseRequest,
           com.bookcyprus.webservicesV2.PaymentMethodCode paymentMethod,
           int reservationId,
           java.lang.String reservationCode,
           java.lang.String creditCardNumber,
           java.lang.String creditCardCVV,
           java.lang.String creditCardExpiryMonth,
           java.lang.String creditCardExpiryYear,
           com.bookcyprus.webservicesV2.ReservationClientDetails clientDetails) {
           this.baseRequest = baseRequest;
           this.paymentMethod = paymentMethod;
           this.reservationId = reservationId;
           this.reservationCode = reservationCode;
           this.creditCardNumber = creditCardNumber;
           this.creditCardCVV = creditCardCVV;
           this.creditCardExpiryMonth = creditCardExpiryMonth;
           this.creditCardExpiryYear = creditCardExpiryYear;
           this.clientDetails = clientDetails;
    }


    /**
     * Gets the baseRequest value for this ReservationPaymentRequest.
     * 
     * @return baseRequest
     */
    public com.bookcyprus.webservicesV2.RequestBase getBaseRequest() {
        return baseRequest;
    }


    /**
     * Sets the baseRequest value for this ReservationPaymentRequest.
     * 
     * @param baseRequest
     */
    public void setBaseRequest(com.bookcyprus.webservicesV2.RequestBase baseRequest) {
        this.baseRequest = baseRequest;
    }


    /**
     * Gets the paymentMethod value for this ReservationPaymentRequest.
     * 
     * @return paymentMethod
     */
    public com.bookcyprus.webservicesV2.PaymentMethodCode getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this ReservationPaymentRequest.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.bookcyprus.webservicesV2.PaymentMethodCode paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the reservationId value for this ReservationPaymentRequest.
     * 
     * @return reservationId
     */
    public int getReservationId() {
        return reservationId;
    }


    /**
     * Sets the reservationId value for this ReservationPaymentRequest.
     * 
     * @param reservationId
     */
    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }


    /**
     * Gets the reservationCode value for this ReservationPaymentRequest.
     * 
     * @return reservationCode
     */
    public java.lang.String getReservationCode() {
        return reservationCode;
    }


    /**
     * Sets the reservationCode value for this ReservationPaymentRequest.
     * 
     * @param reservationCode
     */
    public void setReservationCode(java.lang.String reservationCode) {
        this.reservationCode = reservationCode;
    }


    /**
     * Gets the creditCardNumber value for this ReservationPaymentRequest.
     * 
     * @return creditCardNumber
     */
    public java.lang.String getCreditCardNumber() {
        return creditCardNumber;
    }


    /**
     * Sets the creditCardNumber value for this ReservationPaymentRequest.
     * 
     * @param creditCardNumber
     */
    public void setCreditCardNumber(java.lang.String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }


    /**
     * Gets the creditCardCVV value for this ReservationPaymentRequest.
     * 
     * @return creditCardCVV
     */
    public java.lang.String getCreditCardCVV() {
        return creditCardCVV;
    }


    /**
     * Sets the creditCardCVV value for this ReservationPaymentRequest.
     * 
     * @param creditCardCVV
     */
    public void setCreditCardCVV(java.lang.String creditCardCVV) {
        this.creditCardCVV = creditCardCVV;
    }


    /**
     * Gets the creditCardExpiryMonth value for this ReservationPaymentRequest.
     * 
     * @return creditCardExpiryMonth
     */
    public java.lang.String getCreditCardExpiryMonth() {
        return creditCardExpiryMonth;
    }


    /**
     * Sets the creditCardExpiryMonth value for this ReservationPaymentRequest.
     * 
     * @param creditCardExpiryMonth
     */
    public void setCreditCardExpiryMonth(java.lang.String creditCardExpiryMonth) {
        this.creditCardExpiryMonth = creditCardExpiryMonth;
    }


    /**
     * Gets the creditCardExpiryYear value for this ReservationPaymentRequest.
     * 
     * @return creditCardExpiryYear
     */
    public java.lang.String getCreditCardExpiryYear() {
        return creditCardExpiryYear;
    }


    /**
     * Sets the creditCardExpiryYear value for this ReservationPaymentRequest.
     * 
     * @param creditCardExpiryYear
     */
    public void setCreditCardExpiryYear(java.lang.String creditCardExpiryYear) {
        this.creditCardExpiryYear = creditCardExpiryYear;
    }


    /**
     * Gets the clientDetails value for this ReservationPaymentRequest.
     * 
     * @return clientDetails
     */
    public com.bookcyprus.webservicesV2.ReservationClientDetails getClientDetails() {
        return clientDetails;
    }


    /**
     * Sets the clientDetails value for this ReservationPaymentRequest.
     * 
     * @param clientDetails
     */
    public void setClientDetails(com.bookcyprus.webservicesV2.ReservationClientDetails clientDetails) {
        this.clientDetails = clientDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationPaymentRequest)) return false;
        ReservationPaymentRequest other = (ReservationPaymentRequest) obj;
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
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            this.reservationId == other.getReservationId() &&
            ((this.reservationCode==null && other.getReservationCode()==null) || 
             (this.reservationCode!=null &&
              this.reservationCode.equals(other.getReservationCode()))) &&
            ((this.creditCardNumber==null && other.getCreditCardNumber()==null) || 
             (this.creditCardNumber!=null &&
              this.creditCardNumber.equals(other.getCreditCardNumber()))) &&
            ((this.creditCardCVV==null && other.getCreditCardCVV()==null) || 
             (this.creditCardCVV!=null &&
              this.creditCardCVV.equals(other.getCreditCardCVV()))) &&
            ((this.creditCardExpiryMonth==null && other.getCreditCardExpiryMonth()==null) || 
             (this.creditCardExpiryMonth!=null &&
              this.creditCardExpiryMonth.equals(other.getCreditCardExpiryMonth()))) &&
            ((this.creditCardExpiryYear==null && other.getCreditCardExpiryYear()==null) || 
             (this.creditCardExpiryYear!=null &&
              this.creditCardExpiryYear.equals(other.getCreditCardExpiryYear()))) &&
            ((this.clientDetails==null && other.getClientDetails()==null) || 
             (this.clientDetails!=null &&
              this.clientDetails.equals(other.getClientDetails())));
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
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        _hashCode += getReservationId();
        if (getReservationCode() != null) {
            _hashCode += getReservationCode().hashCode();
        }
        if (getCreditCardNumber() != null) {
            _hashCode += getCreditCardNumber().hashCode();
        }
        if (getCreditCardCVV() != null) {
            _hashCode += getCreditCardCVV().hashCode();
        }
        if (getCreditCardExpiryMonth() != null) {
            _hashCode += getCreditCardExpiryMonth().hashCode();
        }
        if (getCreditCardExpiryYear() != null) {
            _hashCode += getCreditCardExpiryYear().hashCode();
        }
        if (getClientDetails() != null) {
            _hashCode += getClientDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationPaymentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationPaymentRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RequestBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PaymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PaymentMethodCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CreditCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardCVV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CreditCardCVV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardExpiryMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CreditCardExpiryMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardExpiryYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CreditCardExpiryYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ClientDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationClientDetails"));
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
