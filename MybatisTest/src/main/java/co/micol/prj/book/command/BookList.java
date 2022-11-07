package co.micol.prj.book.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.book.service.BookService;
import co.micol.prj.book.service.impl.BookServiceImpl;
import co.micol.prj.book.vo.BookVO;
import co.micol.prj.common.Command;

public class BookList implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		//책 목록 가져오기
		BookService dao = new BookServiceImpl();
		List<BookVO> books = new ArrayList<>();
		books = dao.bookSelectList();
		request.setAttribute("books", books); //request에 결과를 books라는 변수에 담음 "books"는 jsp파일로 전달에서 사용
		
		return "book/bookList"; //결과값을 보여준다/돌려줄 페이지
	}

}
