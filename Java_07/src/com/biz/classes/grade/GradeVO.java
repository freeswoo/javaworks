package com.biz.classes.grade;

/*
 * dynamic class 다 라고 정의를 하는데
 * dynamic 이라는 의미로 해석하면
 * 어려움이 있다.
 * 
 * static이 아닌 class 다 라고 이해를 하자.
 */
public class GradeVO {

	// 맴버변수 들
	public String strNum;
	public String strName;
	public int intKor;
	public int intEng;
	public int intMath;
	

	
	public void gradeList() {
		// %d : 정수(int, long)
		// %f : 실수(float, double)
		// %c : 문자(char)
		// %s : 문자열(String)
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\n",
				strNum,
				strName,
				intKor,
				intEng,
				intMath,
				intKor + intEng + intMath
				);
		
	}
	public void sum() {
		
		int sum = intKor + intEng + intMath;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/3);
	}
}
