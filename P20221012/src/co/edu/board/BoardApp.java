package co.edu.board;

import java.util.Scanner;

//main 메소드 (메세지도 메인에서 처리해줘야함)

public class BoardApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Board brd = null;
		int menu= Integer.parseInt(scn.nextLine());
		
		System.out.println("글제목");
		String main = scn.nextLine();
		System.out.println("글내용");
		String content = scn.nextLine();
		System.out.println("작성자");
		String name = scn.nextLine();
		
		brd = new Board(main,content,name);
		
	}
	
}
