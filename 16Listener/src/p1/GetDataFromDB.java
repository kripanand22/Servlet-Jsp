package p1;


import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


public class GetDataFromDB extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res){
		PrintWriter out=null;
		res.setContentType("text/html");
		try{
			out=res.getWriter();
			ServletContext ctx=getServletContext(); 
			Statement st=(Statement)ctx.getAttribute("stmt");
			ResultSet rs=st.executeQuery("select * from test_info");
			while(rs.next()){
				out.print("<br>"+rs.getString("Name")+":"+rs.getString("Email_id"));
			}
		}catch(Exception ex){
			out.println(ex);
		}
	}
}
