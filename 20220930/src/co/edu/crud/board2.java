package co.edu.crud;

public class board2 {
	
	private String bookTitle;
	private String writerHo;
	private String content;
	private int bookNo;
			int bookPrice;
	
	public board2() {}
	public board2(String bookTitle, String writerHo, String content, int bookNo, int bookPrice) {
		super();
		this.bookTitle = bookTitle;
		this.writerHo = writerHo;
		this.content = content;
		this.bookNo = bookNo;
		this.bookPrice = bookPrice;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getWriterHo() {
		return writerHo;
	}
	public void setWriterHo(String writerHo) {
		this.writerHo = writerHo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	@Override
	public String toString() {
		return "board2 [bookTitle=" + bookTitle + ", writerHo=" + writerHo + ", content=" + content + ", bookNo="
				+ bookNo + ", bookPrice=" + bookPrice + "]";
	}
}	
