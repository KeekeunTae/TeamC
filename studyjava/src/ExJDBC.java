import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
<<<<<<< HEAD
<<<<<<< HEAD

public class ExJDBC {
<<<<<<< HEAD
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
=======
	//
	//lib Api 가 반드시 필요하다
	//
	//oracle.jdbc.driver.OracleDriver;
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	
	
	public Connection getConn() {
		String url = "jdbc:oracle:thin:@125.136.151.206:1521:xe";
		String user = "hr";
		String password = "0000";
=======
=======
>>>>>>> 443ce8191cd59b9764c31a2afdaf61cced0ac35d
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
		
>>>>>>> 1ffaaa86f7a196a2870f89bec9af2d588463f529
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()) {
				System.out.println("열림");
			}
<<<<<<< HEAD
>>>>>>> origin/kwk
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
<<<<<<< HEAD

=======
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return conn;
		
	}
<<<<<<< HEAD
>>>>>>> 1ffaaa86f7a196a2870f89bec9af2d588463f529
=======
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
>>>>>>> 443ce8191cd59b9764c31a2afdaf61cced0ac35d
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
<<<<<<< HEAD
		} catch (Exception e) {
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
	
	public void dbClose() {
		try {
			if(rs != null) {rs.close();}
			if(ps != null) {ps.close();}
			if(conn != null) {conn.close();}
>>>>>>> origin/kwk
		} catch (Exception e) {
=======
		} catch (SQLException e) {
=======
		} catch (Exception e) {
>>>>>>> origin/jhi
>>>>>>> 443ce8191cd59b9764c31a2afdaf61cced0ac35d
>>>>>>> origin/kwk
			e.printStackTrace();
		}
	}
<<<<<<< HEAD
	
<<<<<<< HEAD
=======
<<<<<<< HEAD
	
	
		
	
=======
	public void selectUser() {
		conn = getConn();
		String sql = "select a.*, b.* " + 
				"from (select employee_id, first_name||' '||last_name name, email, salary, department_id " + 
				"from employees em) a, " + 
				"(select max(salary) max_sal, min(salary) min_sal from employees) b";
		try {
			ps = conn.prepareStatement(sql);
			//ps.setString(1, );
			
			int result = ps.executeUpdate();
			System.out.println(result +" select 성공");
		}catch (Exception e) {
			System.out.println("select 실패 ");
			e.printStackTrace();
		}
	}
>>>>>>> origin/kwk
=======
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
=======
<<<<<<< HEAD
>>>>>>> 443ce8191cd59b9764c31a2afdaf61cced0ac35d
	public ArrayList<JdbcDTO> memberSelect() {
		ArrayList<JdbcDTO> list = new ArrayList<>();
		conn = getConn();
		String sql = " select  a.*, b.* " + 
				"        " + 
				"		from  (select employee_id, first_name || ' ' || last_name name, email ,salary , department_id, manager_id  " + 
				"         from employees ) a , " + 
				"        (select max(salary) max_sal, min(salary) min_sal " + 
				"         from   employees) b ";
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {			//employee_id, name, email, salary, department_id, manager_id, max_sal, min_sal
				list.add(new JdbcDTO   (rs.getInt("employee_id"), 
										rs.getString("name"),
										rs.getString("email"), 
										rs.getInt("salary"),
										rs.getString("department_id"),
										rs.getString("manager_id"),
										rs.getInt("max_sal"),
										rs.getInt("min_sal")));
				for (JdbcDTO dto : list) {
					System.out.println(dto.getEmployee_id() + " " + 
									   dto.getFirst_name() + " " + 
									   dto.getLast_name() + " " + 
									   dto.getEmail() + " " + 
									   dto.getSalary() + " " + 
									   dto.getDepartment_id() + " " + 
									   dto.getManager_id());
				}
			}
		} catch (Exception e) {
			System.out.println("memberSelect()에서 에러 발생!");
		} finally {
			dbClose();
		}
		return list;
	
	}
<<<<<<< HEAD
>>>>>>> 1ffaaa86f7a196a2870f89bec9af2d588463f529
=======
=======
>>>>>>> origin/kwk
	
	
		
	
<<<<<<< HEAD
=======
>>>>>>> origin/jhi
>>>>>>> 443ce8191cd59b9764c31a2afdaf61cced0ac35d
>>>>>>> origin/kwk
}
