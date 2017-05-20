package com.aks.jee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {

	LoginService lg= new LoginService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//		String name=request.getParameter("name");
		//		request.setAttribute("name",name);
		request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
		//		System.out.println(request.getParameter("name"));


	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name=request.getParameter("userid");
		String pass=request.getParameter("password");
		boolean isvalid= lg.isValidUser(name, pass);
		if(isvalid)
		{
			request.setAttribute("name", name);
			request.getRequestDispatcher("WEB-INF/views/flights.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("errorMessage","Invalid credentials..try again");
			request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
		}

	}

}
