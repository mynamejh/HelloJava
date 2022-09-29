package co.edu.variable;

import java.util.Scanner;

public class WhileBank {

	public static void main(String[] args) {
		bankApp();
	}

	public static void bankApp() {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int money = 0;
	
	while(run) {
		System.out.println("메뉴: 1예금, 2출금, 3잔고, 4종료");
		//메뉴: 1예금, 2출금, 3잔고, 4종료
		//(제약1 : 예금 10만원을 넘지 않도록 한다! 10만원 이상시 예금실패)
		int menu = scn.nextInt();
		switch(menu) {
		case 1: 
			System.out.println("예금처리 메뉴입니다");
			System.out.println("예금액을 입력하세요!");
			int input = scn.nextInt();
			if(money + input > 100000) {
				System.out.println("입금 그만!");	
				// 잔고에 돈 입금됨!ㅠㅠ
			}else{
				money = money +input;
			}
			break;
		case 2: 
			System.out.println("출금처리 메뉴입니다");
			System.out.println("출금액을 입력하세요!");
			int output= scn.nextInt();
			if(money-output<0) {
				System.out.println("잔고부족!");
			}else {
				money= money-output;
			}
			break;
		case 3:	
			System.out.println("잔고처리 메뉴입니다");
			System.out.println("현재 잔고는 " + money + " 입니다." );
	
			break;
		case 4:	
			System.out.println("종료 메뉴입니다"); 
			run = false;
			}
		}
			System.out.println("end of pgm");
	}

}
