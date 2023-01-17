<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="Error.jsp"
	import="java.util.Date,java.util.Scanner" import="java.io.File"
	
	buffer="8kb" autoFlush="true"
	%>

<%@page import="java.util.regex.Pattern"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		Date d = new Date();
		File f = null;
		Scanner scr = null;
		Pattern p = null;
		int a = 9;
		int b = 0;
		//	int c = a / b;
	%>

	CurrentTime::
	<%=d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds()%>

</body>
</html>