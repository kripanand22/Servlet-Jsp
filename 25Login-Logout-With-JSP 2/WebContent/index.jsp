<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%String m=(String)session.getAttribute("msg");
if(m!=null){
%>
<b><%=m  %><b></b>
<%
m=null;
}
%>

<html>
</head>
<body>

	<h1>Login-Logout-App using JSP</h1>

	<h3>Login</h3>
	<form action="Login.jsp">
	Email id:-<input type="email" name="email" required ><br><br>
	Password:-<input type="password" name="pass" required ><br><br>
	<input type="submit" name="Submit"  >
	<input type="reset" name="Reset"  >
	</form>
	
	<h3>Register</h3>
	<form action="Register.jsp">
	Email id:-<input type="email" name="email" required ><br><br>
	Name:-<input type="text" name="name" required ><br><br>
	Age:-<input type="number" name="age" required ><br><br>
	Contact no.:-<input type="number" name="phone" required ><br><br>
	Password:-<input type="password" name="pass" required ><br><br>
	<input type="submit" name="Submit"  >
	<input type="reset" name="Reset"  >
	</form>
	<hr>
	Visitor No:-<b><%=application.getAttribute("totalsession") %></b>
	<hr>
	Current Login No:-<b><%=application.getAttribute("currentsession") %></b>
	<hr>
</body>
</html>