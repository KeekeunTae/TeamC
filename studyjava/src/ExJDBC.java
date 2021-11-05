import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExJDBC {
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
			if(rs != null) {rs.close();}
			if(ps != null) {ps.close();}
			if(conn != null) {conn.close();}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
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
}
