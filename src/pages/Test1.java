package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/test1" })
public class Test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init() throws ServletException {
		System.out.println("in init of  "+getClass()+"invoked by "+Thread.currentThread());
	}

	
	public void destroy() {
		System.out.println("in destroy of  "+getClass()+"invoked by "+Thread.currentThread());
System.out.println("");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in  of doGet "+getClass()+"invoked by "+Thread.currentThread());
		response.setContentType("text/html");
		try(PrintWriter pw= response.getWriter())
		{
			pw.print("<h1> Hello from servlets lab  "+LocalTime.now()+"<h1>");
			
			System.out.printl("Hello from dhananjay");
			System.out.println("changes");
			//System.out.printl("Hello from kanchan");
			//System.out.println("Test changes");
		}
	}

}
