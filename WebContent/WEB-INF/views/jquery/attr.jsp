<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../global/header.jsp"/>
<div class="container" style="width:1000px; margin:0 auto;"> 
	<button id="callImg">이미지불러오기</button>
	<button id="htmlDemo">html() 테스트</button>
	<button id="textDemo">text() 테스트</button>
	<div id="sampleBox1" style="border: 1px solid black; width:300px;height: 300px">
		샘플 박스 입니다
	</div>
	<div id="sampleBox2" style="border: 1px solid black; width:300px;height: 300px">
		샘플 박스 입니다
	</div>
	<div id="sampleBox3" style="border: 1px solid black; width:300px;height: 300px">
		샘플 박스 입니다
	</div>
</div> 
<script src="${context}/resources/js/attr.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	alert('콜백함수가 실행되었습니다 !!');
	$('#sampleBox1').mouseover(function() {
		attr.attrDemo('${context}/resources/img/member/paper_plane.png');
	});
	$('#htmlDemo').click(function() {
		attr.htmlDemo('#sampleBox2');
	});
	$('#textDemo').click(function() {
		attr.textDemo('#sampleBox3');
	});
});
</script>
