<%@page import="jsp_employee.Employee"%>
<%@page import="java.util.List"%>
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

	<%
	String name = (String) request.getAttribute("cookie");
	if (name != null) {
	%>
	<h2>
		changed by
		<%=name%></h2>
	<%
	}
	%>

	<%
	List<Employee> emp = (List) request.getAttribute("list");
	%>

	<table border="2px solid">
		<tr>
			<td>ID</td>
			<td>NAME</td>
			<td>PHONE</td>
			<td>ADDRESS</td>
			<td>EMAIL</td>
			<td>PASSWORD</td>
		</tr>
		<%
		for (Employee employee : emp) {
		%>
		<tr>
			<td><%=employee.getId()%></td>
			<td><%=employee.getName()%></td>
			<td><%=employee.getPhone()%></td>
			<td><%=employee.getAddress()%></td>
			<td><%=employee.getEmail()%></td>
			<td><%=employee.getPassword()%></td>
			<td><a href="delete?id=<%=employee.getId()%>"><button>DELETE</button></a></td>
			<td><a href="update?id=<%=employee.getId()%>"><button>UPDATE</button></a></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>