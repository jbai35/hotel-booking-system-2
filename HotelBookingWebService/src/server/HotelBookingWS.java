

/**
 * HotelBookingWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package server;

    /*
     *  HotelBookingWS java interface
     */

    public interface HotelBookingWS {
          

        /**
          * Auto generated method signature
          * 
                    * @param register0
                
             * @throws server.HotelBookingWSExceptionException : 
         */

         
                     public server.RegisterResponse register(

                        server.Register register0)
                        throws java.rmi.RemoteException
             
          ,server.HotelBookingWSExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param register0
            
          */
        public void startregister(

            server.Register register0,

            final server.HotelBookingWSCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param order2
                
             * @throws server.HotelBookingWSExceptionException : 
         */

         
                     public server.OrderResponse order(

                        server.Order order2)
                        throws java.rmi.RemoteException
             
          ,server.HotelBookingWSExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param order2
            
          */
        public void startorder(

            server.Order order2,

            final server.HotelBookingWSCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param manage4
                
             * @throws server.HotelBookingWSExceptionException : 
         */

         
                     public server.ManageResponse manage(

                        server.Manage manage4)
                        throws java.rmi.RemoteException
             
          ,server.HotelBookingWSExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param manage4
            
          */
        public void startmanage(

            server.Manage manage4,

            final server.HotelBookingWSCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param logIn6
                
             * @throws server.HotelBookingWSExceptionException : 
         */

         
                     public server.LogInResponse logIn(

                        server.LogIn logIn6)
                        throws java.rmi.RemoteException
             
          ,server.HotelBookingWSExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param logIn6
            
          */
        public void startlogIn(

            server.LogIn logIn6,

            final server.HotelBookingWSCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param delete8
                
             * @throws server.HotelBookingWSExceptionException : 
         */

         
                     public server.DeleteResponse delete(

                        server.Delete delete8)
                        throws java.rmi.RemoteException
             
          ,server.HotelBookingWSExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param delete8
            
          */
        public void startdelete(

            server.Delete delete8,

            final server.HotelBookingWSCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  quit(
         server.Quit quit10

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param queryhotel11
                
             * @throws server.HotelBookingWSExceptionException : 
         */

         
                     public server.QueryhotelResponse queryhotel(

                        server.Queryhotel queryhotel11)
                        throws java.rmi.RemoteException
             
          ,server.HotelBookingWSExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param queryhotel11
            
          */
        public void startqueryhotel(

            server.Queryhotel queryhotel11,

            final server.HotelBookingWSCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param query13
                
             * @throws server.HotelBookingWSExceptionException : 
         */

         
                     public server.QueryResponse query(

                        server.Query query13)
                        throws java.rmi.RemoteException
             
          ,server.HotelBookingWSExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param query13
            
          */
        public void startquery(

            server.Query query13,

            final server.HotelBookingWSCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param book15
                
             * @throws server.HotelBookingWSExceptionException : 
         */

         
                     public server.BookResponse book(

                        server.Book book15)
                        throws java.rmi.RemoteException
             
          ,server.HotelBookingWSExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param book15
            
          */
        public void startbook(

            server.Book book15,

            final server.HotelBookingWSCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    