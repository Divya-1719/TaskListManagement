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
@WebServlet(urlPatterns = "/add-ToDo.do")
public class addServlet extends HttpServlet {
		ToDoService todo = new ToDoService();
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{	
			request.getRequestDispatcher("/WEB-INF/views/add.jsp").forward(request, response);
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{	
				String addtodo = request.getParameter("newtodo");
				String category = request.getParameter("newcategory");
				todo.Add(new ToDo(addtodo,category));
				response.sendRedirect("/todo.do");
		
			}
	
		
}
