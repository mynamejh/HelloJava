package co.edu;
//서블릿이 되려면 HttpServlet의 상속을 받아야한다!

// init(메소드) -> service(메소드) 구현.
// 제어의 흐름을 개발자가 아니라 서블릿컨테이너가 흐름을

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet; //http 패키지에 있는!
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.emp.EmpDAO;
import co.edu.emp.EmployeeVO;

public class FirstServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("init()가 호출되었습니다!"); // 인스턴스가 생성될때 한 번만 실행!
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service()가 호출되었습니다!"); // FirtstServlet이 호출될때마다 실행!
		resp.setContentType("text/html;charset=UTF-8");

		PrintWriter out = resp.getWriter();

		// 사용자 paramet 처리
		String job = req.getParameter("job");
		EmpDAO dao = new EmpDAO();
		dao.empList(new EmployeeVO(job));
		if (req.getMethod().equals("GET")) {
			List<EmployeeVO> list = dao.empList(new EmployeeVO(job));
			out.print("<table border='1'>");
			out.print("<tr><th>사원번호</th><th>이름</th><th>이메일</th><th>직무</th></tr>");

			for (EmployeeVO emp : list) {
				out.print("<tr><td><li>" + "<th><td>" + emp.getEmployeeId() + ", " + "<th><td>" + emp.getLastname()
						+ ", " + "<tr><td>" + emp.getJobId() + "</li>");

			}
			out.print("</ul>");
			System.out.println("Get방식의 실행");
			// 정보를 조회할 경우 사용!
		} else if (req.getMethod().equals("POST")) {
			
			String empId = req.getParameter("emp_id"); // 넘겨주는 파라미터 이름을 뭘로 정할지 중요!
			String lName = req.getParameter("last_name"); // index name이랑 동일하게!
			String email = req.getParameter("email");
			String hDate = req.getParameter("hire_date");

			dao.insertEmp(new EmployeeVO(Integer.parseInt(empId)// 사원번호가 int 타입이라서 이렇게 작성!
					, null// first_name
					, lName // last_name
					, email // email
					, hDate // hire_date
					, job // job_id
			));
			
			out.print("<script>alert('입력완료');</script>");
		}
	}

	@Override
	public void destroy() {
		System.out.println("destroy()가 호출되었습니다!");
		// 끌때
	}

}
