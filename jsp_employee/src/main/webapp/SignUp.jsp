<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String message = (String) request.getAttribute("message");
	if (message != null) {
	%>
	<h2><%=message%></h2>
	<%
	}
	%>
	<form action="save" method="post">
		Id :<input type="number" name="id">
		Name :<input type="text" name="name">
		Phone :<input type="tel" name="phone">
		Address :<input type="text" name="address">
		Email :<input type="email" name="email">
		Password :<input type="text" name="password">
		<button>Register</button>
	</form>
</body>
</html>