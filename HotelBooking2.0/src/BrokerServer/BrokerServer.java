package BrokerServer;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class BrokerServer {
	
	public static void main(String[] args) throws Exception {

		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}

		LocateRegistry.createRegistry(1011);
		// Create a reference to an
		// implementation object...
		BrokerServerHOPP broker = new BrokerServerHOPP();
		// Create the string URL holding the
		// object's name...
		String rmiObjectName = "rmi://localhost:1011/Broker";
		// (Could omit host name here, since 'localhost'
		// would be assumed by default.)
		// 'Bind' the object reference to the name...
		//Naming.rebind(rmiObjectName, brokerHOPP);
		Naming.rebind(rmiObjectName, broker);
		// Display a message so that we know the process
		// has been completed...
		System.out.println("Broker Server is Running ...\n");
	    } 	
}