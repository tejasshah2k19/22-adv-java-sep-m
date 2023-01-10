<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!--  dynamic inclusion -> goto header.jsp -->
	<jsp:include page="Header.jsp"></jsp:include>
	<h3>Welcome ... user</h3>


	<!-- static inclusion ->copy footer.jsp -->
	<%@include file="Footer.jsp"%>

	<!-- we can not access x but we can y due to static inclusion -->
	<%=y%><br>
</body>
</html>