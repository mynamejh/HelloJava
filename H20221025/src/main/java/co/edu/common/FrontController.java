package co.edu.common;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
<<<<<<< HEAD
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
=======
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.control.BulletinControl;
import co.edu.control.MainControl;
import co.edu.control.SearchBoard;
import co.edu.control.WriteBoard;
import co.edu.control.WriteForm;

public class FrontController extends HttpServlet{

	HashMap<String, Control> controlList;
	String charset;
	
//	//서블릿이 최초로 한번 호출되면 실행되는 init()
//	@Override
//	public void init() throws ServletException {
//		ServletContext sc = this.getServletContext(); //이 메소드로 servletContext를 가지고 옴
//		sc.getInitParameter("charset"); //이 값으로 셋팅되어져 있는 키 값(UTF-8) 읽어옴.
//	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		charset = config.getInitParameter("charset"); //위와 같다. 둘 중 아무거나 사용.
		controlList = new HashMap<String, Control>();
		
		controlList.put("/main.do", new MainControl()); //메인
		controlList.put("/bulletin.do", new BulletinControl()); //목록보기	
		controlList.put("/searchBoard.do", new SearchBoard()); //상세조회
		controlList.put("/writeBoardForm.do", new WriteForm()); //글등록form
		controlList.put("/writeBoard.do", new WriteBoard());//글등록
	}
	
	//서블릿이 호출될 때 마다 실행되는 service()
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uri = req.getRequestURI(); //uri값을 읽어와서 .. http://localhost:8081/H20221025/main.do 요청정보에서 uri값읽어옴.
		String context = req.getContextPath(); //H20221025만.
		String path = uri.substring(context.length()); //main.do만.
		
		System.out.println(path);
		System.out.println(uri);
		Control subControl = controlList.get(path);
		subControl.exec(req, resp); //main.do를 호출해서 맵핑되어진 control을 실행.
	}
	
	
	
>>>>>>> branch 'master' of https://github.com/mynamejh/HelloJava.git
	
}
