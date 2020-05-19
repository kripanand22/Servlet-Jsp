import javax.servlet.*;
import java.io.*;

public class AddServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res){
		PrintWriter out=null;
		try{
			res.setContentType("text/html");
			out=res.getWriter();
			String s1=req.getParameter("num1");
			String s2=req.getParameter("num2");
			int n1=Integer.parseInt(s1);
			int n2=Integer.parseInt(s2);
			int n=n1+n2;
			out.println("<html><body>");
			out.println("<h1>First Web App</h1>");
			out.println("<hello Servlet<br>");
			out.println("Sum of<b> "+n1+" </b>and<b> "+n2+" </b>=<b>"+n+"</b>");
			out.println("</body></html>");
		}catch(Exception e){
				out.println(e);
		}
	}
}