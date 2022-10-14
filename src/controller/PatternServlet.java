package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatternServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int x = Integer.parseInt(request.getParameter("n1"));

		//data set - next resource send 
		request.setAttribute("n1", x);
		
		//jump to next resource 
		RequestDispatcher rd = request.getRequestDispatcher("OutputPattern.jsp");
		rd.forward(request, response);
		
		
	}
}
