<%@page import="bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
</head>
<body>
	<%
		ArrayList<UserBean> users = (ArrayList<UserBean>) request.getAttribute("users");
	%>

	<table border="1">
		<tr>
			<th>UserId</th>
			<th>FirstName</th>
			<th>Gender</th>
			<th>Email</th>
			<th>Password</th>
			<th>Action</th>
		</tr>


		<%
			for (int i = 0; i < users.size(); i++) {
		%>
		<tr>
			<td><%=users.get(i).getUserId()%></td>
			<td><%=users.get(i).getFirstName()%></td>
			<td><%=users.get(i).getGender()%></td>
			<td><%=users.get(i).getEmail()%></td>
			<td><%=users.get(i).getPassword()%></td>
			<td>
			<a href="DeleteUserServlet?userId=<%=users.get(i).getUserId()%>">Delete</a>
			|
			<a href="ViewUserServlet?userId=<%=users.get(i).getUserId()%>">View</a>
			
			</td>
		</tr>
		<%
			}
		%>


	</table>
	<br><br><br>
	<form action="SearchUserServlet">
		Search : <input type="text" name="fname"/><br>
		<input type="submit" value="Search"/>
	</form>
</body>
</html>














