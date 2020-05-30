package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class servlet1 extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res){
		PrintWriter out=null;
		try{
			res.setContentType("text/html");
			out=res.getWriter();
			String s1=req.getParameter("name");
			String s2=req.getParameter("roll");
			out.println("Hello "+s1);
			//out.println("Roll number is "+s2);
			out.println("<html><body>");
			out.println("<form action='servlet2'>");
			out.println("<input type='hidden' name='name' value='"+s1+"'>");
			out.println("<input type='hidden' name='roll' value='"+s2+"'>");
			out.println("<input type='submit' value='Go'/>");
			out.println("</form>");
			out.println("</body></html>");
			
		}catch(Exception ex){
			out.println(ex);
			out.close();
		}
	}
}
