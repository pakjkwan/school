package com.movie.web.member;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

@WebServlet({ "/member/login_form.do", "/member/join_form.do", "/member/update_form.do", "/member/join.do",
		"/member/update.do", "/member/delete.do", "/member/login.do","/member/list.do" })
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemberService service = MemberServiceImpl.getInstance();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Command command = new Command();
		MemberBean member = new MemberBean();
		HttpSession session = request.getSession();
		String[] str = Seperator.extract(request);
		List<MemberBean> list = new ArrayList<MemberBean>();
		String directory = str[0], action = str[1];
		int result = 0;

		switch (action) {

		case "update_form":
			System.out.println("=== 수정 폼으로 진입 ===");
			command = CommandFactory.createCommand(directory, action);
			break;
		case "delete":
			if (service.remove(request.getParameter("id")) == 1) {
				command = CommandFactory.createCommand(directory, "login_form");
			} else {
				command = CommandFactory.createCommand(directory, "detail");
			}
			break;
		case "login":

			if (service.isMember(request.getParameter("id")) == true) {
				System.out.println("=== 아이디가 존재함 ===");
				member = service.login(request.getParameter("id"), request.getParameter("password"));
				if (member == null) {
					command = CommandFactory.createCommand(directory, "login_form");
				} else {
					System.out.println("=== 로그인 성공 ===");
					session.setAttribute("user", member);
					command = CommandFactory.createCommand(directory, "detail");
				}

			} else {
				System.out.println("=== 로그인 실패 ===");
				command = CommandFactory.createCommand(directory, "login_form");
			}
			break;
		case "join":
			/*
			Map<String,String[]> map = new HashMap<String,String[]>();
			map = request.getParameterMap();
			String[] arr = map.get("subject"); // java/jsp/spring
			StringBuffer buff = new StringBuffer();
			for (int i = 0; i < arr.length; i++) {
				buff.append(arr[i]+"/");
			}
			*/
			
			String[] arr = request.getParameterValues("subject");
			StringBuffer buff = new StringBuffer();
			for (int i = 0; i < arr.length; i++) {
				buff.append(arr[i]+"/");
			}
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("id"));
			member.setPassword(request.getParameter("id"));
			member.setAddr(request.getParameter("id"));
			member.setBirth(Integer.parseInt(request.getParameter("id")));
			member.setMajor(request.getParameter("id"));
			member.setSubject(buff.toString());
			if (service.join(member) == 1) {
				command = CommandFactory.createCommand(directory, "login_form");
			} else {
				command = CommandFactory.createCommand(directory, "join_form");
			}
			break;
		case "update":
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPassword(request.getParameter("password"));
			member.setAddr(request.getParameter("addr"));
			member.setBirth(Integer.parseInt(request.getParameter("birth")));
			if (service.update(member) == 1) {
				session.setAttribute("user", service.detail(request.getParameter("id")));
				command = CommandFactory.createCommand(directory, "detail");
			} else {
				command = CommandFactory.createCommand(directory, "update_form");
			}
			break;
		case "logout":
			session.invalidate();
			command = CommandFactory.createCommand(directory, "login_form");
			break;
		case "list":
			request.setAttribute("list", service.getList());
			command = CommandFactory.createCommand(directory, "member_list");
			break;
		default:
			command = CommandFactory.createCommand(directory, action);
			break;
		}
		DispatcherServlet.go(request, response, command.getView());
	}

}
