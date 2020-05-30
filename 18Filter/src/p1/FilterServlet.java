package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FilterServlet extends HttpServlet {
	public void service(HttpServletRequest req ,HttpServletResponse res) throws ServletException, IOException{
		PrintWriter out=null;
		res.setContentType("text/html");
			ServletContext s=getServletContext();
			int count=(Integer)s.getAttribute("count");
			out.println("Number of times website visited"+count);
			out.close();
	}

}
