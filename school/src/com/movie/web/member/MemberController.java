package com.movie.web.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.web.global.Action;
import com.movie.web.global.ActionForward;
import com.movie.web.global.Command;
import com.movie.web.global.CommandFactory;
import com.movie.web.global.Constants;

@WebServlet("/member/login_form.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	// 페이지 이동시에는 doGet  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doProc(request, response);
    	System.out.println("인덱스에서 들어옴");
    	CommandFactory fac = new CommandFactory();
		RequestDispatcher dis = 
			//	request.getRequestDispatcher(new Command(doProc(request,response)[0], doProc(request,response)[1]).getView());
				request.getRequestDispatcher(fac.getCommand(doProc(request,response)[0], doProc(request,response)[1]).getView());
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	public String[] doProc(HttpServletRequest request, HttpServletResponse response){
		String[] arr = new String[2];
		String path = request.getServletPath();
		String temp = path.split("/")[2];
		
		arr[0] = path.split("/")[1];
	//	arr[1] = temp3.split("\\.")[0]; 이 방법도 가능
		arr[1] = temp.substring(0, temp.indexOf("."));
		
		return arr;
	}

}
