package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddCookieServlet")
public class AddCookieServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cookieName = request.getParameter("cname");
		String cookieValue = request.getParameter("cvalue");

		Cookie myCookie = new Cookie(cookieName, cookieValue);
		myCookie.setMaxAge(60 * 60 * 24 * 7);
		response.addCookie(myCookie);

		response.sendRedirect("AddCookie.jsp");
	}
}
