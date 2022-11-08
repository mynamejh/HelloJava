package co.micol.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.prj.common.Command;

public class Logout implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		//로그아웃 처리
		HttpSession session = request.getSession(); //초기화
		String message = (String) session.getAttribute("name");
		message = message.concat("님 안녕히 가세요~🙋‍♂️");
		request.setAttribute("message", message);
		session.invalidate(); //서버에 보관한 session자체를 완전히 없애버리는것,
		//session.remove() - 원하는 값만 나두고 지우는 기능, 차이를 알자
		return "member/memberLogin.tiles";
		//로그아웃할때 메세지 보여주고 싶으면 여기로 보냄
		
		//return "main.do"; //처음 로그인 안된 홈으로 
	}

}
