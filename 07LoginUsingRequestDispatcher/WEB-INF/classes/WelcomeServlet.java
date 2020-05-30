import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class WelcomeServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res){
		PrintWriter out=null;
		try{
			res.setContentType("text/html");
			out=res.getWriter();
			String n=req.getParameter("userName");
			out.println("Welcome"+n);
		}catch(Exception e){
				out.println(e);
		}
	}
}