package com.movie.web.admin;

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
import com.movie.web.member.MemberBean;

/**
 * Servlet implementation class AdminController
 */
@WebServlet({"/admin/admin_form.do","/admin/login_form.do","/admin/login.do"})
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Command command = new Command();
		AdminBean admin = new AdminBean();
		HttpSession session = request.getSession();
		AdminService service = AdminServiceImpl.getInstance();
		String[] str = Seperator.extract(request);
		String directory = str[0], action = str[1];
		int result = 0;

		switch (action) {

		case "admin_form": command = CommandFactory.createCommand(directory, action); break;
		case "login" :
			System.out.println("관리자 로그인 진입");
			admin.setId(request.getParameter("id"));
			admin.setPassword(request.getParameter("password"));
			AdminBean temp = service.getAdmin(admin);
			if (temp == null) {
				System.out.println("관리자 로그인 실패");
				command = CommandFactory.createCommand(directory, "login_form");
			} else {
				System.out.println("관리자 로그인 성공");
				session.setAttribute("admin", temp);
				command = CommandFactory.createCommand(directory, "admin_form");
			}
			
			break;
		
		default:
			command = CommandFactory.createCommand(directory, action);
			break;
		}
		DispatcherServlet.go(request, response, command.getView());
    }

}
