<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../global/header.jsp"/>
<div class="container" style="width:1000px; margin:0 auto;">
	<div>
		<h3>문서 객체 모델 (DOM)</h3>
		HTML 과 XML 문서에 대한 프로그래밍 인터페이스 <br />
		문서에 대한 구조적 정보를 제공하고 문서 구조나 외양 및 내용을 <br />
		바꿀 수 있도록 프로그램에서 접근하는 방법을 제공함 <br />
		DOM 은 속성과 메소드를 가지는 객체와  <br />
		<mark>노드</mark>와 트리구조로 표현됨 <br />
		웹페이지를 스크립트나 다른 개발 언어로 접근 시 필수적
	</div>
	<div>
		<h3>document 객체</h3>
		DOM 객체의 최고 상위 객체.
		window 안에 있는 HTML 문서 자체를  <br />
		document 라고 칭함. <br />
		<h3> element 객체</h3>
		문서에 삽입되어 태그로 만들어 지는 모든 요소
		<h3> attribute 속성</h3>
		엘리먼트가 가진 속성
		<h3> node 노드 </h3>
		<mark>객체를 상징한다.</mark> <br />
		엘리먼트도 노드이고, 어트리뷰트도 노드이며 <br />
		엘리먼트 내부의 글 내용도 모두 노드이다. <br />
		엘리먼트를 요소 노드라고 칭하며, 어트리뷰트는 속성노드 <br />
		내부의 글은 텍스트 노드라고 칭함. <br />
	</div>
	<div>
		<h3>노드가 일반적으로 가지고 있는 메소드</h3>
		<ol>
			<li> create : 만들다</li>
			<li> add : 추가하다 </li>
			<li> append : 붙인다</li>
			<li> remove : 지우다(공간은 그대로 두고 null 로 만든다)</li>
			<li> delete : 삭제하다 (공간까지 회수한다)</li>
			<li> set : 설정하다 </li>
			<li> get : 가져오다</li>
			<li> child : 하나의 직속 하위 객체</li>
			<li> children : 둘 이상의 직속 하위 객체</li>
			<li> parent : 직속 상위 객체</li>
		</ol>
	</div>
	<div id="outBox">
		<h3>document.getElementById() 의 예제</h3>
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
		<h3>document.createElement() 의 예제</h3>
		<button onclick="dom.createTag1()">객체 만들기 1</button>
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
			<span name='bbb'>1번</span>
			<span >2번</span>
			<span name='aaa'>3번</span>
			<span >4번</span>
			<span name='bbb'>5번</span>
			<span >6번</span>
		</div>
		</div>
	</div>
	<div id="end_div" style="height: 500px"></div>
</div>	
<script type="text/javascript">
	var dom = {
		hide : function() {
			document.getElementById('inBox').style.display = 'none';
		},
		show : function() {
			document.getElementById('inBox').style.display = '';
		},
		createTag1 : function() {
			var elem = document.createElement('div');
			var attr =  document.createAttribute('style');
			attr.nodeValue = "background: red; width: 500px; height: 100px; margin: 0 0 0 200px";
			elem.setAttributeNode(attr);
			document.body.appendChild(elem);
		},
		createTag2 : function() {
			var elem = document.createElement('div');
			elem.setAttribute('style','background: blue; width: 500px; height: 100px; margin: 0 0 0 200px');
			document.body.appendChild(elem);
		},
		selectElementsByTagName : function() {
			var elems = document.getElementsByTagName('span');
			for (var i = 0, elem = null; elem = elems[i]; i++) {
				elem.style.backgroundColor = 'red';
			}
		},
		selectElementsByName : function() {
			var elems = document.getElementsByName('bbb');
			for (var i = 0, elem = null ; elem = elems[i]; i++) {
				elem.style.backgroundColor = 'red';
			}
		}
	}
</script>









