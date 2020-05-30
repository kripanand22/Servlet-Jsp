<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.sql.*" %>
<%@page errorPage="Error.jsp" %>
<%
String e=request.getParameter("email");
String n=request.getParameter("name");
String a=request.getParameter("age");
String p=request.getParameter("phone");
String pa=request.getParameter("pass");
Class.forName("com.mysql.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDb","root","Kripanand");
Statement st=c.createStatement();
try{
st.executeUpdate("insert into test value ('"+n+"','"+p+"','"+a+"','"+e+"','"+pa+"')");
java.util.HashMap userDetails=new java.util.HashMap();
userDetails.put("email",e);
userDetails.put("name",n);
userDetails.put("age",a);
userDetails.put("phone",p);
userDetails.put("pass",pa);
session.setAttribute("userDetails","userDetails");
response.sendRedirect("index.jsp");
}catch(java.sql.SQLIntegrityConstraintViolationException ex){
	session.setAttribute("msg","Email id is Already exist");
	response.sendRedirect("index.jsp");
}
%>