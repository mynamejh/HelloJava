package co.edu.board;

import java.util.Scanner;

//기능만 넣는곳
public class BoardDAO { //데이터 접근객체
	//Singleton 방식의 인스턴스 생성!
	private static BoardDAO instance= new BoardDAO();//필드 이름이 instance
	private BoardDAO() {} // 생성자 부분 //private 쓰면 외부에서 접근x
		public static BoardDAO getInstance() { //메소드부분
			return instance; //getInstance가 instance를 제공하고 있다
		}
	
	Scanner scn = new Scanner(System.in); //-> 전체 메뉴에서 사용할거기때문에 클래스부분에 설정
	board[] myBoards = new board[100]; // 100개짜리 공간을 만들었다
	
	// 1, 글등록
	public void addBoard() {
		System.out.println("글 등록 기능");
		System.out.print("글번호 입력>> ");
		int bNo= scn.nextInt();
		scn.nextLine();
		System.out.print("글 제목 입력>> ");
		String title = scn.nextLine();
		System.out.print("글 내용 입력>> ");
		String content = scn.nextLine();
		
		board brd = new board(bNo, title, content);
		//배열등록
		for(int i = 0; i <myBoards.length; i++) {
			if(myBoards[i] ==null) {
				myBoards[i] = brd;
				break;
			}
		}
	}
	
	// 2. 글목록보기
	
	public void boardList() {
		System.out.println("글목록 기능");
	
		for(int i=0; i<myBoards.length;i++) {
				System.out.println(myBoards[i].toString());
	}
	
	}
	// 3. 글상세보기
	public void boardDetail() {
		System.out.println("상세보기 기능");
		System.out.print("글번호 입력>> ");
		int bNo= scn.nextInt();
		for(int i=0; i<myBoards.length;i++) {
			if(myBoards[i] !=null && myBoards[i].getBoardNo()==(bNo)) {
				System.out.println(myBoards[i].toString());
			}
		}
	
	}

	// 4. 글삭제
	public void delBoard() {
		System.out.println("글삭제 기능");
		System.out.print("글번호 입력>> ");
		int bNo= scn.nextInt();
		for(int i=0; i<myBoards.length;i++) {
			if(myBoards[i] != null && myBoards[i].getBoardNo()==(bNo)) {
				myBoards[i] = null ;
			}
				
		}		
	}			
	// 5. 전체 메뉴
	public void exe() {
		
		boolean run = true;
		while (run) {
			System.out.println("1.글등록 2.글목록 3.글상세보기 4.글삭제 9.종료");
			
			System.out.print("선택>>");
			
			int menu = scn.nextInt();
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
			case 9:
				run = false;
				break;
			default:
				System.out.println("잘못된 메뉴입니다");
			}
			
		} // end of while
		System.out.println("프로그램 종료.");
	}// end of exe()

}
