package com.biz.classes;

import com.biz.classes.grade.GradeVO;

public class GradeMain_03 {

	public static void main(String[] args) {

		//***********************************
		// 성적처리를 위하여
		// 학생 7명의 객체를 선언, 생성, 초기화 하는부분
		//-----------------------------------
		GradeVO grade01 = new GradeVO();
		GradeVO grade02 = new GradeVO();
		GradeVO grade03 = new GradeVO();
		GradeVO grade04 = new GradeVO();
		GradeVO grade05 = new GradeVO();
		GradeVO grade06 = new GradeVO();
		GradeVO grade07 = new GradeVO();
		
		//********************
		//성적을 입력하는 부분
		//--------------------
		grade01.strNum = "001";
		grade01.strName = "홍길동";
		grade01.intKor = 90;
		grade01.intEng = 88;
		grade01.intMath = 77;
		
		grade02.strNum = "002";
		grade02.strName = "이몽룡";
		grade02.intEng = 88;
		grade02.intMath = 66;
		grade02.intKor = 78;
		
		grade03.strNum = "003";
		grade03.strName = "성춘향";
		grade03.intEng = 98;
		grade03.intMath = 78;
		grade03.intKor = 68;
		
		grade04.strNum = "004";
		grade04.strName = "아무개";
		grade04.intEng = 79;
		grade04.intMath = 58;
		grade04.intKor = 67;
		
		grade05.strNum = "005";
		grade05.strName = "머시기";
		grade05.intEng = 99;
		grade05.intMath = 98;
		grade05.intKor = 98;
		
		grade06.strNum = "006";
		grade06.strName = "거시기";
		grade06.intEng = 94;
		grade06.intMath = 71;
		grade06.intKor = 62;
		
		grade07.strNum = "007";
		grade07.strName = "머시냐";
		grade07.intEng = 75;
		grade07.intMath = 88;
		grade07.intKor = 93;


		
		int intSum = grade01.intKor 
		  		+ grade01.intEng 
				+ grade01.intMath;
	
		intSum = grade02.intKor 
				+ grade02.intEng 
				+ grade02.intMath;
	
		intSum = grade03.intKor 
				+ grade03.intEng 
				+ grade03.intMath;
		
		intSum = grade04.intKor 
				+ grade04.intEng 
				+ grade04.intMath;
		
		intSum = grade05.intKor 
				+ grade05.intEng 
				+ grade05.intMath;
		
		intSum = grade06.intKor 
				+ grade06.intEng 
				+ grade06.intMath;
		
		intSum = grade07.intKor 
				+ grade07.intEng 
				+ grade07.intMath;

		//***********************
		//결과를 list로 출력하는 부분
		//-----------------------
		System.out.println("=============================================");
		System.out.println("\t\t응용SW반 성적표");
		System.out.println("---------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점");
		System.out.println("---------------------------------------------");
		grade01.gradeList();
		grade02.gradeList();
		grade03.gradeList();
		grade04.gradeList();
		grade05.gradeList();
		grade06.gradeList();
		grade07.gradeList();
		System.out.println("=============================================");
		
	}

}
