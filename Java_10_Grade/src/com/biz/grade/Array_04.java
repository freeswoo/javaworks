package com.biz.grade;

import java.util.Random;

public class Array_04 {

	public static void main(String[] args) {

		int[] intNum = new int[50];
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(100) +1;
		}
		
		int Count = 0;
		
		for(int i = 0 ; i < intNum.length ; i++) { 
			for(int j = 2 ; j <= intNum[i] ; j++) { 
			   if(intNum[i] % j == 0) {
				Count++;
			   }
			}
			if(Count == 1) {
				System.out.println(intNum[i] + "는 소수이다.");
			}
			Count = 0;
		}
		
	}

}
