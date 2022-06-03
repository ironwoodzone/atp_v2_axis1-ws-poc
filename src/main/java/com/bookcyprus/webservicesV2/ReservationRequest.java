/**
 * ReservationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ReservationRequest  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.RequestBase baseRequest;

    private java.lang.String title;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String address;

    private java.lang.String email;

    private java.lang.String city;

    private int countryId;

    private java.lang.String mobileNumber;

    private java.lang.String remarks;

    private boolean applyPrepayment;

    private java.lang.String agencyReference;

    private com.bookcyprus.webservicesV2.ReservationPaymentRequest paymentRequest;

    private com.bookcyprus.webservicesV2.HotelReservationRequest[] hotelRequests;

    private com.bookcyprus.webservicesV2.CarReservationRequest[] carRequests;

    private com.bookcyprus.webservicesV2.TransferReservationRequest[] transferRequests;

    private com.bookcyprus.webservicesV2.ExcursionReservationRequest[] excursionRequests;

    private com.bookcyprus.webservicesV2.RoundtripReservationRequest roundtripRequest;

    private java.lang.String clientReservationReference;

    private java.lang.String existingReservationId;

    public ReservationRequest() {
    }

    public ReservationRequest(
           com.bookcyprus.webservicesV2.RequestBase baseRequest,
           java.lang.String title,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String address,
           java.lang.String email,
           java.lang.String city,
           int countryId,
           java.lang.String mobileNumber,
           java.lang.String remarks,
           boolean applyPrepayment,
           java.lang.String agencyReference,
           com.bookcyprus.webservicesV2.ReservationPaymentRequest paymentRequest,
           com.bookcyprus.webservicesV2.HotelReservationRequest[] hotelRequests,
           com.bookcyprus.webservicesV2.CarReservationRequest[] carRequests,
           com.bookcyprus.webservicesV2.TransferReservationRequest[] transferRequests,
           com.bookcyprus.webservicesV2.ExcursionReservationRequest[] excursionRequests,
           com.bookcyprus.webservicesV2.RoundtripReservationRequest roundtripRequest,
           java.lang.String clientReservationReference,
           java.lang.String existingReservationId) {
           this.baseRequest = baseRequest;
           this.title = title;
           this.firstName = firstName;
           this.lastName = lastName;
           this.address = address;
           this.email = email;
           this.city = city;
           this.countryId = countryId;
           this.mobileNumber = mobileNumber;
           this.remarks = remarks;
           this.applyPrepayment = applyPrepayment;
           this.agencyReference = agencyReference;
           this.paymentRequest = paymentRequest;
           this.hotelRequests = hotelRequests;
           this.carRequests = carRequests;
           this.transferRequests = transferRequests;
           this.excursionRequests = excursionRequests;
           this.roundtripRequest = roundtripRequest;
           this.clientReservationReference = clientReservationReference;
           this.existingReservationId = existingReservationId;
    }


    /**
     * Gets the baseRequest value for this ReservationRequest.
     * 
     * @return baseRequest
     */
    public com.bookcyprus.webservicesV2.RequestBase getBaseRequest() {
        return baseRequest;
    }


    /**
     * Sets the baseRequest value for this ReservationRequest.
     * 
     * @param baseRequest
     */
    public void setBaseRequest(com.bookcyprus.webservicesV2.RequestBase baseRequest) {
        this.baseRequest = baseRequest;
    }


    /**
     * Gets the title value for this ReservationRequest.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ReservationRequest.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the firstName value for this ReservationRequest.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this ReservationRequest.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this ReservationRequest.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this ReservationRequest.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the address value for this ReservationRequest.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ReservationRequest.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the email value for this ReservationRequest.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ReservationRequest.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the city value for this ReservationRequest.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this ReservationRequest.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the countryId value for this ReservationRequest.
     * 
     * @return countryId
     */
    public int getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this ReservationRequest.
     * 
     * @param countryId
     */
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the mobileNumber value for this ReservationRequest.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this ReservationRequest.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the remarks value for this ReservationRequest.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this ReservationRequest.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the applyPrepayment value for this ReservationRequest.
     * 
     * @return applyPrepayment
     */
    public boolean isApplyPrepayment() {
        return applyPrepayment;
    }


    /**
     * Sets the applyPrepayment value for this ReservationRequest.
     * 
     * @param applyPrepayment
     */
    public void setApplyPrepayment(boolean applyPrepayment) {
        this.applyPrepayment = applyPrepayment;
    }


    /**
     * Gets the agencyReference value for this ReservationRequest.
     * 
     * @return agencyReference
     */
    public java.lang.String getAgencyReference() {
        return agencyReference;
    }


    /**
     * Sets the agencyReference value for this ReservationRequest.
     * 
     * @param agencyReference
     */
    public void setAgencyReference(java.lang.String agencyReference) {
        this.agencyReference = agencyReference;
    }


    /**
     * Gets the paymentRequest value for this ReservationRequest.
     * 
     * @return paymentRequest
     */
    public com.bookcyprus.webservicesV2.ReservationPaymentRequest getPaymentRequest() {
        return paymentRequest;
    }


    /**
     * Sets the paymentRequest value for this ReservationRequest.
     * 
     * @param paymentRequest
     */
    public void setPaymentRequest(com.bookcyprus.webservicesV2.ReservationPaymentRequest paymentRequest) {
        this.paymentRequest = paymentRequest;
    }


    /**
     * Gets the hotelRequests value for this ReservationRequest.
     * 
     * @return hotelRequests
     */
    public com.bookcyprus.webservicesV2.HotelReservationRequest[] getHotelRequests() {
        return hotelRequests;
    }


    /**
     * Sets the hotelRequests value for this ReservationRequest.
     * 
     * @param hotelRequests
     */
    public void setHotelRequests(com.bookcyprus.webservicesV2.HotelReservationRequest[] hotelRequests) {
        this.hotelRequests = hotelRequests;
    }


    /**
     * Gets the carRequests value for this ReservationRequest.
     * 
     * @return carRequests
     */
    public com.bookcyprus.webservicesV2.CarReservationRequest[] getCarRequests() {
        return carRequests;
    }


    /**
     * Sets the carRequests value for this ReservationRequest.
     * 
     * @param carRequests
     */
    public void setCarRequests(com.bookcyprus.webservicesV2.CarReservationRequest[] carRequests) {
        this.carRequests = carRequests;
    }


    /**
     * Gets the transferRequests value for this ReservationRequest.
     * 
     * @return transferRequests
     */
    public com.bookcyprus.webservicesV2.TransferReservationRequest[] getTransferRequests() {
        return transferRequests;
    }


    /**
     * Sets the transferRequests value for this ReservationRequest.
     * 
     * @param transferRequests
     */
    public void setTransferRequests(com.bookcyprus.webservicesV2.TransferReservationRequest[] transferRequests) {
        this.transferRequests = transferRequests;
    }


    /**
     * Gets the excursionRequests value for this ReservationRequest.
     * 
     * @return excursionRequests
     */
    public com.bookcyprus.webservicesV2.ExcursionReservationRequest[] getExcursionRequests() {
        return excursionRequests;
    }


    /**
     * Sets the excursionRequests value for this ReservationRequest.
     * 
     * @param excursionRequests
     */
    public void setExcursionRequests(com.bookcyprus.webservicesV2.ExcursionReservationRequest[] excursionRequests) {
        this.excursionRequests = excursionRequests;
    }


    /**
     * Gets the roundtripRequest value for this ReservationRequest.
     * 
     * @return roundtripRequest
     */
    public com.bookcyprus.webservicesV2.RoundtripReservationRequest getRoundtripRequest() {
        return roundtripRequest;
    }


    /**
     * Sets the roundtripRequest value for this ReservationRequest.
     * 
     * @param roundtripRequest
     */
    public void setRoundtripRequest(com.bookcyprus.webservicesV2.RoundtripReservationRequest roundtripRequest) {
        this.roundtripRequest = roundtripRequest;
    }


    /**
     * Gets the clientReservationReference value for this ReservationRequest.
     * 
     * @return clientReservationReference
     */
    public java.lang.String getClientReservationReference() {
        return clientReservationReference;
    }


    /**
     * Sets the clientReservationReference value for this ReservationRequest.
     * 
     * @param clientReservationReference
     */
    public void setClientReservationReference(java.lang.String clientReservationReference) {
        this.clientReservationReference = clientReservationReference;
    }


    /**
     * Gets the existingReservationId value for this ReservationRequest.
     * 
     * @return existingReservationId
     */
    public java.lang.String getExistingReservationId() {
        return existingReservationId;
    }


    /**
     * Sets the existingReservationId value for this ReservationRequest.
     * 
     * @param existingReservationId
     */
    public void setExistingReservationId(java.lang.String existingReservationId) {
        this.existingReservationId = existingReservationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationRequest)) return false;
        ReservationRequest other = (ReservationRequest) obj;
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
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            this.countryId == other.getCountryId() &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            this.applyPrepayment == other.isApplyPrepayment() &&
            ((this.agencyReference==null && other.getAgencyReference()==null) || 
             (this.agencyReference!=null &&
              this.agencyReference.equals(other.getAgencyReference()))) &&
            ((this.paymentRequest==null && other.getPaymentRequest()==null) || 
             (this.paymentRequest!=null &&
              this.paymentRequest.equals(other.getPaymentRequest()))) &&
            ((this.hotelRequests==null && other.getHotelRequests()==null) || 
             (this.hotelRequests!=null &&
              java.util.Arrays.equals(this.hotelRequests, other.getHotelRequests()))) &&
            ((this.carRequests==null && other.getCarRequests()==null) || 
             (this.carRequests!=null &&
              java.util.Arrays.equals(this.carRequests, other.getCarRequests()))) &&
            ((this.transferRequests==null && other.getTransferRequests()==null) || 
             (this.transferRequests!=null &&
              java.util.Arrays.equals(this.transferRequests, other.getTransferRequests()))) &&
            ((this.excursionRequests==null && other.getExcursionRequests()==null) || 
             (this.excursionRequests!=null &&
              java.util.Arrays.equals(this.excursionRequests, other.getExcursionRequests()))) &&
            ((this.roundtripRequest==null && other.getRoundtripRequest()==null) || 
             (this.roundtripRequest!=null &&
              this.roundtripRequest.equals(other.getRoundtripRequest()))) &&
            ((this.clientReservationReference==null && other.getClientReservationReference()==null) || 
             (this.clientReservationReference!=null &&
              this.clientReservationReference.equals(other.getClientReservationReference()))) &&
            ((this.existingReservationId==null && other.getExistingReservationId()==null) || 
             (this.existingReservationId!=null &&
              this.existingReservationId.equals(other.getExistingReservationId())));
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
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        _hashCode += getCountryId();
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        _hashCode += (isApplyPrepayment() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAgencyReference() != null) {
            _hashCode += getAgencyReference().hashCode();
        }
        if (getPaymentRequest() != null) {
            _hashCode += getPaymentRequest().hashCode();
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
        if (getCarRequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCarRequests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCarRequests(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferRequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferRequests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferRequests(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcursionRequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcursionRequests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcursionRequests(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoundtripRequest() != null) {
            _hashCode += getRoundtripRequest().hashCode();
        }
        if (getClientReservationReference() != null) {
            _hashCode += getClientReservationReference().hashCode();
        }
        if (getExistingReservationId() != null) {
            _hashCode += getExistingReservationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RequestBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CountryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "MobileNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyPrepayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ApplyPrepayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencyReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "AgencyReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PaymentRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationPaymentRequest"));
        elemField.setMinOccurs(0);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarReservationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarReservationRequest"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferReservationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferReservationRequest"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursionRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionReservationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionReservationRequest"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundtripRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripReservationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientReservationReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ClientReservationReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("existingReservationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExistingReservationId"));
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
