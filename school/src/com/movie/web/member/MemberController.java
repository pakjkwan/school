package com.movie.web.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.movie.web.global.Command;
import com.movie.web.global.CommandFactory;
import com.movie.web.global.DispatcherServlet;
import com.movie.web.global.Seperator;

@WebServlet({"/member/login_form.do",
	"/member/join_form.do","/member/update_form.do",
	"/member/join.do","/member/update.do",
	"/member/login.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    MemberService service = MemberServiceImpl.getInstance();
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Command command = new Command();
    	MemberBean member = new MemberBean();
    	String[] str =	Seperator.extract(request);
		String directory = str[0], action = str[1];
		int result = 0;
		
		switch (action) {
		
		case "login" :
			
			if (service.isMember(request.getParameter("id")) == true) {
				System.out.println("=== 아이디가 존재함 ===");
				member = service.login(request.getParameter("id"), request.getParameter("password"));
				if (member == null) {
					command = CommandFactory.createCommand(directory,"login_form");
				}else{
					System.out.println("=== 로그인 성공 ===");
					request.setAttribute("member", member);
					command = CommandFactory.createCommand(directory,"detail");
				}
				
			} else {
				System.out.println("=== 로그인 실패 ===");
				command = CommandFactory.createCommand(directory,"login_form");
			}
			break;
			case "update_form":
				System.out.println("=== 수정 폼으로 진입 ===");
				request.setAttribute("member", service.detail(request.getParameter("id")));
				command = CommandFactory.createCommand(directory,action);
				break;
			case "delete" : 
				if (service.remove(request.getParameter("id")) == 1) {
					command = CommandFactory.createCommand(directory,"login_form");
				} else {
					request.setAttribute("member", service.detail(request.getParameter("id")));
					command = CommandFactory.createCommand(directory,"detail");
				}
				break;
		default:
			command = CommandFactory.createCommand(directory,action);
			break;
		}
		DispatcherServlet.go(request, response, command.getView());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Command command = new Command();
    	MemberBean member = new MemberBean();
    	String[] str =	Seperator.extract(request);
		String directory = str[0], action = str[1];
		switch (action) {
		case "join":
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPassword(request.getParameter("password"));
			member.setAddr(request.getParameter("addr"));
			member.setBirth(Integer.parseInt(request.getParameter("birth")));
			if (service.join(member)==1) {
				command = CommandFactory.createCommand(directory,"login_form");
			}else{
				command = CommandFactory.createCommand(directory,"join_form");
			}
			break;
		case "update":
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPassword(request.getParameter("password"));
			member.setAddr(request.getParameter("addr"));
			member.setBirth(Integer.parseInt(request.getParameter("birth")));
			if (service.update(member)==1) {
				request.setAttribute("member", service.detail(request.getParameter("id")));
				command = CommandFactory.createCommand(directory,"detail");
			}else{
				request.setAttribute("member", service.detail(request.getParameter("id")));
				command = CommandFactory.createCommand(directory,"update_form");
			}
			break;
		default:
			break;
		}
		DispatcherServlet.go(request, response, command.getView());
	}

}
