package p1;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTag extends TagSupport {
	JspWriter out=pageContext.getOut();
	public int doStartTag() throws JspException{
		try{
			out.print("hello");
			
		}catch(Exception ex){}
			return SKIP_BODY;
		
	}
		public int doEndTag() throws JspException{
			try{
				int a=10,b=20;
				int c=a+b;
				out.print("sum = "+c);
			}catch(Exception ex){}
				return EVAL_PAGE;
		}
}
