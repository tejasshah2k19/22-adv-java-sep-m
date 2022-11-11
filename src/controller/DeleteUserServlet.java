package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

import dao.UserDao;

@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DeleteUserServlet");
		System.out.println(request.getParameter("userId"));
		int userId  = Integer.parseInt(request.getParameter("userId"));
		
		UserDao userDao = new UserDao();
		userDao.deleteUser(userId);
		System.out.println("User deleted...");
		
//		RequestDispatcher rd = request.getRequestDispatcher("ListUserServlet");
//		rd.forward(request, response);

		response.sendRedirect("ListUserServlet");
		
	}
}
