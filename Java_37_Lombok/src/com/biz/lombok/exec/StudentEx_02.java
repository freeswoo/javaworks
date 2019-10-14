package com.biz.lombok.exec;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.biz.lombok.domain.StudentVO;
import com.biz.lombok.service.StudentReadServiceV1;
import com.biz.lombok.service.StudentViewServiceABS;
import com.biz.lombok.service.StudentViewServiceV1;

/*
 * 학생정보.txt 파일을 읽어서
 * 1. 모든 학생의 리스트를 콘솔에 보이기
 * 2. 이름을 입력받아 해당하는 학생 리스트를 콘솔에 보이기
 * 3. 학년을 입력받아 해당하는 학년의 학생들만 콘솔에 보이기
 * 4. 두개의 정수를 입력받아 해당 범위의 
 *      학년에 해당하는 학생들만 콘솔에 보이기
 */
public class StudentEx_02 {

	public static void main(String[] args) {

		StudentReadServiceV1 sRead = new StudentReadServiceV1();
		StudentViewServiceABS sView = new StudentViewServiceV1();
		
		String studentFile = "src/com/biz/lombok/학생정보.txt";
		
		Scanner scan = new Scanner(System.in);
		
		try {
			sRead.readStudent(studentFile);
			List<StudentVO> stdList = sRead.getStdList();
			sView.setStdList(stdList);
			sView.view();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(true) {
				System.out.println("========================");
				System.out.println("검색메뉴");
				System.out.println("========================");
				System.out.println("1.이름검색  2.학년검색  3.학년검색(범위지정) 4.종료");
				System.out.println("========================");
				System.out.print("검색방법을 선택하세요 >> ");
				int menu = Integer.valueOf(scan.nextLine());
				
				if(menu == 4) break;
				if(menu == 1) {
					System.out.print("찾는 이름은? ");
					String strName = scan.nextLine();
					sView.view(strName);
				}
				if(menu == 2) {
					System.out.print("찾는 학년은? ");
					int intGrade = Integer.valueOf(scan.nextLine());
					sView.view(intGrade);
				}
				if(menu == 3) {
					System.out.print("최저 학년? ");
					int grGrade = Integer.valueOf(scan.nextLine());
					System.out.print("최고 학년? ");
					int lessGrade = Integer.valueOf(scan.nextLine());
					sView.view(grGrade, lessGrade);
				} 
			}
		} catch (Exception e) {
			System.out.println("메뉴안의 숫자만 입력 가능");
			
		}
		System.out.println("업무종료");
		
	}
}
