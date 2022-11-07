package co.micol.prj.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.book.command.BookList;
import co.micol.prj.common.Command;
import co.micol.prj.main.MainCommand;

/**
 * 모든 요청을 받아들이는 컨트롤러 
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HashMap<String, Command> map = new HashMap<String, Command>();

    public FrontController() {
        super();

    }

    //# 요청한 것을 실행하는 명령을 모아 두는 곳
	public void init(ServletConfig config) throws ServletException {
		map.put("/main.do", new MainCommand()); // 처음 보여줄 페이지 명령
		map.put("/bookList.do", new BookList());
		
	
	}
	//요청을 분석하고 실행, 결과를 돌려주는 곳
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); //한글 깨짐 방지
		String uri = request.getRequestURI(); //요청한 uri를 구한다 									  //https://news.naver.com/main/main.naver?mode=LSD&mid=shm&sid1=105
		//http://naver.cojm/'uri부분: 도메인을 제외하고 나서 부분' => 무슨 요청했는지 알 수 있다.
		String contextPath = request.getContextPath(); //루트를 구함, context path 					 // https://news.naver.com/main/
		String page = uri.substring(contextPath.length());// 실제 요청만 남음(~com/까지 빼기위해 substring) // main.naver?mode=LSD&mid=shm&sid1=105
		
		Command command = map.get(page); //init 메소드에서 수행할 명령을 가져온다. (가져올때 map.get()써야함)
		
	//Command command = new MainCommand(); = Command command = map.get(page); 같은 의미임!
		String viewPage = command.exec(request, response); // 명령을 수행하고 결과를 viewpage(=보여줄페이지) 돌려준다(실행)
	
	//<<<<<<<< viewResolve 부분 -끝까지> 이제 만지지 말기!>>>>>>
		//마지막에 .do가 포함되어있지 않고 null이 아니면 페이지에 보여주기(서버에 직접 접근할 수 없으니까 만들어주는것이다..?)
		if(!viewPage.endsWith(".do")&& viewPage != null) {
			//ajax 요청한 페이지에 결과를 주는것('.do')가 아니면
			//타일즈 돌아가는곳
			
			viewPage = "/WEB-INF/views/"+ viewPage + ".jsp"; //문자열 더해줌
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);//권한위임? 요청한 값을 그대로 넣어줘서 위임(그대로 전달하는것)
		}else {
				//sendredirect는 권한위임 내가 준거는 안감. 걍 갔다와.. 3자로 받았지만 명령만 보내면 .걍 viewpage만 돌아오세요. ? 지은이한테 요청하는데 값이 달라짐?
				response.sendRedirect(viewPage); //*.do로 들어올때 돌아가는 곳
			}
		

	}

}
