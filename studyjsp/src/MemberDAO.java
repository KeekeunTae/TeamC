package com.hanul.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {				//DB와 연동
	private Connection conn; 			//연결객체
	private PreparedStatement ps; 		//전송객체
	private ResultSet rs;				//결과객체

	//DB에 접속 : ojdbc8.jar (C:\oracle18c\dbhomeXE\jdbc\lib) -> WebContent -> WEB-INF -> lib : 복붙 ->정적로딩
	public Connection getConn () {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "hanul";
		String password = "0000";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	//동적 로딩
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("getConn() 에러");
		}
		return conn; 
	}//getConn()
	
	//db접속 해제
	public void dbClose() {
		try {
			if (rs != null) rs.close();
			if (ps != null) ps.close();
			if (conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("dbClose() 에러");
		}
	}//dbclose()
	
	//회원가입
	public int memberInsert(MemberDTO dto) {
		conn = getConn(); 	//DB접속
		String sql = " insert into member values(?, ?, ?, ?, ?, ?) ";	//SQL 쿼리문 작성
		int succ = 0;		//SQL 쿼리문의 성공여부를 판단하기 위한 변수
		try {
			ps = conn.prepareStatement(sql); 	//전송객체에 SQL문을 담는다
			
			ps.setString(1, dto.getName());		//매개변수 값을 세팅
			ps.setString(2, dto.getId());
			ps.setString(3, dto.getPw());
			ps.setInt(4, dto.getAge());
			ps.setString(5, dto.getAddr());
			ps.setString(6, dto.getTel());
			succ = ps.executeUpdate(); 			// SQL문장을 실행
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("memberInsert() 에러");
		} finally {
			dbClose();							// DB 접속 해제
		}
		return succ; 		//결과 성공여부
	}//memberInsert()
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class
