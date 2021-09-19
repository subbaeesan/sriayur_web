<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
	<div align="center">
		<h1>Welcome to Sriayur Organic Ecommerce!</h1>

		<h2>Quality and pure Organic product!</h2>
	</div>
	<div align="center">

		<jsp:directive.include file="header.jsp" />
	</div>

	<div align="center">
		<h1>Please login</h1>
		<form>
			Email:<input type="text" size="10"><br />
			Password: <input type="password" size="10" />
			<input type="submit" value="Login" />





		</form>

	</div>


<jsp:directive.include file="footer.jsp" />



</body>
</html>