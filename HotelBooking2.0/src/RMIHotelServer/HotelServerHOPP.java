package RMIHotelServer;

import java.rmi.*;
import java.rmi.server.*;

import DAO.*;
import HotelCommon.*;

public class HotelServerHOPP extends UnicastRemoteObject implements Hotel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HotelServerHOPP() throws RemoteException

	{
		// No action needed here.
	}
	DBManage dbmanage = new DBManage();
	
	public String book(String str) throws Exception {
		return dbmanage.book(str);
	}

	public boolean order(String str) throws Exception {
		return dbmanage.order(str);
	}

	public boolean delete(String orderid) throws Exception {
		return dbmanage.delete(orderid);
	}

}
