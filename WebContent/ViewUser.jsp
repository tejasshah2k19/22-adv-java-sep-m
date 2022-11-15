<%@page import="bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
		UserBean user = (UserBean) request.getAttribute("user");
	%>
	<h2>User Detail</h2>
	UserId:
	<%=user.getUserId()%><br> FirstName:
	<%=user.getFirstName()%><br> Email:<%=user.getEmail()%>
	<br>Gender:<%=user.getGender()%>
	<br>Password:<%=user.getPassword()%><br>
	
	
	<h2>OR</h2>
	
	UserId : ${user.userId }<br>
	FirstName : ${user.firstName }<br>
	
</body>
</html>