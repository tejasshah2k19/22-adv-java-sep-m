package controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminLoginServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// ServletConfig - init() -getServletConfig()

		ServletConfig config = getServletConfig();// servlet xml

		String correctEmail = config.getInitParameter("email");
		String correctPassword = config.getInitParameter("password");

		if (correctEmail.equals(email) && correctPassword.equals(password)) {
			response.sendRedirect("Home.jsp");
		} else {
			response.sendRedirect("AdminLogin.jsp");
		}
	}

}
