<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<jsp:useBean id="t1" class="p1.MyBean" scope="session" />
	
	<jsp:getProperty property="username" name="t1"/></br>
	<jsp:getProperty property="password" name="t1"/></br>
	<jsp:getProperty property="age" name="t1"/></br>
</body>
</html>