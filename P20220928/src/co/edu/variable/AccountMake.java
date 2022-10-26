package co.edu.variable;

import java.util.Scanner;

public class AccountMake {
	public static void main(String[] args) {
	
//	1. 스캐너 기능 생성
	Scanner scan = new Scanner(System.in);
// 2. 스캐너가 가지고 있는 기능을 통해서 데이터 입력받음
	System.out.print("자기소개> "); // 화면에 보여주기 위해 적어둠
	String intro = scan.nextLine(); // 공백 포함/문자열

	System.out.println("이름 > ");
	String name = scan.nextLine();
	
	System.out.println("나이 > ");
		int num = scan.nextInt();
		for(int i=0; i<10; i++) {
		if(num<20) {
			System.out.println("미성년자 입니다");
		}else {
			System.out.println("성인입니다");
			
		}	
		break;
		}
		System.out.println(name + "의 나이는 " + num +" 입니다" );
	}
}