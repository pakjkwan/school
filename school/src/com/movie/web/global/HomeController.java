package com.movie.web.global;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/global/main.do")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Command command = new Command();
    	String path = request.getServletPath();
		String temp = path.split("/")[2];
		String directory = path.split("/")[1];
	//	arr[1] = temp3.split("\\.")[0]; 이 방법도 가능
		String action = temp.substring(0, temp.indexOf("."));
		command = CommandFactory.createCommand(directory,action);
		RequestDispatcher dis = 
				request.getRequestDispatcher(command.getView());
				dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
