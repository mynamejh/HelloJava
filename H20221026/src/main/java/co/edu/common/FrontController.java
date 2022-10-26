package co.edu.common;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.control.MainControl;

//서블릿(web.xml 상속)
public class FrontController extends HttpServlet {

	HashMap<String, Control> controlList;
	String charset;

//@Override    // 밑에 init랑 동일 기능인데 다른 방식! 한번 실행
//public void init() throws ServletException {
//	ServletContext sc = this.getServletContext();
//	sc.getInitParameter("charset");
//}
//	

	@Override
	public void init(ServletConfig config) throws ServletException {
		String charset = config.getInitParameter("charset");
		controlList = new HashMap<String, Control>();

		controlList.put("/main.do", new MainControl()); // main.do 요청이 들어오면 실행될 maincontrol()
	}

	// 서블릿이 실행될때마다 실행
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String uri = req.getRequestURI(); // http://localhost:8081(서버정보)/H20221026(프로젝트이름)/main.do(요청페이지)
		String context = req.getContextPath(); //H20221025
		String path = uri.substring(context.length()); //글자크기를 잘라온거만큼 값 받아옴...
		
		System.out.println(path);
		Control subControl = controlList.get(path);
		subControl.exec(req, resp); //main.do => control실행.
		
	
	}
}
