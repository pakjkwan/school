<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../global/header.jsp"/>
<div class="container" style="width:1000px; margin:0 auto;">
	<div>
		<h3>브라우저 객체 BOM</h3>
		<h4>Window</h4>
		<ul>
			<li>[1] 대화창
				<ul>
					<li><a href="#" onclick="javascript:win.alert()">경고창</a></li>
					<li><a href="#" onclick="javascript:win.confirm()">확인창</a></li>
					<li><a href="#" onclick="javascript:win.prompt()">입력창</a></li>
				</ul>
			</li>
			<li>[2] 팝업창
				<ul>
					<li>open('문서명','창이름','속성') : 
						<a href="#" onclick="win.open()">새창열기</a>
					</li>
					<li>
						close() : 창닫기
					</li>
				</ul>
			</li>
		</ul>
		<h4>history 객체</h4>
		<ul>
			<li><a href="#" onclick="win.f5()">새로고침</a></li>
			<li><a href="#" onclick="win.goBack()">이전페이지</a></li>
		</ul>
		<h4>location 객체</h4>
		<ul>
			<li><a href="#" onclick="win.href()">홈으로 이동</a></li>
		</ul>
	</div>
</div>	
<script type="text/javascript">
	var win = {
			alert : function() {
				alert('경고창은 메시지만 전달');
			},
			confirm : function() {
				confirm('컨펌창은 확인/취소 버튼 존재');
			},
			prompt : function() {
				prompt('프롬프트창은 값을 입력하는 것이 가능');
			},
			open : function() {
				window.open('${context}/member/login_form.do');
			},
			href : function() {
				location.href = '${context}/global/main.do';
			},
			f5 : function() {
				history.go(0);
			},
			goBack : function() {
				history.go(-1);
			}
	}
</script>







