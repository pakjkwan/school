package com.movie.web.grade;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;

public class GradeMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		GradeService service = new GradeServiceImpl();
		
		while (true) {
			System.out.println("[메뉴] 1.등록 2.수정 3.삭제 4.조회(전체)"
					+ " 5.조회(이름) 6.조회(학번) 7.회원수 0.종료");
			switch (s.nextInt()) {
			case 1:
				System.out.println("학번,이름,자바,SQL,JSP,스프링 점수 입력");
				service.input(new GradeBean(s.nextInt(),s.next(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()));
				break;
			case 2:
				System.out.println("수정하려는 성적표의 학번,자바,SQL,JSP,스프링 점수 입력하시오");
				int hak = s.nextInt();
				
				
				break;
			case 3:
				System.out.println("삭제하려는 학번을 입력하시오");
				System.out.println(service.delete(s.nextInt()));
				break;
			case 4:
				System.out.println(service.getList());
				break;
			case 5:
				System.out.println("조회하려는 이름을 입력하시오");
				ArrayList<GradeMemberBean>tempList = service.getGradesByName(s.next());
				System.out.println((tempList.size() == 0) ? "조회하려는 이름이 없습니다." : tempList);
				break;
			case 6:
				System.out.println("조회하려는 학번을 입력하시오");
				System.out.println(service.getGradeByHak(s.nextInt()).toString());
				break;
			case 7:
				System.out.println(service.getCount());
				break;
			case 0:
				System.out.println("종료");

				return;
			default:
				System.out.println("잘못된 값");
				return;
			}
		}
			
	}
}
