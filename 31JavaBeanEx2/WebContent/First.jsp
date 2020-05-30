<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<%
	String n=request.getParameter("uname");
	String p=request.getParameter("pass");
	String a=request.getParameter("age");
	%>
	<jsp:useBean id="t1" class="p1.MyBean" scope="session" >
	<jsp:setProperty property="username" name="t1" value="<%=n %>"/>
	<jsp:setProperty property="password" name="t1" value="<%=p %>"/>
	<jsp:setProperty property="age" name="t1" value="<%=Integer.parseInt(a) %>"/>
	</jsp:useBean>
	<a href="Second.jsp">call Second jsp</a>
</body>
</html>