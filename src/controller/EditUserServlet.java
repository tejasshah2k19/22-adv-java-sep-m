package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserBean;
import dao.UserDao;

@WebServlet("/EditUserServlet")
public class EditUserServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int userId = Integer.parseInt(request.getParameter("userId"));
		UserDao userDao = new UserDao();
		UserBean user = userDao.getUserById(userId);

		request.setAttribute("user", user);
		RequestDispatcher rd = request.getRequestDispatcher("EditUser.jsp");
		rd.forward(request, response);

	}

}
