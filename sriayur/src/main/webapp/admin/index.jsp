<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sriayur Ecommerce</title>
</head>
<body>
<div align="center">
<h1>Welcome to Sriayur Organic Ecommerce!</h1>

<h2>Adminsitration Dashboard</h2>
</div>
<jsp:directive.include file="header.jsp" />


<div align="center">

<h2>Quick Actions:</h2>
<b>
<a href="create product"> New Product</a> &nbsp;
<a href="create user"> New User</a> &nbsp;
<a href="create customer"> New Customer</a> &nbsp;
<a href="create category"> New Category</a> &nbsp;
</b>

</div>


<div align="center">
<hr width="60" />
<h2>Recent Sales:</h2>
<b>

</b>

</div>

<div align="center">
<hr width="60" />
<h2>Recent Reviews:</h2>
<b>

</b>

</div>


<div align="center">
<hr width="60" />
<h2>Generate Reports:</h2>
<b>

</b>

</div>
<hr width="60" />
<jsp:directive.include file="footer.jsp" />

</body>
</html>