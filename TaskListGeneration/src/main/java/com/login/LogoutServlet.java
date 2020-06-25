package com.login;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.jsp.*;

import com.todo.ToDoService;
@WebServlet(urlPatterns = "/logout.do")
public class LogoutServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{	
			request.getSession().invalidate();
			request.getRequestDispatcher("/login.do").forward(request, response);
		}
	

		
}
