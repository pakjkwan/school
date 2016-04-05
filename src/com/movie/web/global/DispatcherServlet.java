package com.movie.web.global;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet {
	public static void go(HttpServletRequest request,HttpServletResponse response, String view){
		try {
			Command c = new Command();
			RequestDispatcher dis = request.getRequestDispatcher(view);
			dis.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
