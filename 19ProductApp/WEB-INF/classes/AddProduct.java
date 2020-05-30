package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class AddProduct extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,NumberFormatException ,IOException{
		PrintWriter out=null;
		res.setContentType("text/html");
		
		try{
			out=res.getWriter();
			String s1=req.getParameter("product");
			String price=req.getParameter("price");
			String info=req.getParameter("info");
			String br=req.getParameter("brand");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_app","root","Kripanand");
			Statement st=con.createStatement();
			st.executeUpdate("insert into product value('"+s1+"','"+price+"','"+info+"','"+br+"')");
			out.println("Successsfully Added");
			out.println("<html><body>");
			out.println("<br>");
			out.println("<b><a href=index.html>Go back</a></b>");
			out.println("</body></html>");
		}catch(java.sql.SQLIntegrityConstraintViolationException ex){
			out.println("Already Data exist!");
			out.close();
		}catch(Exception ex){
			out.println(ex);
			out.close();
		}
	}
}
