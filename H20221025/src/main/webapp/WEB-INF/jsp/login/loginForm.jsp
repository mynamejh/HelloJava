<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>로그인 화면</h3>
	<form action="./signInForm.do" method="post">
		ID:<input type="text" name="id"><br> PW:<input
			type="password" name="passwd"><br> <input type="submit"
			value="로그인"> <input type="reset" value="초기화">

	</form>

	<a href="passwdReConfirmForm.do">비밀번호 재전송</a>
	<!-- passReConirm.jsp : 아이디를 입력받고 재전송(메일주소로 변경된 비번) 
	passwdReConfirm.do:아이디를 받아서 이메일 메일을 발송 -->

	<script>
		document.forms.frm.addEventListener('submit',funcion(e)){
			console.log(frm.id)
			if(!frm.id.value || !frm.passwd.value){
				alert('필수입력항목입니다');
				e.preventDefault();
				return;
			}
		}
	</script>

</body>
</html>