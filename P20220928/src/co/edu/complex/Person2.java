package co.edu.complex;

//사람 : 속성 (이름, 나이, 키, 몸무게)
//기능 : 달린다. 먹는다.잠을잔다

public class Person2 {
	//속성 => 필드
	String name;
	int age;
	double height;
	double weight;

	void run() { // 밑에 네임은 위에 필드를 의미한다
		System.out.println(name + "가 달립니다");
	}
	void eat(String food) { //매개변수는 맞게 구현하면 된다
		System.out.println(name + "가" + food+ "를먹습니다");
	}
	void sleep() {
		System.out.println(name + "가 잠을잡니다");
	}
}
