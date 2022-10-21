package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static void getConnection() {
		// url -> db -> dbname
		// driver
		// username
		// password

		String dbUrl = "jdbc:mysql://localhost:3306/22gensepm";
		String driver = "com.mysql.cj.jdbc.Driver";
		String userName = "root";
		String password = "root";

		try {
			// load driver
			Class.forName(driver);

			Connection con = DriverManager.getConnection(dbUrl, userName, password);

			if (con != null) {
				System.out.println("dbConnected...");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		DbConnection.getConnection();
	}
}
