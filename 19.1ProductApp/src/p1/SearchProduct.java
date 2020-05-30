package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class SearchProduct extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,NumberFormatException ,IOException{
		PrintWriter out=null;
		Connection con;
		res.setContentType("text/html");
		
		try{
			out=res.getWriter();
			String s1=req.getParameter("product");
			ServletContext ctx=req.getServletContext();
			Statement st=(Statement)ctx.getAttribute("stmt");
			ResultSet rs=st.executeQuery("select * from product where name like '"+s1+"%' ");
			int flag=0;
			while(rs.next()){
				flag=1;
				out.println("<html><body>");
				out.println("<h1>Product  "+rs.getString("Brand")+"</h1>");
				out.println("Product Name:-"+rs.getString("name")+"<br>");
				out.println("Product Price:-"+rs.getInt("price")+"<br>");
				out.println("Product Info:-"+rs.getString("info")+"<br>");
				out.println("<hr>");
				out.println("</body></html>");
			}
			if(flag==0){
				out.println("Product Not Found !");
				out.close();
			}else{
				out.println("<br>");
				out.println("<b><a href=index.html>Go back</a></b>");
				out.close();
			}
		}catch(Exception ex){
			out.println(ex);
			out.close();
		}
	}
}
