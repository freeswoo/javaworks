package com.biz.grade.exec;

import com.biz.grade.service.StudentService;
import com.biz.grade.service.StudentServiceImpV1;

public class StudentService_Ex {

	public static void main(String[] args) {
		
		StudentService StudentService = new StudentServiceImpV1();
		
		StudentService.input(2);
		
		StudentService.list();
		
		
		
		

	}

}
