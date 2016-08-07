package Client;

import BrokerCommon.*;

import java.rmi.*;
import java.net.MalformedURLException;

public class HotelClientHOPP implements Broker{
	
	private Broker proxy;

	public HotelClientHOPP() throws MalformedURLException,
      NotBoundException, RemoteException {
    // find the object
//	    System.setSecurityManager(new java.rmi.RMISecurityManager());
//	    Registry registry = LocateRegistry.getRegistry();
//	    proxy = (Broker) registry.lookup("Broker");
		
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		try {
			// Obtain a reference to the object from the
			// registry and typecast it into the appropriate
			// type...
			proxy = (Broker) Naming.lookup("rmi://localhost:1011/Broker");
			// Use the above reference to invoke the remote
			// object's method...
			
		} catch (ConnectException conEx) {
			System.out.println("Unable to connect to server!");
			System.exit(1);
		} catch (Exception ex) {

			ex.printStackTrace();
			System.exit(1);
		}
    } 


  public void quit() throws RemoteException {
	  proxy.quit();
  }
  
  public boolean logIn(String userID, String psw) throws Exception {
	  return proxy.logIn(userID, psw);
  }

  public boolean register(String userID, String psw) throws Exception {
	  return proxy.register(userID, psw);
  }
  
  public String query() throws Exception {
	  return proxy.query();
  }
  
  public String queryhotel(String line) throws Exception {
	  return proxy.queryhotel(line);
  }
  
  public String manage(String str) throws Exception {
	  return proxy.manage(str);
  }
  
  public String book(String str) throws Exception {
	  return proxy.book(str);
  }
  
  public boolean order(String str) throws Exception {
	  return proxy.order(str);
  }
  
  public boolean delete(String orderid) throws Exception {
	  return proxy.delete(orderid);
  }
}
