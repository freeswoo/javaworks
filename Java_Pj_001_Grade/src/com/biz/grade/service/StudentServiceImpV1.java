package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.grade.model.StudentVO;

public class StudentServiceImpV1 implements StudentService {
	
	List<StudentVO> studentList;
	Scanner scan;
	
	public StudentServiceImpV1() {
		studentList = new ArrayList<StudentVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void input(int count) {
		for(int i = 0; i < count ; i++) {
			String strNum = String.format("%05d",(i+1));
			
			System.out.print("이름>> ");
			String strName = scan.nextLine();
			
			System.out.print("주소>> ");
			String strAddr = scan.nextLine();
			
			System.out.print("전화>> ");
			String strTel = scan.nextLine();
			
			System.out.print("학과>> ");
			String strDept = scan.nextLine();
			
			System.out.print("학년>> ");
			String strGrade = scan.nextLine();
			int intGrade = Integer.valueOf(strGrade);
			
			StudentVO vo = new StudentVO();
			vo.setStrNum(strNum);
			vo.setStrName(strName);
			vo.setStrAddr(strAddr);
			vo.setStrTel(strTel);
			vo.setStrDept(strDept);
			vo.setIntGrade(intGrade);
			
			studentList.add(vo);
		}
	}
	

	@Override
	public void input(String strNum) {
		
	}

	@Override
	public void input() {

	}

	@Override
	public void list() {
		
		System.out.println("===============================================");
		System.out.println("학생명부");
		System.out.println("===============================================");
		System.out.println("학번\t이름\t주소\t전화번호\t학과\t학년");
		System.out.println("-----------------------------------------------");
		//int nSize = studentList.size();
		//for(int i = 0 ; i < nSize ; i++) {
		for(StudentVO vo : studentList) {
			//StudentVO vo = studentList.get(i);
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrAddr() + "\t");
			System.out.print(vo.getStrTel() + "\t");
			System.out.print(vo.getStrDept() + "\t");
			System.out.print(vo.getIntGrade() + "\n");
			
		}
		
	}

}


