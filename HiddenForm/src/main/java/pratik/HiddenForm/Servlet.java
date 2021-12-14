package pratik.HiddenForm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("user_name");
		
		out.println("<h1> Your name is : "+name+"</h1>");
		//out.println("<a href='servlet1?user="+name+"'>Go to second servlet</a>");
		
	}

}
