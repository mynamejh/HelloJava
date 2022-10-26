package co.edu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.board.BoardVO;
import co.edu.common.Control;
import co.edu.common.HttpUtil;
import co.edu.service.BoardService;
import co.edu.service.BoardServiceImpl;

public class searchBoard implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//bno(r게시글번호) 파라메터를 읽어서

		String bno = req.getParameter("bno");
		
		BoardService service = new BoardServiceImpl();
		BoardVO board = service.findBoard(Integer.parseInt(bno)); //bno값을 한건 리턴해줌!
		
		req.setAttribute("board", board);
		
		HttpUtil.forward(req, resp, "bulletin/searchBulltin.tiles");
		
	}

}
