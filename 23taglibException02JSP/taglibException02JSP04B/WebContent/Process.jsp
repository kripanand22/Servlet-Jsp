<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<%
	String n1=request.getParameter("num1");
	String n2=request.getParameter("num2");
	int a=Integer.parseInt(n1);
	int b=Integer.parseInt(n2);
	int c=a/b;
	%>
	Divisible number is<%= c %>
</body>
</html>