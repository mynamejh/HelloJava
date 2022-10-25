<%@page import="co.edu.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원삭제(memberDelete.jsp)</title>
</head>
<body>

	<h3>회원조회</h3>
	<form action="./memberSearch.do" method="post">
		<input type="hidden" name="job" value="delete">
		ID : <input type="text" name="id"><br>
		<input type="submit" value="조회">
	</form>

	<%
	MemberVO result= (MemberVO) request.getAttribute("memberInfo");
	String id = (String) session.getAttribute("id"); // 로그인 했는 로그인정보
	%>

	<%if (result != null) {%>
	<h3>회원삭제페이지</h3>
	<form action ="./memberRemove.do" method="post"> 
	ID: <input type="text" name="id" value="<%=result.getId() %>"><br>
	<input type="submit" value="삭제">
	
	</form>
	<%} %>
</body>
</html>