<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<h3>${member.name} 성적 입력</h3>
<form>
<table id="member_list" style="width:100%;margin-top: 30px">
	<tr style="background-color: yellow;">
		<th style="text-align: center;">Java</th>
		<th>JSP</th>
		<th>SQL</th>
		<th>Spring</th>
	</tr>
	
	<tr>
	  <td><input type="text" name="java" id="java"/></td>	
	  <td><input type="text" name="jsp" id="jsp"/></td>	
	  <td><input type="text" name="sql" id="sql"/></td>	
	  <td><input type="text" name="spring" id="spring"/></td>	
	  <td><input type="hidden" name="id" id="id" value="${member.id}"/></td>	
	</tr>
	<tr>
		<td colspan="4">
			<button id="grade_input">입 력</button>
			<button id="grade_cancle">취소</button>
		</td>
	</tr>
</table>
</form>	
<script type="text/javascript">
	$(function() {
		$('#member_list').css('border','1px solid black');
		$('#member_list th').css('border','1px solid black').css('text-align','center');
		$('#member_list tr').css('border','1px solid black');
		$('#member_list tr td').css('border','1px solid black')
		.css('text-align','center');
		$('#grade_input').click(function() {
			$('form').attr('action','${context}/grade/add.do').submit();
		});
		$('#grade_cancle').click(function() {
			$('form').reset();
		});
	});
</script>