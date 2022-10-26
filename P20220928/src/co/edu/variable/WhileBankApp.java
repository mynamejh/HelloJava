package co.edu.variable;
import java.util.Scanner;

// 계좌정보 선언: 계좌번호, 예금주, 잔고 
// 은행 계좌 생성: Account[] banks;
public class WhileBankApp {
	public static void main(String[] args) {
	// 메뉴: 1.예금, 2.출금, 3.잔액조회, 4.종료

		Account[] banks = new Account[10];
		Scanner scn = new Scanner(System.in);

		while(true) {
			System.out.println("0.계좌생성, 1.예금, 2.출금, 3.잔액조회, 4.종료");
			int menu = scn.nextInt();scn.nextLine();

			if(menu == 1) {
	// 예금기능
				System.out.println("계좌번호 입력 >>> ");
				String accNo = scn.nextLine();
				System.out.println("예금할 금액 입력 >>> ");
				int money = scn.nextInt();
				
				for(int i = 0; i<banks.length; i++) {
					if(banks[i] != null && banks[i].getAccNo(null).equals(accNo)) {
						if(banks[i].getBalance() + money <100000 ) {
							System.out.println(money+"원이 입금되었습니다");
							banks[i].setBalance(banks[i].getBalance() + money);
							System.out.println("현재 잔고는"+banks[i].getBalance()+"원 입니다");
							break;
						}
						System.out.println("예치가능한 금액을 초과합니다");
					}
				}
			}else if(menu == 2) {
	//출금 기능.
		//계좌조회
				System.out.println("계좌번호 입력 >>> ");
				String accNo = scn.nextLine();
		//출금액 입력
				System.out.println("출금할 금액 입력 >>> ");
				int money = scn.nextInt();
		//출금 진행
				for(int i = 0; i<banks.length; i++) {
					if(banks[i] != null && banks[i].getAccNo(null).equals(accNo)) {
						if(banks[i].getBalance() - money >0 ) {
							System.out.println(money+"원이 인출되었습니다");
							banks[i].setBalance(banks[i].getBalance() - money);
							System.out.println("현재 잔고는"+banks[i].getBalance()+"원 입니다");
							break;
						}
						System.out.println("잔고가 부족합니다");
					}
				}
			}else if(menu == 3) {
	//잔액 조회

				System.out.println("조회할 계좌번호 입력 >>> ");
				String accNo = scn.nextLine();

				for(int i=0; i<banks.length; i++) {
					if(banks[i] != null && banks[i].getAccNo(null).equals(accNo)) {
						System.out.println("예금주: '"+banks[i].getOwner(null)+"' 잔액: " + banks[i].getBalance());
					}
				}
			}else if(menu == 4) {
	//시스템 종료
				System.out.println("시스템을 종료하였습니다");
				break;
			}else if(menu == 0) {
	//계좌 생성
				System.out.println("계좌번호 입력 >>> ");
				String accNo = scn.nextLine();
				System.out.println("예금주 이름 입력 >>> ");
				String owner = scn.nextLine();

		//인스턴스 생성.
				Account acc = new Account(); 
				acc.setAccNo(accNo);
				acc.setOwner(owner);
	    //계좌번호 생성.
				
				for(int i=0; i<banks.length; i++) {
					if(banks[i] == null) {
	    //계좌 한건 입력+ break;
						banks[i] = acc;
						break;
					}
				}
				System.out.println("계좌 생성 완료.");

			}//else end
		}// while end
	}// method end
}//class end

//for(int i=0; i<banks.length; i++) {
//if( banks[i] != null &&banks[i].accNo != acc.accNo) {
//	
//	break;
//}System.out.println("이미 존재하는 계좌번호입니다");
//}
//