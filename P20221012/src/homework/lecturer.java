package homework;
//강사 정보
public class lecturer {
	String lecName;
	int lecTel;
	String subject;
	
	public lecturer() {}
	
	public lecturer(String lecName, int lecTel, String subject) {
		this.lecName = lecName;
		this.lecTel = lecTel;
		this.subject = subject;
	}

	public String getLecName() {
		return lecName;
	}

	public void setLecName(String lecName) {
		this.lecName = lecName;
	}

	public int getLecTel() {
		return lecTel;
	}

	public void setLecTel(int lecTel) {
		this.lecTel = lecTel;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	
}
