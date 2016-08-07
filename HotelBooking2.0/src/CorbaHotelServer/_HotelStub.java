package CorbaHotelServer;

public class _HotelStub extends org.omg.CORBA.portable.ObjectImpl implements
		Hotel {

	public String book(String str) {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("book", true);
			$out.write_string(str);
			$in = _invoke($out);
			String $result = $in.read_string();
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return book(str);
		} finally {
			_releaseReply($in);
		}
	} // cities

	public boolean order(String str) {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("order", true);
			$out.write_string(str);
			$in = _invoke($out);
			String $result = $in.read_string();
			if ($result.equals("true")){
				return true;
			} else {
				return false;
			}
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return order(str);
		} finally {
			_releaseReply($in);
		}
	} // hotels

	public boolean delete(String orderid) {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("delete", true);
			$out.write_string(orderid);
			$in = _invoke($out);
			String $result = $in.read_string();
			if ($result.equals("true")){
				return true;
			} else {
				return false;
			}
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return delete(orderid);
		} finally {
			_releaseReply($in);
		}
	} // rates

	// Type-specific CORBA::Object operations
	private static String[] __ids = { "IDL:CorbaHotelServer/Hotel:1.0" };

	public String[] _ids() {
		return (String[]) __ids.clone();
	}

	private void readObject(java.io.ObjectInputStream s)
			throws java.io.IOException {
		String str = s.readUTF();
		String[] args = null;
		java.util.Properties props = null;
		org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, props);
		try {
			org.omg.CORBA.Object obj = orb.string_to_object(str);
			org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)
					._get_delegate();
			_set_delegate(delegate);
		} finally {
			orb.destroy();
		}
	}

	private void writeObject(java.io.ObjectOutputStream s)
			throws java.io.IOException {
		String[] args = null;
		java.util.Properties props = null;
		org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, props);
		try {
			String str = orb.object_to_string(this);
			s.writeUTF(str);
		} finally {
			orb.destroy();
		}
	}
} // class _HotelStub

