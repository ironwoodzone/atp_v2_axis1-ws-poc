/**
 * EBookingServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookcyprus.webservicesV2;

public interface EBookingServiceSoap extends java.rmi.Remote {
    public com.bookcyprus.webservicesV2.HotelAvailabilityResponse hotelAvailabilitySearch(com.bookcyprus.webservicesV2.HotelAvailabilityRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.CarAvailabilityResponse carAvailabilitySearch(com.bookcyprus.webservicesV2.CarAvailabilityRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.TransferAvailabilityResponse transferAvailabilitySearch(com.bookcyprus.webservicesV2.TransferAvailabilityRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.BookingConditionsResponse getBookingConditions(com.bookcyprus.webservicesV2.BookingConditionsRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.ReservationResponse makeReservation(com.bookcyprus.webservicesV2.ReservationRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.ReservationResponse cancelReservation(com.bookcyprus.webservicesV2.ReservationCancelRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.ReservationResponse getReservation(com.bookcyprus.webservicesV2.ReservationRetrieveRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.ReservationListRetrieveResponse getReservationList(com.bookcyprus.webservicesV2.ReservationListRetrieveRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.ReservationResponse payReservation(com.bookcyprus.webservicesV2.ReservationPaymentRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.ReservationResponse updateReservationClientDetails(com.bookcyprus.webservicesV2.ReservationCustomerUpdateRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.AccountDetailsResponse getAccountDetails(com.bookcyprus.webservicesV2.AccountDetailsRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.SupplierCancellationPolicyResponse getSupplierCancellationPolicy(com.bookcyprus.webservicesV2.SupplierCancellationPolicyRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.ExcursionAvailabilityResponse excursionAvailabilitySearch(com.bookcyprus.webservicesV2.ExcursionAvailabilityRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.ExcursionSearchLocationResponse getExcursionSearchLocations(com.bookcyprus.webservicesV2.ExcursionSearchLocationRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.ExcursionPriceResponse getExcursionPrice(com.bookcyprus.webservicesV2.ExcursionPriceRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.TransferSearchLocationResponse getTransferSearchLocations(com.bookcyprus.webservicesV2.TransferSearchLocationRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.RoundtripListResponse roundtripList(com.bookcyprus.webservicesV2.RoundtripListRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.RoundtripInfoResponse roundtripInfo(com.bookcyprus.webservicesV2.RoundtripInfoRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.RoundtripAvailabilityResponse roundtripAvailability(com.bookcyprus.webservicesV2.RoundtripAvailabilityRequest rq) throws java.rmi.RemoteException;
    public com.bookcyprus.webservicesV2.RoundtripExtendedAvailabilityResponse roundtripExtendedAvailability(com.bookcyprus.webservicesV2.RoundtripExtendedAvailabilityRequest rq) throws java.rmi.RemoteException;
}
