package com.edu;

public class HighStudent extends Student {
//	고등학생정보 : 담임교사, 학년 정보 추가.

	private String HighTeacher;
	private int Grade;

	// 생성자.
	public HighStudent() {
	}

	public HighStudent(int studNo, String studName, int score, String highTeacher, int Grade) {
		super(studNo, studName, score);
		this.HighTeacher = highTeacher;
		this.Grade = Grade;
	}

	public String getHighTeacher() {
		return HighTeacher;
	}

	public void setHighTeacher(String highTeacher) {
		this.HighTeacher = highTeacher;
	}

	public int getGrade() {
		return Grade;
	}

	public void setGrade(int grade) {
		this.Grade = grade;
	}

	// toString()
	// 학생번호, 학생이름, 점수
	@Override
	public String toString() {
		return "학생 번호" + getStudNo() + "학생 이름" + getStudName() + "점수" + getScore() + "담임 교사: " + HighTeacher + ", 학년: "
				+ Grade;
	}

}
