//without Filter class user will be able to navigate to todo page directly in order to authenticate the user 
//before ach servlet call we can use Filter to intersept servlet calls in this waybefore the call
//getting transfered to another the servlet the filter being called intermidiately.
package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;
@WebFilter(urlPatterns = "*.do")//To make the filter act on all url with ".do",if multiple paramneed to pass as={"/.do",}
public class LoginRequiredFilter implements Filter {
	//Filter interface has its 3 methosd that need to implemented

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	//dofilter is the method that is getting call between to intercept the call to servlets
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		//method gets called when particular url is called
		HttpServletRequest request = (HttpServletRequest)servletRequest;//Type casted the Servletreq to HTTPservlet req
		HttpServletResponse response = (HttpServletResponse)servletResponse;
		if(request.getSession().getAttribute("name") != null){
			System.out.println(request.getRequestURI());
			chain.doFilter(servletRequest,servletResponse );//Without this method  Filter will block all the calls to the servlet and nothing will show up
			
		}
		else{
			request.getRequestDispatcher("/login.do").forward(servletRequest,servletResponse);
			//response.sendRedirect("/login.do");
		
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
