package com.biz.classes.student;


public class StudentMain {

	public static void main(String[] args) {

        StudentInfo info01 = new StudentInfo();
        StudentInfo info02 = new StudentInfo();
        StudentInfo info03 = new StudentInfo();
                      			
		info01.intNum = 1; 
		info01.strName = "홍길동";
		info01.strClass = "전기";
		int intYear1 = 2018;
		
		info02.intNum = 2; 
		info02.strName = "아무개";
		info02.strClass = "토목";
		int intYear2 = 2017;
		
		info03.intNum = 3; 
		info03.strName = "머시기";
		info03.strClass = "응용SW";
		int intYear3 = 2016;
		
				
		System.out.println("=================");
		System.out.println("학생 개인 정보");
		System.out.println("=================");
		System.out.println("학번 : " + info01.intNum);
		System.out.println("이름 : " + info01.strName);
		System.out.println("입학년도 : " + info01.intYear);
		System.out.println("전공 : " + info01.strClass);
		System.out.println("학년 :" + (2019 - intYear1));
		System.out.println();
						
		System.out.println("=================");
		System.out.println("학생 개인 정보");
		System.out.println("=================");
		System.out.println("학번 : " + info02.intNum);
		System.out.println("이름 : " + info02.strName);
		System.out.println("입학년도 : " + info02.intYear);
		System.out.println("전공 : " + info02.strClass);
		System.out.println("학년 :" + (2019 - intYear2));
		System.out.println();
						
		System.out.println("=================");
		System.out.println("학생 개인 정보");
		System.out.println("=================");
		System.out.println("학번 : " + info03.intNum);
		System.out.println("이름 : " + info03.strName);
		System.out.println("입학년도 : " + info03.intYear);
		System.out.println("전공 : " + info03.strClass);
		System.out.println("학년 :" + (2019 - intYear3));
		System.out.println();
		
		System.out.println("=================");
		System.out.println("학생 리스트");
		System.out.println("=================");
		System.out.println("학번\t이름\t입학\t전공\t학년");
		System.out.printf("%d\t%s\t%d\t%s\t%d\n",
				info01.intNum,
				info01.strName,
				info01.intYear,
				info01.strClass,
				2019 - intYear1);

		System.out.printf("%d\t%s\t%d\t%s\t%d\n",
				info02.intNum,
				info02.strName,
				info02.intYear,
				info02.strClass,
				2019 - intYear2);
		
		System.out.printf("%d\t%s\t%d\t%s\t%d\n",
				info03.intNum,
				info03.strName,
				info03.intYear,
				info03.strClass,
				2019 - intYear3);
		
		
		
	}

}
