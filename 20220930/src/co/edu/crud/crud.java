package co.edu.crud;

public class crud {
	private String bookNo;
<<<<<<< HEAD
	private String homeBe;
	private int numberBook;
	
	public crud(){
		
	}

	public String getBookNo() {
		return bookNo;
	}

	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}

	public String getHomeBe() {
		return homeBe;
	}

	public void setHomeBe(String homeBe) {
		this.homeBe = homeBe;
	}

	public int getNumberBook() {
		return numberBook;
	}

	public void setNumberBook(int numberBook) {
		this.numberBook = numberBook;
	}
=======
	private String publishingCom;
	private int numberBook;
	
	public crud(){
		
	}
	
	public crud(String bookNo, String publishingCom, int numberBook) {
		super();
		this.bookNo = bookNo;
		this.publishingCom = publishingCom;
		this.numberBook = numberBook;
		
	}
	public String getPublishingCom() {
		return publishingCom;
	}

	public void setPublishingCom(String publishingCom) {
		this.publishingCom = publishingCom;
	}

	public String getBookNo() {
		return bookNo;
	}

	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}

	public String getpublishingCom() {
		return publishingCom;
	}

	public void setpublishingCom(String publishingCom) {
		this.publishingCom = publishingCom;
	}

	public int getNumberBook() {
		return numberBook;
	}

	public void setNumberBook(int numberBook) {
		this.numberBook = numberBook;
	}

	@Override
	public String toString() {
		return "crud [bookNo=" + bookNo + ", publishingCom=" + publishingCom + ", numberBook=" + numberBook + "]";
	}
}
>>>>>>> refs/remotes/origin/master
