package co.edu;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {
	// servlet 관리하는곳!
	// url 주소와 실행할 서블릿을 map타입으로 관리하겠다
	Map<String, Command> map = new HashMap<String, Command>();

	@Override
	public void init() throws ServletException {
		map.put("/first.do", new FirstImpl()); // .do로 끝나는 요청이 들어오면 실행
		map.put("/second.do", new SecondImpl());
		map.put("/third.do", new ThirdImpl());
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI(); // http://localhost:8081/HelloWeb/first.do 를 호출하면 uri:/Helloweb/first.do 호스트
											// 정보 빼버리고 프로젝트 요청하는 페이지정보 uri 리턴해준다
		String contextPath = req.getContextPath(); // uri에서 프로젝트 정보를 반환
		String path = uri.substring(contextPath.length()); // uri가 가지고있는 substring

//		System.out.println("uri: "+uri);
//		System.out.println("contextPath: "+contextPath);
//		System.out.println("path: "+path);
//	
		Command result = map.get(path); // 해당되는 벨류값을 가져온다
		result.exec(req, resp);
	}
}
