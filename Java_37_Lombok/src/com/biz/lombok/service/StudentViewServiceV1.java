package com.biz.lombok.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

import lombok.Setter;

@Setter

public class StudentViewServiceV1 extends StudentViewServiceABS {

	List<StudentVO> stdList;
	@Override
	public void setStdList(List<StudentVO> stdList) {
		
		this.stdList = stdList;
		
	}
	
	public void title() {
		
		System.out.println("=====================");
		System.out.println("학생정보 조회");
		System.out.println("=====================");
		System.out.println("학번\t이름\t전화번호\t학년\t주소");
		System.out.println("=====================");
	}
	
	public void body(StudentVO stdVO) {
		
		System.out.print(stdVO.getS_num() + "\t");
		System.out.print(stdVO.getS_name() + "\t");
		System.out.print(stdVO.getS_tel() + "\t");
		System.out.print(stdVO.getS_grade() + "\t");
		System.out.print(stdVO.getS_addr() + "\n");

	}

	@Override
	public void view() {
		
		this.title();
		for(StudentVO stdVO : stdList) {
			this.body(stdVO);
		}
		System.out.println("===========================");
	}

	@Override
	public void view(String strName) {

		this.title();
		for(StudentVO stdVO : stdList) {
			if(stdVO.getS_name().contains(strName)) {
				this.body(stdVO);
			}
		}
		System.out.println("===========================");
	}

	@Override
	public void view(int intGrade) {

		this.title();
		for(StudentVO stdVO : stdList) {
			int grade = stdVO.getS_grade();
			if(grade == intGrade) {
				this.body(stdVO);
			}
		}
		System.out.println("===========================");
	}

	@Override
	public void view(int grGrade, int lessGrade) {

		this.title();
		for(StudentVO stdVO : stdList) {
			int grade = stdVO.getS_grade();
			if(grade >= grGrade && grade <= lessGrade) {
				this.body(stdVO);
			}
		}
		System.out.println("===========================");
	}
}
