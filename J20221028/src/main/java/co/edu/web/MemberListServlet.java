package co.edu.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.edu.member.MemberVO;
import co.edu.service.MemberDAO;

@WebServlet("/MemberListServlet")
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberListServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/json;charset=utf-8");
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.memberList();
		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(list));

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("dopost");
		request.setCharacterEncoding("utf-8"); // 한글처리 인코딩을 utf-8로처리!
		response.setCharacterEncoding("utf-8"); // 응답처리 한글로 표시!
		response.setContentType("text/json;charset=utf-8");

		String job = request.getParameter("job");
		String id = request.getParameter("id");
		System.out.println(id);
		MemberDAO dao = new MemberDAO();
		// job => 등록, 삭제 구분!
		// delete 요청이면

		if (job.equals("delete")) {
			if (dao.deleteMember(id)) {
				response.getWriter().print("success");
			} else {
				response.getWriter().print("fail");
			}

		} else if (job.equals("insert")) {
			String pw = request.getParameter("passwd"); // &뒤에 붙여있는 이름(memberadd.html_ex) let data)
			String em = request.getParameter("email");
			String nm = request.getParameter("name");

			MemberVO vo = new MemberVO();// MemberDAO insertMember(MemberVO vo)에 매개값으로 쓰기위해 밑에 작업해줘야함!
			vo.setId(id);
			vo.setPasswd(pw);
			vo.setEmail(em);
			vo.setName(nm);

			dao.insertMember(vo);
			Gson gson = new GsonBuilder().create(); // gson 인스턴스 호출!(marven에서 받아오기!)
			// {"id":"user1","passwd":...??} 형식으로 나옴~

			response.getWriter().print(gson.toJson(vo)); // 응답정보를 편하게 받고 싶으면 gson받아서 사용! 웹브라우저에 보여줌!

		}

	}
}
