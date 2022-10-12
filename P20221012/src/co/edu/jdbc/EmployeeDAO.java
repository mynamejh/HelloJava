package co.edu.jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO extends DAO {
	
	
	public void delete(int empId) {
		String sql = "delete from empl where employee_id = ?";
		conn=getConnect();
		
		try {
		psmt=conn.prepareStatement(sql);
		psmt.setInt(1, empId);
		
		int r= psmt.executeUpdate();
		System.out.println(r+ "건 삭제됨");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

	public void update(Employee emp) {
		String sql = "update empl "
					+ "set email = ?, "
				    + "hire_date = ?, "
				    + "job_id =? "
				    + "where employee_id =?";
		conn = getConnect();
		
		try {
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, emp.getEmail());
		psmt.setString(2, emp.getHireDate());
		psmt.setString(3, emp.getJobId());
		psmt.setInt(4, emp.getEmployeeId());

		int r = psmt.executeUpdate();
		System.out.println(r+"건 변경됨");
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	public void insert(Employee emp) {
		System.out.println(emp);
		String sql = "insert into empl (employee_id,last_name,email,hire_date,jobId)" + " values( "
				+ emp.getEmployeeId() + "', '" + emp.getLastName() + "', '" + emp.getEmail() + "', '"
				+ emp.getHireDate() + "', '" + emp.getJobId() + "')";

		conn = getConnect();
		try {// 쿼리 실행할 객체 stmt
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 입력됨");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 조회
	public List<Employee> search() {
		conn = getConnect();
		List<Employee> list = new ArrayList<Employee>(); // 1반환하기 위한 값 저장!

		try { // 쿼리 실행 : executeQuery
			stmt = conn.createStatement();
			rs=stmt.executeQuery("select * from empl");
			while (rs.next()) { //next(): 데이터 계속 읽어옴 다 읽어오면 false
				list.add(new Employee(rs.getInt("employee_id") 
						, rs.getString("last_name") 
						, rs.getString("email")
						, rs.getString("hire_date")
						, rs.getString("job_id")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
	public Employee getEmp(int empId) {
		// 한건만 반환시켜라!
		
		conn = getConnect();
		Employee emp =null;
		List<Employee> list = new ArrayList<Employee>();

		
		try {
			psmt = conn.prepareStatement("select * from empl where employee_id =?");
			rs=psmt.executeQuery();
			psmt.setInt(1, empId);
			
					if(rs.next()) {//next(): 데이터 계속 읽어옴 다 읽어오면 읽을게 없으니까 false
				new Employee(rs.getInt("employee_id")
						, rs.getString("last_name") 
						, rs.getString("email")
						, rs.getString("hire_date")
						, rs.getString("job_id")
						);

			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return null;
	}
	}

