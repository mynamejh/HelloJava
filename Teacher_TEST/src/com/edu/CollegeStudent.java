package com.edu;

public class CollegeStudent extends Student {
//	대학생정보 : 담당교수, 전공과목 정보 추가.

	private String UniTeacher;
	private String subject;

	// 생성자.
	public CollegeStudent() {

	}

	public CollegeStudent(int studNo, String studName, int score, String UniTeacher, String subject) {
		super(studNo, studName, score);
		this.UniTeacher = UniTeacher;
		this.subject = subject;
	}

	public String getUniTeacher() {
		return UniTeacher;
	}

	public void setUniTecher(String UniTeacher) {
		this.UniTeacher = UniTeacher;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	// toString()

	@Override
	public String toString() {
		return "학생 번호" + getStudNo() + "학생 이름" + getStudName() + "점수" + getScore() + "담당 교수: " + UniTeacher
				+ ", 전공 과목: " + subject;
	}

}
