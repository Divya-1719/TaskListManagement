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
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
		ToDoService todo = new ToDoService();
		LoginUserValidationService usrValid = new LoginUserValidationService();
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{	
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{	
				String name = request.getParameter("name");
				Integer Pwd = Integer.parseInt(request.getParameter("passcode"));
				boolean Result = usrValid.userValid(name,Pwd);
				if(Result == true){
					request.getSession().setAttribute("name", name);
				//In order to print todolist redirect to todo servlet
				response.sendRedirect("/todo.do");
				}
				else{
					request.setAttribute("ErrorMessage", "Invalid User Credentials!!!");
					request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);	
				}
		}
		
}
