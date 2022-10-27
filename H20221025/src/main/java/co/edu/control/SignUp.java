package co.edu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edu.board.MemberVO;
import co.edu.common.Control;
import co.edu.common.HttpUtil;
import co.edu.service.BoardService;
import co.edu.service.BoardServiceImpl;

public class SignUp implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
		String pass = req.getParameter("passwd");

		BoardServiceImpl service = new BoardService();
		MemberVO result = service.login(id, pass);

		if (result != null) {
			req.setAttribute("logInfo", result);

			HttpSession session = req.getSession();
			session.setAttribute("id", result.getId());
			session.setAttribute("respansibility", result.getResponsibility());

			HttpUtil.forward(req, resp, "member/loginForm.jsp");

		} else {
			HttpUtil.forward(req, resp, "bulletin/bulletin.jsp");

		}

	}

}
