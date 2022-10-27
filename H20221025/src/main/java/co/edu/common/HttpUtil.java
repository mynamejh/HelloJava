package co.edu.common;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD
import org.apache.catalina.filters.ExpiresFilter.XHttpServletResponse;

public class HttpUtil {
	public static void forward(HttpServletRequest req//
			, HttpServletResponse resp//
			, String path ) {
		
		RequestDispatcher rs = req.getRequestDispatcher(path);
		try {
			rs.forward(req,resp); 
			//first.do => Web-INF/jsp/first.jsp //페이지 요청 재지정
		} catch (Exception e) {
			e.printStackTrace();
		}
=======
public class HttpUtil {
	public static void forward(HttpServletRequest req
			, HttpServletResponse resp
			, String path) {
		
		RequestDispatcher rs = req.getRequestDispatcher(path);
		try {
			rs.forward(req, resp); //first.do를 호출하면 WEB-INF/jsp/first.jsp로 이동하겠다는 걸로 
		} catch (Exception e) {
			e.printStackTrace();
		} 
>>>>>>> branch 'master' of https://github.com/mynamejh/HelloJava.git
	}
}
