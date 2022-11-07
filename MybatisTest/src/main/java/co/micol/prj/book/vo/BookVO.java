package co.micol.prj.book.vo;

import lombok.Getter;
import lombok.Setter;

//테이블 칼럼(DB)과 타입 이름 일치시킨다. 그래야 신경을 덜쓴다!

@Getter
@Setter
public class BookVO {
	private String bookCode;
	private String bookTitle;
	private String bookAuthor;
	private String bookPress;
	private int bookPrice;
}
