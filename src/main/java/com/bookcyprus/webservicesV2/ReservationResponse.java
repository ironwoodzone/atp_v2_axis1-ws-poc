/**
 * ReservationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public class ReservationResponse  implements java.io.Serializable {
    private com.bookcyprus.webservicesV2.ResponseBase baseResponse;

    private int reservationId;

    private java.lang.String reservationCode;

    private java.util.Calendar createdOn;

    private java.lang.String title;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String address;

    private java.lang.String email;

    private java.lang.String city;

    private int countryId;

    private java.lang.String country;

    private java.lang.String mobileNumber;

    private java.lang.String remarks;

    private java.lang.String currency;

    private java.lang.String languge;

    private java.math.BigDecimal amount;

    private java.math.BigDecimal amountDue;

    private java.lang.String status;

    private java.lang.String agencyReference;

    private com.bookcyprus.webservicesV2.HotelReservationResponse[] hotels;

    private com.bookcyprus.webservicesV2.CarReservationResponse[] cars;

    private com.bookcyprus.webservicesV2.TransferReservationResponse[] transfers;

    private com.bookcyprus.webservicesV2.ExcursionReservationResponse[] excursions;

    private com.bookcyprus.webservicesV2.RoundtripReservationResponse roundtrip;

    private com.bookcyprus.webservicesV2.ReservationPaymentResponse paymentResponse;

    private java.lang.String clientReservationReference;

    public ReservationResponse() {
    }

    public ReservationResponse(
           com.bookcyprus.webservicesV2.ResponseBase baseResponse,
           int reservationId,
           java.lang.String reservationCode,
           java.util.Calendar createdOn,
           java.lang.String title,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String address,
           java.lang.String email,
           java.lang.String city,
           int countryId,
           java.lang.String country,
           java.lang.String mobileNumber,
           java.lang.String remarks,
           java.lang.String currency,
           java.lang.String languge,
           java.math.BigDecimal amount,
           java.math.BigDecimal amountDue,
           java.lang.String status,
           java.lang.String agencyReference,
           com.bookcyprus.webservicesV2.HotelReservationResponse[] hotels,
           com.bookcyprus.webservicesV2.CarReservationResponse[] cars,
           com.bookcyprus.webservicesV2.TransferReservationResponse[] transfers,
           com.bookcyprus.webservicesV2.ExcursionReservationResponse[] excursions,
           com.bookcyprus.webservicesV2.RoundtripReservationResponse roundtrip,
           com.bookcyprus.webservicesV2.ReservationPaymentResponse paymentResponse,
           java.lang.String clientReservationReference) {
           this.baseResponse = baseResponse;
           this.reservationId = reservationId;
           this.reservationCode = reservationCode;
           this.createdOn = createdOn;
           this.title = title;
           this.firstName = firstName;
           this.lastName = lastName;
           this.address = address;
           this.email = email;
           this.city = city;
           this.countryId = countryId;
           this.country = country;
           this.mobileNumber = mobileNumber;
           this.remarks = remarks;
           this.currency = currency;
           this.languge = languge;
           this.amount = amount;
           this.amountDue = amountDue;
           this.status = status;
           this.agencyReference = agencyReference;
           this.hotels = hotels;
           this.cars = cars;
           this.transfers = transfers;
           this.excursions = excursions;
           this.roundtrip = roundtrip;
           this.paymentResponse = paymentResponse;
           this.clientReservationReference = clientReservationReference;
    }


    /**
     * Gets the baseResponse value for this ReservationResponse.
     * 
     * @return baseResponse
     */
    public com.bookcyprus.webservicesV2.ResponseBase getBaseResponse() {
        return baseResponse;
    }


    /**
     * Sets the baseResponse value for this ReservationResponse.
     * 
     * @param baseResponse
     */
    public void setBaseResponse(com.bookcyprus.webservicesV2.ResponseBase baseResponse) {
        this.baseResponse = baseResponse;
    }


    /**
     * Gets the reservationId value for this ReservationResponse.
     * 
     * @return reservationId
     */
    public int getReservationId() {
        return reservationId;
    }


    /**
     * Sets the reservationId value for this ReservationResponse.
     * 
     * @param reservationId
     */
    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }


    /**
     * Gets the reservationCode value for this ReservationResponse.
     * 
     * @return reservationCode
     */
    public java.lang.String getReservationCode() {
        return reservationCode;
    }


    /**
     * Sets the reservationCode value for this ReservationResponse.
     * 
     * @param reservationCode
     */
    public void setReservationCode(java.lang.String reservationCode) {
        this.reservationCode = reservationCode;
    }


    /**
     * Gets the createdOn value for this ReservationResponse.
     * 
     * @return createdOn
     */
    public java.util.Calendar getCreatedOn() {
        return createdOn;
    }


    /**
     * Sets the createdOn value for this ReservationResponse.
     * 
     * @param createdOn
     */
    public void setCreatedOn(java.util.Calendar createdOn) {
        this.createdOn = createdOn;
    }


    /**
     * Gets the title value for this ReservationResponse.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ReservationResponse.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the firstName value for this ReservationResponse.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this ReservationResponse.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this ReservationResponse.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this ReservationResponse.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the address value for this ReservationResponse.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ReservationResponse.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the email value for this ReservationResponse.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ReservationResponse.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the city value for this ReservationResponse.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this ReservationResponse.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the countryId value for this ReservationResponse.
     * 
     * @return countryId
     */
    public int getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this ReservationResponse.
     * 
     * @param countryId
     */
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the country value for this ReservationResponse.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this ReservationResponse.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the mobileNumber value for this ReservationResponse.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this ReservationResponse.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the remarks value for this ReservationResponse.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this ReservationResponse.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the currency value for this ReservationResponse.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ReservationResponse.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the languge value for this ReservationResponse.
     * 
     * @return languge
     */
    public java.lang.String getLanguge() {
        return languge;
    }


    /**
     * Sets the languge value for this ReservationResponse.
     * 
     * @param languge
     */
    public void setLanguge(java.lang.String languge) {
        this.languge = languge;
    }


    /**
     * Gets the amount value for this ReservationResponse.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ReservationResponse.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the amountDue value for this ReservationResponse.
     * 
     * @return amountDue
     */
    public java.math.BigDecimal getAmountDue() {
        return amountDue;
    }


    /**
     * Sets the amountDue value for this ReservationResponse.
     * 
     * @param amountDue
     */
    public void setAmountDue(java.math.BigDecimal amountDue) {
        this.amountDue = amountDue;
    }


    /**
     * Gets the status value for this ReservationResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ReservationResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the agencyReference value for this ReservationResponse.
     * 
     * @return agencyReference
     */
    public java.lang.String getAgencyReference() {
        return agencyReference;
    }


    /**
     * Sets the agencyReference value for this ReservationResponse.
     * 
     * @param agencyReference
     */
    public void setAgencyReference(java.lang.String agencyReference) {
        this.agencyReference = agencyReference;
    }


    /**
     * Gets the hotels value for this ReservationResponse.
     * 
     * @return hotels
     */
    public com.bookcyprus.webservicesV2.HotelReservationResponse[] getHotels() {
        return hotels;
    }


    /**
     * Sets the hotels value for this ReservationResponse.
     * 
     * @param hotels
     */
    public void setHotels(com.bookcyprus.webservicesV2.HotelReservationResponse[] hotels) {
        this.hotels = hotels;
    }


    /**
     * Gets the cars value for this ReservationResponse.
     * 
     * @return cars
     */
    public com.bookcyprus.webservicesV2.CarReservationResponse[] getCars() {
        return cars;
    }


    /**
     * Sets the cars value for this ReservationResponse.
     * 
     * @param cars
     */
    public void setCars(com.bookcyprus.webservicesV2.CarReservationResponse[] cars) {
        this.cars = cars;
    }


    /**
     * Gets the transfers value for this ReservationResponse.
     * 
     * @return transfers
     */
    public com.bookcyprus.webservicesV2.TransferReservationResponse[] getTransfers() {
        return transfers;
    }


    /**
     * Sets the transfers value for this ReservationResponse.
     * 
     * @param transfers
     */
    public void setTransfers(com.bookcyprus.webservicesV2.TransferReservationResponse[] transfers) {
        this.transfers = transfers;
    }


    /**
     * Gets the excursions value for this ReservationResponse.
     * 
     * @return excursions
     */
    public com.bookcyprus.webservicesV2.ExcursionReservationResponse[] getExcursions() {
        return excursions;
    }


    /**
     * Sets the excursions value for this ReservationResponse.
     * 
     * @param excursions
     */
    public void setExcursions(com.bookcyprus.webservicesV2.ExcursionReservationResponse[] excursions) {
        this.excursions = excursions;
    }


    /**
     * Gets the roundtrip value for this ReservationResponse.
     * 
     * @return roundtrip
     */
    public com.bookcyprus.webservicesV2.RoundtripReservationResponse getRoundtrip() {
        return roundtrip;
    }


    /**
     * Sets the roundtrip value for this ReservationResponse.
     * 
     * @param roundtrip
     */
    public void setRoundtrip(com.bookcyprus.webservicesV2.RoundtripReservationResponse roundtrip) {
        this.roundtrip = roundtrip;
    }


    /**
     * Gets the paymentResponse value for this ReservationResponse.
     * 
     * @return paymentResponse
     */
    public com.bookcyprus.webservicesV2.ReservationPaymentResponse getPaymentResponse() {
        return paymentResponse;
    }


    /**
     * Sets the paymentResponse value for this ReservationResponse.
     * 
     * @param paymentResponse
     */
    public void setPaymentResponse(com.bookcyprus.webservicesV2.ReservationPaymentResponse paymentResponse) {
        this.paymentResponse = paymentResponse;
    }


    /**
     * Gets the clientReservationReference value for this ReservationResponse.
     * 
     * @return clientReservationReference
     */
    public java.lang.String getClientReservationReference() {
        return clientReservationReference;
    }


    /**
     * Sets the clientReservationReference value for this ReservationResponse.
     * 
     * @param clientReservationReference
     */
    public void setClientReservationReference(java.lang.String clientReservationReference) {
        this.clientReservationReference = clientReservationReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationResponse)) return false;
        ReservationResponse other = (ReservationResponse) obj;
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
            this.reservationId == other.getReservationId() &&
            ((this.reservationCode==null && other.getReservationCode()==null) || 
             (this.reservationCode!=null &&
              this.reservationCode.equals(other.getReservationCode()))) &&
            ((this.createdOn==null && other.getCreatedOn()==null) || 
             (this.createdOn!=null &&
              this.createdOn.equals(other.getCreatedOn()))) &&
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
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.languge==null && other.getLanguge()==null) || 
             (this.languge!=null &&
              this.languge.equals(other.getLanguge()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.amountDue==null && other.getAmountDue()==null) || 
             (this.amountDue!=null &&
              this.amountDue.equals(other.getAmountDue()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.agencyReference==null && other.getAgencyReference()==null) || 
             (this.agencyReference!=null &&
              this.agencyReference.equals(other.getAgencyReference()))) &&
            ((this.hotels==null && other.getHotels()==null) || 
             (this.hotels!=null &&
              java.util.Arrays.equals(this.hotels, other.getHotels()))) &&
            ((this.cars==null && other.getCars()==null) || 
             (this.cars!=null &&
              java.util.Arrays.equals(this.cars, other.getCars()))) &&
            ((this.transfers==null && other.getTransfers()==null) || 
             (this.transfers!=null &&
              java.util.Arrays.equals(this.transfers, other.getTransfers()))) &&
            ((this.excursions==null && other.getExcursions()==null) || 
             (this.excursions!=null &&
              java.util.Arrays.equals(this.excursions, other.getExcursions()))) &&
            ((this.roundtrip==null && other.getRoundtrip()==null) || 
             (this.roundtrip!=null &&
              this.roundtrip.equals(other.getRoundtrip()))) &&
            ((this.paymentResponse==null && other.getPaymentResponse()==null) || 
             (this.paymentResponse!=null &&
              this.paymentResponse.equals(other.getPaymentResponse()))) &&
            ((this.clientReservationReference==null && other.getClientReservationReference()==null) || 
             (this.clientReservationReference!=null &&
              this.clientReservationReference.equals(other.getClientReservationReference())));
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
        _hashCode += getReservationId();
        if (getReservationCode() != null) {
            _hashCode += getReservationCode().hashCode();
        }
        if (getCreatedOn() != null) {
            _hashCode += getCreatedOn().hashCode();
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
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getLanguge() != null) {
            _hashCode += getLanguge().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAmountDue() != null) {
            _hashCode += getAmountDue().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAgencyReference() != null) {
            _hashCode += getAgencyReference().hashCode();
        }
        if (getHotels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHotels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHotels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCars() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCars());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCars(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransfers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransfers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransfers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcursions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcursions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcursions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoundtrip() != null) {
            _hashCode += getRoundtrip().hashCode();
        }
        if (getPaymentResponse() != null) {
            _hashCode += getPaymentResponse().hashCode();
        }
        if (getClientReservationReference() != null) {
            _hashCode += getClientReservationReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BaseResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ResponseBase"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("createdOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CreatedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Languge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountDue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "AmountDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("hotels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Hotels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelReservationResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelReservationResponse"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Cars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarReservationResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarReservationResponse"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transfers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Transfers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferReservationResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferReservationResponse"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excursions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Excursions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionReservationResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionReservationResponse"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundtrip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Roundtrip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripReservationResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PaymentResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationPaymentResponse"));
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
