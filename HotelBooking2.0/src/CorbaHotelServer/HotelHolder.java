package CorbaHotelServer;

public final class HotelHolder implements org.omg.CORBA.portable.Streamable {
	public Hotel value = null;

	public HotelHolder() {
	}

	public HotelHolder(Hotel initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = HotelHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		HotelHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return HotelHelper.type();
	}

}
