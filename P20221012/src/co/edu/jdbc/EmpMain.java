package co.edu.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		Scanner scn = new Scanner(System.in);
		Employee emp = null;

		// 메뉴 1.사원등록(insert) 2.한건조회(getEmp) 3.수정 4.삭제 5.목록

		int menu = scn.nextInt();

		while (true) {
			System.out.println("1.사원등록 2.사원조회 3.수정 4.삭제 5.목록 6.일괄등록 9.종료");
			if (menu == 1) {
				System.out.println("사원번호");
				int id = scn.nextInt();
				scn.nextLine();
				System.out.println("사원이름");
				String name = scn.nextLine();
				System.out.println("이메일");
				String mail = scn.nextLine();
				System.out.println("입사일자");
				String date = scn.nextLine();
				System.out.println("직무이름");
				String job = scn.nextLine();

				emp = new Employee(id, name, mail, date, job);
				dao.insert(emp);

			} else if (menu == 2) {
				System.out.println("사원조회");
				int no = scn.nextInt();
				scn.nextLine();
				dao.getEmp(no);
				System.out.println(dao.getEmp(no));

			} else if (menu == 3) {
				System.out.println("수정");

				System.out.println("사원번호");
				int id = scn.nextInt();
				scn.nextLine();
				System.out.println("사원이름");
				String name = scn.nextLine();
				System.out.println("이메일");
				String mail = scn.nextLine();
				System.out.println("입사일자");
				String date = scn.nextLine();
				System.out.println("직무이름");
				String job = scn.nextLine();

				emp = new Employee(id, name, mail, date, job);
				dao.update(emp);

			} else if (menu == 4) {
				System.out.println("삭제");
				System.out.println("사번 입력");
				int no = scn.nextInt();
				scn.nextLine();
//
//				dao.delete(no);

				// while(true){
				// if(dao.delete(10000))
				// System.out.println("정상적으로 삭제");
				// else System.out.println("삭제할 데이터가 없습니다")}

			} else if (menu == 5) {
				System.out.println("목록");
				List<Employee> employees = dao.search();

				for (Employee i : employees) {
					System.out.println(i);
				}
			} else if (menu == 6) {

			} else if (menu == 9) {
				System.out.println("종료합니다");
				break;
			}
			scn.close();
		}

	}

}
