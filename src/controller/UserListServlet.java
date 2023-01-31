package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserBean;

public class UserListServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		
		UserBean u1 = new UserBean();
		u1.setEmail("ram@gmail.com");
		u1.setFirstName("ram");
		
		
		UserBean u2 = new UserBean();
		u2.setEmail("ravan@gmail.com");
		u2.setFirstName("ravan");
		
		
		UserBean u3 = new UserBean();
		u3.setEmail("laxman@gmail.com");
		u3.setFirstName("laxman");
		
		
		UserBean u4 = new UserBean();
		u4.setEmail("sita@gmail.com");
		u4.setFirstName("sita");
		
		ArrayList<UserBean> users = new ArrayList<UserBean>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		
		request.setAttribute("users", users);
		request.getRequestDispatcher("JstlDemo.jsp").forward(request, response); 
		
	}

}
