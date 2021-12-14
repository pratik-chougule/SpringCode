package pratik.Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Cookie;

@SuppressWarnings("serial")
public class SFCookie extends HttpServlet {
	
	 public void doGet (HttpServletRequest	request,HttpServletResponse	response ) throws ServletException, IOException
		
	 {
				PrintWriter		out;
				// set content type and other response header fields first
			     response.setContentType("text/html");

				// then write the data of the response
				out = response.getWriter();
			//get values submitted by the form
			String income = request.getParameter("income");
			String tax = request.getParameterValues("tax")[0];
			// here we can use jdbc to store the values in database
				out.print("<html>   <head>     <title>Income tax details</title>");
				out.print("  </head>  <body bgcolor=#ffffff>"); 
				out.print("Thanks for submitting income tax form<br>");
				out.print(" following information is stored in our database");
				out.print(income+"<br>"+ tax +"<br>");
				javax.servlet.http.Cookie[] c= request.getCookies();
				if(c!=null){
				for(int i =0 ;i<c.length;i++)
					out.println(c[i].getName() +"....."+c[i].getValue());
				}
				out.print(" <BR><BR>Like this we can store the state of a client on client by using Cookies");
				out.print("</body> </html>");
				out.close();
	 }		   

}
