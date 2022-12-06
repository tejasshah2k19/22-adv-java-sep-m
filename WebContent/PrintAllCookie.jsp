<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>

	<%
		Cookie c[] = request.getCookies();

		for (int i = 0; i < c.length; i++) {
			out.print(c[i].getName() + " : " + c[i].getValue() + "<Br>");
		}
	%>
</body>
</html>