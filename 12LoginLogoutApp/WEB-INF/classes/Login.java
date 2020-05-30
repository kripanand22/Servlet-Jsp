import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*; 
import java.sql.*;

public class Login extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
			PrintWriter out=null;
			try{
			res.setContentType("text/html");
			out=res.getWriter();
			String e=req.getParameter("email");
			String p=req.getParameter("pass");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Kripanand");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from test_info where Email_id='"+e+"' and pass='"+p+"'");
			if(rs.next()){
				ServletContext ctx=getServletContext();
				Integer ct=(Integer)ctx.getAttribute("count");
				if(ct==null){
					ct=0;
				}
				ctx.setAttribute("count",ct++);
				HttpSession hs=req.getSession();
				hs.setAttribute("email",e);
				hs.setAttribute("name",rs.getString("Name"));
				hs.setAttribute("age",rs.getString("Age"));
				hs.setAttribute("phone",rs.getString("Phone"));
				res.sendRedirect("Profile");
			}
			else{
				res.sendRedirect("loginerror.html");
			}
			out.close();
			}catch(Exception e){
				out.println(e);
				out.close();
			}
		}
}