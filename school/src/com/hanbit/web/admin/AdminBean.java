package com.hanbit.web.admin;

import com.hanbit.web.member.MemberBean;

public class AdminBean extends MemberBean{
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
