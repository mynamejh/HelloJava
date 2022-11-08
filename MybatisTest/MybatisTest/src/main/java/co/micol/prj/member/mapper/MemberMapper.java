package co.micol.prj.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.micol.prj.member.vo.MemberVO;

public interface MemberMapper {
	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo); 
	//한명의 데이터 또는 로그인 처리도 가능함.굳이 login하나 더 만들어도 돼 
	int memberInsert(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberUpdate(MemberVO vo);
	
	MemberVO memberLogin(@Param("id") String id, @Param("password") String password);
	//매게변수가 2개 이상일 때는 Param 매게변수를 만들어줘야 함 - service와의 차이
	//넘어오는 id값을 String id값으로 쓰겠음
	
	//아이디중복체크
	boolean isMemberIdCheck(String id);
}
