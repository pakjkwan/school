package com.movie.web.global;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			conn = DriverManager.getConnection(Constants.ORACLE_URL,
					Constants.ID, Constants.PASSWORD);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM Test");
			String sample = "";
			while (rs.next()) {
				sample = rs.getString("sample");
			}
			System.out.println("샘플 : "+sample);
			
		} catch (Exception e) {
			System.out.println("테스트 에러발생");
			e.printStackTrace();
		} 
		
	}
}
