package com.biz.classes.arrays;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] nums = new int[10];
		
		Random rnd = new Random();
		
        System.out.println("1~10 사이의 숫자를 입력하세요");
        System.out.print("숫자 >>");
		
		String strNum = scanner.nextLine();

		
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = rnd.nextInt(10) + 1;
			
		}

		
		int index;
		int intNum;
		intNum = Integer.valueOf(strNum);
		
		for(index = 0 ; index < nums.length ; index++) {
			if(nums[index] == intNum) break;
		}
		
		if(index >= nums.length)
			System.out.printf("배열에 %d 값이 없음\n",intNum);
		else
			System.out.printf("찾았다!! \n"
					+ "배열의 %d 번째에 값이 있음\n"
					+ "",index);
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
