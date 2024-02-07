<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign-Up Success</title>
</head>
<body>
	<h1>${Header}</h1>
	<p>${description}</p>
	<h3>Successfully Signed-Up</h3>
	<h4>Welcome  ${user.name}</h4>
	<h4>Your email address is ${user.email}</h4>
	<h4>Trying to secure your password which is ${user.password} </h4>
</body>
</html>