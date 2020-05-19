import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class JdbcServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res){
		PrintWriter out=null;
		try{
			res.setContentType("text/html");
			out=res.getWriter();
			String e=req.getParameter("email");
			out.println("<html><body>");
			out.println("<h1>JDBC EXAMPLE</h1>");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Kripanand");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from test_info where Email_id='"+e+"'");
			//out.println(rs);
			if(rs.next()){
				out.println("Email Id:-<b>"+e+"</b><br/>");
				out.println("Name:-<b>"+rs.getString(2)+"</b><br/>");
				out.println("phone:-<b>"+rs.getString(3)+"</b><br/>");
				out.println("age:-<b>"+rs.getString(4)+"</b><br/>");
			}
			else{
				out.println("Wrong Email Id !");
			}
		}catch(Exception e){
				out.println(e);
		}
	}
}