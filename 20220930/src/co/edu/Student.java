package co.edu;

import java.util.Arrays;

public class Student { //클래스 생성: 필드, 생성자(필드의 값을 초기화) 필수
	//필드.  
	private String studNo;
	private String studname;
	private String major;
	private int age; // 정수값 23,0,-12
	private String[] hobbies = new String[5]; //취미가 여러개일수도 있어서 배열타입으로 입력! 배열 이름 hobbies

//static -> 정적 메소드 (static 없는 메소드는 동적메소드로 인스턴스를 만들어야 사용 가능!)
	public static void staticMethod() { 
		System.out.println("staticMenthod call");
	}
	
	
	
	
	
	//매개변수로 age를 선언해서 필드 구분하기 위해서 필드라는 의미로 this.age 써줌!
	//#생성자 오버로딩 : 동일한 이름의 생성자를 여러번 정의
	
	public Student(){
		//매개값이 없는 생성자=> 기본생성자 (반환타입이 없음)
		//역할: 호출하는 시점에 채워주겠습니다.
		this.studname ="기본값";
		this.studNo ="000-000";
	}
	public Student(String studNo, String studname) {
		this.studNo = studNo;
		this.studname = studname;
	}
	
	public Student(String studNo, String studname, String major) {
		this(studNo, studname);
		this.major = major;
	}
	
	
	//기능을 담고 있는것 => 메소드
	void setHobbies(String[] hobbies) {
//		this.hobbies = hobbies;
		for(String hobby: hobbies) {
			for(int i=0; i<this.hobbies.length;i++) {
				if (this.hobbies[i] == null) {
					this.hobbies[i] = hobby;
					break;
				}
			}
		}
	}
	
	String[] getHobbies() {
		return this.hobbies;
	}
	
	String getHobb() {
		String	str ="취미는 ";
		for(String hobby : hobbies) {
			if(hobby != null) 
			{str += hobby + " ";
			}
			}
		str +="입니다.";
		return str;
	}
	//취미 추가!
	void addHobby(String hobby) {
		for(int i=0; i<hobbies.length; i++) {
			if(hobbies[i] == null) {
				hobbies[i] = hobby;
				break;
			}
		}
	}
	
	void setStudNo(String studNo) {
		this.studNo = studNo;
	}
	String getStudNo(String studNo) {
		return this.studNo;
	}
	void setMajor(String major) {
		this.major = major;
	}
	String getMajor(String major) {
		return this.major;
	}
	
	void setName(String studname) {
		this.studname = studname;
	}
	String getName(String studname) {
		return this.studname;
	}
	
	void setAge(int age) {
		if(age<0) {
			this.age = 0;
		}else {
			this.age = age;
		}
	}
	
	int getAge() {
		return this.age;
	}
	
	//showInfo() 메소드: 
	public String showInfo() {
		return "이름은 " + this.studname+ "이고 학번은" +this.studNo +"이고 전공은"+
	this.major + "입니다";
	}
	
	void study(String scl){
		System.out.println(studname + "가"+ scl + "공부한다");
	}
	void game() {
		System.out.println(studname + "가 게임한다");
	}

	void sleep() {
		System.out.println(studname + "가 지금 잠잔다");
	}





	@Override
	public String toString() {
		return "Student [studNo=" + studNo + ", studname=" + studname + ", major=" + major + ", age=" + age
				+ ", hobbies=" + Arrays.toString(hobbies) + "]";
	}
	
}
