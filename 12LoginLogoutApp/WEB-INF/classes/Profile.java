import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*; 
import java.sql.*;

public class Profile extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
			res.setContentType("text/html");
			PrintWriter out=null;
			try{
			out=res.getWriter();
			HttpSession hs=req.getSession(false);
			if(hs!=null){
			String e=(String)hs.getAttribute("email");	
			String n=(String)hs.getAttribute("name");
			String p=(String)hs.getAttribute("phone");
			String a=(String)hs.getAttribute("age");
			out.println("<html><body>");
			out.println("Welcome="+n+"<a href=Logout>Logout</a><hr>");
			out.println("Email="+e+"<br>");
			out.println("Phone="+p+"<br>");
			out.println("Age="+a+"<br>");
			ServletContext ctx=getServletContext();
			Integer c=(Integer)ctx.getAttribute("count");
			out.println("No. of Login:-<b>"+c+"</b>");
			out.println("</html></body>");
			out.close();
			}
			else{
				res.sendRedirect("loginerror2.html");
			}
			}catch(Exception e){
				out.println(e);
				out.close();
			}
		}
}