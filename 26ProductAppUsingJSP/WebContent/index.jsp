<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String m=(String)session.getAttribute("msg");
if(m!=null){
%>
<b><%=m %></b>
<%
m=null;
}
%>
<html>
<body>
<b><h1>ProductApp using JSP</h1></b>
<hr>

<h3>Search product</h3>
<form action="SearchProduct.jsp">
Product Name:-<input type="text" name="product" /><br><br>
<input type="submit" value"Go" />
</form>
<hr>

<h3>Add New Product</h3>
<form action="AddProduct.jsp">
Product Name:-<input type="text" name="product" /><br><br>
Price:-<input type="number" name="price" /><br><br>
Brand:-<input type="text" name="brand" /><br><br>
Info:-<textarea name="info" rows="3" cols="0"></textarea><br><br>
Quantity:-<input type="number" name="quantity" /><br><br>
<input type="submit" value"Add" />
</form>
</body>
</html>