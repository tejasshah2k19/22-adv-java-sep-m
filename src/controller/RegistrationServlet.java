package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import util.Validators;

public class RegistrationServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");

		// validation
		boolean isError = false;

		if (firstName == null || firstName.trim().length() == 0) {
			// required field
			isError = true;
			request.setAttribute("firstNameError", "Please Enter FirstName");// kev:value
		} else if (firstName.matches("[a-zA-Z]+") == false) {
			// format - alphabets
			isError = true;
			request.setAttribute("firstNameError", "Please Enter Valid FirstName");
			request.setAttribute("firstNameValue", firstName);
		} else {
			request.setAttribute("firstNameValue", firstName);
		}
		// email
		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email");
		} else if (Validators.isEmail(email) == false) {
			isError = true;
			request.setAttribute("emailError", "Please enter valid Email");
			request.setAttribute("emailValue", email);

		}

		// } else if (email.matches("^([a-zA-Z0-9])+@([a-zA-Z])+\\.([a-zA-Z]){2,3}$") ==
		// false) {
//			isError = true;
//			request.setAttribute("emailError", "Please enter valid Email");
//			request.setAttribute("emailValue", email);
//
//		}

		else {
			request.setAttribute("emailValue", email);
		}

		// password
		if (password == null || password.trim().length() == 0) {
			isError = true;
			request.setAttribute("passwordError", "Please Enter Password");
		} else if (password.trim().length() <= 7) {
			isError = true;
			request.setAttribute("passwordError", "Please Enter atleast 8 characters");
		} else if (isStrongPassword(password) == false) {
			isError = true;
			request.setAttribute("passwordError", "Please Enter Atleast 1 Upper, Lower and Digit ");

		} else {
			request.setAttribute("passwordValue", password);
		}

		if (gender == null) {
			isError = true;
			request.setAttribute("genderError", "Please Select Gender");
		} else {

			request.setAttribute("genderValue", gender);
		}

		if (isError == true) {
			// go back -> Registration.jsp
			RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
			rd.forward(request, response);// request -> error

		} else {
			//store info -> db -> users 
			UserDao userDao = new UserDao();
			userDao.insertUser(firstName,email,password,gender); 
			
			
			// Home.jsp
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			rd.forward(request, response);
		}

	}

	boolean isStrongPassword(String password) {
		// msdf987324kllsfd
		boolean upper = false, lower = false, digit = false;
		for (int i = 0; i < password.length(); i++) {
			char x = password.charAt(i);

			if (Character.isUpperCase(x)) {
				upper = true;
			} else if (Character.isLowerCase(x)) {
				lower = true;
			} else if (Character.isDigit(x)) {
				digit = true;
			}
		}
		return upper && lower && digit;// strong
		//
	}
}
