package co.edu.nested;

interface Run {
	void run();
}

class Runner implements Run {
	@Override
	public void run() { // 꼭 재정의 해줘야한다
		System.out.println("run.");

	}
}

public class AnonymousExample2 {
	public static void main(String[] args) {
		//익명구현객체 : 상황에 따라 기능이 다를 경우 (쓰는이유? # 버튼 : 삭제 , 등록 , 추가 다른 기능넣을 수 있음!)
		Run runner = new Run() {
			// Run 인터페이스 구현하는 익명의 개체를 만들겠다
			void runKind() {
				System.out.println("육상");
			}

			public void run() {// <=익명 구현 객체!
				System.out.println("구현 run");
				runKind(); //위에 runKind 를 여기서 구현하게 적어줘야함
			}
		};
		runner.run();
		Run runner2 = new Run() {
			@Override
			public void run() {
				System.out.println("구기종목");
			}
		};
		runner2.run();
	
	}
}
