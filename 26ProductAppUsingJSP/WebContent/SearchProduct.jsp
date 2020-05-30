<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page errorPage="Error.jsp" %>
<%@page import="java.sql.*" %>
<html><body>
	<%
	String p=request.getParameter("product");
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_app","root","Kripanand");
	Statement st=c.createStatement();
	ResultSet rs=st.executeQuery("select * from product where name like '"+p+"%' ");
	%>
	<b><h1>Product App</h1></b>
	<b><a href="index.jsp" >Back to home</a></b>
	<%
	int flag=0;
	while(rs.next()){
		flag=1;
	%>
	<hr><hr>
	Product name:- <%=rs.getString("name") %><b>(<%= rs.getString("Brand") %>)</b><br><br>
	Price :- <%= rs.getInt("price")%><br><br>
	Info :- <%= rs.getString("info")%><br><br>
	Quantity :-<%=  rs.getInt("Quantity")%>
	<%
		}
	if(flag==0){
		session.setAttribute("msg","Wrong Entries");
		response.sendRedirect("index.jsp");
	}
	%>
	
	</body></html>
