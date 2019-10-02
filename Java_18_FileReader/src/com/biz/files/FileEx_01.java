package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx_01 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/files/data.txt";
		
		FileReader fileReader;
		
		try {
			// fileName으로 지정된 text 파일을
			// 읽을수 있도록 준비할
			// fileReader 객체(인스턴스)에는
			// 파을을 읽는데 필요한 여러가지 정보가 담겨 있다.
			fileReader = new FileReader(fileName);
			
			// fileReader 객체에 담긴 파을 정보를 사용하여
			// 한개의 문자를 읽어서
			// ASCII 코드로 달라
			int intChar = fileReader.read();
			System.out.print(intChar);
			System.out.print(" : ");
			System.out.println((char)intChar);  // 어떤 문지인가?
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
