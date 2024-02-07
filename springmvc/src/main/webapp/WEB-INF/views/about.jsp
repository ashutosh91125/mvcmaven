<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About Page</title>
</head>
<body>
	<h1> I visited cities</h1>
	<% 
        List<String> cities = (List<String>) request.getAttribute("cities");
        if (cities != null) {
            out.println("I had visited some cities given below:");
            for (String s : cities) { 
    %>
                <b><%=s %></b>
    <%
            }
        } else {
            out.println("No cities data available.");
        }
    %>
</body>
</html>