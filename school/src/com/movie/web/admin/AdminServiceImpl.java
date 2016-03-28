package com.movie.web.admin;

import java.util.HashMap;
import java.util.List;

import com.movie.web.grade.GradeMemberBean;
import com.movie.web.member.MemberBean;
import com.movie.web.member.MemberDAO;
import com.movie.web.member.MemberDAOImpl;
import com.movie.web.member.MemberService;
import com.movie.web.member.MemberServiceImpl;

public class AdminServiceImpl implements AdminService{
	private static	AdminService instance = new AdminServiceImpl();
	HashMap<String,AdminBean> map;
	AdminDAO dao = AdminDAOImpl.getInstance();
	public AdminServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static AdminService getInstance() {
		return instance;
	}

	public static void setInstance(AdminService instance) {
		AdminServiceImpl.instance = instance;
	}

	@Override
	public List<GradeMemberBean> getMemberList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addScore(GradeMemberBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AdminBean getAdmin(AdminBean admin) {
		
		AdminBean temp = new AdminBean();
		temp = dao.selectAdmin(admin);
		if (temp != null) {
			System.out.println("어드민 서비스 : 관리자가 널이 아님");
			return temp;
		} else {
			System.out.println("어드민 서비스 : 관리자가 널임");
			return null;
		}
	}

}
