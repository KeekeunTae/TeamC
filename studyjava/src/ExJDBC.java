import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
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
}
