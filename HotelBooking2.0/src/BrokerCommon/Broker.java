package BrokerCommon;

import java.rmi.RemoteException;

public interface Broker extends java.rmi.Remote {
	
	public void quit() throws RemoteException;
	
	public boolean logIn(String userID, String psw) throws RemoteException, Exception;
	
	public boolean register(String userID, String psw) throws RemoteException, Exception;
	
	public String query() throws RemoteException, Exception;
	
	public String queryhotel(String line) throws RemoteException, Exception;

	public String book(String str) throws RemoteException, Exception;
	
	public boolean order(String str) throws RemoteException, Exception;
	
	public String manage(String str) throws RemoteException, Exception;
	
	public boolean delete(String orderid) throws RemoteException, Exception;
	
}
