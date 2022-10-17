package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		CustomerDAO dao = new CustomerDAO();
		Customer cust = null;
		String logid = null;
		List<Customer> list= new ArrayList<>();
		
//		String lecId = "jihyun";
//		String pwd = "1234";
//		
//		
//		while(true) {
//			System.out.println("로그인 페이지");
//			System.out.println("아이디 입력>> ");
//			String id = scn.nextLine();
//			System.out.println("비밀번호 입력>> ");
//			String passwd = scn.nextLine();
//			
//
//			if(!(id.equals(lecId) && passwd.equals(pwd))) {
//				System.out.println("잘못 입력했습니다..");
//				continue;
//			}

	while(true) {
		System.out.println("1. 회원 등록 2. 회원 수정 3. 회원 삭제 4. 전체 목록 5. 회원 조회 6.종료");
		System.out.println("메뉴 선택>> ");
		int menu= Integer.parseInt(scn.nextLine());
		if(menu==1) {
			System.out.println("회원 등록");
			System.out.println("회원 이름>> ");
			String custName = scn.nextLine();
			System.out.println("회원 번호>> ");
			int custNum = Integer.parseInt(scn.nextLine());
			System.out.println("등록 날짜>> ");
			String date = scn.nextLine();
			System.out.println("회원 휴대전화 번호>> ");
			String custTel = scn.nextLine();
			
			cust = new Customer(custName,custNum, date, custTel);
			dao.insert(cust);
			
			System.out.println("등록 완료");
		
		}else if(menu ==2) {
			System.out.println("회원 수정");
			System.out.println("수정할 회원 번호>> ");
			int custNum= Integer.parseInt(scn.nextLine());
			System.out.println("수정할 회원 이름>> ");
			String custName = scn.nextLine();
			
			cust= new Customer(custNum, custName);
			
			if(dao.getCust(custNum).getcustName().equals(logid)) {
				dao.update(cust);
				
				System.out.println("수정 완료");
				
			}else {
				System.out.println("수정 실패");
			}
						
		}else if(menu ==3 ) {
			System.out.println("회원 삭제");
			System.out.println("삭제할 회원 번호>> ");
			int custNum= Integer.parseInt(scn.nextLine());
			
			if(dao.getCust(custNum).getcustName().equals(logid)) {
				dao.delete(custNum);
				System.out.println("삭제 완료");
				
			}else {
				System.out.println("삭제 실패.");
			}
			
		}else if(menu==4) {
			System.out.println("회원 목록");
			List<Customer> lists = dao.search();
			for(Customer i : lists) {
				System.out.println(i.getString());
			}
		}else if(menu==5) {
			System.out.println("회원 상제 조회");
			System.out.println("회원 번호 >> ");
			
			int cNum = Integer.parseInt(scn.nextLine());
			
			Customer x = dao.getCust(cNum);
			
			}	
		else if(menu == 6) {
			System.out.println("프로그램을 종료합니다");
			break;
		}else {
			System.out.println("메뉴를 잘못 입력하셨습니다"); 
		}
		break;
	}
	
	
	
	}
		
}
//}


	

