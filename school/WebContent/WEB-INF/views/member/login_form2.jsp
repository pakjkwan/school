<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../global/header.jsp"/>
<div class="mg_auto" style="width: 1000px;">
	<div>
		<h2> 로그인 </h2>
		<!--  -->
		<form action="${context}/member/login.do" name="frm" method="get">
		<table>
			<tr>
				<td>
					<h3>아이디</h3>
				</td>
				<td>
					<input type="text" name="id" value="" autofocus="autofocus" required="required"/>
				</td>
			</tr>
			<tr>
				<td>
					<h3>비밀번호</h3>
				</td>
				<td>
					<input type="password" required="required" />
				</td>
			</tr>
		</table>
		<div>
			<input type="submit" value="로그인" />
			<input type="reset" value="취소" />
		</div>
		</form>
			<form action="${context}/member/admin.do">
		<input type="submit" value="관리자" />
	</form>
	</div>
</div>	
<jsp:include page="../global/footer.jsp">	







