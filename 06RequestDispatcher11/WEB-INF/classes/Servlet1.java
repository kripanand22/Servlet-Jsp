import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class Servlet1 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res){
		PrintWriter out=null;
		try{
			res.setContentType("text/html");
			out=res.getWriter();
			String n=req.getParameter("name");
			out.println("<html><body>");
			out.println("<h1> My Web Application </h1>");
			out.println("Hello Servlet");
			out.println("Name:-"+n);
			RequestDispatcher rd=req.getRequestDispatcher("s2");
			rd.include(req,res);
			//rd.forward(req,res);
			out.println("Bye Servlet");
			out.println("</body></head>");
		}catch(Exception e){
				out.println(e);
		}
	}
}