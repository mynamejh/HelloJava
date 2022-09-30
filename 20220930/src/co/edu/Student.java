package co.edu;

public class Student {
	private String studNo;
	private String studname;
	private String major;
	private int age; // 정수값 23,0,-12
	private String[] hobbies = new String[5]; //취미가 여러개일수도 있어서 배열타입으로 입력! 배열 이름 hobbies

	
	//매개변수로 age를 선언해서 필드 구분하기 위해서 필드라는 의미로 this.age 써줌!
	
	
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
	
	void setName(String name) {
		this.studname = name;
	}
	String getName(String name) {
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
	
}
