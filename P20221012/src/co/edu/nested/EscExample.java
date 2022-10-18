package co.edu.nested;

import java.io.IOException;
import java.util.Scanner;

public class EscExample {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		inputvalidate("입력하세요");
		System.out.println("val 1)");
		String vall = scn.nextLine();

		System.out.println("val 2)");
		String val2 = scn.nextLine();
		System.out.println("val 3)");
		String val3 = scn.nextLine();

	}

	public static boolean inputValidate(String prompt) {
		System.out.println(prompt);
		try {
			while (true) {
				int inRead = System.in.read();

				if (inRead == -1)
					return true;
			}
			System.out.println((char) inRead);

		} catch (

		IOExaption e) {

			e.printStackTrace();
		}
		return true;
	}

}