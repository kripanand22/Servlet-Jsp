<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<%
java.util.HashMap userDetails=(java.util.HashMap)session.getAttribute("userDetails");
if(userDetails!=null){
%>

<h1>Welcome: <%= userDetails.get("email") %></h1><a href='Logout'>Logout</a>
<hr>

Name :-<b><%=userDetails.get("name ") %></b><br><br>
Phone :-<b><%=userDetails.get("phone") %></b><br><br>
Age :-<b><%=userDetails.get("age") %></b><br><br>
<%
Integer count=(Integer)application.getAttribute("count");
Integer newcount=(Integer)application.getAttribute("newcount");
if(count==null){
	count=0;
}
if(newcount==null){
	newcount=0;
}

%>

<hr>Login Visitor No:<%= count %>
<hr>Login Visitor No:<%= newcount %>

<%
}
%>

</body>
</html>