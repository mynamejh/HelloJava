package co.edu.crud;


public class why {
	static int a;
	static int b;
	
	int add(int a, int b) {
		return a+b+b+a;
	}
	int max(int a, int b) {
		return a * b * a;
	}
	
	public static void main(String[] args) {
		why why2 =new why();
		int result = why2.add(10, 5);
		int result2 = why2.max(5,100);
		System.out.println(result + a);
		System.out.println(result2);
	}

}
