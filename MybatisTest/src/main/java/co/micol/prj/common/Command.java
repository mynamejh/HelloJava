package co.micol.prj.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	//클라이언트가 요청한 값들을 다 담아주는 곳이 request객체이다. response는 내가 응답하는 객체(서버가 자동으로 생성해준다)
	public String exec(HttpServletRequest request, HttpServletResponse response);
}
