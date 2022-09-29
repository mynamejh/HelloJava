package co.edu.variable;

public class MethodExample {	
	// 가로, 세로 => 정수 타입의 값을 넣어주면 넓이를 구해라
	public static int getArea(int w, int h) {
		int result = w * h;
		return result;
	}
	// #배열 요소의 각 값의 합.
	// sumAry 메소드의 배열을 넣어주면 배열의값을 누적해서 반환하는 것
	public static int sumAry(int[] ary) {
		int sum = 0;
		for (int i=0; i<ary.length; i++) {
			sum = sum + ary[i];
		}
		return sum;
	}
	//디바이드 메소드를 반환하면 
		//#두 수의 나눈 결과를 반환하는 메소드를 만들어라
	public static double divide(double n1, double n2) {
	 if(n2==0) {
		 return 0;
	 }
	double result = n1/ n2;
	 return result;
	
	}
	//두 수를 나누는 작업. divide라는 메소드에 매개변수를 int타입(소수점으로 나올 수 있어서)으로 지정.
	public static double divide(int n1, int n2) {
		// 유형 : byte(1), short(2), int(4), long(8) 타입
		//	   : float(4), double(8)
		double result = (double) n1 / n2; //3 /2 =>1.5
		return result;
	}
	
	public static void main(String[] args) {
		int result = getArea(20,15);
		System.out.println("전체 너비는 " + result + "입니다." );
		
		int[] intAry = {23, 45, 12};
		result = sumAry(intAry);
		System.out.println("전체 배열 요소의 합계는 " + result + "입니다." );
		
	// 실수. float, double 
		// Q. 밑에 값 지정?
		double d1 = 23.4567;
		double d2 = 12.34;
		double d3 = d1 + d2 ;
		
		d3 = divide(d1, d2);
		System.out.println("나눈 결과는 "+ d3);
		
		d3 = divide(3,2);
		System.out.println("나눈 결과는 " + d3);
	}
}
