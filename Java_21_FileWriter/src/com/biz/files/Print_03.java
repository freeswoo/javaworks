package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Print_03 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/files/data4.txt";
		
		FileWriter fileWriter = null;
		PrintWriter fileOut = null;
		
		try {
			/*
			 * java 1.5부터는
			 * PrintWriter 클래스만 단독으로 사용해서
			 * 파일에 text를 기록할수 있다.
			 * 
			 * PrintWriter는 무조건 모든 파일을 새로 생성한다
			 * append mode 파을을 open 할수 없다.
			 * 
			 * 두번째 메서드를 지정하면
			 * flush() method를 자동으로 실행할수 있다.
			 */
			fileOut = new PrintWriter(fileName);
			fileOut.println("우리나라만세");
			fileOut.println(30 * 40);
			fileOut.println(200 % 2);
			
			fileOut.printf("%5d\n",30+40);
			fileOut.print("Republic of Korea\n");
			
			fileOut.flush();
			fileOut.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
