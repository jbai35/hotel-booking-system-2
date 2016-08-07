
start java -Djava.security.policy=policy.all -Djava.security.policy=policy.all -jar BrokerServer.jar

start java -Djava.security.policy=policy.all -jar RMIHotelServer.jar Melbourne Hilton

start java -Djava.security.policy=policy.all -jar RMIHotelServer.jar Sydney Chevron

start java -Djava.security.policy=policy.all -jar RMIHotelServer.jar Melbourne Regent

start java -jar CorbaHotelServer.jar

start java -Djava.security.policy=policy.all -jar HotelClientUI.jar