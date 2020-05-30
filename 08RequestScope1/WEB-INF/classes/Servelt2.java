import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Servelt2 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
			res.setContentType("text/html");			
			PrintWriter out=res.getWriter();
			out.println("Hello Second Servlet");
			String c=(String)req.getAttribute("Company");
			out.println("Hello"+c);
		}
	
}