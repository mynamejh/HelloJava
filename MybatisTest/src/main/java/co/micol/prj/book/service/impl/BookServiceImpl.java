package co.micol.prj.book.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.book.mapper.BookMapper;
import co.micol.prj.book.service.BookService;
import co.micol.prj.book.vo.BookVO;
import co.micol.prj.common.DataSource;

public class BookServiceImpl implements BookService {
//bookSerivce.interface의 구현
	private SqlSession sqlSession = DataSource.getInstace().openSession(true); //true를 써야 autoCommit 가능 
	private BookMapper map = sqlSession.getMapper(BookMapper.class);
	//위 두줄이 DB를 연결하고, mapper연결
	
	@Override
	public List<BookVO> bookSelectList() {
		// book 전체리스트
		return map.bookSelectList();
	}

	@Override
	public BookVO bookSelect(BookVO vo) {
		// 한권의 책정보 가져오기
		return map.bookSelect(vo);
	}

	@Override
	public int bookInsert(BookVO vo) {
		// 책입력
		return map.bookInsert(vo);
	}

	@Override
	public int bookDelete(BookVO vo) {
		// 책 삭제
		return map.bookDelete(vo);
	}

	@Override
	public int bookUpdate(BookVO vo) {
		// 책 내용 변경
		return map.bookUpdate(vo);
	}

}
