<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>resultSession.jsp<br>
	<h3>resultSession</h3>
	id : ${sessionScope.id }<br>
	name : ${name }<br>
	addr : ${addr }<hr>
	<a href="makeSession">makeSession 이동</a>
	<a href="delSession">delSession 이동</a>
</body>
</html>