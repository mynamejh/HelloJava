package co.edu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edu.common.Command;
import co.edu.common.HttpUtil;

public class MainControl implements Command {

	@Override //제일첫번째 보이는 페이지
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		//session 정보가 있으면 첫 페이지에 메인페이지로 이동하고
		//없으면 로그인 페이지로 이동하도록 설정!
		
		String id = (String) session.getAttribute("id");
		if(id !=null) {
			HttpUtil.forward(req, resp, "memberView/main.jsp");
		}else {
			HttpUtil.forward(req, resp, "memberLog/loginForm.jsp");
		}
		
		

	}

}
