package co.edu.board;

public class Reply {
	private int reNum;
	private int coNo;
	private String reCon;
	private String id;
	private String date;
	
	
	public Reply(int reNum, int coNo, String reCon, String id, String date) {
		this.reNum = reNum;
		this.coNo = coNo;
		this.reCon = reCon;
		this.id = id;
		this.date = date;
	}
	
	
	
	public int getReNum() {
		return reNum;
	}
	
	public void setReNum(int reNum) {
		this.reNum = reNum;
	}
	public int getCoNo() {
		return coNo;
	}
	public void setCoNo(int coNo) {
		this.coNo = coNo;
	}
	public String getReCon() {
		return reCon;
	}
	public void setReCon(String reCon) {
		this.reCon = reCon;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
