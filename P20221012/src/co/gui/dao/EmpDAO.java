package co.gui.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO extends DAO { // DAO는 데이터베이스 기능을 처리하는 클래스
	
	//입력
	public void insertEmp(EmployeeVO vo) { //매개값이 employeeVo vo
		 getConnect();//연결
		 String sql = "insert into empl (employee_id, first_name, last_name, email, hire_date, job_id)"
				 + "values(employees_seq.nextval,?,?,?,?,?)";//sql 구문써주기
		 
		 try {
			psmt = conn.prepareStatement(sql); //위에 쿼리(sql)를 실행시켜줌 psmt
			psmt.setString(1, vo.getFirstName()); //vo가 가지고 있는 것 순서에 맞게 적어줘야함
			psmt.setString(2, vo.getLastname());
			psmt.setString(3, vo.getEmail());
			psmt.setString(4, vo.getHiredate());
			psmt.setString(5, vo.getJobId());
			
			int r = psmt.executeUpdate();// 쿼리 실행한 결과 값을 가져옴
			System.out.println(r+ "건 입력됨");
		 
		 
		 } catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}
	
	//삭제
	
	public void deleteEmp(int employeeId) { //employee_id 기준으로 삭제하겠다!
		getConnect();
		String sql = "delete from empl where employee_id=?";
		try{
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, employeeId);
			int r= psmt.executeUpdate(); //쿼리실행
			System.out.println(r + "건 삭제됨");
	
	}catch(SQLException e){
		e.printStackTrace();
	}finally {
		disconnect();
	}
	}	
	//수정
	public void updateEmp(EmployeeVO vo) {
		getConnect();
		String sql="update empl set first_name=?, last_name=?, email=?, hire_date=? job_id where employee_id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getFirstName());
			psmt.setString(2, vo.getLastname());
			psmt.setString(3, vo.getEmail());
			psmt.setString(4, vo.getHiredate());
			psmt.setString(5, vo.getJobId());
			psmt.setInt(6, vo.getEmployeeId());
			
			int r = psmt.executeUpdate(); //실제 쿼리 실행할때 쓰는 구문
			System.out.println(r +"건 변경됨");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}
		
	
	
	//목록
	public List<EmployeeVO> empList(EmployeeVO vo){ // <employeeVo> 전체 다 목록을 가져온다.
		List<EmployeeVO> empList = new ArrayList<EmployeeVO>(); // 리스트에 값 넣어주는 list변수 생성!		
		getConnect();
		String sql = "select * from empl"
				+ "	where employee_id = decode(?, 0, employee_id, ?)"
				+ "	and first_name like '%'||?||'%' " //두문장을 연결기호: || 
				+ "	and last_name like '%'||?||'%' "
				+ "	and email like '%'||?||'%' "
				+ "	and to_char(hire_date, 'yyyy-mm-dd') like '%'||?||'%' " //to_char데이트 타입을 문자로 가져오겠다
				+ "	and job_id = nvl(?, job_id) "
				+ "	order by employee_id";
		
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setInt(1, vo.getEmployeeId());
			psmt.setInt(2, vo.getEmployeeId());
			psmt.setString(3, vo.getFirstName());
			psmt.setString(4,vo.getLastname());
			psmt.setString(5, vo.getEmail());
			psmt.setString(6, vo.getHiredate());
			psmt.setString(7, vo.getJobId());
			
			
			rs = psmt.executeQuery(); // 쿼리결과 실행
			while(rs.next()) {
				int empId = rs.getInt("employee_id"); //rs이 getint가지고 있는 employee_id칼럼을 가져오겠다
				String fName= rs.getString("first_name");
				String lName= rs.getString("last_name");
				String email = rs.getString("email");
				String hDate = rs.getString("hire_date");
				String jobId = rs.getString("job_id");
				
				EmployeeVO emp = new EmployeeVO(empId, fName, lName, email, hDate, jobId);
				empList.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empList;
		
	}
	
	
}
