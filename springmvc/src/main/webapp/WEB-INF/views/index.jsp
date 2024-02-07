<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<% List<String> mydetails = (List<String>) request.getAttribute("detail"); %>
	
	
	<h1>Welcome to home Page</h1>
	<p>Hello my first name is  <%= mydetails.get(0) %> , my surname is <%=mydetails.get(1) %></p>
	<br>
	
	
</body>
</html>