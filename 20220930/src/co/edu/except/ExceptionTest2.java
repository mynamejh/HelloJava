package co.edu.except;

class NegativeValExcption extends RuntimeException {
	NegativeValExcption() {
		
	}
	NegativeValExcption(String msg) {
		super(msg);
	}
	
	public static class ExceptionTest2 {
		public static void main(String[] args) {
			try {
				PositiveVal(10,-20);
			}catch(NegativeValExcption e) {
		System.out.println("예외발생");
		
			}
		System.out.println("프로그램 종료");
		}
					

		public static int PositiveVal(int n1, int n2) 
				throws NegativeValExcption {
			int result = n1 + n2;
			if(result < 0) {
				throw new NegativeValExcption("음의 값이 발생");
			}
			return result;
		}
	}
}