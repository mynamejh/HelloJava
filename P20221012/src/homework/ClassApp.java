package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		CustomerDAO dao = new CustomerDAO();
		SubjectDAO dao2 = new SubjectDAO();
		Customer cust = null;
		String logid = null;
		List<Customer> list = new ArrayList<>();

		while (true) {
			System.out.println("페이지 접속을 위해 회원 1번/ 강사 2번을 입력해주세요!");
			int who = Integer.parseInt(scn.nextLine());
			if (who == 2) {

				System.out.println("강사페이지 입니다!");
				System.out.println("로그인 페이지");
				System.out.println("아이디 입력>> ");
				String id = scn.nextLine();
				System.out.println("비밀번호 입력>> ");
				String passwd = scn.nextLine();

				if (dao.login(id, passwd)) {
					System.out.println("로그인 성공!");
					break;
				} else {
					System.out.println("로그인 실패!");
					continue;
				}
			} else {
				System.out.println("회원페이지 입니다!");
				System.out.println("<< 1.수업시간표 2.수업신청 3.마이페이지 >>");
				int menu = Integer.parseInt(scn.nextLine());
				if (menu == 1) {
					System.out.println("          <<  수업시간표  >>         ");

					List<Subject> list2 = dao.find();
					for (Subject i : list2) {
						System.out.println(i);
					
					}
				}else if(menu ==2) {
					System.out.println("수업 상세 조회");
					System.out.println("강사 조회>> ");
					String teacher = scn.nextLine();
					Subject x = dao2.getSub(teacher);
					System.out.println(x);
					dao2.getadd(teacher, who);
					System.out.println("등록하시겠습니까? 등록하려면 1번을 누르세요!");
						
					}
				
			}
		}
		while (true) {
			System.out.println("0.수업시간표 보기 1. 회원 등록 2. 회원 수정 3. 회원 삭제 4. 전체 목록 5. 회원 조회 6.종료");
			System.out.println("메뉴 선택>> ");
			int menu = Integer.parseInt(scn.nextLine());
			if (menu == 0) {

				System.out.println("          <<  수업시간표  >>         ");
				List<Subject> list2 = dao.find();
				for (Subject i : list2) {
					System.out.println(i);
				}

			} else if (menu == 1) {
				System.out.println("회원 등록");
				System.out.println("회원 이름>> ");
				String custName = scn.nextLine();
				System.out.println("회원 번호>> ");
				int custNum = Integer.parseInt(scn.nextLine());
				System.out.println("등록 날짜>> ");
				String date = scn.nextLine();
				System.out.println("회원 휴대전화 번호>> ");
				String custTel = scn.nextLine();

				cust = new Customer(custName, custNum, date, custTel);
				dao.insert(cust);
				System.out.println("등록 완료");

			} else if (menu == 2) {
				System.out.println("회원 수정");
				System.out.println("수정할 회원 번호>> ");
				int custNum = Integer.parseInt(scn.nextLine());
				System.out.println("수정할 회원 이름>> ");
				String custName = scn.nextLine();
				System.out.println("수정할 전화번호>> ");
				String custTel = scn.nextLine();

				cust = new Customer(custName, custTel, custNum);

				if (dao.getCust(custNum).getcustNum() == custNum) {
					dao.update(cust);
					;
					System.out.println("수정 완료");
				} else {
					System.out.println("수정 실패");
				}

			} else if (menu == 3) {

				System.out.println("회원 삭제");
				System.out.println("삭제할 회원 번호>> ");
				int number = scn.nextInt();
				scn.nextLine();
				System.out.println("진짜 삭제하시려면 1번을 눌러주세요! ");
				int number2 = Integer.parseInt(scn.nextLine());
				if (number2 == 1) {
					if (dao.delete(number)) {
						System.out.println("삭제 완료");
					}
				} else {
					System.out.println("삭제 실패");
				}
			} else if (menu == 4) {
				System.out.println("회원 목록");
				List<Customer> lists = dao.search();
				for (Customer i : lists) {
					System.out.println(i.getString());
				}
			} else if (menu == 5) {
				System.out.println("회원 상제 조회");
				System.out.println("회원 번호 >> ");
				int cNum = Integer.parseInt(scn.nextLine());
				Customer x = dao.getCust(cNum);
				System.out.println(x);

			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다");
				break;

			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다");
			}

		}

	}

}