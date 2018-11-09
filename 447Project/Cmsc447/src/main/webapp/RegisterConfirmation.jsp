<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Thank you for Registering at PoliticalReddit</title>
</head>
<body>

	Your email is : 	<%= request.getAttribute("email") %>
	Your Password is:	<%= request.getAttribute("password")%>
</body>
</html>