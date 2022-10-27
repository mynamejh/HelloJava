package co.edu.service;

import java.util.List;

import co.edu.board.BoardVO;

public interface BoardService {
<<<<<<< HEAD
	//기능만 정의
	public BoardVO insertBoard(BoardVO vo);
	public List<BoardVO> getList(BoardVO vo);
	public BoardVO findBoard(int boardNo);
	public boolean updateBoard(BoardVO vo);
	public boolean deleteBoard(int boardNo);
	
	
	//페이지
=======
	//기능만 정의.
	public BoardVO insertBoard(BoardVO vo); //입력기능
	public List<BoardVO> getList(BoardVO vo); //목록조회
	public BoardVO findBoard(int boardNo); //한건 조회
	public boolean updateBoard(BoardVO vo); //수정
	public boolean deleteBoard(int boardNo); //삭제
	
	//페이지 기능.
>>>>>>> branch 'master' of https://github.com/mynamejh/HelloJava.git
	public List<BoardVO> pageList(int page);
}
