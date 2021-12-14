package pratik.HttpStateless;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet  {
	
	protected void processRequest(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
resp.setContentType("text/html;charset=UTF-8");
		
		try {
			PrintWriter out= resp.getWriter();
			
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet Servlet1</title>");
			out.println("</head>");
			out.println("<body>");
			
			
			String name=req.getParameter("name");
			out.println("<h1>Hello , "+ name + "welcome back to my website...<h1>" );
			out.println("<h1>thank you</h1>");
			out.println("</body>");
			out.println("</html>");
			
		} catch (Exception e) {
			
		}
	}


}
