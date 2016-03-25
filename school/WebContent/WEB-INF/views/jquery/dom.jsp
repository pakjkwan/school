<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../global/header.jsp"/>
<div class="container" style="width:1000px; margin:0 auto;">
	<div id="outBox">
		<h3>$('#') 의 예제</h3>
		<button onclick="dom.show()">열기</button>
		<div id="inBox" style="background: red; display: none;">
			<button onclick="dom.hide()">닫기</button>
		</div>
		
	</div>
		<div id="outBox">
		<h3>document.getElementById() 의 예제</h3>
		<button onclick="dom.show()">열기</button>
		<div id="inBox" style="background: red; display: none;">
			<button onclick="dom.hide()">닫기</button>
		</div>
		
	</div>
	<div>
		<div>
		<h3>append() 의 예제</h3>
		<button onclick="dom.createTag1()">객체 만들기 1</button>
		</div>
		<div>
		<h3>empty() 의 예제</h3>
		<button onclick="dom.createTag2()">객체 만들기 2</button>
		</div>
		<div>
		<h3>html() 의 예제</h3>
		<button onclick="dom.createTag3()">객체 만들기 3</button>
		</div>
	</div>
	<div>
		<div>
		<h3>document.getElementsByTagName() 의 예제</h3>
		<button onclick="dom.selectElementsByTagName()">태그이름으로 찾기</button>
		<div>
			<span name='bbb'>1번</span>
			<span >2번</span>
			<span name='aaa'>3번</span>
			<span >4번</span>
			<span name='bbb'>5번</span>
			<span >6번</span>
		</div>
		</div>
	</div>
	<div>
		<div>
		<h3>document.getElementsByName() 의 예제</h3>
		<button onclick="dom.selectElementsByName()">이름으로 찾기</button>
		<div>
			<span class='bbb'>1번</span>
			<span >2번</span>
			<span class='aaa'>3번</span>
			<span >4번</span>
			<span class='bbb'>5번</span>
			<span >6번</span>
		</div>
		</div>
	</div>
	<div id="end_div"></div>
</div>	
<script type="text/javascript">
	var dom = {
		hide : function() {
			$('#inBox').css('display','none');
		},
		show : function() {
			document.getElementById('inBox').style.display = '';
		},
		createTag1 : function() {
			var elem = document.createElement('div');
			var attr =  document.createAttribute('style');
			attr.nodeValue = "background: red; width: 500px; height: 100px; margin: 0 0 0 200px";
			elem.setAttributeNode(attr);
			$('#end_div').append(elem);
		},
		createTag2 : function() {
			var elem = document.createElement('div');
			elem.setAttribute('style','background: blue; width: 500px; height: 100px; margin: 0 0 0 200px');
			$('#end_div').empty();
			$('#end_div').append(elem);
		},
		createTag3 : function() {
			var elem = $('<div>');
			$('#elem').attr('style','background: yellow; width: 500px; height: 100px; margin: 0 0 0 200px');
			$('#end_div').empty();
			$('#end_div').append(elem);
		},
		selectElementsByTagName : function() {
			var elems = $('span');
			for (var i = 0, elem = null; elem = elems[i]; i++) {
				elem.style.backgroundColor = 'red';
			}
		},
		selectElementsByName : function() {
			var elems = $('.bbb');
			for (var i = 0, elem = null ; elem = elems[i]; i++) {
				elem.style.backgroundColor = 'red';
			}
		}
	}
</script>









