package co.micol.prj.book.mapper;

import java.util.List;

import co.micol.prj.book.vo.BookVO;

public interface BookMapper {
	public interface BookService { 
		List<BookVO> bookSelectList(); //책 전체 리스트 가져오기. getBookList()메소드로 이름 사용가능!(R)
		BookVO bookSelect(BookVO vo);  //한권의 책 상세 내역 가져오기(R) getBook(데이터가 주고받아야되기 때문에 BookVO로 매개값)
		int bookInsert(BookVO vo);     //도서입력(C) setBook
		int bookDelete(BookVO vo);     //도서삭제(D) deleteBook
		int bookUpdate(BookVO vo);     //도서변경(U) updateBook
}
}