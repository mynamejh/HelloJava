package co.micol.prj.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.micol.prj.member.vo.MemberVO;

public interface MemberMapper {
	List<MemberVO> memberSelectList(); //전체리스트
	MemberVO memberSelect(MemberVO vo); 
	int memberInsert(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberUpdate(MemberVO vo);
	
	//#두개 이상 매개값이 넘어올때 반드시!! @Param을 넣어야한다.("넘어오는"값)string타입 id/password라는 변수로 사용하겠다.
	MemberVO memberLogin(@Param("id") String id, @Param("password") String password);
	boolean isMemberIdCheck(String id);
}
