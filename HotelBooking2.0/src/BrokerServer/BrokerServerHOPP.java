package BrokerServer;

import java.rmi.*;
import java.rmi.server.*;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;
import CorbaHotelServer.HotelHelper;
import DAO.*;
import HotelCommon.Hotel;
import BrokerCommon.Broker;

public class BrokerServerHOPP extends UnicastRemoteObject implements Broker, Hotel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BrokerServerHOPP() throws RemoteException

	{
		// No action needed here.
	}
	
	//Corba
	
	CorbaHotelServer.Hotel hotelRef;
	
	String args[] = {"¨CORBInitialPort", "1235"};

	public void setup(String[] args) {
		try {
			//
			ORB orb = ORB.init(args, null);
			org.omg.CORBA.Object objectRef = orb
					.resolve_initial_references("NameService");
			NamingContext namingContext = NamingContextHelper.narrow(objectRef);
			NameComponent nameComp = new NameComponent(
					"CorbaHotelServer.Hotel", "");
			NameComponent[] path = { nameComp };
			// Re-use existing object reference...
			objectRef = namingContext.resolve(path);
			hotelRef = HotelHelper.narrow(objectRef);
		} catch (java.lang.Exception ex) {
			System.out.println("*** Client error! ***");
			ex.printStackTrace();
		}
	}

	//RMI
	
	private Hotel proxy;
	
	public void getRMIconnection(int port){
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		try {
			// Obtain a reference to the object from the
			// registry and typecast it into the appropriate
			// type...
			if (port == 18892) {
			proxy = (Hotel) Naming.lookup("rmi://localhost:18892/Hilton");
			// Use the above reference to invoke the remote
			// object's method...
			} else if (port == 18893) {
			proxy = (Hotel) Naming.lookup("rmi://localhost:18893/Chevron");
			// Use the above reference to invoke the remote
			// object's method...
			} else if (port == 18896) {
			proxy = (Hotel) Naming.lookup("rmi://localhost:18896/Regent");
			// Use the above reference to invoke the remote
			// object's method...
			}
		} catch (ConnectException conEx) {
			conEx.printStackTrace();
			System.out.println("Unable to connect to hotel server!");
			System.exit(1);
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			System.exit(1);
		}
	}
	
	//WebService
	
	
	//logic realize

	DBManage dbmanage = new DBManage();
	
	public void quit() throws RemoteException {
	}

	public boolean logIn(String userID, String psw) throws java.lang.Exception {
		return dbmanage.logIn(userID, psw);
	}

	public boolean register(String userID, String psw) throws java.lang.Exception {
		return dbmanage.register(userID, psw);
	}

	public String query() throws java.lang.Exception{
		return dbmanage.query();
	}

	public String queryhotel(String line) throws java.lang.Exception {
		return dbmanage.queryhotel(line);
	}
	
	public String manage(String str) throws java.lang.Exception {
		return dbmanage.manage(str);
	}
	
	public String book(String str) throws java.lang.Exception {
		int port = dbmanage.getbookPort(str);
		String middle = dbmanage.getbookMiddle(str);
		System.out.println(middle);
		if (middle.equals("RMI")){
			getRMIconnection(port);
			return proxy.book(str);
		} else if (middle.equals("CORBA")){
			setup(args);
			return hotelRef.book(str);
		} else {
			return "ERROR";
		}
	}
	
	public boolean order(String str) throws java.lang.Exception {
		int port = dbmanage.getorderPort(str);
		String middle = dbmanage.getorderMiddle(str);
		if (middle.equals("RMI")){
			getRMIconnection(port);
			return proxy.order(str);
		} else if (middle.equals("CORBA")){
			setup(args);
			return hotelRef.order(str);
		} else{
			return false;
		}
	}

	public boolean delete(String orderid) throws java.lang.Exception {
		int port = dbmanage.getdeletePort(orderid);
		String middle = dbmanage.getdeleteMiddle(orderid);
		if (middle.equals("RMI")){
			getRMIconnection(port);
			return proxy.delete(orderid);
		} else if (middle.equals("CORBA")){
			setup(args);
			return hotelRef.delete(orderid);
		} else {
			return false;
		}
	}

}