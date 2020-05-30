package pa;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class Lis implements HttpSessionListener {
	ServletContext ctx=null;
    private static int currentsession=0,totalsession=0;
    public void sessionCreated(HttpSessionEvent e)  { 
    	++currentsession;
    	++totalsession;
    	ctx=e.getSession().getServletContext();
    	ctx.setAttribute("currentsession",currentsession);
    	ctx.setAttribute("totalsession",totalsession);
    }
    public void sessionDestroyed(HttpSessionEvent ex)  { 
    	currentsession--;
    	ctx=ex.getSession().getServletContext();
    	ctx.setAttribute("currentsession",currentsession);
    }
	
}
