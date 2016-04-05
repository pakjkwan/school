package com.movie.web.member;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		MemberService service = new MemberServiceImpl();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("[메뉴]1.회원가입 2.로그인 3.내정보보기 4.내정보수정 5.회원탈퇴 0.종료");
			switch (s.nextInt()) {
			case 1: 
				System.out.println("아이디,비번,이름,주소 입력,생년월일");
				break;
			case 2: break;
			case 3: 
				System.out.println("아이디 입력");
				System.out.println(service.detail(s.next()).toString());
				break;
			case 4: break;
			case 5: break;
			case 0: System.out.println("시스템 종료"); return;

			default:
				return;
				
			}
		}
	}
}
