<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome....</h2>
	<%
		int a = 90;
		int b = 200;
	%>

	<%
		out.println(a+"<Br>");
		out.println(b+"<BR>");
	%>
	
	a = <%=a%>
	
	
</body>
</html>