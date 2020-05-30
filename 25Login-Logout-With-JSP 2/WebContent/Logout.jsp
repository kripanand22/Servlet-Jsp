<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page errorPage="Error.jsp" %>

<% 
java.util.HashMap userDetails=(java.util.HashMap)session.getAttribute("userDetails");
if(userDetails!=null){
session.invalidate();
session=request.getSession();
session.setAttribute("msg","Thanks to visiting !");
response.sendRedirect("index.jsp");
}else{
	session.setAttribute("msg","Plz login first !");
	response.sendRedirect("index.jsp");
}
%>