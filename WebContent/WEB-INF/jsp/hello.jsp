<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>Hello</title>
</head>
<body>
<div align="center">
	<h2>User Details</h2>
	<hr>
	<table border="1">
		<tr bgcolor="green" style="color: white">
			<th >First Name</th>
			<th >Last Name</th>
			<th >Gender</th>
			<th>Country</th>
			<th>Visited Countries</th>
			<th>Message</th>
		</tr>
		<tr>
			<td>${firstName}</td>
			<td>${lastName}</td>
			<td>${gender}</td>
			<td>${country}</td>
			<td>
				<ul>
					<c:forEach items="${visitedCountry}" var="temp">
						<li>${temp}</li>
					</c:forEach>
				</ul>
			</td>
			<td>${message}</td>
		</tr>
	</table>
</div>
</body>
</html>