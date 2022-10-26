package co.edu.nested;

class Person { // 클래스 멤버들 

	// 필드.
	String name;
	int age;

	// 생성자
	Person() {
	}

	// 메소드
	void showInfo() { // 메소드가 실행되야 로컬 클래스 실행(내부클래스는 사용 잘 x)
		// 로컬 클래스
		class Local {
			void show() {
				System.out.println("show");
			}

		}
		Local local = new Local();
		local.show(); //안에 local 클래스 안에 'show' 메소드 실행방법!
	}

	// Inner 클래스(인스턴스)
	class Car {
		String carname;

		void run() {
			System.out.println("run");
		}
	}

	// Inner 클래스(정적)
	static class calculator {
		void add() {
			System.out.println("add");

		}
		
	}
	
	class Run implements Runnable{
		@Override
		public void run() {
			System.out.println("run 구현");
			
		}
	}
	
	// Inner 인터페이스
	interface Runnalbe{
		void run();
	}
}

public class NestedExample {
	public static void main(String[] args) {
		Person p = new Person();

		// #인스턴스 멤버 클래스 (인스턴스만들고 생성자 호출하는 방식!)
		Person.Car car = p.new Car(); // 내부 클래스 인스턴스 만듬
		car.run();

		// #정적 멤버 클래스
		Person.calculator cal = new Person.calculator();
		cal.add();
		p.showInfo();
	}
}
