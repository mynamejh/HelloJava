package co.edu.board;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.edu.jdbc.Employee;

//main 메소드 (메세지도 메인에서 처리해줘야함)
public class BoardApp {
	public static void main(String[] args) {

		BoardDAO board = new BoardDAO();
		Scanner scn = new Scanner(System.in);
		Board brd = null;
		String logID = null;
		int count = 0;
		Reply reply = null;

		
		
		while (true) {
			System.out.println("id");
			String id = scn.nextLine();
			System.out.println("pwd");
			String pass = scn.nextLine();

			if (board.login(id, pass)) {
				System.out.println("로그인 성공");
				logID = id;
				break;

			} else {
				System.out.println("로그인 실패");
				continue;
			}
		}

		
		while (true) {
			System.out.println("1.게시글 등록 2. 수정 3. 삭제  4.조회 5. 목록 보기 9. 종료");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {

				System.out.println("글번호");
				int num = scn.nextInt();
				scn.nextLine();
				System.out.println("글제목");
				String main = scn.nextLine();
				System.out.println("글내용");
				String content = scn.nextLine();
				String name = logID;

				brd = new Board(num, main, content, name, null, count);
				board.insert(brd);

			} else if (menu == 2) {

				System.out.println("수정");
				System.out.println("글번호");
				int num = scn.nextInt();
				scn.nextLine();
				System.out.println("글내용");
				String content = scn.nextLine();

				brd = new Board(num,content);
				

				if (board.getBoard(num).getWriter().equals(logID)) {
					board.modify(brd);
				}

			} else if (menu == 3) {

				System.out.println("삭제");
				System.out.println("삭제할 댓글 번호 입력>");
				int box = scn.nextInt();
				scn.nextLine();
				board.delete(box);

//				if(board.getBoard(menu)))

				//
//				if(brd.getWriter().equals(logID)) {
//					board.delete(box);
//				System.out.println("삭제완료");	
//				}else {
//					System.out.println("권한이 없습니다");
//				}

			} else if (menu == 4) {
				System.out.println("게시글 1개 조회");
				List<Board> boards = board.search();
				for (Board i : boards) {
					System.out.println("글번호 : " + i.getBno() + ", 글 제목 :" + i.getTitle() + ", 글 작성일자 :" + i.getDate()
							+ ", 글 작성자 :" + i.getWriter());
				}

			} else if (menu == 5) {
				System.out.println("글 번호 입력하세요");
				int number = scn.nextInt();
				scn.nextLine();
				board.getBoard(number);
				
				Board x= board.getBoard(number);
				System.out.println(x);
				
				
				

			} else if (menu == 9) {
				System.out.println("종료합니다");

				break;

			}

		} // end of while
		scn.close();
	}
	
}
