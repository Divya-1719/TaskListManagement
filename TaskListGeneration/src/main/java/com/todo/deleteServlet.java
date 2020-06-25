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
@WebServlet(urlPatterns = "/delete-ToDo.do")
public class deleteServlet extends HttpServlet {
	ToDoService todo = new ToDoService();	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{	
			String deletename = request.getParameter("todo");
			String deletecategory = request.getParameter("category");
			todo.delete(new ToDo(deletename,deletecategory));
			response.sendRedirect("/todo.do");
		}
			
	
		
}
