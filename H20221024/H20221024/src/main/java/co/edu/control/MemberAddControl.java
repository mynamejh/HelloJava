package co.edu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.common.Command;
import co.edu.common.HttpUtil;
import co.edu.service.MemberService;
import co.edu.service.MemberServiceImpl;
import co.edu.vo.MemberVO;

public class MemberAddControl implements Command {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// parameter 값에 따라서!
		String id = req.getParameter("id"); // 파라미터 아이디를 가져와서 스트링 id로 저장
		String pw = req.getParameter("passwd");
		String name = req.getParameter("name");
		String email = req.getParameter("email");

		//생성
		MemberVO vo = new MemberVO(id, pw, name, email); // 생성자 순으로 저장! (membervo 확인)
		
		//DB 입력처리
		MemberService service = new MemberServiceImpl();
		service.addMember(vo);
		
		//처리된 결과를 보여주는 페이지! (포워드)
		HttpUtil.forward(req, resp, "memberResult/memberInsertOutput.jsp"); // 재호출 하겠다.

	}
}