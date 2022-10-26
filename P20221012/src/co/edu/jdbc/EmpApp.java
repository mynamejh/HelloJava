
package co.edu.jdbc;

import java.util.List;

public class EmpApp {
	public static void main(String[] args) {
		EmployeeDAO empDao = new EmployeeDAO();
		
		int empId= 600;
		String lastName = "Hong";
		String email = "hongkil@email";
		String jobId = "ST_MAN";
		String hireDate = "2021-05-11";
		
		Employee emp1 = new Employee(empId, lastName, email, hireDate, jobId);
		
//		empDao가 가지고 있는 insert메소드 호출
//		empDao.insert(emp1);
//		empDao.update(emp1);
		System.out.println(empDao.getEmp(empId));
//		empDao.delete(empId);
		
		//조회.
		List<Employee> employees = empDao.search();
		
		for(Employee emp : employees) {
			System.out.println(emp);
		}
	}
}
