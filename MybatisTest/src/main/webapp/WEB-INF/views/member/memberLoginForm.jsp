<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버로그인</title>
</head>
<body>
<div align="center">
	<div><h1>로 그 인</h1></div>
	<div>	<!-- id속성은 자바스크립트 name속성은 자바에서 사용한다 -->
		<form id="frm" action="memberLogin.do" method="post"></form>
			<div>
				<table border="1">
					<tr>
						<th width="100">아이디</th>
						<td width="150">
							<input type="text" id="id" name="id">
						
						</td>
					</tr>
					<tr>
						<th>패스워드</th>
						<td>
							<input type="password" id="passwd" name="passwd">
						</td>
					</tr>
				</table>
			</div><br/>
			<div>
				<input type="submit" value="로그인">&nbsp;&nbsp;
				<input type="reset" value="취소">&nbsp;&nbsp;
				<input type="button" value="홈 가기" onclick="location.href='main.do'">
			</div>
	</div>
</div>
</body>
</html>