<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.sql.*" %>
<%@page errorPage="Error.jsp" %>
<<html><body>
<%
try{
String p=request.getParameter("product");
String pr=request.getParameter("price");
String info=request.getParameter("info");
String brand=request.getParameter("brand");
String quan=request.getParameter("quantity");
Class.forName("com.mysql.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_app","root","Kripanand");
Statement st=c.createStatement();
st.executeUpdate("insert into product value('"+p+"','"+pr+"','"+info+"','"+brand+"','"+quan+"') ");
session.setAttribute("msg", "Add Successfully !");
response.sendRedirect("index.jsp");
}catch(java.sql.SQLIntegrityConstraintViolationException ex){
	session.setAttribute("msg", "Already data exist !");
	response.sendRedirect("index.jsp");
}
%>
<a href="index.jsp" >Back to home</a>
</body></html>