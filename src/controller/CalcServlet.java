package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		boolean isError = false;
		String error = "";
		// input
		String x1 = request.getParameter("n1");// 30 -> String
		String x2 = request.getParameter("n2");// 20 -> String
		String operation = request.getParameter("operation");

		// validation
		if (x1 == null || x1.trim().length() == 0) {
			isError = true;
			error = error + "Please Enter N1<br>";
		}

		if (x2 == null || x2.trim().length() == 0) {
			isError = true;
			error += "Please Enter N2<br>";
		}

		if(operation == null || operation.equals("-1")) {
			isError = true; 
			error+="Please Select Operation<br>";
		}
		
		if (isError == true) {
			//
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			out.print(error);
		} else {

			// process
			int n1 = Integer.parseInt(x1); // ""
			int n2 = Integer.parseInt(x2);

			// operation => add
			// operation => sub
			// operation => mul

			int ans =0;
			
			switch (operation) {
			case "add":
				ans = n1+n2;
				break;
			case "sub":
				ans = n1-n2;
				break;
			case "mul":
				ans = n1*n2;
				break;


			default:
				ans=0;
				break;
			}
			 

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

//		out.print("Addition = "+ans);

			out.print(operation + " => " + ans);
		}
	}
}
