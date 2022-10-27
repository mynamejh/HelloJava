package co.edu.crud;

<<<<<<< HEAD
import co.edu.board.crudDAO;

public class crudDAO {
	private static crudDAO instance= new crudDAO();
	private crudDAO() {}
}=======
=======
<<<<<<< HEAD
import co.edu.board.crudDAO;

public class crudDAO {
	private static crudDAO instance= new crudDAO();
	private crudDAO() {}
}=======
import java.util.Scanner;

import co.edu.board.board;

public class crudDAO {
	private static crudDAO instance= new crudDAO();
	private crudDAO() {}
	public static crudDAO getInstance() {
		return instance;
	}


	Scanner scn=new Scanner(System.in);
	board[] myBoards = new board[100];
	
	
	
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
	
		for(int i = 0; i <myBoards.length; i++) {
			if(myBoards[i] ==null) {
				myBoards[i] = brd;
				break;
			}
		}
	}
public void boardlist() {
	System.out.println("글 목록 기능");
	for(int i=0; i<myBoards.length;i++) {
		System.out.println(myBoards[i].toString());
	}
 }


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
			boardlist();
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
	}
}

}>>>>>>>refs/remotes/origin/master=======
import java.util.Scanner;

import co.edu.board.board;

public class crudDAO {
	private static crudDAO instance = new crudDAO();

	private crudDAO() {
	}

	public static crudDAO getInstance() {
		return instance;
	}

	Scanner scn = new Scanner(System.in);
	board[] myBoards = new board[100];

	public void addBoard() {
		System.out.println("글 등록 기능");
		System.out.print("글번호 입력>> ");
		int bNo = scn.nextInt();
		scn.nextLine();
		System.out.print("글 제목 입력>> ");
		String title = scn.nextLine();
		System.out.print("글 내용 입력>> ");
		String content = scn.nextLine();

		board brd = new board(bNo, title, content);

		for (int i = 0; i < myBoards.length; i++) {
			if (myBoards[i] == null) {
				myBoards[i] = brd;
				break;
			}
		}
	}

	public void boardlist() {
		System.out.println("글 목록 기능");
		for (int i = 0; i < myBoards.length; i++) {
			System.out.println(myBoards[i].toString());
		}
	}

	public void boardDetail() {
		System.out.println("상세보기 기능");
		System.out.print("글번호 입력>> ");
		int bNo = scn.nextInt();
		for (int i = 0; i < myBoards.length; i++) {
			if (myBoards[i] != null && myBoards[i].getBoardNo() == (bNo)) {
				System.out.println(myBoards[i].toString());
			}
		}

	}

	public void delBoard() {
		System.out.println("글삭제 기능");
		System.out.print("글번호 입력>> ");
		int bNo = scn.nextInt();
		for (int i = 0; i < myBoards.length; i++) {
			if (myBoards[i] != null && myBoards[i].getBoardNo() == (bNo)) {
				myBoards[i] = null;
			}

		}
	}

	public void exe() {

		boolean run = true;
		while (run) {
			System.out.println("1.글등록 2.글목록 3.글상세보기 4.글삭제 9.종료");

			System.out.print("선택>>");

			int menu = scn.nextInt();
			switch (menu) {
			case 1:
				addBoard();
				break;
			case 2:
				boardlist();
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
		}
	}
}
=======
>>>>>>> branch 'master' of https://github.com/mynamejh/HelloJava.git
import java.util.Scanner;

import co.edu.board.board;

public class crudDAO {
	private static crudDAO instance= new crudDAO();
	private crudDAO() {}
	public static crudDAO getInstance() {
		return instance;
	}


	Scanner scn=new Scanner(System.in);
	board[] myBoards = new board[100];
	
	
	
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
	
		for(int i = 0; i <myBoards.length; i++) {
			if(myBoards[i] ==null) {
				myBoards[i] = brd;
				break;
			}
		}
	}
public void boardlist() {
	System.out.println("글 목록 기능");
	for(int i=0; i<myBoards.length;i++) {
		System.out.println(myBoards[i].toString());
	}
 }


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
			boardlist();
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
	}
}

<<<<<<< HEAD
}>>>>>>>refs/remotes/origin/master=======
import java.util.Scanner;

import co.edu.board.board;

public class crudDAO {
	private static crudDAO instance = new crudDAO();

	private crudDAO() {
	}

	public static crudDAO getInstance() {
		return instance;
	}

	Scanner scn = new Scanner(System.in);
	board[] myBoards = new board[100];

	public void addBoard() {
		System.out.println("글 등록 기능");
		System.out.print("글번호 입력>> ");
		int bNo = scn.nextInt();
		scn.nextLine();
		System.out.print("글 제목 입력>> ");
		String title = scn.nextLine();
		System.out.print("글 내용 입력>> ");
		String content = scn.nextLine();

		board brd = new board(bNo, title, content);

		for (int i = 0; i < myBoards.length; i++) {
			if (myBoards[i] == null) {
				myBoards[i] = brd;
				break;
			}
		}
	}

	public void boardlist() {
		System.out.println("글 목록 기능");
		for (int i = 0; i < myBoards.length; i++) {
			System.out.println(myBoards[i].toString());
		}
	}

	public void boardDetail() {
		System.out.println("상세보기 기능");
		System.out.print("글번호 입력>> ");
		int bNo = scn.nextInt();
		for (int i = 0; i < myBoards.length; i++) {
			if (myBoards[i] != null && myBoards[i].getBoardNo() == (bNo)) {
				System.out.println(myBoards[i].toString());
			}
		}

	}

	public void delBoard() {
		System.out.println("글삭제 기능");
		System.out.print("글번호 입력>> ");
		int bNo = scn.nextInt();
		for (int i = 0; i < myBoards.length; i++) {
			if (myBoards[i] != null && myBoards[i].getBoardNo() == (bNo)) {
				myBoards[i] = null;
			}

		}
	}

	public void exe() {

		boolean run = true;
		while (run) {
			System.out.println("1.글등록 2.글목록 3.글상세보기 4.글삭제 9.종료");

			System.out.print("선택>>");

			int menu = scn.nextInt();
			switch (menu) {
			case 1:
				addBoard();
				break;
			case 2:
				boardlist();
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
		}
	}
}
=======
}
>>>>>>> branch 'master' of https://github.com/mynamejh/HelloJava.git
>>>>>>> branch 'master' of https://github.com/mynamejh/HelloJava.git
