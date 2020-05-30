package p1;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Login")
public class Login extends HttpServlet {
		protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException  {
			HttpSession session=null;
			try {
				session=request.getSession();
				String email = request.getParameter("email");
			    String password = request.getParameter("password");
			    
			    Db.DbConnect db=new Db.DbConnect();
			    java.util.HashMap userDetails=db.checkLogin(email, password);
			    db.dbDisconnect();
			    if(userDetails!=null){
			    	session.setAttribute("userDetails",userDetails);
			    	
			    	ServletContext application=getServletContext();
			    	Integer count=(Integer)application.getAttribute("count");
			    	if(count==null){
			    		count=0;
			    	}
			    	application.setAttribute("count", ++count);
			    	response.sendRedirect("Profile.jsp");
			    }else{
			    	session.setAttribute("msg","Wrong Entries");
			    	response.sendRedirect("home.jsp");
			    }
			}catch(Exception ex){
				session.setAttribute("exception", ex);
				response.sendRedirect("exception.jsp");
			}
		}
	}

