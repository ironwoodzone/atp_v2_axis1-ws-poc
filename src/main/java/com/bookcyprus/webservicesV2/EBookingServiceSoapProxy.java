package com.bookcyprus.webservicesV2;

public class EBookingServiceSoapProxy implements com.bookcyprus.webservicesV2.EBookingServiceSoap {
  private String _endpoint = null;
  private com.bookcyprus.webservicesV2.EBookingServiceSoap eBookingServiceSoap = null;
  
  public EBookingServiceSoapProxy() {
    _initEBookingServiceSoapProxy();
  }
  
  public EBookingServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initEBookingServiceSoapProxy();
  }
  
  private void _initEBookingServiceSoapProxy() {
    try {
      eBookingServiceSoap = (new com.bookcyprus.webservicesV2.EBookingServiceLocator()).geteBookingServiceSoap();
      if (eBookingServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)eBookingServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)eBookingServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (eBookingServiceSoap != null)
      ((javax.xml.rpc.Stub)eBookingServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.bookcyprus.webservicesV2.EBookingServiceSoap getEBookingServiceSoap() {
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap;
  }
  
  public com.bookcyprus.webservicesV2.HotelAvailabilityResponse hotelAvailabilitySearch(com.bookcyprus.webservicesV2.HotelAvailabilityRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.hotelAvailabilitySearch(rq);
  }
  
  public com.bookcyprus.webservicesV2.CarAvailabilityResponse carAvailabilitySearch(com.bookcyprus.webservicesV2.CarAvailabilityRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.carAvailabilitySearch(rq);
  }
  
  public com.bookcyprus.webservicesV2.TransferAvailabilityResponse transferAvailabilitySearch(com.bookcyprus.webservicesV2.TransferAvailabilityRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.transferAvailabilitySearch(rq);
  }
  
  public com.bookcyprus.webservicesV2.BookingConditionsResponse getBookingConditions(com.bookcyprus.webservicesV2.BookingConditionsRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.getBookingConditions(rq);
  }
  
  public com.bookcyprus.webservicesV2.ReservationResponse makeReservation(com.bookcyprus.webservicesV2.ReservationRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.makeReservation(rq);
  }
  
  public com.bookcyprus.webservicesV2.ReservationResponse cancelReservation(com.bookcyprus.webservicesV2.ReservationCancelRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.cancelReservation(rq);
  }
  
  public com.bookcyprus.webservicesV2.ReservationResponse getReservation(com.bookcyprus.webservicesV2.ReservationRetrieveRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.getReservation(rq);
  }
  
  public com.bookcyprus.webservicesV2.ReservationListRetrieveResponse getReservationList(com.bookcyprus.webservicesV2.ReservationListRetrieveRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.getReservationList(rq);
  }
  
  public com.bookcyprus.webservicesV2.ReservationResponse payReservation(com.bookcyprus.webservicesV2.ReservationPaymentRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.payReservation(rq);
  }
  
  public com.bookcyprus.webservicesV2.ReservationResponse updateReservationClientDetails(com.bookcyprus.webservicesV2.ReservationCustomerUpdateRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.updateReservationClientDetails(rq);
  }
  
  public com.bookcyprus.webservicesV2.AccountDetailsResponse getAccountDetails(com.bookcyprus.webservicesV2.AccountDetailsRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.getAccountDetails(rq);
  }
  
  public com.bookcyprus.webservicesV2.SupplierCancellationPolicyResponse getSupplierCancellationPolicy(com.bookcyprus.webservicesV2.SupplierCancellationPolicyRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.getSupplierCancellationPolicy(rq);
  }
  
  public com.bookcyprus.webservicesV2.ExcursionAvailabilityResponse excursionAvailabilitySearch(com.bookcyprus.webservicesV2.ExcursionAvailabilityRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.excursionAvailabilitySearch(rq);
  }
  
  public com.bookcyprus.webservicesV2.ExcursionSearchLocationResponse getExcursionSearchLocations(com.bookcyprus.webservicesV2.ExcursionSearchLocationRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.getExcursionSearchLocations(rq);
  }
  
  public com.bookcyprus.webservicesV2.ExcursionPriceResponse getExcursionPrice(com.bookcyprus.webservicesV2.ExcursionPriceRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.getExcursionPrice(rq);
  }
  
  public com.bookcyprus.webservicesV2.TransferSearchLocationResponse getTransferSearchLocations(com.bookcyprus.webservicesV2.TransferSearchLocationRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.getTransferSearchLocations(rq);
  }
  
  public com.bookcyprus.webservicesV2.RoundtripListResponse roundtripList(com.bookcyprus.webservicesV2.RoundtripListRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.roundtripList(rq);
  }
  
  public com.bookcyprus.webservicesV2.RoundtripInfoResponse roundtripInfo(com.bookcyprus.webservicesV2.RoundtripInfoRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.roundtripInfo(rq);
  }
  
  public com.bookcyprus.webservicesV2.RoundtripAvailabilityResponse roundtripAvailability(com.bookcyprus.webservicesV2.RoundtripAvailabilityRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.roundtripAvailability(rq);
  }
  
  public com.bookcyprus.webservicesV2.RoundtripExtendedAvailabilityResponse roundtripExtendedAvailability(com.bookcyprus.webservicesV2.RoundtripExtendedAvailabilityRequest rq) throws java.rmi.RemoteException{
    if (eBookingServiceSoap == null)
      _initEBookingServiceSoapProxy();
    return eBookingServiceSoap.roundtripExtendedAvailability(rq);
  }
  
  
}