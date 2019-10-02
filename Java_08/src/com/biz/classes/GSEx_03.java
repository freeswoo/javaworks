package com.biz.classes;

import com.biz.classes.service.GradeScoreService;

public class GSEx_03 {

	public static void main(String[] args) {

		// GradeScoreVO[] gsVO = new GradeScoreVO[100];
		GradeScoreService gService = new GradeScoreService();
		
		// newVO() 메서드를 호출 하면서
		// 숫자 100을 전달해 준다.
		gService.newVO(100);
		gService.makeScore();
		gService.scoreList();
		
		
	}

}
