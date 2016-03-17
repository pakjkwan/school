package com.movie.web.member;

public class MemberBean {
	private String id, password, name, addr;
	private int birth; // 생년월일은  800101 처럼 숫자만 입력
	
	public MemberBean() {} // 생성자 오버로딩
	public MemberBean(String id,String password, String name, String addr, int birth) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.addr = addr;
		this.birth = birth;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "회원정보 [아이디=" + id + ", 비번=" + password + ", 이름=" + name 
				+ ", 주소=" + addr + ", 생년월일="
				+ birth + "]";
	}
}
