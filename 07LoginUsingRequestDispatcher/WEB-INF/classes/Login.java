import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class Login extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res){
		PrintWriter out=null;
		try{
			res.setContentType("text/html");
			out=res.getWriter();
			String n=req.getParameter("userName");
			String p=req.getParameter("userPass");
			
			if(p.equals("servlet")){
				RequestDispatcher rd=req.getRequestDispatcher("Servelt2");
				rd.forward(req,res);
			}else{
				out.print("Sorry User name and Password Error!");
				RequestDispatcher rd=req.getRequestDispatcher("index.html");
				rd.include(req,res);
			}
		}catch(Exception e){
				out.println(e);
		}
	}
}