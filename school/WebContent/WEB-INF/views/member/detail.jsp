<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../global/header.jsp"/>
<div id="detail">
		<div class="joinTop">
			<h2 class="text-center">${user.name} 상세정보</h2>
		</div>
		<div class="joinCenter row">
		<form >
			<fieldset class="joinField">
				<div class="form-group">
				 	<label for="input_id" class="col-sm-4 control-label">아이디</label>
				 	<div class="col-sm-4">
				 		<input type="text" class="form-control" id="id" name="id" value="${member.id}" readonly="readonly"/>
					</div>
				</div>
				<div class="form-group">
					<label for="input_pw" class="col-sm-4 control-label">비밀번호</label>
				 	<div class="col-sm-4">
						<input type="password" class="form-control" id="password" name="password" value="${member.password}" readonly="readonly"/>
					</div>
				</div>
				<div class="form-group">
					<label for="input_name" class="col-sm-4 control-label">이름</label>
				 	<div class="col-sm-4">
						<input type="text" class="form-control" id="name" name="name" value="${member.name}" readonly="readonly"/>
					</div>
				</div>
				<div class="form-group">
					<label for="input_name" class="col-sm-4 control-label">주소</label>
				 	<div class="col-sm-4">
						<input type="text" class="form-control" id="addr" name="addr" value="${member.addr}" readonly="readonly"/>
					</div>
				</div>
				<div class="form-group">
					<label for="input_name" class="col-sm-4 control-label">생년월일</label>
				 	<div class="col-sm-4">
						<input type="text" class="form-control" id="birth" name="birth" value="${member.birth}" readonly="readonly"/>
					</div>
				</div>
			</fieldset>
			</form>
			<div class="input_button text-center">
				<button id="updateBtn">수정 폼으로 이동</button>
				<button id="delBtn">삭  제</button>
			</div>
		</div>
	</div>
	<script>
	$(function() {
		$('#test').click(function() {
			location.href = 'http://www.naver.com';
		});
		$('form').addClass('form-horizontal');
		$('#updateBtn').addClass('btn btn-primary').click(function() {
			location.href = '${context}/member/update_form.do?id=${member.id}'; 
		});
		$('#delBtn').addClass('btn btn-primary').click(function() {
			location.href = '${context}/member/delete.do?id=${member.id}';
		});
	});
	</script>
	
	
	
	
	
	
	
	