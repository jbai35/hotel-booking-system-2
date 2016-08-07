package CorbaHotelServer;
import DAO.*;

public class HotelServant extends _HotelImplBase {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
