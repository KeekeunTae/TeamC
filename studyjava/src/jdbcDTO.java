
public class JdbcDTO {
	private int employee_id		;     	 //number(6,0)
	private String first_name		;    //varchar2(20 byte)
	private String last_name		;    //varchar2(25 byte)
	private String name;
	private String email			;    //varchar2(25 byte)
	private String phone_number		;    //varchar2(20 byte)
	private String hire_date		;    //date
	private String job_id			;    //varchar2(10 byte)
	private int salary			;        //number(8,2)
	private int commission_pct	;        //number(2,2)
	private int manager_id		;        //number(6,0)
	private int department_id	;        //number(4,0)
	private int max_sal	;        //number(4,0)
	private int min_sal	;        //number(4,0)
	
	public JdbcDTO(int employee_id, String first_name, String last_name, String email, String phone_number,
			String hire_date, String job_id, int salary, int commission_pct, int manager_id, int department_id) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
		this.hire_date = hire_date;
		this.job_id = job_id;
		this.salary = salary;
		this.commission_pct = commission_pct;
		this.manager_id = manager_id;
		this.department_id = department_id;
	}
	




	


	
	public JdbcDTO(int employee_id, String name, String email, int salary, String department_id, String manager_id, int max_sal,
			int min_sal) {
		this.employee_id = employee_id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.department_id = department_id;
		this.manager_id = manager_id;
		this.max_sal = max_sal;
		this.min_sal = min_sal;
		
	}










	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getHire_date() {
		return hire_date;
	}

	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommission_pct() {
		return commission_pct;
	}

	public void setCommission_pct(int commission_pct) {
		this.commission_pct = commission_pct;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	
	
	
}
