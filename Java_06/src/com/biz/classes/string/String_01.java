package com.biz.classes.string;

//import java.util.Scanner;

public class String_01 {
	
	/*
	 * strNation 문자열 중에서 u 라는 문자가 
	 * 몇번째 위치에 있나?
	 */

	public static void main(String[] args) {
		
		//Scanner scanner = new Scanner(System.in);
		//System.out.print("Republic of Korea 중 알파벳 한글자만 입력하시오 >");

		//String cB = scanner.nextLine();
		String strNation = "Republic of Korea";		
		int intLength = strNation.length();
		char cB = 'u';
				
		for(int i = 0 ; i < intLength ; i++) {
			
			char cA = strNation.charAt( i );
			
			if (cA == cB) {					
			
				System.out.println(cA+"는 " + i+"번째 있습니다.");
			
			}
		}
		
	}

}
