<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
	<form action="AddCookieServlet" method="post">
		Cookie Name : <input type="Text" name="cname" /><br>
		<BR> Cookie Value : <input type="text" name="cvalue" /><Br>
		<br> <input type="submit" value="Add Cookie" />
	</form><br>
	
	<a href="PrintAllCookie.jsp">Print ALL Cookies DATA</a>
</body>
</html>