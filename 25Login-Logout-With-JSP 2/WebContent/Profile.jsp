<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page errorPage="Error.jsp" %>
<%
java.util.HashMap userDetails=(java.util.HashMap)session.getAttribute("userDetails");
if(userDetails!=null){
%>


<html>
<body>
<h1>Login-Logout App</h1><hr><hr>
Welcome : -<%=userDetails.get("name") %> <a href="Logout.jsp">Logout</a></br></br>
Email : -<%=userDetails.get("email") %></br></br>
Contect no. : -<%=userDetails.get("phone") %></br></br>
Age : -<%=userDetails.get("age") %>
<%
}else{
	session.setAttribute("msg","Plz login first");
	response.sendRedirect("index.jsp");
}
%>
</body>
</html>