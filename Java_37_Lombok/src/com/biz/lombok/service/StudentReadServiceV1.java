package com.biz.lombok.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

import lombok.Getter;

@Getter

public class StudentReadServiceV1 {

	private List<StudentVO> stdList;
	/*
	public List<StudentVO> getStdList() {
		return this.stdList;
	}
	*/
	/*
	 * 파일로부터 학생정보를 읽어서 stdList에 저장
	 */
	public void readStudent(String FileName) throws IOException {
		
		stdList = new ArrayList<StudentVO>();
		FileReader fileReader = new FileReader(FileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		String reader = new String();
		
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
						
			String[] students = reader.split(":");
			
			StudentVO stdVO = new StudentVO();
			stdVO.setS_num(students[0]);
			stdVO.setS_name(students[1]);
			stdVO.setS_tel(students[2]);
			stdVO.setS_grade(Integer.valueOf(students[3]));
			stdVO.setS_addr(students[4]);
			
			stdList.add(stdVO);
		}
		buffer.close();
		fileReader.close();
	}
}
