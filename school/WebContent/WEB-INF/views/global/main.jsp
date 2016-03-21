<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="context" value="<%=request.getContextPath()%>"></c:set>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	메인 홈 <br />
	<a href="${context}/member/login_form.do"> 로그인 화면 이동</a>
	<div><h4>아이디가 없으면, 계정을 생성하시오</h4>
		<a href="${context}/member/join_form.do">회원가입</a>
	</div>
</body>
</html>