package co.edu.api;

import java.util.ArrayList;

public class ListExe {
	public static void main(String[] args) {
		//컬렉션
		int[] intAry = new int[5];
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); // 박싱작업
		
		int a=5;
		Integer b=10; //기본타입을 클래스타입으로 박싱시킴 int -> integer(박싱) =>클래스 역할도 한다
		a = b; 
	
	}
}
