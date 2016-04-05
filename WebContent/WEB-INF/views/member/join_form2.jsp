<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../global/header.jsp"/>
<div class="mg_auto" style="width: 1000px;">
	회원가입 폼
	<form action="${context}/member/join.do">
		<table>
			<tr>
				<td><h3>아이디 :</h3></td>
				<td><input type="text" name="id" value="" autofocus="autofocus"/></td>
			</tr>
			<tr>
				<td><h3>비밀번호 :</h3></td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td><h3>비밀번호확인 :</h3></td>
				<td><input type="password" name="passwordCheck" /></td>
			</tr>
			<tr>
				<td><h3>이름 :</h3></td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td><h3>주소 :</h3></td>
				<td><input type="text" name="addr" /></td>
			</tr>
			<tr>
				<td><h3>생년월일 :</h3></td>
				<td><input type="date" name="birth" /></td>
			</tr>
		</table>
		<div>
			<input type="reset" value="취소" /> <input type="submit" value="회원가입" />
		</div>
	</form>
	<form action="${context}/global/main.do">
		<input type="submit" value="홈으로" />
	</form>
</div>	
<jsp:include page="../global/footer.jsp">	