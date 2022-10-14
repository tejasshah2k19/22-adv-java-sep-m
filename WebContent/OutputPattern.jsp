<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OutputPattern</title>
</head>
<body>


	<%
			Integer x = (Integer)request.getAttribute("n1");
	
			for(int i=1;i<=x;i++){
				for(int j=1;j<=i;j++){
					out.print(j);
				}
				out.print("<BR>");
			}
	
	%>

</body>
</html>