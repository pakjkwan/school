<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="admin_header.jsp"/>
<div class="container" style="width:1000px; margin:0 auto;">
	<div class="row display-table">
    <div class="col-xs-12 col-sm-4 display-cell" >
	    <ul id="admin_sidebar" class="nav nav-pills nav-stacked">
	    	<li ><a href="#" id="member_list">전체학생 목록보기</a></li>
	    	<li ><a href="#" id="grade_list">전체성적 목록보기</a>	</li>
	    </ul>
    </div>
    <div class="col-xs-12 col-sm-8 display-cell" id="result" style="border: 1px solid black;height: 500px">
       <%--  <jsp:include page="../member/member_list.jsp"/> --%>
    </div>
</div>
</div>
<script src="${context}/resources/js/admin.js"></script>	
<script type="text/javascript">
$(document).ready(function() {
	$('#result').load('${context}/member/list.do');
	$('#admin_sidebar').children().first().addClass('dropdown active');
	$('#admin_sidebar').children().click(function() {
		$(this).addClass('dropdown active');
		$(this).siblings().removeClass('dropdown active');
	});
	$('#member_list').click(function() {
		$('#result').empty();
		$('#result').load('${context}/member/list.do');
	});
	$('#grade_list').click(function() {
		$('#result').empty();
		$('#result').load('${context}/grade/list.do');
	});
	$('grade_regist').click(function() {
		$('#result').empty();
		$('#result').load('${context}/grade/grade_add.do');
	});
});
</script>








