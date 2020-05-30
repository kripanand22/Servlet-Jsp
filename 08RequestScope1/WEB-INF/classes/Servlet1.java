import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Servlet1 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
			
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			req.setAttribute("Company","kripa");
			out.println("Hello First Servlet");
			RequestDispatcher rd=req.getRequestDispatcher("s2");
			rd.forward(req,res);
		}
	
}