package com.biz.classes;

import java.util.Scanner;

public class ScannerB {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름>> ");
		String strName = scanner.nextLine();
		
		System.out.println("국어>> ");
		int intKor = scanner.nextInt();
		
		System.out.println("국어>> ");
		int intEng = scanner.nextInt();
		
		System.out.println("전화>> ");
		String strTel = scanner.nextLine();
		
		System.out.println("전화>> ");
		String strTel1 = scanner.nextLine();
		
		
	}

}
