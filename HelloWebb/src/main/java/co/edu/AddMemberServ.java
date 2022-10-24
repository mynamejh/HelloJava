package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.emp.EmpDAO;
import co.edu.emp.EmployeeVO;
//서블릿은 클래스다!
/**
 * Servlet implementation class AddMemberServ 
 */
@WebServlet({"/addMember","/addMemberServlet"}) // 주소표시줄 실행! 두개중에 아무거나 사용가능!
public class AddMemberServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AddMemberServ() {
        super();
      
    }
    //# 어떤 방식의 요청인지 구분하는게 중요! (기억해놓기~!)
    //get 방식의 요청이 들어오면, 톰캣이 get방식으로 실행 (post호출하면 post방식으로 실행!)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException { //생성자만들어주고 sql순서대로 적어줌!
		
		//content타입 
		response.setContentType("text/html;charset=UTF-8");//컨텐츠가 보여지는 타입이 HTML이다!(content 타입을 지정)
		
		System.out.println("/addMemberSer 페이지입니다.");
		String empId = request.getParameter("employee_id");
		String IName = request.getParameter("last_name");
		String email = request.getParameter("email");
		String date = request.getParameter("hire_date");
		String id = request.getParameter("job_id");
		
		System.out.println(empId);
		
		//입력
		EmpDAO dao = new EmpDAO();
		EmployeeVO vo=new EmployeeVO(0 , IName, email,date,id);
		dao.insertEmp(vo);
		
		System.out.println("입력완료");
		
		PrintWriter out = response.getWriter();//출력 스트림
		out.print("<h3>completed.</h3>");//response.setContentType 사용해서! <h3>을 html로 인식해줌
		out.print("<h3>입사</h3>");
		out.print("<h5>직원번호:" + vo.getEmployeeId() + "</h5>");
		out.print("<h5>직원이름:" + vo.getLastname()+"</h5>");
		out.print("<h5>이메일:" + vo.getEmail()+"</h5>");
		out.print("<h5>입사일자:" + vo.getHiredate()+ "<h5>");
		out.print("<a href=index.html> 첫 페이지로 이동</a>");
	
	}

	//post방식의 요청시 실행(톰캣)
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
//		doGet(request, response);
		PrintWriter out =  response.getWriter();// 사용자의 브라우저(출력스트림 생성)
//		out.print("<h3>Post 방식의 요청</h3>");)
		
	
	}
}
