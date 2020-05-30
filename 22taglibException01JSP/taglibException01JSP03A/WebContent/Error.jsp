<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Exception handling in jsp</title>
</head>
<body>
	<%@page isErrorPage="true" %>
	<h3>Sorry an Exception has occured !</h3><br>
	Exception is<%= exception %><br>
	<form action="index.html">
	<input type="submit" value="Re-Compute" />
	</form>
</body>
</html>