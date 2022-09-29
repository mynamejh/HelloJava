package co.edu.variable;

import java.util.Scanner;

// 계좌 정보 선언: 계좌번호, 예금주, 잔고정보
// 은행 계좌 생성: Account[] banks;
// 미션. 누구계좌에 예금하고 출금 잔액 확인 할건지 찾기

public class WhileBankApp {
	public static void main(String[] args) {
		Account[] banks = new Account[10]; // bank 어카운트 배열에 몇번째에 값을 넣겠습니다
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("0:계좌 생성, 1:예금, 2:출금, 3:잔액, 4:종료");
			int menu = scn.nextInt();scn.nextLine();

			if (menu == 1) {
				//예금기능. 계좌번호 입력받으면 얼마를 넣겠습니까?
				System.out.println("계좌번호>>>  ");
				String accNo = scn.nextLine();
				System.out.println("예금할 금액>>> ");
				int money = scn.nextInt();
				for(int i=0; i<banks.length; i++) {
					if(banks[i].accNo.equals(accNo)) {
						banks[i].balance = banks[i].balance+ money;
					}else {
						System.out.println("맞는 계좌가 없습니다~");
						break;
					}
				}
			} else if (menu == 2) {
				System.out.println("조회할 계좌번호 입력>>>  ");
				String accNo = scn.nextLine();
				System.out.println("출금할 금액>>> ");
				int output= scn.nextInt();
				
					for(int i=0; i<banks.length; i++) {
						if(banks[i] !=null && banks[i].accNo.equals(accNo)) {
						int money = output;
						System.out.println("잔액: " + banks[i].balance);
						}else {
							System.out.println("맞는 계좌가 없습니다~");
							break;
						} else if (menu == 3) {
				System.out.println("조회할 계좌번호 입력>>>  ");
				String accNo = scn.nextLine();
				for(int i=0; i<banks.length; i++) {
					if(banks[i] !=null && banks[i].accNo.equals(accNo)) {
						System.out.println("잔액: " + banks[i].balance);
					}
				}
				
			} else if (menu == 4) {
				break;
			}
					
			}else if(menu ==0) {
				System.out.println("계좌번호입력>>>  ");
				String accNo = scn.nextLine();
				System.out.println("예금주>>>  ");
				String owner = scn.nextLine();
				Account acc= new Account(); // 인스턴스 생성.
				acc.accNo = accNo;
				acc.owner = owner;
				
				//계좌번호 생성.
				for(int i=0; i<banks.length; i++) {
					
					if(banks[i]==null) {
					// 한건입력. break;	
						banks[i] = acc;
						break;
					}	
				}
			System.out.println("계좌생성완료.");
			}

		}
	}
}
