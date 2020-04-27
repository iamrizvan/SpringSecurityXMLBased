<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/files/css/style.css"/>
</head>
<body>
<h4>Home Page : List of users in the project</h4>
	<hr />
	<br>
	<a href="${pageContext.request.contextPath}/addUser">Add User</a>
	<p/>
	<table border="1" align="left">
		<tr>
			<th>User ID</th>
			<th>Name</th>
			<th>Email</th>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.userID} </td>
				<td>${user.name} </td>
				<td>${user.email} </td>
			</tr>
		</c:forEach>
	</table></body>
</html>