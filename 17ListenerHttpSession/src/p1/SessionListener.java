package p1;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class SessionListener implements HttpSessionListener {
	ServletContext ctx=null;
	private static int sessionCurrent=0,sessionTotal=0;
    public void sessionCreated(HttpSessionEvent e)  { 
    	sessionCurrent++;
    	sessionTotal++;
    	ctx=e.getSession().getServletContext();
    	ctx.setAttribute("TotalSession",sessionTotal);
    	ctx.setAttribute("CurrentSession",sessionCurrent);
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	sessionCurrent--;
    	ctx.setAttribute("CurrentSession", sessionCurrent);
    }
	
}
