package co.edu.nested;

//익명 구현객체
//추상 메소드 하나만 존재하는 인터페이스는 Functional 인터페이스.
interface MyInterface {
	void run();
}

interface MyInterface2 {
	void run(String kind);
}

interface MyInterface3 {
	int sum(int num1, int num2);
}

public class AnonymousExample3 {
	public static void main(String[] args) {

		// 익명의 객체를 만들겠다!▽ , run 반드시 구현해줘야한다

		// #람다표현식(기능을 간단하게 쓰겠다란 의미!) 매개값을 받아서 구현하겠다.
		MyInterface intf = () -> System.out.println("MyInterface run.");
		intf.run();

		//myinterface2 익명구현객체이고 반드시 run() 구현해야함
		
			
			
			MyInterface  = kind-> System.out.println(kind +"Run.");
			intf2.run("농구종목");
			
			MyInterface3 intf3 = (num1,num2) ->  num1 *2+num2;
			int result = intf3.sum(10, 20);
			
			intf3 = (num1, num2) -> num1 *2 +num2 *3;
			result = intf3.sum(11, 22);
	}
}