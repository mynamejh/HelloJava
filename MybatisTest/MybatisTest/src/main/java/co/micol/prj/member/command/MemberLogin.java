package co.micol.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.prj.common.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.impl.MemberServiceImpl;
import co.micol.prj.member.vo.MemberVO;

public class MemberLogin implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 로그인처리
		
		MemberService dao = new MemberServiceImpl();
		MemberVO member = new MemberVO();
		HttpSession session = request.getSession(); //세션값을 사용하기 위해
		
		String id = request.getParameter("id");
		String password = request.getParameter("passwd");
		String message = "아이디 또는 패스워드가 틀립니다.";
		//name속성이 가지고 있는 값을 getParameter()안에 써주는 것
		
		member = dao.memberLogin(id, password);
		//memberLogin 실행 
		//성공했다면 not null, 실패했다면 null
		if(member != null) {
			session.setAttribute("id", member.getId());
			session.setAttribute("name", member.getName());
			session.setAttribute("responsibility", member.getResponsibility());
			//session객체에 id라는 이름으로 member.getId()담으라고
			//한번 로그인해놓고 다른 페이지 옮길때 마다 새로 로그인 안하기 위한 목적			
			message = member.getName() + "님 환영합니다.";			
		}
		request.setAttribute("message", message);
		return "member/memberLogin.tiles";
	}

}
