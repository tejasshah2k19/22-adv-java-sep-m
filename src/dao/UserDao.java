package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.UserBean;
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

	//

	public ArrayList<UserBean> getAllUsers() {

		ArrayList<UserBean> users = new ArrayList<UserBean>();

		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from users");

			ResultSet rs = pstmt.executeQuery(); // 5 records

			while (rs.next()) { //r1 r2 r3 r4 r5|true =>  false 
				UserBean user = new UserBean();
				user.setUserId(rs.getInt("userId"));
				user.setFirstName(rs.getString("firstName"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setGender(rs.getString("gender"));
				users.add(user);

			}

		} catch (Exception e) {
			System.out.println("Exception in UserDao::getAllUsers()");
			e.printStackTrace();
		}
		return users;

	}

}
