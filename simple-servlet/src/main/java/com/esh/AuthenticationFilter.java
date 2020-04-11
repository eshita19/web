package com.esh;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationFilter implements Filter {
	private List<String> excludedURLs;

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		if(!excludedURLs.contains(req.getRequestURI())){
			if(!getCookieVal(req.getCookies(), "userName").equals("1234")){
				((HttpServletResponse)response).sendRedirect("error.html");
			}
		}
		
		filterChain.doFilter(request, response);
	}
	
	public String getCookieVal(Cookie[] cookies, String cookieName){
		String cookieVal = null;
		for(Cookie cookie: cookies){
			if(cookie.getName().equals(cookieName)){
				cookieVal = cookie.getValue();
				break;
			}
		}
		return cookieVal;
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		excludedURLs =  Arrays.asList(filterConfig.getInitParameter("excludedURLs").split(","));
	}
}
