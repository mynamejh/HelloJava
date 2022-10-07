package co.edu.collect;

import java.util.ArrayList;
import java.util.Scanner;

class Employee2 {
	int empId;
	String empName;
	int salary;

	public Employee2(int empId, String empName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}

}

public class MorningCode {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Employee2>list = new ArrayList<>();
		System.out.println("입력>> ex) 100 홍길동 2500");
		
		while(true) {
			System.out.print(">>");
		String inputVal = scn.nextLine();
		String[] inputs = inputVal.split("");
		
		
		if(inputs[0].equals("quit"))
			break;
		
		
		if(inputs.length !=3) {
		System.out.println("다시입력..");
		continue;
		}
		
		list.add(new Employee2(inputs[0], inputs[1],Integer.parseInt(input[2]));
		
		

		

			
	

		for(Employee2 emp: list) {
			System.out.println(emp);
		}

//		ArrayList<String> name = new ArrayList<>();
//		ArrayList<String> dept = new ArrayList<>();
//		ArrayList<Integer> salary = new ArrayList<>();
//		Arr

// String tok = "Hello World Good";
//		Scanner scn = new Scanner(tok);
//		Scanner scanner = new Scanner(System.in);
//		while(scn.hasNext()) // hasNext => 가지고있는거 출력
//			System.out.println(scn.next());

//		String[] toks= tok.split(" ");
//		for(String str: toks) {
//			System.out.println(str);
//		}

// 첫번째 값-> empId, 두번째 값-> empName, 세번째 값-> salary
// employee클래스의 인스턴스 생성
// ArrayList 저장
// 종료를 하고 싶으면 quit 누르면 종료.
// for(반복문) 출력

}

}
