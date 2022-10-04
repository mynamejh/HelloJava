package co.edu.emp;

import java.util.Scanner;

//main (제일 처음에 시작하는 메소드)
public class EmployeeApp {
	public static void main(String[] args) {
// 1. 사원수(초기화) 2.사원정보입력 3.사원검색 4.사원리스트 9 종료
	Scanner scn = new Scanner(System.in);
	EmployeeService service = new EmployeeArray();
	
		while(true) {
		System.out.println("1. 사원수(초기화) 2.사원정보입력 3.사원검색 4.사원리스트 9 종료");
		System.out.print("메뉴를 선택하세요>>");
		int menu = Integer.parseInt(scn.nextLine()); //메뉴 변수는 int타입  "1" -> 1 문자 1을 숫자 1로
		if(menu==1) {
			service.init(); //초기화 기능
			
		}else if(menu==2) {
			service.input(); // 입력 기능
			
		}else if(menu==3) {
			System.out.println("검색할 사원 번호 입력하세요>>");
			int eId = Integer.parseInt(scn.nextLine()); // nextLine = enter값까지 들고 오겠다
			String name = service.search(eId);// 이름 받아오기
			System.out.println("사원의 이름은 " + name);
			
		}else if(menu ==4) {
			service.print();
			
		}else if(menu ==9) {
			System.out.println("프로그램을 종료합니다");
			break;
		}
	}
	System.out.println("프로그램 종료");
	}//end of main()
}//end of class
