package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("SignupServlet :: service() ");


		//user signup form -> input data -> read 
		//request
		
		String firstName = request.getParameter("fn");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		//response 
		//what type of content server will send to client 
		//html pdf img aud vid 
		response.setContentType("text/html");  //MIME 
		PrintWriter out = response.getWriter();//stream open between server and client

		out.print("User Info:<br>");
		out.print("FirstName => "+firstName+"<br>");
		out.print("Email => "+email+"<br>");
		out.print("Password => "+password+"<br>");
		
		
	
	}

}
