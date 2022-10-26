package co.edu.api;

import java.util.HashSet;
import java.util.Set;

class Student {
	String name;
	int age;

	@Override 	// set 컬렉션: 동일한 인스텉ㄴ스는 담아주지 않는 컬렉션
	public int hashCode() { // 다른객체랑 구별하도록 도와줌 할당된 인스턴스 주소값을 16진수로,(동일한 객체는 동일한 주소로 반환)
		return age;
	}
	
	@Override
	public String toString() {
		return "학생의 이름은 " + name + ", 나이는 " + age + "살 입니다"; //tostring 메소드 재정의
	}
	
	//스튜던트가 가지고 있는기능 이퀄즈는 
	@Override //부모클래스가 가지고 있는 기능을 자식클래스가 재정의한다는 것 (override)
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) {
			return false;
		}
		
		Student str = (Student) obj;
		if(this.name.equals(str.name) && this.age == str.age)
			return true;
			
			return false;	
	}

}
public class ObjectExe {
	public static void main(String[] args) {
		Object obj = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj.equals(obj2)); // obj == obj2
		
		Student s1 = new Student();
		s1.name ="Hong";
		s1.age = 10;
		
		Student s2 = new Student();
		s2.name ="Hong";
		s2.age= 11;
		String s3 = "Hong";
		
		
//		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	 //set 컬렉션 : 직접 인터페이스만들수는 없고 구현클래스를 통해서 인스턴스 생성
	 // 
		Set<Integer> set =  new HashSet<Integer>(); // HashSet(구현클래스)
		set.add(new Integer(100));
		set.add(new Integer(110));
		set.add(new Integer(100));
		
		System.out.println("컬렉션의 크기 : " + set.size());
	
		//Set 컬렉션에 Student 인스턴스 저장시 논리적으로 동일한 인스턴스 판단.
		//hasCode(), equals() => 기준
		Set<Student> students = new HashSet<Student>(); 
		students.add(s1);
		students.add(s2);
		System.out.println("컬렉션의 크기 : " + students.size());
		
		
	
	}
}