package co.edu.inherit.friend;

import java.util.ArrayList;

public class ArrayExam {
	public static void main(String[] args) {
		// 크기가 정해지면 변경 불가!

		String[] flowers = new String[3];
		flowers[0] = "장미";
		flowers[1] = "해바라기";
		flowers[2] = "무궁화꽃";
//	flowers[3] = "목련";

		String[] flowers2 = new String[6];

		for (String str : flowers) {
			if (str != null) {
				System.out.println(str);
			}
		}
		// 배열의 크기 고정 => 컬렉션(ArrayList);
		// Object 모든 클래스의 최상위 클래스.
		ArrayList flowers3 = new ArrayList(); //크기 10개 공간생성
		flowers3.add("장미"); // 인덱스 지정안해도 단계적으로 첫번째 위치 장미저장
		flowers3.add("해바라기"); 
		flowers3.add("해바라기"); 
		flowers3.add("해바라기"); 
		flowers3.add("해바라기"); 
		flowers3.add("해바라기"); 
//		flowers3.add(123);
		
		flowers3.add("무궁화꽃");
		for(Object str : flowers3) {
			String result = (String) str; //문자타입으로 가져오고 싶을때 string str
			System.out.println(result);
		}
		//컬렉션의 크기 : size() 
		for(int i=0; i<flowers3.size(); i++) { //size 인덱스에 있는 위에 있는것만큼!
			String result = (String) flowers3.get(i); //get 몇번째 있는 것을 가져오겠습낟
			System.out.println(result);
		}
	}
	
}
