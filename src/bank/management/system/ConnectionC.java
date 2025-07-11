package bank.management.system;

import java.sql.*;

public class ConnectionC {
	
	Connection c;
	Statement st;
	public ConnectionC() {
		try {
		c = DriverManager.getConnection("jdbc:mysql:///bank_management_database", "root", "Heybuddy88,");
		st = c.createStatement();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
