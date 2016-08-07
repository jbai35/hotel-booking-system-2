package CorbaHotelServer;

@SuppressWarnings("unchecked")
public abstract class _HotelImplBase extends org.omg.CORBA.portable.ObjectImpl
		implements Hotel,
		org.omg.CORBA.portable.InvokeHandler {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Constructors
	public _HotelImplBase() {
	}

	@SuppressWarnings("rawtypes")
	private static java.util.Hashtable _methods = new java.util.Hashtable();
	static {
		_methods.put("book", new java.lang.Integer(0));
		_methods.put("order", new java.lang.Integer(1));
		_methods.put("delete", new java.lang.Integer(2));
	}

	public org.omg.CORBA.portable.OutputStream _invoke(String $method,
			org.omg.CORBA.portable.InputStream in,
			org.omg.CORBA.portable.ResponseHandler $rh) {
		org.omg.CORBA.portable.OutputStream out = null;
		java.lang.Integer __method = (java.lang.Integer) _methods.get($method);
		if (__method == null)
			throw new org.omg.CORBA.BAD_OPERATION(0,
					org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

		switch (__method.intValue()) {
		case 0: // book
		{
			String str = in.read_string();
			String $result = null;
			try {
				$result = this.book(str);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out = $rh.createReply();
			out.write_string($result);
			break;
		}

		case 1: // order
		{
			String str = in.read_string();
			boolean $result;
			String $result1 = null;
			try {
				$result = this.order(str);
				if($result) {
					$result1 = "true";
				} else {
					$result1 = "false";
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out = $rh.createReply();
			out.write_string($result1);
			break;
		}

		case 2: // delete
		{
			String orderid = in.read_string();
			boolean $result;
			String $result1 = null;
			try {
				$result = this.delete(orderid);
				if($result) {
					$result1 = "true";
				} else {
					$result1 = "false";
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out = $rh.createReply();
			out.write_string($result1);
			break;
		}

		default:
			throw new org.omg.CORBA.BAD_OPERATION(0,
					org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
		}

		return out;
	} // _invoke

	// Type-specific CORBA::Object operations
	private static String[] __ids = { "IDL:CorbaHotelServer/Hotel:1.0" };

	public String[] _ids() {
		return (String[]) __ids.clone();
	}

} // class _HotelImplBase
