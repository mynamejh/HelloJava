package co.edu.board;

import java.util.List;

public class Board {
	private int bno; // 기본키
	private String title;
	private String content;
	private String writer;
	private String date;
	private int cnt; // 조회수

	public Board(int bno, String title, String content, String writer, String date, int cnt) {

		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.cnt = cnt;
	}
	
//	public Board(int bno, String title, String content, String writer, String date, int cnt) {
//		this.bno = bno;
//		this.title = title;
//		this.content = content;
//		this.writer = writer;
//		this.date = date;
//		this.cnt = cnt;
//	}

	public Board(int bno, String content) {
		this.bno = bno;
		this.content = content;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", date="
				+ date + ", cnt=" + cnt + "]";
	}

	public List<Board> search() {
		
		return null;
	}

}
