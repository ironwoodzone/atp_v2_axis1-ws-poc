import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.jws.HandlerChain;
import javax.xml.namespace.QName;
import javax.xml.rpc.handler.HandlerInfo;
import javax.xml.rpc.handler.HandlerRegistry;

import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis2.util.XMLPrettyPrinter;

import com.bookcyprus.webservicesV2.EBookingServiceSoapStub;
import com.bookcyprus.webservicesV2.HotelAvailabilityRequest;
import com.bookcyprus.webservicesV2.HotelAvailabilityResponse;
import com.bookcyprus.webservicesV2.HotelOccupancy;
import com.bookcyprus.webservicesV2.HotelService;
import com.bookcyprus.webservicesV2.MyHandler;
import com.bookcyprus.webservicesV2.RequestBase;

public class AtpWSClientTest {

	public static void main(String[] args) throws Exception {

		AtpWSClientTest atpWSClientTest = new AtpWSClientTest();
		atpWSClientTest.send();

	}

	public void send() throws Exception {

		long smili = System.currentTimeMillis();
		
		EBookingServiceSoapStub eBookingServiceSoapStub = new EBookingServiceSoapStub(
				new URL("https://ws-premiere.beta.belugga.net/eBookingService.asmx"),
				null);
		
		
		HotelAvailabilityRequest hotelAvailabilityRequest = new HotelAvailabilityRequest();

		RequestBase requestBase = new RequestBase();
		requestBase.setUserName("premiereservices@testcredentials.com");
		requestBase.setPassword("premservices123");
		requestBase.setCurrency("USD");
		requestBase.setLanguage("EN");

		hotelAvailabilityRequest.setBaseRequest(requestBase);

		Calendar checkIn = new GregorianCalendar(2022, 6, 28, 13, 24, 56);
		Calendar checkout = new GregorianCalendar(2022, 6, 29, 13, 24, 56);

		hotelAvailabilityRequest.setFromDate(checkIn);
		hotelAvailabilityRequest.setToDate(checkout);

		HotelOccupancy[] hotelOccupancies = new HotelOccupancy[1];
		HotelOccupancy hotelOccupancy = new HotelOccupancy();
		hotelOccupancy.setAdults(2);
		hotelOccupancies[0] = hotelOccupancy;
		hotelAvailabilityRequest.setOccupancy(hotelOccupancies);

		hotelAvailabilityRequest.setLocationId(1957);

		try {
			
			HotelAvailabilityResponse hotelAvailabilityResponse = eBookingServiceSoapStub
					.hotelAvailabilitySearch(hotelAvailabilityRequest);
			
			getSOAPResponseXML(eBookingServiceSoapStub);

			System.out.println("hotelAvailabilityResponse : " + hotelAvailabilityResponse);

			HotelService[] hotelServices = hotelAvailabilityResponse.getHotels();
			System.out.println("hotelServices.length : " + hotelServices.length);

			for (int i = 0; i < hotelServices.length; i++) {

				HotelService hotelService = hotelServices[i];
//				System.out.println("send().hotelService.getHotelId() : " + hotelService.getHotelId());
//				System.out.println("send().hotelService.getHotelName() : " + hotelService.getHotelName());

			}
			
		} catch (Exception e) {
			e.printStackTrace();
			Call call = eBookingServiceSoapStub._getCall();
			MessageContext ctx = call.getMessageContext();
			String requestXML = ctx.getRequestMessage().getSOAPPartAsString();
			System.out.println("getSOAPResponseXML().requestXML : " + requestXML);
		}

		
		
		

		long emili = System.currentTimeMillis();

		System.out.println("time taken : " + (emili - smili) / 1000 + "s");

	}

	private String getSOAPResponseXML(Object clientstub) throws Exception {
		
		String returnValue = null;
		
		org.apache.axis.client.Stub stub = (org.apache.axis.client.Stub) clientstub;
		Call call = stub._getCall();
		
		if (call != null) {
			
			MessageContext ctx = call.getMessageContext();
			
			String requestXML = XMLUtil.getPrettyString(ctx.getRequestMessage().getSOAPPartAsString(), 2);
			System.out.println("getSOAPResponseXML().requestXML : " + requestXML);
			
			String responseXML = XMLUtil.getPrettyString(ctx.getResponseMessage().getSOAPPartAsString(), 2);
			System.out.println("getSOAPResponseXML().responseXML : " + responseXML);
			
			// If I registered a handler
			// returnValue = (String) ctx.getProperty( ClientHandler.SOAP_RESPONSE );

			try {
				Message msg = call.getResponseMessage();
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				msg.writeTo(baos);
				returnValue = baos.toString();

			} catch (java.io.IOException ex) {
			} catch (javax.xml.soap.SOAPException ex) {
			}
		}
		return returnValue;
	}

}