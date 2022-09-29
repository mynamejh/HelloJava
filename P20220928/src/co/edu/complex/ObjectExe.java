package co.edu.complex;

import java.util.Scanner;

public class ObjectExe {
	public static void main(String[] args) {
// let hong ={
//		name : "홍길동",
//		age: 20,
//		height : 162.3
//		
//		}
//		hong.name
		
		String s1 = "홍길동";
		int i1= 20;
		double d1 = 162;
		
		Person p1 = new Person(); // 빈공간(인스턴스)을 만든다 
		p1.name = "김민기";
		p1.age = 22;
		p1.heigth = 172.3;
		System.out.println(p1);
		
		Person p2 = new Person();
		p2.name = "김경미";
		p2.age =23;
		p2.heigth = 172.3;
	
		Person p3 = new Person();
		p3.name = "주소영";
		p3.age =22;
		p3.heigth = 172.3;
		System.out.println(p3);
		
		System.out.println("이름 :" + p1.name);
		System.out.println("나이 :" + p1.age);
		System.out.println("키 :" + p1.heigth);
		
		Person[] persons = {p1, p2, p3};
		System.out.println(persons[1].name);
		System.out.println(persons[1].age);
		System.out.println(persons[1].heigth);
		
//		persons[2].name = "송지은"; // Person[]배열로 만든 persons에 2번째 이름!
//		p3.name = "송지은";
		
		// p1변수값과 persons[0]값을 비교.
//		System.out.println(persons[0] == p1);
	
		//김경미 이름을 찾아서 나이23살을 22살로 변경!
		// 반복 for ==(문자열은 이거 오류있을 수도 있음!) -> (.equals)로 쓰기!
//
//		String kim ="김경미"; // 문자열 리터럴, 
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("변경할 이름>>> ");
		String name = scn.nextLine();
		System.out.println("변경할 나이>>> ");
		int age = scn.nextInt();
	
		for(int i=0; i<persons.length; i++) {
			if(name.equals(persons[i].name)) {
				persons[i].age = age ;
			}
			
		}
		
		for(int i=0; i< persons.length ; i++) {
			System.out.println(persons[i].name +" "+ persons[i].age + "살 입니다.");
		}	
	}
}
//	
//		for(int i=0; i<persons.length; i++) {
//			if (persons[i].name == "kim") {
//				persons[i].age = 22;
//			}
//		}
		
		//전체 목록을 출력.
		