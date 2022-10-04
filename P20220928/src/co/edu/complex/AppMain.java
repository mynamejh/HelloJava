package co.edu.complex;

// 하나의 실행클래스와 여러개의 라이브러리 클래스.
public class AppMain {
	public static void main(String[] args) {
		//object -> class ->instance
		 Person2 kim = new Person2(); // 인스턴스 생성
		 kim.name ="김민기";
		 kim.age = 20;
		 kim.sleep();
		 kim.eat("사과");
		 
		 Person2 lee = new Person2();
		 lee.name ="이순신";
		 lee.age = 25;
		 lee.sleep();
		 lee.eat("피자"); //매개변수 값 안들어가면 빨간 줄 ㄷ뜸! 설정해줘서 ->string food로 저장해서 문자로!
//		System.out.println(kim);
	}
	
//	workMan wman = new workMan();
//	wann.name ="직장인";
//	wman.age = 30;
}
