<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:getAsString name="title"></tiles:getAsString></title>
<!-- name 은 tiles.xml에서 설정된 변수를 입력해야 한다. -->
</head>
<body>
	<div align = "center">
		<div><tiles:insertAttribute name="header" /></div>
		<div><tiles:insertAttribute name="body" /></div><hr>
		<div><tiles:insertAttribute name="footer" /></div>
	</div>
</body>
</html>