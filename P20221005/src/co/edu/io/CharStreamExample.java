package co.edu.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamExample {

	public static void main(String[] args) {
//		write();
		read();
	}
	
	public static void read() {
		try {//메모장에 입력된 값을 읽어오는것. 메소드 형태로 어떤값을 읽어와서 데이터를 생성한다
			FileReader reader = new FileReader("C:/Temp/addr.txt");//읽어올 파일(작성되어졌음 미리)
			BufferedReader br = new BufferedReader(reader); //한번에 처리하는 보조스트림
			
			while(true) {
				String bytes=br.readLine();
				if(bytes ==null) {
				break;
			}
				String[] strAry = bytes.split(","); //문장들을 배열에 넣겠다(split이 공백을 기준으로 문장나눔... 유용....)
				System.out.println("학번" + strAry[0]);
				System.out.println("성명" + strAry[1]);
				System.out.println("영어" + strAry[2]);
				System.out.println("수학" + strAry[3]);
				System.out.print("======="); //char가 없으면 문자로 출력된다. \n 줄바꿈
			}
			reader.close();
			System.out.println("completed");
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void write() {//문자열 filewriter
	
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
