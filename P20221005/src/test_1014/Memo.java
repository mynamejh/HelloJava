package test_1014;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Memo { // # 문자 파일 만들기!
	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);// 입력 받아서~
		File file = new File("c:/Temp/memberList.txt"); // # 폴더에 <memberList>이름 파일 만들기
		List<Member> list = new ArrayList<>(); // # 리스트컬렉션 <멤버 테이블> 읽을 배열 만들기
		FileWriter fw = new FileWriter(file);// #파일 읽어주기
		
		// # 데이터 추가
		while (true) {
			System.out.println("아이디 >> ");
			String id = scn.nextLine();
			System.out.println("이름 >> ");
			String name = scn.nextLine();
			System.out.println("비밀번호 >> ");
			int pwd = Integer.parseInt(scn.nextLine());

			list.add(new Member(id, name, pwd));
			
			if(list.size()==3) {
				break;
			}

		}
		// #데이터 입력된거 가져와서 보여주기
		for(int i=0; i<list.size(); i++) {
			fw.write(list.get(i).getName()); //가져오기
			fw.write(list.get(i).getId());
			fw.write(list.get(i).getPrice()+"\n");
		}
		
		
		fw.close();
		System.out.println("completed");
	}

}
