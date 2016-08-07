package client;

import java.rmi.*;
import org.apache.axis2.AxisFault;
import server.*;

public class HotelClientHOPP {

	HotelBookingWS ws;

	public HotelClientHOPP() throws AxisFault {
		// TODO Auto-generated constructor stub
		ws = new HotelBookingWSStub();
	}

	public void quit() throws RemoteException {
		Quit q = new Quit();
		ws.quit(q);
	}

	public boolean logIn(String userID, String psw) throws RemoteException,
			HotelBookingWSExceptionException {
		LogIn l = new LogIn();
		l.setUserID(userID);
		l.setPsw(psw);
		LogInResponse lr = ws.logIn(l);
		return lr.get_return();
	}

	public boolean register(String userID, String psw) throws RemoteException,
			HotelBookingWSExceptionException {
		Register r = new Register();
		r.setUserID(userID);
		r.setPsw(psw);
		RegisterResponse rr = ws.register(r);
		return rr.get_return();
	}

	public String query() throws RemoteException,
			HotelBookingWSExceptionException {
		Query q = new Query();
		QueryResponse qr = ws.query(q);
		return qr.get_return();
	}

	public String queryhotel(String line) throws RemoteException,
			HotelBookingWSExceptionException {
		Queryhotel q = new Queryhotel();
		q.setLine(line);
		QueryhotelResponse qr = ws.queryhotel(q);
		return qr.get_return();
	}

	public String manage(String str) throws RemoteException,
			HotelBookingWSExceptionException {
		Manage m = new Manage();
		m.setStr(str);
		ManageResponse mr = ws.manage(m);
		return mr.get_return();
	}

	public String book(String str) throws RemoteException,
			HotelBookingWSExceptionException {
		Book b = new Book();
		b.setStr(str);
		BookResponse br = ws.book(b);
		return br.get_return();
	}

	public boolean order(String str) throws RemoteException,
			HotelBookingWSExceptionException {
		Order o = new Order();
		o.setStr(str);
		OrderResponse or = ws.order(o);
		return or.get_return();
	}

	public boolean delete(String orderid) throws RemoteException,
			HotelBookingWSExceptionException {
		Delete d = new Delete();
		d.setOrderid(orderid);
		DeleteResponse dr = ws.delete(d);
		return dr.get_return();
	}
}
