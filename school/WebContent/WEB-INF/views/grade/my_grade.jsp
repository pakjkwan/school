<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<jsp:include page="../global/header.jsp" />
<div>

	<form name="my_grade">
		<table>
			<tr>
				<td>과목</td>
				<td>성적</td>
			</tr>
			<tr>
				<td>자바</td>
				<td>${score.java}</td>
			</tr>
			<tr>
				<td>JSP</td>
				<td>${score.jsp}</td>
			</tr>
			<tr>
				<td>SQL</td>
				<td>${score.sql}</td>
			</tr>
			<tr>
				<td>스프링</td>
				<td>${score.spring}</td>
			</tr>
		</table>
		
	</form>
	
	<form action="${context}/member/detail.do">
		<input type="submit" value="상세보기" />
	</form>
</div>
<jsp:include page="../global/footer.jsp" />