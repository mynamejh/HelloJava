package co.edu.variable;

//추상화 : 
public class Person {
	// 속성 -> 필드 (클래스 안에서 받는 값)
	String name;
	int age;
	double height;
	
	// 기능을 '메소드' 라고 한다!
	void laught() {
		System.out.println("웃는다");
	}
	void sleep() {
		System.out.println("잠을 잡니다");
	}
}
