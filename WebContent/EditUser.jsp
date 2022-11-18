<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="UpdateUserServlet">

		FirstName : <input type="text" name="firstName"
			value="${user.firstName }"> <br> <input type="submit"
			value="Update" /> <input type="hidden" name="userId"
			value="${user.userId}">
	</form>


</body>
</html>