<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<table id="member_list">
	<tr>
		<th>아이디</th>
		<th>이름</th>
		<!-- <th>전공</th>
		<th>수강과목</th> -->
		<th>주소</th>
		<th>생년월일</th>
	</tr>
		<c:forEach items="${list}"  var="member" >
			<tr>
				<td>${member.id}</td>
				<td>${member.name}</td>
				<%-- <td>${member.major}</td>
				<td>${member.subjects}</td> --%>
				<td>${member.addr}</td>
				<td>${member.birth}</td>
			</tr>	
		</c:forEach>
</table>
<script>
	$(function() {
		$('#member_list').css('border','1px solid black').css('width','100%')
		.css('margin-top','100px');
		$('#member_list tr').css('border','1px solid black');
		$('#member_list tr td').css('border','1px solid black')
		.css('text-align','center');
		
	});
</script>








