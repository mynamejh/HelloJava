package co.edu.service;

import java.util.List;

import co.edu.board.BoardVO;
import co.edu.board.MemberVO;

public interface BoardServiceImpl {
	//기능만 정의
	public BoardVO insertBoard(BoardVO vo);
	public List<BoardVO> getList(BoardVO vo);
	public BoardVO findBoard(int boardNo);
	public boolean updateBoard(BoardVO vo);
	public boolean deleteBoard(int boardNo);
	
	//페이지
	public List<BoardVO> pageList(int page); 
	public List<MemberVO> memberList();
	public MemberVO login(String id, String pass);
}
