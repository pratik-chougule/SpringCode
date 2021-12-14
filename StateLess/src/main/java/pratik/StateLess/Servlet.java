package pratik.StateLess;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet")
public class Servlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		resp.setContentType("text/html;charset=UTF-8");
		try {
		PrintWriter out = resp.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Servlet Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		
		String name =req.getParameter("name");
		out.println("<h1>Hello , " + name + "welcome to my website...</h1>");
		out.println("<h1><a href='servlet1'> Go to servlet 1</a></h1>");
		out.println("</body>");
		out.println("</html>");
		
	}catch (Exception e) {
		// TODO: handle exception
	}

	
	}
	
	
}
