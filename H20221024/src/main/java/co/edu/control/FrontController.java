package co.edu.control;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.common.Command;

//전체 처리하는 곳!
public class FrontController extends HttpServlet {
	Map<String, Command> control = new HashMap<>();

	@Override
	public void init() throws ServletException {
		control.put("/main.do", new MainControl());
		
		//추가
		control.put("/memberAddForm.do", new MemberAddForm());
		control.put("/memberAdd.do", new MemberAddControl());
	
		//수정
		control.put("/memberModifyForm.do", new MemberModifyForm());
		control.put("/memberModify.do", new MemberModify());
		
		//삭제
		control.put("/memberRemoveForm.do", new MemberRemoveForm());
		control.put("/memberRemove.do",new MemberRemove());
		
		//단건 조회
		control.put("/memberSearchForm.do", new MemberSearchForm());
		control.put("/memberSearch.do", new MemberSearch());
		
		//목록
		control.put("/memberList.do",new MemberList());
		
		//로그인 , 밑에는 로그인 처리
		control.put("/loginForm.do", new LoginForm());
		control.put("/login.do", new Login());
		control.put("/loginOut.do", new LogOut());
		
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri= req.getRequestURI();
		String contextPath = req.getContextPath();
		String path=uri.substring(contextPath.length());
		
		System.out.println(path); //콘솔 실행 경로 알려줌!
		
		Command command = control.get(path);
		command.exec(req, resp);
	}
	
}
