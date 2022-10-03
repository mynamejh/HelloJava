
public class Ex6_4 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result = mm.max(5, 3);
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		long result5 = mm.min(5, 3);
		mm.printGugudan(2);
		//		
		
	System.out.println("max(5, 3L) = " + result);
	System.out.println("min(5, 3L) = " + result5);
	
		
		
	}

}


class MyMath{
	void printGugudan(int dan) {
		if(!(2<=dan && dan<=9)) 
			
		return; // 입력받은 단(dan)이 2~9단이 아니면, 메서드 종료하고 돌아가기.
		
		for(int i=1; i<9; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan*i);;
		
		}
	}	
	long add(long a, long b) {
		long result = a+b;
		return result;
	}
	long max(long a, long b) {
//	return a>b ? a: b; // a>b보다 크면 a/ b가 더크면 b
		if(a>b) 
			return a;
			else
				return b;
		}
 
	long min(long a, long b) {
		return a<b ? a:b;
	}
	
	long subtract(long a, long b) {return a - b;}
	long multiply(long a, long b) {return a * b ;}
	double divide(double a, double b) {
		return a/b;
	}
	
}
