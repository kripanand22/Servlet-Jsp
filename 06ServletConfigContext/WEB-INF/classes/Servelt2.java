import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class Servelt2 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res){
		PrintWriter out=null;
		try{
			ServletContext ctx=getServletContext();
			ServletConfig con=getServletConfig();
			String s1=con.getInitParameter("age");
			String s2=ctx.getInitParameter("email");
			res.setContentType("text/html");
			out=res.getWriter();
			out.println("<html><body>");
			out.println("<h1> My Web Application </h1>");
			out.println("Hello Servlet2<br>");
			out.println("Name:-"+s1+"<br>");
			out.println("Name:-"+s2);
			out.println("</body></head>");
		}catch(Exception e){
				out.println(e);
		}
	}
}