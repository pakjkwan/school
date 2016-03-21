package com.movie.web.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.web.global.Command;
import com.movie.web.global.CommandFactory;

@WebServlet({"/member/login_form.do",
	"/member/join_form.do",
	"/member/join.do",
	"/member/login.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	// 페이지 이동시에는 doGet  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("인덱스에서 들어옴");
    	Command command = new Command();
    	String path = request.getServletPath();
		String temp = path.split("/")[2];
		String directory = path.split("/")[1];
	//	arr[1] = temp3.split("\\.")[0]; 이 방법도 가능
		String action = temp.substring(0, temp.indexOf("."));
		
		switch (action) {
		case "join":
			String id = request.getParameter("id");
			System.out.println("ID :"+id);
			break;
		case "login" :
			System.out.println("====  로그인 ===========");
			command = CommandFactory.createCommand(directory,"detail");
			break;
		default:
			command = CommandFactory.createCommand(directory,action);
			break;
		}
		System.out.println("오픈될 페이지 :"+command.getView());
		RequestDispatcher dis = 
		request.getRequestDispatcher(command.getView());
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
