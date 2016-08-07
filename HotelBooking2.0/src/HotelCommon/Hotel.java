package HotelCommon;

import java.rmi.RemoteException;

public interface Hotel extends java.rmi.Remote {

	public String book(String str) throws RemoteException, Exception;
	
	public boolean order(String str) throws RemoteException, Exception;
	
	public boolean delete(String orderid) throws RemoteException, Exception;
	
}