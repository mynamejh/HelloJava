package co.edu.crud;

import java.util.Scanner;

public class board2DAO {
		private static board2DAO instance = new board2DAO();
		private board2DAO() {}
		public static board2DAO getInstance() {
		return instance;
		}
		
		Scanner sc = new Scanner(System.in);
		board2[] myboard = new board2[100];
		
		
	public void exe() {
		boolean run = true;
		while(run) {
			System.out.println("1.책 등록 2.책 목록 3.책 상세보기 4.책 삭제 5. 종료");
		
			System.out.println("선택>> ");
		
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			addBoard();
			break;
		case 2:
			boardList();
			break;
		case 3:
			boardDetail();
			break;
		case 4:
			delBoard();
			break;
		case 5:
			run = false;
			break;
		default:
			System.out.println("잘못된 메뉴입니다");
			
			}
		
		}
		System.out.println("프로그램 종료");
	}

		
		
		

	public void addBoard() {
		sc.nextLine();
		System.out.println("책 이름 등록!");
		System.out.println("책 제목 입력>>> ");
		String book=sc.nextLine();
		System.out.print("작가 등록>>> ");
		String writer = sc.nextLine();
		System.out.print("내용 등록>>> ");
		String content = sc.nextLine();
		System.out.print("분류 번호 등록>>> ");
		int bookNo = sc.nextInt();
		System.out.println("책 가격 등록>>> ");
		int price = sc.nextInt();		
		
		board2 brd = new board2(book, writer, content, bookNo, price);
		for(int i=0; i<myboard.length; i++) {
			if(myboard[i]==null) {
				myboard[i] = brd;
				break;
			}
		}
		
	}
	
	public void boardList() {
		System.out.println("책 목록 기능");
	
		for(int i=0; i<myboard.length; i++) {
			System.out.println(myboard[i].toString());
		}
		
		
	}
	
	
	public void boardDetail() {
		System.out.println("책 상세보기 기능 ");
		System.out.println("책 번호 입력>> ");
		int book = sc.nextInt();
		for(int i=0; i<myboard.length; i++) {
			if(myboard[i]!=null && myboard[i].getBookNo()==(book)) {
				System.out.println(myboard[i].toString());
			}
		}
	}
	
	
	public void delBoard() {
		System.out.println("책 삭제 기능");
		System.out.println("책 번호 입력>> ");
		int book = sc.nextInt();
		for(int i=0; i<myboard.length; i++) {
			if(myboard[i]!=null && myboard[i].getBookNo()==(book)) {
				myboard[i]=null;
			}
		}
	}

}