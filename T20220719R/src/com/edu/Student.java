package com.edu;

public class Student {
	// 학생번호, 학생이름, 점수
	private int studNo;
	private String studName;
	private int score;

	public Student() {
	}

	public Student(int studNo, String studName, int score) {
		this.studNo = studNo;
		this.studName = studName;
		this.score = score;
	}


	public int getStudNo() {
		return studNo;
	}

	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "학생 번호:" + studNo + ", 학생 이름: " + studName + ", 점수: " + score;
	}

}
