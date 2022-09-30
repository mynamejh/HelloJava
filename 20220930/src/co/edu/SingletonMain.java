package co.edu;

public class SingletonMain {
	public static void main(String[] args) {
	 // 1) student 선언
		Student s1 = new Student();
		Student s2 = new Student();
		
//		2) singleton 선언
		Singleton sg1 = Singleton.getInstance();
		Singleton sg2 = Singleton.getInstance();
		
		
		System.out.println(s1 == s2);
		System.out.println(sg1 == sg2);
	
	
	}
}
