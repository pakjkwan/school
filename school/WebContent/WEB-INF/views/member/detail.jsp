<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="context" value="<%=request.getContextPath() %>"></c:set>
<!doctype html>
<html lang="ko">
<head>
	<meta charset="UTF-8" />
	<title></title>
</head>
<body>
	<table>
		<tr>
			<td rowspan="4"></td>
			<td><h3>아이디</h3></td>
			<td><input type="text" /></td>
		</tr>
		<tr>
			<td><h3>이름</h3></td>
			<td><input type="text" /></td>
		</tr>
		<tr>
			<td><h3>비밀번호</h3></td>
			<td><input type="password" /></td>
		</tr>
		<tr>
			<td><h3>주소</h3></td>
			<td><input type="text" /></td>
		</tr>
		<tr>
			<td><input type="file" /></td>
			<td><h3>생년월일</h3></td>
			<td><input type="date" /></td>
		</tr>
	</table>
	<form action="${context}/global/main.do">
		<input type="submit" value="로그아웃" />
	</form>
	
</body>
</html>