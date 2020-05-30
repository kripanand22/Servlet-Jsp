package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String s1=req.getParameter("name");
		out.print("Welcome"+s1);
		HttpSession hp=req.getSession();
		hp.setAttribute("name", s1);
		ServletContext ctx=getServletContext();
		int t=(Integer)ctx.getAttribute("TotalSession");
		int c=(Integer)ctx.getAttribute("CurrentSession");
		out.println("<br>Total Session"+t);
		out.println("<br>Current Session"+c);
		out.println("<br><a href='Logout'>Logout</a>");
		out.close();
	}
}
