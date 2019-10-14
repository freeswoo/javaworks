package com.biz.exam.exec;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.biz.exam.domain.BBsVO;
import com.biz.exam.service.BBsReadService;
import com.biz.exam.service.BBsReadServiceV1;
import com.biz.exam.service.BBsViewService;
import com.biz.exam.service.BBsViewServiceV1;

public class BBsEx_01 {

	public static void main(String[] args) {

		BBsReadService bbsRead = new BBsReadServiceV1();
		BBsViewService bbsView = new BBsViewServiceV1();
		
		String bbsFile = "src/com/biz/exam/bbs.txt";
		
		Scanner scan = new Scanner(System.in);
		
		try {
			bbsRead.readBBS(bbsFile);
			List<BBsVO> bbsList = bbsRead.getBBsList();
			bbsView.setBBsList(bbsList);
			
			System.out.println("==============================");
			System.out.println("게시판 관리 시스템 v1");
			System.out.println("==============================");
			System.out.println("1.전체  2.작성자  3.날짜  0.종료");
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
