/**
 * EBookingServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

import javax.jws.HandlerChain;

public class EBookingServiceSoapStub extends org.apache.axis.client.Stub implements com.bookcyprus.webservicesV2.EBookingServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[20];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("HotelAvailabilitySearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelAvailabilityRequest"), com.bookcyprus.webservicesV2.HotelAvailabilityRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelAvailabilityResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.HotelAvailabilityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelAvailabilitySearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CarAvailabilitySearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarAvailabilityRequest"), com.bookcyprus.webservicesV2.CarAvailabilityRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarAvailabilityResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.CarAvailabilityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarAvailabilitySearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TransferAvailabilitySearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferAvailabilityRequest"), com.bookcyprus.webservicesV2.TransferAvailabilityRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferAvailabilityResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.TransferAvailabilityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferAvailabilitySearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBookingConditions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingConditionsRequest"), com.bookcyprus.webservicesV2.BookingConditionsRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingConditionsResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.BookingConditionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GetBookingConditionsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MakeReservation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationRequest"), com.bookcyprus.webservicesV2.ReservationRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.ReservationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "MakeReservationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CancelReservation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationCancelRequest"), com.bookcyprus.webservicesV2.ReservationCancelRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.ReservationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CancelReservationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetReservation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationRetrieveRequest"), com.bookcyprus.webservicesV2.ReservationRetrieveRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.ReservationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GetReservationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetReservationList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationListRetrieveRequest"), com.bookcyprus.webservicesV2.ReservationListRetrieveRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationListRetrieveResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.ReservationListRetrieveResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GetReservationListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PayReservation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationPaymentRequest"), com.bookcyprus.webservicesV2.ReservationPaymentRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.ReservationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PayReservationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateReservationClientDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationCustomerUpdateRequest"), com.bookcyprus.webservicesV2.ReservationCustomerUpdateRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.ReservationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "UpdateReservationClientDetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccountDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "AccountDetailsRequest"), com.bookcyprus.webservicesV2.AccountDetailsRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "AccountDetailsResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.AccountDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GetAccountDetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSupplierCancellationPolicy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SupplierCancellationPolicyRequest"), com.bookcyprus.webservicesV2.SupplierCancellationPolicyRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SupplierCancellationPolicyResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.SupplierCancellationPolicyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GetSupplierCancellationPolicyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExcursionAvailabilitySearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionAvailabilityRequest"), com.bookcyprus.webservicesV2.ExcursionAvailabilityRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionAvailabilityResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.ExcursionAvailabilityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionAvailabilitySearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetExcursionSearchLocations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionSearchLocationRequest"), com.bookcyprus.webservicesV2.ExcursionSearchLocationRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionSearchLocationResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.ExcursionSearchLocationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GetExcursionSearchLocationsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetExcursionPrice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionPriceRequest"), com.bookcyprus.webservicesV2.ExcursionPriceRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionPriceResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.ExcursionPriceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GetExcursionPriceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTransferSearchLocations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferSearchLocationRequest"), com.bookcyprus.webservicesV2.TransferSearchLocationRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferSearchLocationResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.TransferSearchLocationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GetTransferSearchLocationsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RoundtripList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripListRequest"), com.bookcyprus.webservicesV2.RoundtripListRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripListResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.RoundtripListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RoundtripInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripInfoRequest"), com.bookcyprus.webservicesV2.RoundtripInfoRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripInfoResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.RoundtripInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RoundtripAvailability");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripAvailabilityRequest"), com.bookcyprus.webservicesV2.RoundtripAvailabilityRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripAvailabilityResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.RoundtripAvailabilityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripAvailabilityResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RoundtripExtendedAvailability");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "rq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripExtendedAvailabilityRequest"), com.bookcyprus.webservicesV2.RoundtripExtendedAvailabilityRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripExtendedAvailabilityResponse"));
        oper.setReturnClass(com.bookcyprus.webservicesV2.RoundtripExtendedAvailabilityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripExtendedAvailabilityResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    public EBookingServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public EBookingServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public EBookingServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "AccountDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.AccountDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "AccountDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.AccountDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfBookingConditionItem");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.BookingConditionItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingConditionItem");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingConditionItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfBookingConditionItemDetail");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.BookingConditionItemDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingConditionItemDetail");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingConditionItemDetail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfCancellationPolicyResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.CancellationPolicyResponse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CancellationPolicyResponse");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CancellationPolicyResponse");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfCarGroup");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.CarGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarGroup");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfCarGroupSupplement");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.CarGroupSupplement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarGroupSupplement");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarGroupSupplement");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfCarReservationRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.CarReservationRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarReservationRequest");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarReservationRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfCarReservationResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.CarReservationResponse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarReservationResponse");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarReservationResponse");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfCarService");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.CarService[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarService");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarService");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfCarVehicle");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.CarVehicle[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarVehicle");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarVehicle");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfDepartureDate");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.DepartureDate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "DepartureDate");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "DepartureDate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfEssentialInformationDetail");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.EssentialInformationDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "EssentialInformationDetail");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "EssentialInformationDetail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfExcursionDate");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionDate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionDate");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionDate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfExcursionGrade");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionGrade[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionGrade");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionGrade");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfExcursionGradeLanguage");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionGradeLanguage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionGradeLanguage");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionGradeLanguage");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfExcursionPassenger");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionPassenger[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionPassenger");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionPassenger");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfExcursionQuestion");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionQuestion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionQuestion");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionQuestion");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfExcursionQuestionAnswer");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionQuestionAnswer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionQuestionAnswer");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionQuestionAnswer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfExcursionReservationRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionReservationRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionReservationRequest");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionReservationRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfExcursionReservationResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionReservationResponse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionReservationResponse");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionReservationResponse");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfExcursionSearchLocation");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionSearchLocation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionSearchLocation");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionSearchLocation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfExcursionService");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionService[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionService");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionService");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfExcursionStartTime");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionStartTime[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionStartTime");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionStartTime");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfHotelOccupancy");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.HotelOccupancy[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelOccupancy");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelOccupancy");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfHotelReservationRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.HotelReservationRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelReservationRequest");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelReservationRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfHotelReservationResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.HotelReservationResponse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelReservationResponse");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelReservationResponse");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfHotelResult");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.HotelResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelResult");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfHotelResultRoom");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.HotelResultRoom[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelResultRoom");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelResultRoom");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfHotelService");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.HotelService[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelService");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelService");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfHotelServiceMedia");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.HotelServiceMedia[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelServiceMedia");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelServiceMedia");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "int");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfItinerary");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.Itinerary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Itinerary");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Itinerary");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfItineraryService");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ItineraryService[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ItineraryService");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ItineraryService");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfLanguage");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.Language[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Language");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Language");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfMedia");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.Media[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Media");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Media");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfPrepaymentPolicyResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.PrepaymentPolicyResponse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PrepaymentPolicyResponse");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PrepaymentPolicyResponse");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfReservationResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ReservationResponse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationResponse");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationResponse");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfRoundtripAvailability");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripAvailability[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripAvailability");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripAvailability");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfRoundtripListItem");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripListItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripListItem");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfRoundtripLocation");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripLocation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripLocation");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripLocation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfRoundtripResult");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripResult");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfRoundtripType");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripType");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfServiceRate");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ServiceRate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ServiceRate");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ServiceRate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfServiceRateDetail");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ServiceRateDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ServiceRateDetail");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ServiceRateDetail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfSupplierCancellationPolicyItem");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.SupplierCancellationPolicyItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SupplierCancellationPolicyItem");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SupplierCancellationPolicyItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfTransferLocation");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.TransferLocation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferLocation");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferLocation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfTransferReservationRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.TransferReservationRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferReservationRequest");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferReservationRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfTransferReservationResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.TransferReservationResponse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferReservationResponse");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferReservationResponse");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfTransferService");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.TransferService[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferService");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferService");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfTransferVehicle");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.TransferVehicle[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferVehicle");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferVehicle");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ArrayOfTraveller");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.Traveller[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Traveller");
            qName2 = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Traveller");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingConditionItem");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.BookingConditionItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingConditionItemDetail");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.BookingConditionItemDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingConditionsRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.BookingConditionsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "BookingConditionsResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.BookingConditionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CancellationPolicyResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.CancellationPolicyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarAvailabilityRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.CarAvailabilityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarAvailabilityResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.CarAvailabilityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarGroup");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.CarGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarGroupSupplement");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.CarGroupSupplement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarReservationRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.CarReservationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarReservationResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.CarReservationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarService");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.CarService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarVehicle");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.CarVehicle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ClientNationalityInfo");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ClientNationalityInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "DepartureDate");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.DepartureDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "EssentialInformationDetail");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.EssentialInformationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionAvailabilityRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionAvailabilityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionAvailabilityResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionAvailabilityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionDate");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionGrade");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionGrade.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionGradeLanguage");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionGradeLanguage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionItineraryService");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionItineraryService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionPassenger");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionPassenger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionPrice");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionPrice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionPriceRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionPriceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionPriceResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionPriceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionQuestion");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionQuestion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionQuestionAnswer");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionQuestionAnswer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionReservationRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionReservationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionReservationResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionReservationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionSearchLocation");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionSearchLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionSearchLocationRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionSearchLocationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionSearchLocationResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionSearchLocationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionService");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionStartTime");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ExcursionStartTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelAvailabilityRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.HotelAvailabilityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelAvailabilityResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.HotelAvailabilityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelItineraryService");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.HotelItineraryService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelOccupancy");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.HotelOccupancy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelReservationRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.HotelReservationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelReservationResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.HotelReservationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelResult");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.HotelResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelResultRoom");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.HotelResultRoom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelService");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.HotelService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelServiceExtented");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.HotelServiceExtented.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelServiceMedia");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.HotelServiceMedia.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Itinerary");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.Itinerary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ItineraryService");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ItineraryService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Language");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.Language.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Location");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.Location.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Media");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.Media.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "MiscellaneousItineraryService");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.MiscellaneousItineraryService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PaymentMethodCode");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.PaymentMethodCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PrepaymentPolicyResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.PrepaymentPolicyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RequestBase");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RequestBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationCancelRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ReservationCancelRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationClientDetails");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ReservationClientDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationCustomerUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ReservationCustomerUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationListRetrieveRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ReservationListRetrieveRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationListRetrieveResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ReservationListRetrieveResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationPaymentRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ReservationPaymentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationPaymentResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ReservationPaymentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ReservationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ReservationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ReservationRetrieveRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ReservationRetrieveRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ResponseBase");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ResponseBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ResponseCode");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ResponseCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripAvailability");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripAvailability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripAvailabilityRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripAvailabilityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripAvailabilityResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripAvailabilityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripExtendedAvailabilityRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripExtendedAvailabilityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripExtendedAvailabilityResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripExtendedAvailabilityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripGroup");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripInfoItem");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripInfoItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripListItem");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripListItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripListRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripListResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripLocation");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripReservationRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripReservationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripReservationResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripReservationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripResult");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripType");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.RoundtripType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ServiceRate");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ServiceRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ServiceRateDetail");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.ServiceRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SupplierCancellationPolicyItem");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.SupplierCancellationPolicyItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SupplierCancellationPolicyRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.SupplierCancellationPolicyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "SupplierCancellationPolicyResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.SupplierCancellationPolicyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferAvailabilityRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.TransferAvailabilityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferAvailabilityResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.TransferAvailabilityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferItineraryService");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.TransferItineraryService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferLocation");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.TransferLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferReservationData");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.TransferReservationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferReservationRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.TransferReservationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferReservationResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.TransferReservationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferSearchLocationRequest");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.TransferSearchLocationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferSearchLocationResponse");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.TransferSearchLocationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferService");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.TransferService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferVehicle");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.TransferVehicle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "Traveller");
            cachedSerQNames.add(qName);
            cls = com.bookcyprus.webservicesV2.Traveller.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.bookcyprus.webservicesV2.HotelAvailabilityResponse hotelAvailabilitySearch(com.bookcyprus.webservicesV2.HotelAvailabilityRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/HotelAvailabilitySearch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "HotelAvailabilitySearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.HotelAvailabilityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.HotelAvailabilityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.HotelAvailabilityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.CarAvailabilityResponse carAvailabilitySearch(com.bookcyprus.webservicesV2.CarAvailabilityRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/CarAvailabilitySearch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CarAvailabilitySearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.CarAvailabilityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.CarAvailabilityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.CarAvailabilityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.TransferAvailabilityResponse transferAvailabilitySearch(com.bookcyprus.webservicesV2.TransferAvailabilityRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/TransferAvailabilitySearch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "TransferAvailabilitySearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.TransferAvailabilityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.TransferAvailabilityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.TransferAvailabilityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.BookingConditionsResponse getBookingConditions(com.bookcyprus.webservicesV2.BookingConditionsRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/GetBookingConditions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GetBookingConditions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.BookingConditionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.BookingConditionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.BookingConditionsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.ReservationResponse makeReservation(com.bookcyprus.webservicesV2.ReservationRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/MakeReservation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "MakeReservation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.ReservationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.ReservationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.ReservationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.ReservationResponse cancelReservation(com.bookcyprus.webservicesV2.ReservationCancelRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/CancelReservation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "CancelReservation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.ReservationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.ReservationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.ReservationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.ReservationResponse getReservation(com.bookcyprus.webservicesV2.ReservationRetrieveRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/GetReservation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GetReservation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.ReservationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.ReservationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.ReservationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.ReservationListRetrieveResponse getReservationList(com.bookcyprus.webservicesV2.ReservationListRetrieveRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/GetReservationList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GetReservationList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.ReservationListRetrieveResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.ReservationListRetrieveResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.ReservationListRetrieveResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.ReservationResponse payReservation(com.bookcyprus.webservicesV2.ReservationPaymentRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/PayReservation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "PayReservation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.ReservationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.ReservationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.ReservationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.ReservationResponse updateReservationClientDetails(com.bookcyprus.webservicesV2.ReservationCustomerUpdateRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/UpdateReservationClientDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "UpdateReservationClientDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.ReservationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.ReservationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.ReservationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.AccountDetailsResponse getAccountDetails(com.bookcyprus.webservicesV2.AccountDetailsRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/GetAccountDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GetAccountDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.AccountDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.AccountDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.AccountDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.SupplierCancellationPolicyResponse getSupplierCancellationPolicy(com.bookcyprus.webservicesV2.SupplierCancellationPolicyRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/GetSupplierCancellationPolicy");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GetSupplierCancellationPolicy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.SupplierCancellationPolicyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.SupplierCancellationPolicyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.SupplierCancellationPolicyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.ExcursionAvailabilityResponse excursionAvailabilitySearch(com.bookcyprus.webservicesV2.ExcursionAvailabilityRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/ExcursionAvailabilitySearch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "ExcursionAvailabilitySearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.ExcursionAvailabilityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.ExcursionAvailabilityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.ExcursionAvailabilityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.ExcursionSearchLocationResponse getExcursionSearchLocations(com.bookcyprus.webservicesV2.ExcursionSearchLocationRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/GetExcursionSearchLocations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GetExcursionSearchLocations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.ExcursionSearchLocationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.ExcursionSearchLocationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.ExcursionSearchLocationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.ExcursionPriceResponse getExcursionPrice(com.bookcyprus.webservicesV2.ExcursionPriceRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/GetExcursionPrice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GetExcursionPrice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.ExcursionPriceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.ExcursionPriceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.ExcursionPriceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.TransferSearchLocationResponse getTransferSearchLocations(com.bookcyprus.webservicesV2.TransferSearchLocationRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/GetTransferSearchLocations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "GetTransferSearchLocations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.TransferSearchLocationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.TransferSearchLocationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.TransferSearchLocationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.RoundtripListResponse roundtripList(com.bookcyprus.webservicesV2.RoundtripListRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/RoundtripList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.RoundtripListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.RoundtripListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.RoundtripListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.RoundtripInfoResponse roundtripInfo(com.bookcyprus.webservicesV2.RoundtripInfoRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/RoundtripInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.RoundtripInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.RoundtripInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.RoundtripInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.RoundtripAvailabilityResponse roundtripAvailability(com.bookcyprus.webservicesV2.RoundtripAvailabilityRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/RoundtripAvailability");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripAvailability"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.RoundtripAvailabilityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.RoundtripAvailabilityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.RoundtripAvailabilityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bookcyprus.webservicesV2.RoundtripExtendedAvailabilityResponse roundtripExtendedAvailability(com.bookcyprus.webservicesV2.RoundtripExtendedAvailabilityRequest rq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservicesV2.bookcyprus.com/RoundtripExtendedAvailability");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservicesV2.bookcyprus.com/", "RoundtripExtendedAvailability"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bookcyprus.webservicesV2.RoundtripExtendedAvailabilityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bookcyprus.webservicesV2.RoundtripExtendedAvailabilityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bookcyprus.webservicesV2.RoundtripExtendedAvailabilityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
