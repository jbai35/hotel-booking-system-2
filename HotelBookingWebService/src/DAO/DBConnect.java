package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect{
	
	//private final String PROP_FILE = "mysql.ini";
	private String driver = "com.mysql.jdbc.Driver";
	// url�����ݿ�ķ����ַ
	private String url = "jdbc:mysql://localhost:3306/id26346990";
	private String user = "fit5183a1";
	private String pass = "";
	
	public Connection getConnection() throws Exception{
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url
				, user , pass);
		return conn;
	}
	
}