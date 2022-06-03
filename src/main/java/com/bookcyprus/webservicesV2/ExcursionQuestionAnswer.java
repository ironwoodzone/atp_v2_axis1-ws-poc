/**
 * ExcursionQuestionAnswer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ExcursionQuestionAnswer  implements java.io.Serializable {
    private java.lang.String questionCode;

    private int passengerIndex;

    private java.lang.String answer;

    public ExcursionQuestionAnswer() {
    }

    public ExcursionQuestionAnswer(
           java.lang.String questionCode,
           int passengerIndex,
           java.lang.String answer) {
           this.questionCode = questionCode;
           this.passengerIndex = passengerIndex;
           this.answer = answer;
    }


    /**
     * Gets the questionCode value for this ExcursionQuestionAnswer.
     * 
     * @return questionCode
     */
    public java.lang.String getQuestionCode() {
        return questionCode;
    }


    /**
     * Sets the questionCode value for this ExcursionQuestionAnswer.
     * 
     * @param questionCode
     */
    public void setQuestionCode(java.lang.String questionCode) {
        this.questionCode = questionCode;
    }


    /**
     * Gets the passengerIndex value for this ExcursionQuestionAnswer.
     * 
     * @return passengerIndex
     */
    public int getPassengerIndex() {
        return passengerIndex;
    }


    /**
     * Sets the passengerIndex value for this ExcursionQuestionAnswer.
     * 
     * @param passengerIndex
     */
    public void setPassengerIndex(int passengerIndex) {
        this.passengerIndex = passengerIndex;
    }


    /**
     * Gets the answer value for this ExcursionQuestionAnswer.
     * 
     * @return answer
     */
    public java.lang.String getAnswer() {
        return answer;
    }


    /**
     * Sets the answer value for this ExcursionQuestionAnswer.
     * 
     * @param answer
     */
    public void setAnswer(java.lang.String answer) {
        this.answer = answer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExcursionQuestionAnswer)) return false;
        ExcursionQuestionAnswer other = (ExcursionQuestionAnswer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.questionCode==null && other.getQuestionCode()==null) || 
             (this.questionCode!=null &&
              this.questionCode.equals(other.getQuestionCode()))) &&
            this.passengerIndex == other.getPassengerIndex() &&
            ((this.answer==null && other.getAnswer()==null) || 
             (this.answer!=null &&
              this.answer.equals(other.getAnswer())));
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
        if (getQuestionCode() != null) {
            _hashCode += getQuestionCode().hashCode();
        }
        _hashCode += getPassengerIndex();
        if (getAnswer() != null) {
            _hashCode += getAnswer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExcursionQuestionAnswer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionQuestionAnswer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "QuestionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PassengerIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Answer"));
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
