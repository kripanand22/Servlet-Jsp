import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Servlet1 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
			
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			ServletContext ctx=getServletContext();
			ctx.setAttribute("company","kripa");
			out.println("Hello First Servlet");
			out.println("<a href='s2'>Second Servlet</a>");
		}
}