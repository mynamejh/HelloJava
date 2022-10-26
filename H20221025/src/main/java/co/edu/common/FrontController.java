package co.edu.common;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.control.BulletinControl;
import co.edu.control.MainControl;
import co.edu.control.WriteBoard;
import co.edu.control.WriteForm;
import co.edu.control.searchBoard;

//HttpServlet을 상속받는 서블릿임!
public class FrontController extends HttpServlet {

	HashMap<String, Control> controlList ;
	
	//init() - 서블릿 실행되면 처음만 작동
//	@Override
//	public void init() throws ServletException {
//		ServletContext sc = this.getServletContext();
//		
//	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		config.getInitParameter("charset");
		controlList = new HashMap<String, Control>();
		
		controlList.put("/main.do", new MainControl()); //main.do라는 요청이들어오면 Maincontrol 클래스로..고고!
		controlList.put("/bulletin.do", new BulletinControl());
		controlList.put("/searchBoard.do", new searchBoard());
		controlList.put("/writeBoardForm.do", new WriteForm());
		controlList.put("/writeBoard.do", new WriteBoard());

	}
	
	//service() - 실행될때마다 작동
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String url = req.getRequestURI(); 
		//url - http://localhost:8081/H20221025/main.do에서 H20221025/main.do만 가져온다 
		String context = req.getContextPath();
		//url에서 /H20221025 해당
		String path = url.substring(context.length());
		// url에서 main.do가져오는거 -> /H20221025 이후. context끝까지 자르겠다.
		
		System.out.println(path);
		Control subControl = controlList.get(path);
		subControl.exec(req, resp); 
		//main.do를 호출해 여기에 매핑되어잇는 control실행하겠다.
	}
	
}
