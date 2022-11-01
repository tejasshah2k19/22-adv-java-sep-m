package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.DbConnection;

//cohesion -> 
public class UserDao {

	public void insertUser(String firstName, String email, String password, String gender) {

		try {
			Connection con = DbConnection.getConnection();
			// query -> 1)Statement 2)PreparedStatement 3)CallableStatement

			// Statement and PreparedStatment -> ddl dml[C R U D] tcl
			// CallableStatement -> procedure function -> plsql

			// PreparedStatment -> executeUpdate() -> insert update delete
			// executeQuery() -> read only -> select

			PreparedStatement pstmt = con
					.prepareStatement("insert into users (firstName,email,password,gender) values (?,?,?,?)");
			pstmt.setString(1, firstName);
			pstmt.setString(2, email);
			pstmt.setString(3, password);
			pstmt.setString(4, gender);

			pstmt.executeUpdate();
			System.out.println("User added.....");
		} catch (Exception e) {
			System.out.println("Exception in UserDao::insertUser()");
			e.printStackTrace();
		}
	}

}
