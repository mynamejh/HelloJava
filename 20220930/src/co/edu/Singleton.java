package co.edu;

public class Singleton {

	//private 정적 필드
	private static Singleton singleton = new Singleton(); // singleton 클래스를 정적으로 선언하겠습니다.
	
		//외부에서도 사용할 수 없도록 private 생성자
		private Singleton() {
			
		}
		//public getInstance(): getInstance를 통해서만 인스턴스를 생성할 수 있도록 합니다!
		public static Singleton getInstance(){// 정적메소드를 선언하겠습니다. 겟 인스턴스란 이름으로
		return singleton;
		}
}