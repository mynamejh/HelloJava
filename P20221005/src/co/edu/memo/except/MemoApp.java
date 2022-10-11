package co.edu.memo.except;

import java.util.Scanner;

import co.edu.memo.MENU;

public class MemoApp {
	public static void main(String[] args) {
		MemoManager menager = MemoManager.getInstance();
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			try {
			System.out.println("1. 등록 2. 검색 3. 삭제 4. 종료");
			System.out.println("선택>>> ");
			
			int menu = Integer.parseInt(scn.nextLine());
			
			if(menu<MENU.INSERT || menu >MENU.EXIT) {
				throw new MenuException(menu);
			  }
				switch(menu) {
				case MENU.INSERT:
					//입력작업
					menager.inputData();
					break;
					
				case MENU.SEARCH:
					//조회작업
					menager.searchData();
					break;
				
				case MENU.DELETE:
					//삭제처리
					menager.deleteDate();
					break;
					
				case MENU.EXIT:
					//새로운 파일 저장
					menager.storeTOFile();
					throw new ExitException();
				}
			}catch(MenuException e) {
				e.showErrMessage();
			}catch(ExitException e) {
				break;
			}
		}// end of while
		System.out.println("프로그램 종료");
		scn.close();
	}
}
