package co.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {
	public static void main(String[] args) {
		String str = "Hello World!!";

		// 예외처리. RuntimeException 상속받아서 처리하는 예외클래스
		try {
			String result = str.substring(0, 10);
			char chr = result.charAt(20);
			System.out.println(chr);

		} catch (NullPointerException e) {
			System.out.println("참조하는 값이 없습니다");
		} catch (StringIndexOutOfBoundsException e1) {
			System.out.println("인덱스 범위를 벗어난 값입니다");
		} catch (RuntimeException e2) {
			System.out.println("실행 예외가 발생했습니다");
		} catch (Exception e3) { // exception 으로 예외 처리 다 가능!
			System.out.println("알 수 없는 예외가 발생했습니다");
		}

		// 일반예외 : Exception 상속 받아서 처리하는 예외 클래스.
//		try {
//			Class.forName("java.lang.String");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("숫자 입력>> ");

			try {
				int menu = scn.nextInt(); // InputMismatchException
				System.out.println("입력값은 :" + menu);
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요!");
				scn.nextLine(); // abc(Enter) -> 아무 의미없음. 그냥 엔터값
			} finally {
				System.out.println("반드시 실행할 코드");
				// db connection 사용하고 resource 반환
			}
		}
		
//		try {
//			exceptMethod();
//		}catch{
//			
//		}
		System.out.println("프로그램 종료");
	} // end of main()

	public static void exceptMethod() throws ClassNotFoundException {
//		try {
			Class.forName("java.lang.String");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}

	}
}
