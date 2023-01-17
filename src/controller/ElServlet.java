package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ElServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String age = request.getParameter("age");

		request.setAttribute("firstName", firstName);
		HttpSession session = request.getSession();
		session.setAttribute("age", age);
		
		Cookie c = new Cookie("today", "Tuesday");
		response.addCookie(c);
		
		
		request.getRequestDispatcher("OutputData.jsp").forward(request, response);
	}

}
