package com.movie.web.grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.movie.web.global.Constants;
import com.movie.web.member.MemberBean;

public class GradeDAOImpl implements GradeDAO {
	
	private Connection conn; // 오라클 연결 객체
	private Statement stmt; // 쿼리 전송 객체
	private PreparedStatement pstmt; // 쿼리 전송 객체2
	private ResultSet rs; // 리턴값 회수 객체
	
	@Override
	public void insert(GradeBean grade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<GradeBean> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GradeMemberBean selectGradeByHak(int hak) {
		MemberBean member = new MemberBean();
		GradeBean grade = new GradeBean();
		Map<String,Object> map = new HashMap<String,Object>();
		GradeMemberBean bean = new GradeMemberBean();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			conn = DriverManager.getConnection(Constants.ORACLE_URL,
					Constants.ORACLE_ID, Constants.ORACLE_PASSWORD);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM GradeMember WHERE hak ='"+hak+"'");
			while (rs.next()) {
				bean.setId(rs.getString("id"));
				bean.setName(rs.getString("name"));
				bean.setPassword(rs.getString("password"));
				bean.setAddr(rs.getString("addr"));
				bean.setBirth(rs.getInt("birth"));
				bean.setId(rs.getString("id"));
				bean.setHak(rs.getInt("hak"));
				bean.setJava(rs.getInt("java"));
				bean.setJsp(rs.getInt("jsp"));
				bean.setSpring(rs.getInt("spring"));
				bean.setSql(rs.getInt("sql"));
			}
			
		} catch (Exception e) {
			System.out.println("selectMember() 에서 에러 발생함 !!");
			e.printStackTrace();
		}
		// System.out.println("쿼리 조회 결과 :"+temp.getAddr());
		map.put("member", member);
		map.put("grade", grade);
		return bean;
	}

	@Override
	public ArrayList<GradeMemberBean> selecctGradesByName(String name) {
		// TODO Auto-generated method stub
		ArrayList<GradeMemberBean> list = new ArrayList<>();		
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			conn = DriverManager.getConnection(Constants.ORACLE_URL,
					Constants.ORACLE_ID, Constants.ORACLE_PASSWORD);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM GradeMember WHERE name ='"+name+"'");
			while (rs.next()) {
				GradeMemberBean gmb =new GradeMemberBean();
				gmb.setHak(rs.getInt("hak"));
				gmb.setId(rs.getString("id"));
				gmb.setJava(rs.getInt("java"));
				gmb.setJsp(rs.getInt("jsp"));
				gmb.setSql(rs.getInt("sql"));
				gmb.setSpring(rs.getInt("spring"));
				gmb.setPassword(rs.getString("password"));
				gmb.setAddr(rs.getString("addr"));
				gmb.setName(rs.getString("name"));
				gmb.setBirth(rs.getInt("birth"));
				list.add(gmb);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int count() {
		int count = 0;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			conn = DriverManager.getConnection(Constants.ORACLE_URL,
					Constants.ORACLE_ID, Constants.ORACLE_PASSWORD);
			stmt = conn.createStatement();
			stmt.executeQuery("SELECT * FROM GradeMember").last();
			count = rs.getRow();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public String update(GradeBean grade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(int hak) {
		// TODO Auto-generated method stub
		return null;
	}

}
