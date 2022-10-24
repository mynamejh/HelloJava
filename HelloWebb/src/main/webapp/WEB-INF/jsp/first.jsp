<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="co.edu.emp.EmpDAO"%>
<%@page import="co.edu.emp.EmployeeVO"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<table border='1'>
	<tr>
		<th>사원번호</th>
		<th>이름</th>
		<th>이메일</th>
		<th>입사일자</th>
		<th>직무</th>
	</tr>
		<%
		String name = "홍길동";
		EmployeeVO emp = new EmployeeVO("IT_PROG");
		EmpDAO dao = new EmpDAO();

		List<EmployeeVO> list = dao.empList(emp);
		for (EmployeeVO vo : list) {
		%>
			<tr>
			<td><%=vo.getEmployeeId() %></td>
			<td><%=vo.getLastname() %></td>
			<td><%=vo.getEmail() %></td>
			<td><%=vo.getHiredate() %></td>
			<td><%=vo.getJobId() %></td>
			</tr>
	<%
		}
	%>
	</table>
</body>
</head>
</html>




