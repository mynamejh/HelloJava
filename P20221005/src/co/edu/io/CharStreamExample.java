package co.edu.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamExample {

	public static void main(String[] args) {
		write();
	}
	
	public static void read() {
		try {//입력스트림
			FileReader reader = new FileReader("src/co/edu/io/ByteStreamExample.java");
			
			while(true) {
				int bytes=reader.read();
				if(bytes ==-1) {
				break;
			}
				System.out.print((char)bytes+" ");
			}
			reader.close();
			System.out.println("completed");
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void write() {
	
		Scanner scn = new Scanner(System.in); // 변수선언

		// # 문자 기반 스트림 생성. Reader/Writer
		try { // 출력스트림
			FileWriter fw = new FileWriter("C:/Temp/addr.txt"); //출력 스트림 filewriter

			while (true) {
				System.out.println(">> ");
				String temp = scn.nextLine();
				if (temp.equals("quit"))
					break; // 반복문 값이 문자열 quit가 들어오면 반복문을 빠져나가겠다!
			
				fw.write(temp+"\n"); // temp에 있는 문자열=> '\n' 줄바꿈

			}
			
			fw.close();
			scn.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} // 출력 스트림
		System.out.println("completed.");
	}
}
