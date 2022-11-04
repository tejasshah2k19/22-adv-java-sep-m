package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

import bean.UserBean;
import dao.UserDao;

public class ListUserServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserDao userDao = new UserDao();
		ArrayList<UserBean> users = userDao.getAllUsers();

		request.setAttribute("users", users);

		RequestDispatcher rd = request.getRequestDispatcher("UserList.jsp");
		rd.forward(request, response);
	}
}
