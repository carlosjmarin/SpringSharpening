package com.freshspring;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		//Instead of PrintWriter, we will be using JSP since java is bad at dynamic html
//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Success!!</title>");
//		out.println("<head>");
//		out.println("<body>");
//		out.println("My First Servlet");
//		out.println("</body>");
//		out.println("</html>");
		
	}
	
}
