package RMIHotelServer;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class HotelServer {
	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			   System.err.println("Usage: Client address");
			   System.exit(1);
		}
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
        if (args[0].equals("Melbourne") && args[1].equals("Hilton")){
			LocateRegistry.createRegistry(18892);
			// Create a reference to an
			// implementation object...
			HotelServerHOPP temp = new HotelServerHOPP();
			// Create the string URL holding the
			// object's name...
			String rmiObjectName = "rmi://localhost:18892/Hilton";
			// (Could omit host name here, since 'localhost'
			// would be assumed by default.)
			
			// 'Bind' the object reference to the name...
			Naming.rebind(rmiObjectName, temp);
			
			// Display a message so that we know the process
			// has been completed...
			System.out.println("Melbourne Hilton Server is Running ...\n");
	    } else if (args[0].equals("Sydney") && args[1].equals("Chevron")){
			LocateRegistry.createRegistry(18893);
			// Create a reference to an
			// implementation object...
			HotelServerHOPP temp = new HotelServerHOPP();
			// Create the string URL holding the
			// object's name...
			String rmiObjectName = "rmi://localhost:18893/Chevron";
			// (Could omit host name here, since 'localhost'
			// would be assumed by default.)
			
			// 'Bind' the object reference to the name...
			Naming.rebind(rmiObjectName, temp);
			
			// Display a message so that we know the process
			// has been completed...
			System.out.println("Sydney Chevron Server is Running ...\n");
	    }  else if (args[0].equals("Melbourne") && args[1].equals("Regent")){
			LocateRegistry.createRegistry(18896);
			// Create a reference to an
			// implementation object...
			HotelServerHOPP temp = new HotelServerHOPP();
			// Create the string URL holding the
			// object's name...
			String rmiObjectName = "rmi://localhost:18896/Regent";
			// (Could omit host name here, since 'localhost'
			// would be assumed by default.)
			
			// 'Bind' the object reference to the name...
			Naming.rebind(rmiObjectName, temp);
			
			// Display a message so that we know the process
			// has been completed...
			System.out.println("Melbourne Regent Server is Running ...\n");
	    }
        
	}
}