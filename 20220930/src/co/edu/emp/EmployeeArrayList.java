package co.edu.emp;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.ArrayList;
import java.util.Scanner;

//컬렉션을 활용해서 데이터를 저장하는 기능 
public class EmployeeArrayList implements EmployeeService {

	ArrayList<Employee> list;
	int idx = 0;
	Scanner scn = new Scanner(System.in);
	private Object vaildDept;

	@Override
	public void init() {
		list = new ArrayList<Employee>();
		System.out.println("초기화 완료");

	}

	@Override
	public void input() {
		int eId = readInt("사번>> ");
		System.out.println("이름 입력");
		String name = scn.nextLine();
	
		System.out.println("부서 입력");
		public int readInt(String msg) {
		int dept = -1;
		while(true) {
			dept = readInt("부서>> ");
			try {
				vaildDept(detpId);
				break;
			}catch(NumberFormatException e1) {
					System.out.println("잘못 입력했습니다. 숫자를 입력하세요");
				}

	

		System.out.println("급여 입력");
		int sal = Integer.parseInt(scn.nextLine());
		
		list.add(new Employee(eId, name, sal, deptId));
	
	}

	@Override
	public String search(int employeeId) {
		String result = null;
		for (int i = 0; i < list.size(); i++) {
//1. 첫번째 방법: Employee emp = list.get(i);
//if(emp.getEmployeeId() == employeeID){if문 }
//2번째 방법 ▼:
			if (list.get(i).getEmployeeId() == employeeId) {
				result = list.get(i).getName();
				break;
			}
		}
		return result;
	}
//	3번째 방법 ▼:
//	Employee emp = list.get(i);
//	for(Employee emp: list){
//	if(emp.getEmployeeId() == employeeId{
//	result = emp.getName();
//	break;}}

	@Override
	public void print() {
		System.out.printf("%5s %10s %7s\n", "사원번호", "이름", "급여");
		System.out.println("=====================");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%5d %10s %7d\n", list.get(i).getEmployeeId(), list.get(i).getName(),
					list.get(i).getSalary());
		}

	}

	@Override
	public int searchSal(int employeeId) {
		// 사원번호에 해당되는 급여를 반환하도록 함
		int result = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getEmployeeId() == employeeId) {
				result = list.get(i).getSalary();
				break;
			}
			return result;
		}
	}
	public void vaildDept(int dept) throws InvalidDnDOperationException
	
	
	
	public int readInt(String msg) {
		int result = -1;
		while(true) {
		result = 
			try {
				result 
			}
		}
	}
}