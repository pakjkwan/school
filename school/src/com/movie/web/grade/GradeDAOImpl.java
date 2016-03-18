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
	public Map<String,Object> selectGradeByHak(int hak) {
		MemberBean member = new MemberBean();
		GradeBean grade = new GradeBean();
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			conn = DriverManager.getConnection(Constants.ORACLE_URL,
					Constants.ORACLE_ID, Constants.ORACLE_PASSWORD);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM Member WHERE id ='"+hak+"'");
			while (rs.next()) {
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPassword(rs.getString("password"));
				member.setAddr(rs.getString("addr"));
				member.setBirth(rs.getInt("birth"));
				grade.setHak(rs.getInt("hak"));
				grade.setJava(rs.getInt("java"));
				grade.setJsp(rs.getInt("jsp"));
				grade.setSpring(rs.getInt("spring"));
				grade.setSql(rs.getInt("sql"));
			}
			
		} catch (Exception e) {
			System.out.println("selectMember() 에서 에러 발생함 !!");
			e.printStackTrace();
		}
		// System.out.println("쿼리 조회 결과 :"+temp.getAddr());
		map.put("member", member);
		map.put("grade", grade);
		return map;
	}

	@Override
	public ArrayList<GradeBean> selecctGradesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
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
