package com.movie.web.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/login_form.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	// 페이지 이동시에는 doGet  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("인덱스에서 들어옴");
		RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/views/member/login_form.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
