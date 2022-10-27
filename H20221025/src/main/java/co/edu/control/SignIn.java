package co.edu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.common.Control;
import co.edu.common.HttpUtil;

public class SignIn implements Control {
	//아이디, 패스워드를 검증해서 맞으면 session 객체에 id값을 저장!
	//로그인 성공했습니다! signIn.jsp(로그인성공 페이지)
	
	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpUtil.forward(req, resp, "member/signInForm.tiles");	

	}

}
