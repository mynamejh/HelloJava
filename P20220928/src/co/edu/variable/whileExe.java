package co.edu.variable;

import java.util.Scanner;

public class whileExe {
	public static void main(String[] args) {
//		whileFnc();
//		whileFnc2();
		whileFnc3();
	}
	//# 캘린더 입력받기
	public static void whileFnc3() {
		// 보고싶은 달을 입력받고. 종료하고 싶으면 -1를 입력하세요!
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("월을 선택하세요. 종료는 -1를 입력하세요");
//			String input = scn.nextLine();
			int input2 = scn.nextInt(); //정수값으로 받아들임
			if(input2 ==-1) {
				break;
			}
			MethodCalendar.makeCal(input2);
			System.out.println(); // 끝에 줄바꿈 설정!
		}
		System.out.println("end of pgm");
	}
	
	public static void whileFnc2() {
		Scanner scn = new Scanner(System.in); // import:ctrl+shf+o
		while (true) {
			System.out.println("값을 입력하세요. 종료하려면 stop을 입력하세요");
			String inputVal = scn.nextLine();
			if (inputVal.equals("stop")) {
				break;

			}
			System.out.println("사용자 입력값>" + inputVal);
		}
		System.out.println("end of program");
		scn.close(); // 시스템 자원 반환
	}

	public static void whileFnc() {
		// for 반복문: 반복횟수, for(int i=0; i<10; i++){}
		int i = 0;
		while (i < 4) {
			System.out.println(i);
			i++;
		}
		System.out.println("end if program");
	}
}
