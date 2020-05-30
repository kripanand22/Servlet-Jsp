<html>
	<body>
		<%-- Delclaration Tag Example --%>
		<%! int x=10;%>
		<h1>My first WebApplication using jsp </h1>
		
		<%
			int n1=Integer.parseInt(request.getParameter("num1"));
			int n2=Integer.parseInt(request.getParameter("num2"));
			int n=n1+n2;
		%>
		Sum of<b><%=n1%></b> and <b><%=n2%></b> = <b><%=n1%></b>
		<%! int square(){
			return x*x;
		}
		%>
		Square =<%= square() %>
	</body>
</html>
 