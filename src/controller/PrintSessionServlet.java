package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PrintSessionServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// request.getCookies() => all data

		HttpSession session = request.getSession();
		String userName = (String) session.getAttribute("userName");

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		out.print("<html><body>");
		out.print("UserName = > " + userName);
		out.print("</body></html>");
	}

}
