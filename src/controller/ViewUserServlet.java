package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserBean;
import dao.UserDao;

@WebServlet("/ViewUserServlet")
public class ViewUserServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int userId = Integer.parseInt(request.getParameter("userId"));

		UserBean user = new UserDao().getUserById(userId);
		request.setAttribute("user", user);

		request.getRequestDispatcher("ViewUser.jsp").forward(request, response);
	}
}
