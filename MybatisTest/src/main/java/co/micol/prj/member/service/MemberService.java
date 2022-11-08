package co.micol.prj.member.service;

import java.util.List;

import co.micol.prj.member.vo.MemberVO;

public interface MemberService {
	List<MemberVO> memberSelectList(); //전체리스트
	MemberVO memberSelect(MemberVO vo); 
	int memberInsert(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberUpdate(MemberVO vo);
	
	
	//<<회원가입>> 1. 아이디 만들기 2.중복체크
	MemberVO memberLogin(String id, String password);
	boolean isMemberIdCheck(String id); // 존재하면 false(디폴트) (=중복이라는 소리) (is붙어있으면 다 false값을 리턴시키는것!)
	
}
