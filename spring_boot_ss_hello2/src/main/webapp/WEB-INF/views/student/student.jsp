<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>student</title>
</head>
<body>
	<h1>학생뷰~입니당</h1>
	<%-- <form action="${pageContext.request.contextPath}/student" method="get">
		아이디 : <input type="text" name="id" value="${studentId}"><br>
		<input type="submit" value="제출">	
	</form> --%>
	<form action="${pageContext.request.contextPath}/student" method="post">
		아이디 : <input type="text" name="id" value="${studentId}"><br>
		<input type="submit" value="제출">	
	</form>
	<hr>
	<form action="${pageContext.request.contextPath}/studentView" method="post">
		아이디 : <input type="text" name="id"><br>
		비밀번호 : <input type="password" name="pw"><br>
		이름 : <input type="text" name="name"><br>
		이메일 : <input type="text" name="email"><br>
		나이 : <input type="text" name="age"><br> 
		<input type="submit" value="전송">
		<input type="reset" value="초기화">
	</form>
	<hr>
	<h1>리다이렉트 체크 입력</h1>
	<form action="${pageContext.request.contextPath}/redirect/check" method="post">
		아이디 : <input type="text" name="id"><br>
		<input type="submit" value="제출">	
	</form>
</body>
</html>