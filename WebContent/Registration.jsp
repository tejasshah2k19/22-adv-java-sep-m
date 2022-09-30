<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>

	<%
		String firstNameError = (String) request.getAttribute("firstNameError");
		String emailError = (String) request.getAttribute("emailError");
		String passwordError = (String) request.getAttribute("passwordError");
		String genderError = (String) request.getAttribute("genderError");

		String firstNameValue = (String) request.getAttribute("firstNameValue");
		String emailValue = (String) request.getAttribute("emailValue");
		String passwordValue = (String) request.getAttribute("passwordValue");
		String genderValue = (String) request.getAttribute("genderValue");
	%>
	<form method="post" action="RegistrationServlet">

		FirstName : <input type="text" name="firstName"
			value="<%=firstNameValue == null ? "" : firstNameValue%>" /> <span
			class="error"> <%=firstNameError == null ? "" : firstNameError%>
		</span> <br> <BR> Email : <input type="text" name="email"
			value="<%=emailValue == null ? "" : emailValue%>" /> <span
			class="error"> <%
 	if (emailError != null) {
 		out.print(emailError);
 	}
 %>

		</span> <br> <br> Password : <input type="text" name="password"
			value="<%=passwordValue == null ? "" : passwordValue%>" /> <span
			class="error"> <%=passwordError == null ? "" : passwordError%></span>
		<br> <Br> 
		
		Gender : M<input type="radio" name="gender"  <%=genderValue!=null&&genderValue.equals("male")?"checked":"" %>
			value="male" /> F<input type="radio" name="gender" value="female" <%=genderValue!=null&&genderValue.equals("female")?"checked":""%> />
		<span class="error"> 
		
		<%=genderError == null ? "" : genderError%>
		</span> <br> <br>
		<button type="submit">Signup</button>

	</form>


</body>
</html>