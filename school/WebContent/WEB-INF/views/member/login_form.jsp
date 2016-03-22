<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../global/header.jsp"/>
	<style type="text/css">
		#login{
			margin-top: 5em;
		}
	</style>

	<div id="login">
		<div class="loginTop text-center" >
			<img src="${context}/img/member/paper_plane.png" border="0" height="160px" width="160px"/>
		</div>
		<form action="${context}/member/login.do" name="loginForm" class="form-horizontal">
		<div class="loginCenter row" style="margin-left: 43.5%;">
				<fieldset class="loginField">
					<div class="form-group">
					 	<label for="input_id" class="control-label sr-only">아이디</label>
					 	<div class="col-sm-3">
							<input type="text" class="form-control" id="id" name="id" placeholder="아이디를 입력하세요"/>
						</div>
					</div>
					<div class="form-group">
						<label for="input_pw" class="control-label sr-only">비밀번호</label>
					 	<div class="col-sm-3">
							<input type="password" class="form-control" id="password" name="password" placeholder="비밀번호를 입력하세요"/>
						</div>
					</div>
				</fieldset>
			
		</div>
		<div class="input_button text-center">
			<input type="submit" id="loginButton" class="btn btn-primary" value ="로그인"/>
			<input type="reset" id="joinButton" class="btn btn-primary" value ="취소"/>
		</div>
		</form>
	</div>
</body>
</html>