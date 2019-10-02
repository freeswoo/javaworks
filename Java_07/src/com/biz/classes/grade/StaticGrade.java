package com.biz.classes.grade;

/*
 * 어떤 class를 만들고
 * 맴버변수, 메서드에 
 * 한개라도 static 이라는 키워드를 붙이면
 * class가 static class가 된다.
 * 
 * static class가 된다는 것
 *  - 프로젝트를 RUN(컴파일 후 실행)하면
 *    JVM이 자동으로 클래스를 선언, 생생, 초기화하여
 *    사용할수 있도록 미리 준비시켜준다는 개념
 */
public class StaticGrade {
	
	/*
	 * 객체의 정의
	 * 1. 연산을 통해서 얻을수 없는 데이터
	 *    (학번, 이름, 과목점수 들)
	 *    변수로 정의
	 *    ==> 맴버변수라고 한다.
	 *    
	 * 2. 맴버변수를 기초로하여 연산을 통해서
	 *    얻을수 있는 항목들을 위하여
	 *    method()를 정의
	 *    (일부 맴버 메서드라고도 한다)
	 *    
	 * 3. 처리하고자 하는 대상(데이터...)을 객체로 정의하는
	 *    단계를 '추상화' 라고 한다.
	 *    추상화는 객체지향 언어를 이용한 프로그래밍에서
	 *    매우 중요한 개념이다.   
	 */
	// 맴버변수 들
	public static String strNum;
	public static String strName;
	public static int intKor;
	public static int intEng;
	public static int intMath;
	
	public static void sum() {
		// StaticGrade 클래스의 sum() 메서드의 몸체부분
		
		int sum = intKor + intEng + intMath;
		System.out.println("총점 : " + sum);
		
	}

}
