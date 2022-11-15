package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserBean;
import dao.UserDao;

@WebServlet("/SearchUserServlet")
public class SearchUserServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fname = request.getParameter("fname");
		UserDao dao = new UserDao();
		ArrayList<UserBean> users = dao.searchUser(fname);
		request.setAttribute("users", users);
		request.getRequestDispatcher("UserList.jsp").forward(request, response);
	}
}
