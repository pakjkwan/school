package com.movie.web.member;

import java.util.List;

public interface MemberDAO {
	public int insert(MemberBean member);
	public MemberBean selectById(String id, String password);
	public MemberBean selectMember(String id);
	public int update(MemberBean member);
	public int delete(String id);
	public boolean isMember(String id);
	public List<MemberBean> selectList();
}
