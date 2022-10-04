package co.edu.emp;



//추가 수정 조회 삭제 crud 처리(기능만 넣는)

public interface EmployeeService {
	//저장공간 생성

	public void init();

	public void input();

	public String search(int employeeId); 

	public void print();

}
