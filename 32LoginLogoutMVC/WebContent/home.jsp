<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<title>Login App</title>
</head>
<body>
<center>
<%
String m= (String)session.getAttribute("msg");
if(m!=null){
%>
 <p style="color:white;background-color: tomato">
 <br><%=m %><br>
<%
session.setAttribute("msg",null);
}
%>
<hr>
<h3>Login Form</h3>
<form action="Login" method="post">
	Email ID: <input type='email' name='email' /><br><br>
	Password:- <input type='password' name='password' /><br><br>
	<input type='submit' value='Login' />
</form>

<h3>Add New User</h3>
<hr>
<form action="AddUser" method="post">
	Enter Email: <input type='email' name='email' /><br><br>
	Enter Name: <input type='text' name='name' /><br><br>
	Enter Phone: <input type='text' name='phone' /><br><br>
	Enter Age: <input type='number' name='age' /><br><br>
	Enter Password: <input type='password' name='password' /><br><br>
	<input type='submit' value='Add User' /><br><br>
	<input type='reset' name='clear' /><br><br>
</form>
</center>
</body>
</html>