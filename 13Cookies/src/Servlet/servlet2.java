package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet2 extends HttpServlet {
	public void service(HttpServletRequest req ,HttpServletResponse res){
		PrintWriter out=null;
		res.setContentType("text/html");
		try{
			out=res.getWriter();
			Cookie ck[]=req.getCookies();
			out.println("Your name="+ck[0].getValue());
			out.println("Your Roll number="+ck[1].getValue());
			out.close();
		}catch(Exception ex){
			out.println(ex);
			out.close();
		}
	}
}
