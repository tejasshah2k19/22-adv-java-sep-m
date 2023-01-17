<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	FirstName : ${firstName }<br>
	Age : ${age }<br>
	Age : ${sessionScope.age }<br>
	Today : ${cookie.today.value }<br>
	Today : ${cookie.today}<br>




	
</body>
</html>