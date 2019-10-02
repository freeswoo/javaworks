package com.biz.iolist.exec;

import java.util.Random;

import com.biz.iolist.model.GradeVO;

public class GradeEx_01 {

	public static void main(String[] args) {

		GradeVO gradeVO = new GradeVO();
		
		gradeVO.setStrNum("001");
		gradeVO.setStrName("홍길동");
		gradeVO.setIntKor(90);
		
		String s = gradeVO.toString(); //gradeVO가 갖고있는 기억장소 주소(com.biz.iolist.model.GradeVO@15db9742)
		System.out.println(s);		
		
		Random rnd = new Random();
		for(int i = 0 ; i < 10 ; i++) {
			
			gradeVO = new GradeVO(rnd.nextInt()+"");
			s = gradeVO.toString();
			System.out.println(s);
		}
		
		s = gradeVO.toString();
		System.out.println(s);
		
	}

}
