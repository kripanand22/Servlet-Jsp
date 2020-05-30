import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Servlet1 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
			
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			ServletContext ctx=getServletContext();
			Integer c=(Integer)ctx.getAttribute("count");
			if(c==null)
				c=0;
			c++;
			ctx.setAttribute("count",c);
			out.println(c);
			
		}
}