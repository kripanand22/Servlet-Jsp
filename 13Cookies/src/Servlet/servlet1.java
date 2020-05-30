package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet1 extends HttpServlet {
	public void service(HttpServletRequest req ,HttpServletResponse res){
		PrintWriter out=null;
		res.setContentType("text/html");
		try{
			out=res.getWriter();
			String s1=req.getParameter("name");
			String s2=req.getParameter("roll");
			out.println("Hello"+s1);
			out.println("Your roll number="+s2);
			Cookie ck1=new Cookie("name",s1);
			Cookie ck2=new Cookie("roll",s2);
			res.addCookie(ck1);
			res.addCookie(ck2);
			
			out.println("<html><body>");
			out.println("<form action='servlet2'>");
			out.println("<input type='submit' value='Submit'>");
			out.println("</body></html>");
		}catch(Exception ex){
			out.println("ex");
			out.close();
		}
	}
}
