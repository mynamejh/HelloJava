package co.micol.prj.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.common.DataSource;
import co.micol.prj.member.mapper.MemberMapper;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {

	private SqlSession sqlSession= DataSource.getInstace().openSession(true);
	private MemberMapper map = sqlSession.getMapper(MemberMapper.class);
	
	
	



	@Override
	public List<MemberVO> memberSelectList() {
		return map.memberSelectList();
	}





	@Override
	public MemberVO memberSelect(MemberVO vo) {
		return map.memberSelect(vo);
	}





	@Override
	public int memberInsert(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}





	@Override
	public int memberDelete(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}





	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}





	@Override
	public MemberVO memberLogin(String id, String password) {
		return map.memberLogin(id, password);
	}





	@Override //아이디체크
	public boolean isMemberIdCheck(String id) {
		return map.isMemberIdCheck(id);
	}
}
