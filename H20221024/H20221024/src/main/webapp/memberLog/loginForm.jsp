<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 로그인 처리하는 곳을 넣어줘야함 액션에 -->

	<h3>로그인 화면</h3>
	<form action="./login.do" method="post"> 
		ID:<input type="text" name="id"><br>
		PW:<input type="password" name="passwd"><br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>