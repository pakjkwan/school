package com.movie.web.member;

import java.util.HashMap;

public class MemberServiceImpl implements MemberService{
	
	HashMap<String,MemberBean> map;
	MemberDAO dao = new MemberDAOImpl();
	
	public MemberServiceImpl() {
		map = new HashMap<String,MemberBean>();
	}
	@Override
	public void join(MemberBean member) {
		// 회원가입
		map.put(member.getId(), member);
	}

	@Override
	public void login(String id, String password) {
		// 로그인
		// 아이디가 존재하지 않아서 실패한 경우와 비번이 틀려서 실패한 경우에 따라서
		// 메시지를 전달해줘야 함
		
	}

	@Override
	public void update(MemberBean member) {
		// 수정
		
	}

	@Override
	public void remove(String id) {
		// 삭제
		
	}

	@Override
	public MemberBean detail(String id) {
		return dao.selectMember(id);
		
	}

}
