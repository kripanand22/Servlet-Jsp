<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.sql.*" %>
<%@page errorPage="Error.jsp" %>
	<%
	String e=request.getParameter("email");
	String p=request.getParameter("pass");
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDb","root","Kripanand");
	Statement st=c.createStatement();
	ResultSet rs=st.executeQuery("select * from test where Email_id='"+e+"' and pass='"+p+"'");
	if(rs.next()){
		java.util.HashMap userDetails=new java.util.HashMap();
		userDetails.put("name",rs.getString("Name"));
		userDetails.put("email",rs.getString("Email_id"));
		userDetails.put("phone",rs.getString("Phone"));
		userDetails.put("age",rs.getString("Age"));
		session.setAttribute("userDetails",userDetails);
		response.sendRedirect("Profile.jsp");
		}else{
			session.setAttribute("msg","Wrong Entries !");
			response.sendRedirect("index.jsp");
		}
	%>