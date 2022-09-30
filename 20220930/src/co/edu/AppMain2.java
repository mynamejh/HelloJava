package co.edu;

public class AppMain2 {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setStudNo("111-111");
		s1.setName("홍길동");
		s1.setMajor("컴퓨터공학");
		s1.setAge(21);
		
		
		System.out.println(s1.getStudNo(null)); //string = null 초기값 출력
		System.out.println(s1.getAge()); // int = 0;초기값
		System.out.println(s1.showInfo());
		
		
		Student s2 = new Student();
		s2.setName("김민숙");
		s2.setStudNo("111-222");
		s2.setMajor("역사학과");
		System.out.println(s2.showInfo());
		
		String[] hob = {"독서","자전거"};
		s1.setHobbies(hob);
		s1.addHobby("음악듣기");
		System.out.println(s1.getHobb());
		
		System.out.println(s2.getHobb());
	}
}
