package co.edu.inherit;

public class MainApp { //실행부분(객체생성, 메소드 실행)
	public static void main(String[] args) {
		Child child = new Child(); // field1, method1 가지고 있음!
		child.method();//parent의 메소드
		child.method1();// child의 메소드
		
		Child2 child2 = new Child2();
		child2.method();
		child2.method2(); //child2의 메소드
		
		Parent c1 = new Parent();
		c1 = new Child(); // 부모클래스의 변수에 자식인스턴스 대입가능
		c1 = new Child2();// 자동형변환(자식인스턴스 -> 부모인스턴스)
		
//		c1.method2(); // 부모클래스의 멤버들만 호출이 가능해서 에러!
		
		if(c1 instanceof Child2) { // c1이 child2의 변수이면
			Child2 c2= (Child2) c1; // 강제형변환(casting)
			c2.method2();
		}
	Parent c3 = new Parent();
		if(c3 instanceof Child2) {
		Child2 c4 = (Child2) c3; //강제형변환(casting)
			c4.method2();//child2가 가지고 있는 method2 / 참이 아니라 실행이 안된다
	}
		
		
	}
}
