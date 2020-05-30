import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*; 
import java.sql.*;

public class Register extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
			PrintWriter out=null;
			try{
			res.setContentType("text/html");
			out=res.getWriter();
			String e=req.getParameter("email");
			String n=req.getParameter("name");
			String p=req.getParameter("phone");
			String pa=req.getParameter("pass");
			String ab=req.getParameter("age");
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Kripanand");
			Statement st=con.createStatement();
			st.executeUpdate("Insert into test_info values ('"+n+"','"+p+"','"+ab+"','"+e+"','"+pa+"')");
			HttpSession hs=req.getSession();
			hs.setAttribute("email",e);
			hs.setAttribute("name",n);
			hs.setAttribute("phone",p);
			hs.setAttribute("age",ab);
			ServletContext ctx=getServletContext();
			Integer ct=(Integer)ctx.getAttribute("count");
			if(ct==null){
				ct=0;
			}
			ctx.setAttribute("count",ct++);
			res.sendRedirect("Profile");
			}catch(java.sql.SQLIntegrityConstraintViolationException ex){
				res.sendRedirect("registererror.html");
				out.close();
			}catch(Exception ex){
				out.println(ex);
				out.close();
			}
		}
}