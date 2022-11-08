package co.micol.prj.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.common.Command;

public class MainCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		//처음 들어올 때 보여주는 페이지 
		return "main/main.tiles"; //string -> views/main/main.jsp 만들어짐
	}

}
