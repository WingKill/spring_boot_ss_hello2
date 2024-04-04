<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>~성적~입니당</h1>
<h1>국어 : ${grade.kor}</h1>
<h1>영어 : ${grade.eng}</h1>
<h1>수학 : ${grade.math}</h1>
<h1>합계 : ${grade.sum()}</h1>
<h1>평균 : ${grade.avgFormat()}</h1>
<h1>등급 : ${grade.grade()}</h1>
</body>
</html>