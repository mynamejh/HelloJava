package homework;

public class Subject {
	String subject;
	String managerName;
	String time;
	int click;
	
	public Subject() {};
	
	
	public Subject(String subject, String managerName, int click) {
		this.subject = subject;
		this.managerName = managerName;
		this.click = click;
	}


	public Subject(String subject, String managerName, String time, int click) {
		this.subject = subject;
		this.managerName = managerName;
		this.time = time;
		this.click = click;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public int getClick() {
		return click;
	}

	public void setClick(int click) {
		this.click = click;
	}

	@Override
	public String toString() {
		return "강의:" + subject + "\t 강사이름:" + managerName + "\t 수업시간:" + time;
	}

	
}
