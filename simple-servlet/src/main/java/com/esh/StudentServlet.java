package com.esh;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("name").equals("eshita")) {
			request.getRequestDispatcher("welcome.html").forward(request, response);
		} else if (request.getParameter("name").equals("saurabh")) {
			response.sendRedirect("https://www.google.com/");
		} else {
			response.getWriter().println(getServletConfig().getInitParameter("userName") + " Not authorized");
		}
	}
}
