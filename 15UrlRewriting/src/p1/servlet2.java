package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {
	public void service(HttpServletRequest req ,HttpServletResponse res){
		PrintWriter out=null;
		try{
			out=res.getWriter();
			res.setContentType("text/html");
			String s1=req.getParameter("name");
			String s2=req.getParameter("roll");
			out.println("Hello "+s1);
			out.println("Roll no "+s2);
			
		}catch(Exception ex){
			out.println(ex);
		}
	}
}
