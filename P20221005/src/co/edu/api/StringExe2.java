package co.edu.api;

import java.io.IOException;

public class StringExe2 {
	public static void main(String[] args) {
		System.out.println("abcDEF".toLowerCase());
		
	}
	
	public static void changeCapital(String msg) {
	//대문자 > 소문자, 소문자 > 대문자(차이-32)로 바꿔주는 기능
	//aBcD => AbCd 97:65, 98:66
	// 소문자: 97~122, 대문자: 65~90
		
		while(true) {
			try {
				int bytes= System.in.read();// system.in 입력하는 값!
				if(bytes==122)
					break;
				System.out.println("입력값: " + bytes);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end of prog.");
	}

}
