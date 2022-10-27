package co.edu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.board.BoardVO;
import co.edu.common.Control;
import co.edu.common.HttpUtil;
import co.edu.service.BoardServiceImpl;
import co.edu.service.BoardService;

public class SearchBoard implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//bno 파라메터읽기
		
		String bno = req.getParameter("bno");
		
		BoardServiceImpl service = new BoardService();
		BoardVO board = service.findBoard(Integer.parseInt(bno));
		
		req.setAttribute("board", board);
		
		HttpUtil.forward(req, resp, "bulletin/searchBulletin.tiles");
	}

}
