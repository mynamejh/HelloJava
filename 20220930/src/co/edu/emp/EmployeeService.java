package co.edu.emp;



//추가 수정 조회 삭제 crud 처리(기능만 넣는)
public interface EmployeeService {
	//저장공간 생성

	public void init();

	public void input();

	public String search(int employeeId); //사원아이디에 이름 반환
	public void print();
	  // 사원아이디에 급여 반환

	 public int searchSal(int employeeId);

}
