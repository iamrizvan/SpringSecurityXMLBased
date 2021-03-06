<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Login Page</title>
</head>
<body onload='document.f.username.focus();'>
<hr/>
Custom Login form
<hr/>

	<h3>Login with Username and Password</h3>
	<form name='f' action='${loginUrl}' method='POST'>
		<table>
			<tr>
			<c:if test="${param.error != null }">
			<span style="color:red">Invalid Credentials</span>
			</c:if>
				<td>User:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td>Remember Me:</td>
				<td><input type='checkbox' name='remember-me' checked="checked" /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="Login" /></td>
			</tr>
			<input type="hidden" name="${_csrf.parameterName}"     value="${_csrf.token}"/>
		</table>
	</form>
</body>
</html>