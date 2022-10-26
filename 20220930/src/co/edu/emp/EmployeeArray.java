package co.edu.emp;

import java.util.InputMismatchException;
import java.util.Scanner;

//배열을 활용해서 정보를 저장함
public class EmployeeArray implements EmployeeService {
	Employee[] list;
	int idx = 0;
	Scanner scn = new Scanner(System.in);

	@Override
	public void init() {
		System.out.println("사원수 입력>> ");
		int cnt = Integer.parseInt(scn.nextLine());
		list = new Employee[cnt]; // 5개 크기 인스턴스를 저장할 수 있는 공간 생성
		//

	}

	@Override
	public void input() {
		if (idx >= list.length) {
			System.out.println("더 이상 입력불가");
			return;
		}

		System.out.println("사번 입력>> ");
		try {
		int eId = Integer.parseInt(scn.nextLine());
		}catch(NumberFormatException e){
			System.out.println("숫자를 입력하세요");
		}
		
		System.out.println("이름 입력>> ");
		String name = scn.nextLine();
		System.out.println("부서 입력>>");
		try {
		int deptId = Integer.parseInt(scn.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("잘못 입력했습니다. 숫자를 입력하세요");
		}
		System.out.println("급여 입력>>");
		int sal = Integer.parseInt(scn.nextLine());
		// input() 추가


//		list.add(new Employee(eId, name, sal, deptId));
	}

	@Override
	public String search(int employeeId) {
		// 입력된 값 중에서 찾도록. 배열의 크기 list[5] 
//		=> idx -> 지금 들어있는 크기만큼 돌려라~
		
		String result = null;
		for (int i = 0; i < idx; i++) {
			if (list[i].getEmployeeId() == employeeId) {
				result = list[i].getName();
				break;
			}
		}
		return result;
	}

	@Override
	public void print() {
		for (int i = 0; i < idx; i++) {
			System.out.printf("%5d %10s %7d\n", list[i].getEmployeeId(), list[i].getName(), list[i].getSalary());
		}

	}

	@Override
	public int searchSal(int employeeId) {
		int result = -1; // 왜? -1
		for (int i = 0; i < idx; i++) {
			if (list[i].getEmployeeId() == employeeId) {
				result = list[i].getSalary();
				break;
			}
		}
		return result;
	}

}
