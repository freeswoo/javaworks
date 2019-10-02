package com.biz.string.exec;

import java.util.Random;

public class StringEx_05 {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		/*
		 * 임의 난수 10개를 생성하는 반복문에서
		 * 생성된 난수의 3번 위치 숫자들의 합을 구하시오
		 * (시작위치는 0부터 이다)
		 */
		int sum = 0;
		System.out.println("=======================");
		System.out.println("난수\t\t3번째값");
		System.out.println("=======================");
		for(int i = 0 ; i < 10 ; i++) {
			int rNum = rnd.nextInt();
			if(rNum < 0) {
				rNum *= (-1);
			}			
			String strNum = rNum + "";
			System.out.println(rNum);
			System.out.println("--------------");
			String[] sNum = strNum.split("");
			System.out.printf("%s\t%s\n",strNum, sNum[3]);
			sum += Integer.valueOf(sNum[3]);				
			
		}
		System.out.println("-----------------------");
		System.out.println("3번 위치의 합 : " + sum);
		
	}

}
