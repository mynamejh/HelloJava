package co.edu;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//command라는 인터페이스를 구현하는 클래스!
public class FirstImpl implements Command {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//first.do ->first.jsp 페이지 호출
		RequestDispatcher rd= req.getRequestDispatcher("WEB-INF/jsp/first.jsp");
		rd.forward(req,resp);
//		resp.sendRedirect("WEB-INF/jsp/first.jsp");
		
	} 

	
	
}
