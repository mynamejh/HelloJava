package co.edu.board;

import java.util.Scanner;

//main 메소드 (메세지도 메인에서 처리해줘야함)

public class BoardApp {

	public static void main(String[] args) {

		BoardDAO board = new BoardDAO();

		Scanner scn = new Scanner(System.in);

		Board brd = null;

		int menu = Integer.parseInt(scn.nextLine());

		while (true) {

			System.out.println("1.게시판 등록 2. 수정 3. 삭제");

			System.out.print("입력");

			if (menu == 1) {
				System.out.println("글제목");
				String main = scn.nextLine();
				System.out.println("글내용");
				String content = scn.nextLine();
				System.out.println("작성자");
				String name = scn.nextLine();
				brd = new Board(main, content, name);
				board.insert(brd);

			} else if (menu == 2) {

				System.out.println("수정");
				System.out.println("글제목");
				String main = scn.nextLine();
				System.out.println("글내용");
				String content = scn.nextLine();
				System.out.println("작성자");
				String name = scn.nextLine();

				brd = new Board(main, content, name);

				board.modify(brd);

			} else if (menu == 4) {

				System.out.println("삭제");
				System.out.println("게시글 삭제");
				int box = scn.nextInt();
				scn.nextLine();
				board.delete(brd);

			} else if (menu == 9) {
				System.out.println("종료합니다");

				break;

			}

			scn.close();

		}

	}

}
