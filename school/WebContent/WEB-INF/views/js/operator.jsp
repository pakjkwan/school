<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../global/header.jsp"/>
<div class="container" style="width:1000px; margin:0 auto;">
	<div>
		<h3> 배열 출력하기</h3>
		<button onclick="opr.sysout()">배열출력</button>	
		<button onclick="opr.score()">성적출력</button>	
	</div>
</div>	
<script type="text/javascript">
var opr = {
	sysout : function() {
		var arr = ['사과','배','감','귤'];
		for ( var i in arr) {
			console.log(arr[i]+'\t');
		}
	},
	score : function() {
		var result = '';
		var avengers = [];
		avengers.push({name : '아이언',kor : 90,eng : 90,math : 90});
		avengers.push({name : '헐크',kor : 80,eng : 80,math : 80});
		avengers.push({name : '캡아',kor : 70,eng : 70,math : 70});
		for ( var i in avengers) {
			avengers[i].getSum = function() {
				result = this.kor + this.eng + this.math; 
				return result;
			}
			avengers[i].getAvg = function() {
				result = this.getSum()/3;
				return result;
			}
			console.log('이름 :'+avengers[i].name+'합계 :'+avengers[i].getSum()+'평균 : '+avengers[i].getAvg());
		}
		result = '============ 어벤저스 성적표 ============ \n';
		result += '이름\t국어\t영어\t수학\t총점\t평균\n';
		result += '-------------------------------------\n';
		for ( var i in avengers) {
			{
				with(avengers[i]){
					result += name + ':\t'+kor+':\t'+eng+':\t'+math
						+':\t'+getSum()+':\t'+getAvg()+'\n';
				}
			}
		}
		/*
		with 키워드는 배열에 담긴 하나의 객체를 의미한다.
		즉 예를 들어
		var iron = {name : '아이언',kor : 90,eng : 90,math : 90}
		이렇게 선언된 하나의 객체를 avengers.push(iron) 이라고 줄 경우
		출력문에서 with 를 사용하지 않는다면 iron.name 이런 식으로 일일히
		명시해야 하기 때문에 with 를 사용한다
		*/
		console.log('어벤저스 성적표 : '+result);
	},
	grade : function() {
		/*
		평균 90 이상 A
		80 B
		70 C
		60 D
		미만 F
		*/
		var kor = 80, eng = 70, math = 60;
		if (condition) {
			
		} else if(condition){

		}else{
			
		}
	},
	gender : function() {
		/* 
		800101-1234567 일 경우 flag 값은 1 이다라고 정의함
		*/
		var flag = 4; // 라면 성별을 판별하는 로직을 switch - case 로 완성하시오
		// 자바의 switch case 와 동일
		
	}
	
	
}
</script>




