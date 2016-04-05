package com.movie.web.grade;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.web.global.Command;
import com.movie.web.global.CommandFactory;
import com.movie.web.global.DispatcherServlet;
import com.movie.web.member.MemberBean;
import com.movie.web.member.MemberService;
import com.movie.web.member.MemberServiceImpl;


/**
 * Servlet implementation class GradeController
 */
@WebServlet({"/grade/my_grade.do","/grade/add_form.do"})
public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Command command = new Command();
		GradeService service = new GradeServiceImpl();
		MemberService memberService = MemberServiceImpl.getInstance();
    	GradeBean grade = new GradeBean();
    	MemberBean member = new MemberBean();
    	String id="";
    	String path = request.getServletPath();
		String temp = path.split("/")[2];
		String directory = path.split("/")[1];
	//	arr[1] = temp3.split("\\.")[0]; 이 방법도 가능
		String action = temp.substring(0, temp.indexOf("."));
		switch (action) {
		case "my_grade":
			
			break;
		case "add_form":
			request.setAttribute("member", memberService.detail(request.getParameter("id")));
			CommandFactory.createCommand(directory, action);
			break;
		default:
			break;
		}
		DispatcherServlet.go(request, response, command.getView());
		
	}

}
