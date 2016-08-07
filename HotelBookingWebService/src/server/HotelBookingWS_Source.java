package server;

import DAO.DBManage;

public class HotelBookingWS_Source {

	DBManage dbmanage = new DBManage();

	public void quit(){
        //do nothing
	}

	public boolean logIn(String userID, String psw) throws java.lang.Exception {
		return dbmanage.logIn(userID, psw);
	}

	public boolean register(String userID, String psw) throws java.lang.Exception {
		return dbmanage.register(userID, psw);
	}

	public String query() throws java.lang.Exception {
		return dbmanage.query();
	}

	public String queryhotel(String line) throws java.lang.Exception {
		return dbmanage.queryhotel(line);
	}

	public String manage(String str) throws java.lang.Exception {
		return dbmanage.manage(str);
	}

	public String book(String str) throws java.lang.Exception {
		return dbmanage.book(str);
	}

	public boolean order(String str) throws java.lang.Exception {
		return dbmanage.order(str);
	}

	public boolean delete(String orderid) throws java.lang.Exception {
		return dbmanage.delete(orderid);
	}
}
