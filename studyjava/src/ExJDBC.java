import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
<<<<<<< HEAD
import java.sql.SQLException;
import java.util.ArrayList;



public class ExJDBC {
	//Java <=> Oracle
	//Lib Api 가 반드시 필요하다.
	//OracleDriverManager <-
	//File jar 파일을 프로젝트에 추가한다.
	//pom.xml (Maven) Dependency (의존성) 연결 프로젝트 마우스 오른쪽 -> build path -> configure build path
	// lib -> add External jars -> 경로 찾은 후 apply
	
	//oracle.jdbc.driver.OracleDriver// <- Ojdbc.jar 파일에 있는 클래스가 정상적으로 임포트 됐는지 확인
	//DB에 접속하는 방법들.
	//Mybatis(Xml, ConnectionPool, mapper, .....) , JDBC (Connection, PrepartdStateMent, ResultSet)
	//Connection 연결 (DB와 연결)
	Connection conn;		//Oracle 접속(연결)
	PreparedStatement ps;	//sql문 실행(연결을 통해서 sql문을 전송)
	ResultSet rs;			//전송한 결과를 출력하기위한 결과객체
	
	//DB 초기화식
	//DataBase에 접속하기 위해서는 밙드시 있어야함 Url, User, Password
	//Myssql, Mssql, MongDb, MariaDB
	public Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "hr";
		String password = "0000";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()) {
				System.out.println("열림");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return conn;
		
	}
=======

public class ExJDBC {
	//JAVA <=> Oracle
	//Lib Api 가 반드시 필요하다.
	//OracleDriverManager <-
	//File jar파일을 프로젝트에 추가한다(프로젝트 마우스 오른쪽 클릭 -> Build path -> Configur Build path
	//라이브러스 탭에서 external Jars . 파일선택
	//프로젝트 밑에 ref lib <- 추가한 jar 파일이 있는지 확인
	//pom.xml (Maven) dependancy(의존성)
	//oracle.jdbc.driver.OracleDriver // <- Ojdbc.jar 파일에 이쓴 클래스가 정상적으로 임포트 됬는지 확인
	//DB에 접속하는 방법들
	//Mybatis(xml, Connection, mapper), JDBC( Connection, PreparedDtateMent, ResultSet) 등
	//Connection 연결 ( DataBase와 연결)
	Connection conn;	//oracle 접속
	PreparedStatement ps;	//sql문 실행 (연결을 통해서 sql문을 전송해서)
	ResultSet rs;			//전송한 결과를 출력하기 위한 객체 (결과 객체)
	
	//DB 초기화식
	//DataBase에 접속하기 위해서는 반드시 url, user, password
	//Myssql, Mssql, MongDb, MariaDB <- where employee_id = employee_id(+)
	
	public Connection getConn() {

		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "hr";
		String password = "0000";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

>>>>>>> origin/jhi
	public void dbClose() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
		
	
}
