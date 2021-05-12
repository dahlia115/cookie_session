<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>makeSession.jsp<br>
	<h3>세션 설정</h3>
	id : ${sessionScope.id }<br>
	name : ${name }<br>
	addr : ${addr }<hr>
	<a href="resultSession">resultSession 이동</a>
	<a href="delSession">delSession 이동</a>
</body>
</html>