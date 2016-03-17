package com.movie.web.grade;

import java.util.ArrayList;
import java.util.ArrayList;

public class GradeServiceImpl implements GradeService{
	// 멤버 필드
	ArrayList<GradeBean> gradeList;
	
	public GradeServiceImpl() {
		gradeList = new ArrayList<GradeBean>(); // 초기화
	}
	// 멤버 메소드 에어리어
	@Override
	public void input(GradeBean grade) {
		// 성적표 등록 
		gradeList.add(new GradeBean(2,"김구",100,100,100,100));
		gradeList.add(new GradeBean(3,"강감찬",90,90,90,90));
		gradeList.add(new GradeBean(4,"유관순",80,80,80,80));
		gradeList.add(new GradeBean(5,"김구",70,70,70,70));
		gradeList.add(grade);
	}

	@Override
	public ArrayList<GradeBean> getList() {
		// 성적표 리스트 출력
		return gradeList;
	}

	@Override
	public GradeBean getGradeByHak(int hak) {
		// 성적표 조회(학번)
	
		GradeBean tempGrade = new GradeBean();
		for (int i = 0; i < gradeList.size(); i++) {
			// arr[i]
			int searchHak = gradeList.get(i).getHak();
			if (hak == searchHak) {
				tempGrade = gradeList.get(i);
				break;
			} 
		}
		return tempGrade;
	}

	@Override
	public ArrayList<GradeBean> getGradesByName(String name) {
		// 성적표 조회(이름)
		ArrayList<GradeBean> tempList = new ArrayList<GradeBean>();
		for (int i = 0; i < gradeList.size(); i++) {
			if (name.equals(gradeList.get(i).getName())) {
				tempList.add(gradeList.get(i));
			}
		}
		return tempList;
		
	}

	@Override
	public String update(GradeBean grade) {
		// 성적표 수정
		String result = "수정하려는 학번이 존재하지 않음";
		if (gradeList.contains(getGradeByHak(grade.getHak()))) {
			GradeBean searchedGrade = getGradeByHak(grade.getHak());
			searchedGrade.setJava(grade.getJava());
			searchedGrade.setSql(grade.getSql());
			searchedGrade.setJsp(grade.getJsp());
			searchedGrade.setSpring(grade.getSpring());
			result = "수정 성공";
		}
		/*
		this.delete(grade.getHak());
		this.input(grade);
		*/
		return result;
	}

	@Override
	public String delete(int hak) {
		// 성적표 삭제
		return (gradeList.remove(getGradeByHak(hak))) ? "삭제 성공" : "삭제 실패";
	}

	@Override
	public int getCount() {
		// 카운트 조회
		return gradeList.size();
	}

	@Override
	public void getCountByName() {
		// 이름조회시 카운트 조회
		
	}

}
