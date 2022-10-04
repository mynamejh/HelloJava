package co.edu.inherit;

public class Child extends Parent { // extends 뒤에 부모class, 1.변수선언
	String field1;
	Child(){
		super("args"); // 부모 클래스의 생성자 호출
		System.out.println("Child() call.");
	}
	void method1() {
		System.out.println("method() call.");
	}
	//부모 클래스의 메소드를 재정의 overriding
	@Override //어노테이션: 부모 클래스의 메소드(반환값, 메소드의 이름, 매개값) 체크.
	void method() {
		System.out.println("Child method() call");
	}
//	@Override 부모 클래스의 메소드를 재정의
	public String toString() {
		return "Child [field1=" + field1 + "]";
	}
	
}
