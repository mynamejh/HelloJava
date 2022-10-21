package co.edu.emp;

public class EmployeeVO {
	private int employeeId;
	private String firstName;
	private String lastname;
	private String email;
	private String hiredate;
	private String jobId;
	
	
	public EmployeeVO(int employeeId, String firstName, String lastname, String email, String hiredate, String jobId) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastname = lastname;
		this.email = email;
		this.hiredate = hiredate;
		this.jobId = jobId;
		
	}


	public EmployeeVO(int employeeId, String lastname, String email, String hiredate, String jobId) {
		this.employeeId = employeeId;
		this.lastname = lastname;
		this.email = email;
		this.hiredate = hiredate;
		this.jobId = jobId;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getHiredate() {
		return hiredate;
	}


	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}


	public String getJobId() {
		return jobId;
	}


	public void setJobId(String jobId) {
		this.jobId = jobId;
	}


	
	@Override
	public String toString() {
		return "EmployeeVO [employeeId=" + employeeId + ", firstName=" + firstName + ", lastname=" + lastname
				+ ", email=" + email + ", hiredate=" + hiredate + ", jobId=" + jobId + "]";
	}
	
}


//empl테이블 칼럼: employee_id, first_name, last_name, email, hire_date, job_id -> 칼럼가져오기
//VO(value Object) 한건한건 내용을 넣겠다 => 제목 클래스