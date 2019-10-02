package com.biz.classes.user;

public class User_02 {
	
	public static void add() {
		
		int num1 = 30;
		int num2 = 40;
		int num3 = 100;
		
		int sum = num1 + num2 + num3;
		double avg = sum / 3.0;
		
		System.out.printf("%d + %d + %d = %d\n",
				num1,num2,num3,sum);
		System.out.println("평균 : %d4.1" + avg);
		
		
	}

}
