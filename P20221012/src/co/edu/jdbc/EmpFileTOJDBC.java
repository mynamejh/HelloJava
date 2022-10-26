package co.edu.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;

public class EmpFileTOJDBC {
	public static void main(String[] args) {
		String[] emps = null;
		Employee employee = null;
		EmployeeDAO dao = new EmployeeDAO();
		
		
		try(
			FileReader fr= new FileReader ("C:/Temp/list.txt");
			BufferedReader br= new BufferedReader(fr); // 실행속도 빠르게
		){	
			while(true) {
			String emp = br.readLine(); //readLine() : 파일의 끝까지돌다가 반복문 종료
			if(emp == null)
				break;
			
			emps = emp.split(" ");
			employee = new Employee(Integer.parseInt(emps[0]),emps[1],emps[2],emps[3],emps[4]);
			dao.insert(employee);
		}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("completed");
	}
}