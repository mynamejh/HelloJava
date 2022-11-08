package co.micol.prj.member.service;

import java.util.List;

import co.micol.prj.member.vo.MemberVO;

public interface MemberService {
	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo); 
	//한명의 데이터 또는 로그인 처리도 가능함.굳이 login하나 더 만들어도 돼 
	int memberInsert(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberUpdate(MemberVO vo);
	
	MemberVO memberLogin(String id, String password);
	//아이디중복체크
	boolean isMemberIdCheck(String id); //검색해서 존재하면 false
	//select해서 존재하면 false 
	//boolean은 초기값을 false로 쓰는게 좋다.!
	
	
}
