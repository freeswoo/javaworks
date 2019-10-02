package com.biz.grade;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {
				
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		
		Random rnd = new Random();
		
		int sumKor = 0;
		int sumEng = 0;
		
		System.out.println("==================");
		System.out.println("Kor\tEng");
		System.out.println("------------------");
		for(int i = 0; i < intKor.length ; i++) {
			
			//0 ~ 99까지 숫자 1개를 생성하라
			rnd.nextInt(100);
			
			//1 ~ 100까지 숫자 1개를 생성해서
			// num 변수에 담아라
			int num = rnd.nextInt(100) +1;
			
			// 51 ~ 100까지 숫자 1개를 생성하라
			intKor[i] = rnd.nextInt(50) +51;
			
			// 1 ~ 100까지 숫자 1개를 생성
			intEng[i] = rnd.nextInt(100) +1;
			
			// sumKor 변수에 intKor 배열의 모든 값을 
			// 더하라
			// sumKor = intKor[0]+ ~ +intKor[49]
			sumKor += intKor[i];			
			sumEng += intEng[i];
			System.out.printf("%d\t%d\n", intKor[i], intEng[i]);
		}
		System.out.println("------------------");
		System.out.printf("%d\t%d\n",sumKor,sumEng);
		System.out.println("==================");
		
	}

}
