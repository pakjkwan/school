package com.movie.web.admin;

import java.util.List;

import com.movie.web.grade.GradeMemberBean;

public interface AdminService {
	public List<GradeMemberBean>getMemberList();
	public int addScore(GradeMemberBean bean);
	public AdminBean getAdmin(AdminBean admin);
}
