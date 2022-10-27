package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	List<Student> list = new ArrayList<Student>();

	Scanner scn = new Scanner(System.in);
	
	public void execute() {
		boolean run = true;
		
		while (run) {
			System.out.println("1.학생입력 2.학생목록 3.학생상세조회 4.학생삭제 9.종료");
			int menu= scn.nextInt();
			
			switch(menu) {
			case 1:
				addList();
				break;
			case 2:
				boardList();
				break;
			case 3:
				searchList();
				break;
			case 4:
				deleteList();
				break;
			case 9:
				run = false;
				break;
			default:
				System.out.println("해당 메뉴가 없습니다 다시 시도하세요.");
			}
			break;
		}
		System.out.println("종료");
	}

	public void addList() {
//		Student student = null;
		
		int subMenu = scn.nextInt();
			System.out.println("학생 입력창입니다");
			System.out.println("1. 고등학교 2. 대학교");

			if (subMenu == 1) {
							
				System.out.println("학생 번호> ");
				int num = Integer.parseInt(scn.nextLine());
				scn.next();
				System.out.println("학생 이름> ");
				String name = scn.nextLine();
				scn.nextLine();
				System.out.println("학생 점수> ");
				int score = scn.nextInt();

				System.out.print("고등학교 입력 페이지");
				System.out.println("담임교사> ");
				String HighTeacher = scn.nextLine();
				System.out.println("학년> ");
				int grade = Integer.parseInt(scn.nextLine());
				
			student=new Student(num,name,score);

			} else if (subMenu == 2) {

				System.out.println("학생 번호> ");
				String num = scn.nextLine();
				scn.next();
				System.out.println("학생 이름> ");
				String name = scn.nextLine();
				scn.nextLine();
				System.out.println("학생 점수> ");
				int score = scn.nextInt();
				System.out.print("대학교 입력 페이지");
				System.out.println("담당 교수> ");
				String UniTeacher = scn.nextLine();
				System.out.println("전공 과목> ");
				String Subject = scn.nextLine();

			
			System.out.println("등록완료");
			
		} else {
			System.out.println("잘못 입력했습니다. 종료합니다");
		}
	}
	

	
	

	public void boardList() {
		System.out.println("글목록 기능");
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			if (list != null) {
				System.out.println(list.toString());

			}
		}
	}

	public void deleteList() { // 삭제 (번호)
		System.out.println("삭제할 학생의 학생번호 입력> ");
		int delNo = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < list.size(); i++) {
			if (delNo == list.get(i).getStudNo()) {
				list.remove(i);
				System.out.println("삭제완료");
			} else {
				System.out.println("해당 학생 번호가 없습니다");
			}

		}
	}

	public void searchList() { // 조회 (번호)
		System.out.println("조회할 학생의 학생번호 입력");
		int delNo = scn.nextInt();

		boolean exists = false;

		for (int i = 0; i < list.size(); i++) {
			if (delNo == list.get(i).getStudNo()) {
				System.out.println(list.get(i).toString());
				exists = true;

			} else {
				System.out.println("해당 학생 번호가 없습니다");

			}
		}
	}
}