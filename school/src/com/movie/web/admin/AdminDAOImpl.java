package com.movie.web.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.movie.web.global.Constants;
import com.movie.web.global.DatabaseFactory;
import com.movie.web.global.Vendor;

public class AdminDAOImpl implements AdminDAO{
	private Connection conn; // 오라클 연결 객체
	private Statement stmt; // 쿼리 전송 객체
	private PreparedStatement pstmt; // 쿼리 전송 객체2
	private ResultSet rs; // 리턴값 회수 객체
	private static AdminDAO instance = new AdminDAOImpl();
	
	public static AdminDAO getInstance() {
		return instance;
	}

	public AdminDAOImpl() {
		conn = DatabaseFactory.getDatabase(Vendor.ORACLE, Constants.ID, Constants.PASSWORD)
				.getConnection();
	}
	@Override
	public AdminBean selectAdmin(AdminBean admin) {
		AdminBean temp = new AdminBean();
		try {
			System.out.println("넘어온 admin Id "+admin.getId());
			pstmt = conn.prepareStatement("SELECT * FROM Admin WHERE id =? and password=?");
			pstmt.setString(1, admin.getId());
			pstmt.setString(2, admin.getPassword());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				temp.setId(rs.getString("id"));
				temp.setName(rs.getString("name"));
				temp.setPassword(rs.getString("password"));
				temp.setAddr(rs.getString("addr"));
				temp.setBirth(rs.getInt("birth"));
				temp.setRole(rs.getString("role"));
			}
			
		} catch (Exception e) {
			System.out.println("selectAdmin() 에서 에러 발생함 !!");
			e.printStackTrace();
		}
		System.out.println("쿼리 조회 결과 :"+temp.getRole());
		return temp;
	}

}
