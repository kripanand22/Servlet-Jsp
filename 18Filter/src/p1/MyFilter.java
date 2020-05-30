package p1;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyFilter implements Filter {
	
	FilterConfig config;
	public void destroy() {
	}

	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		ServletContext ctx=config.getServletContext();
		Integer count=(Integer)ctx.getAttribute("count");
		if(count==null){
			count=new Integer(0);
		}
		count++;
		ctx.setAttribute("count", count);
		
		chain.doFilter(req,res);
		
	}
	public void init(FilterConfig c) throws ServletException {
		config=c;
	}
	
}
