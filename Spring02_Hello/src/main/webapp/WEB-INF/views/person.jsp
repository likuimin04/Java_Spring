<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/person.jsp</title>
</head>
<body>
<h1>오늘의 인물 페이지</h1>
<p>오늘의 인물: ${requestScope.personToday }</p>
</body>
</html>