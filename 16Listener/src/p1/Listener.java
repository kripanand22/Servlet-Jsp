package p1;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;

public class Listener implements ServletContextListener {
	Connection con;
	PrintWriter out=null;
	
    public void contextInitialized(ServletContextEvent event)  { 
        try{
        	Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Kripanand");
			Statement st=con.createStatement();
			ServletContext ctx=event.getServletContext();
			ctx.setAttribute("dbCon", con);
			ctx.setAttribute("stmt", st);
        }catch(Exception ex){
        	ex.printStackTrace();
        }
    }
    
    public void contextDestroyed(ServletContextEvent e)  { 
    	try{
    		con.close();
    	}catch(Exception ex){
    		out.println(ex);
    	}
    }
	
}
