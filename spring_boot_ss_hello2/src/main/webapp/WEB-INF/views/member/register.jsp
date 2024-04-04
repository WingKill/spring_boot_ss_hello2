<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/member/register" method="post">
		아이디 : <input type="text" name="id"><br>
		비밀번호 : <input type="password" name="pw"><br>
		이름 : <input type="text" name="name"><br>
		이메일 : <input type="text" name="email"><br>
		나이 : <input type="text" name="age"><br> 
		<input type="submit" value="전송">
		<input type="reset" value="초기화">
	</form>
	
	입력된 정보 <br>
	- 아이디 : ${member.id}<br>
	- 비밀번호 : ${member.pw}<br>
	- 이름 : ${member.name}<br>
	- 이메일 : ${member.email}<br>
	- 나이 : ${member.age}<br>
	
</body>
</html>