package co.edu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.board.MemberVO;
import co.edu.common.Control;
import co.edu.common.HttpUtil;
import co.edu.service.BoardService;

public class passwdConfirm implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		String id = req.getParameter("id");
		String pass = req.getParameter("passwd");
		
		BoardService service = new BoardServiceImpl();
		MemberVO result = service.login(id,pass);
		
		
		
		
		
		HttpUtil.forward(req, resp, "member/passReConirm.tiles");

	}

}
