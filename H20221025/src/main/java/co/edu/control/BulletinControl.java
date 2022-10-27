package co.edu.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.board.BoardVO;
<<<<<<< HEAD
import co.edu.board.pageVO;
import co.edu.common.Control;
import co.edu.common.HttpUtil;
import co.edu.service.BoardService;
import co.edu.service.BoardServiceImpl;

public class BulletinControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String page = req.getParameter("page");
		page = page == null ? "1" : page;
		int pg = Integer.parseInt(page);
		
		pageVO paging = new pageVO(516,pg);
	
		BoardService service = new BoardServiceImpl();
		List<BoardVO> list = service.pageList(pg);//전체값 조회 getList(new BoardVO(0,"","","","",0,"")); 
		
		
		req.setAttribute("bList", list);
		req.setAttribute("page", paging);
		
		HttpUtil.forward(req, resp, "bulletin/bulletin.tiles"); //데이터부분만 변경해주기위해 tiles사용 ->bulletin.jsp로 이동

=======
import co.edu.common.Control;
import co.edu.common.HttpUtil;
import co.edu.service.BoardService;
import co.edu.service.BoardServiceImpl;

public class BulletinControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String page = req.getParameter("page");
		page = page == null ? "1": page; //페이지 값이 null이면 1로 바꿔줘서 1~10번만 보여줌.
		int pg = Integer.parseInt(page); //page는 int값으로 들어와야하기때문에
		
		BoardService service = new BoardServiceImpl();
//		List<BoardVO> list = service.getList(new BoardVO(0, "", "", "", "", 0, ""));
		List<BoardVO> list = service.pageList(pg);
		req.setAttribute("bList", list);
		
		HttpUtil.forward(req, resp, "bulletin/bulletin.tiles");
		
	}

}
