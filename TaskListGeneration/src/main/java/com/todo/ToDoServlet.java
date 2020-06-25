package com.todo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.jsp.*;

import com.login.LoginUserValidationService;
import com.todo.ToDoService;
@WebServlet(urlPatterns = "/todo.do")
public class ToDoServlet extends HttpServlet {
		ToDoService todo = new ToDoService();
		LoginUserValidationService usrValid = new LoginUserValidationService();
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{	
			
			request.setAttribute("name",request.getParameter("name"));
			request.setAttribute("todo",(todo.Retrive()));
			request.getRequestDispatcher("/WEB-INF/views/TODO.jsp").forward(request, response);
		}
	
		
}
