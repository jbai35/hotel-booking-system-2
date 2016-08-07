package CorbaHotelServer;

public interface HotelOperations {
	String book(String str) throws Exception;

	boolean order(String str) throws Exception;

	boolean delete(String orderid) throws Exception;
} // interface HotelOperations