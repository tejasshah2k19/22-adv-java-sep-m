<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>
	<c:set var="a" value="31"></c:set>
	<c:out value="${a}"></c:out>


	<c:if test="${a%2 ==0}">
		EVEN
	</c:if>
	<c:if test="${a%2 !=0}">
		ODD
	</c:if>

	<br>
	<Br>
	<c:set var="days" value="sun,mon,tue,wed,thus,fri,sat"></c:set>

	<c:forTokens items="${days}" delims="," var="day">
		${day}
	</c:forTokens>

	<br>
	<br>


	<table border="1">
		<tr>
			<th>FirstName</th>
			<th>Email</th>
		</tr>
		<c:forEach items="${users}" var="u">
			<tr>
				<td>${u.firstName}</td>
				<td>${u.email }</td>
			</tr>
		</c:forEach>
	</table>









	<c:catch var="e">
		SOMETHING WENT WRONG
	</c:catch>
	
	<c:remove var="a"/>

	<c:choose>
		<c:when test="${a == 10 }">
			TEN
		</c:when> 
		<c:when test="${a == 20 }">
			TWENTY
		</c:when> 
		<c:otherwise>
			INVALID
		</c:otherwise>
	</c:choose>


</body>
</html>