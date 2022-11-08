package co.micol.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.prj.common.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;
import co.micol.prj.member.vo.MemberVO;

public class MemberLogin implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		//로그인 처리 (jsp에 name 속성에 있는 값을"" 들고온다)
		MemberService dao = new MemberServiceImpl();
		MemberVO member = new MemberVO();
		HttpSession session = request.getSession(); //세션 값을 사용하기 위해 생성
		
		String id = request.getParameter("id");
		String password = request.getParameter("passwd");
		String message = "아이디 또는 패스워드가 틀립니다.";
		
		member = dao.memberLogin(id, password);

		//세션에 담음
		if(member != null) {
			session.setAttribute("id", member.getId()); //session에 memberid 값을 id(변수)라는 이름으로 넣는다
			session.setAttribute("name", member.getName());
			session.setAttribute("responsibility", member.getResponsibility());
			message =member.getName()+"님 환영합니다";
			
		}
		
		request.setAttribute("message", message); //메세지라는 변수에 메시지를 실어보낸다.
		return "member/memberLogin.tiles";
	}

}
