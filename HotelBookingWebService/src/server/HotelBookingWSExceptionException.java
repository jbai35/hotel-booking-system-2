
/**
 * HotelBookingWSExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package server;

public class HotelBookingWSExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1432015349429L;
    
    private server.HotelBookingWSException faultMessage;

    
        public HotelBookingWSExceptionException() {
            super("HotelBookingWSExceptionException");
        }

        public HotelBookingWSExceptionException(java.lang.String s) {
           super(s);
        }

        public HotelBookingWSExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public HotelBookingWSExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(server.HotelBookingWSException msg){
       faultMessage = msg;
    }
    
    public server.HotelBookingWSException getFaultMessage(){
       return faultMessage;
    }
}
    