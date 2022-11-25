package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;

@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		int userId = Integer.parseInt(request.getParameter("userId"));

		UserDao userDao = new UserDao();
		userDao.updateUser(firstName, userId);

		// RequestDispatcher
		// sendRedirect()
		//request.setAttribute("msg","hey");  => RequestDispatcher 
		
		response.sendRedirect("ListUserServlet");
		
	}
}
