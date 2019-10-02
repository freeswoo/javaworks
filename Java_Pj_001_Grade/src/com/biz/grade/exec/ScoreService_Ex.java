package com.biz.grade.exec;

import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImpV1;

public class ScoreService_Ex {

	public static void main(String[] args) {
		
	ScoreService ScoreService = new ScoreServiceImpV1();
		
	ScoreService.input(10);
	ScoreService.total();
	ScoreService.rank();
	ScoreService.list();
		
		
		
		

	}

}
