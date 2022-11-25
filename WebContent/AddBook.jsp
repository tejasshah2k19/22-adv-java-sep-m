<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>

	<form method="post" action="AddBookServlet">
		BookName : <input type="text" name="bookName"  value="${bookNameValue}"> <span
			class="error"> ${bookNameError }</span> <br> <br> Price : <input
			type="text" name="price"  value="${priceValue}"> ${priceError } <br> <br>
		Qty : <input type="text" name="qty"  value="${qtyValue}"> ${qtyError } <br> <br>
		<input type="submit" value="Add Book">
	</form>
</body>
</html>