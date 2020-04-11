package com.esh;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	private String userName= "eshita", password="1234";
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("userName").equals(userName) && request.getParameter("password").equals(password)){
			Cookie cookie = new Cookie("userName", "eshita");
			cookie.setMaxAge(1000);
			response.addCookie(cookie);
			request.getRequestDispatcher("welcome.html").forward(request, response);
		}else{
			response.sendRedirect("error.html");
		}
	}
}
