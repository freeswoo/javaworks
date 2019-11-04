package com.biz.exam.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.biz.exam.domain.BBsVO;

public class BBsViewServiceV1 implements BBsViewService {

	List<BBsVO> bbsList;
	@Override
	public void setBBsList(List<BBsVO> bbsList) {

		this.bbsList = bbsList;
	}

	public void title() {
		
		System.out.println("=================");
		System.out.println("   전체 리스트");
		System.out.println("=================");
		System.out.println("==================================================================");
		System.out.println("순번\t작성자\t작성일자\t제목\t내용\t조회수");
		System.out.println("==================================================================");
	}
	
	public void body(BBsVO vo) {
		
		System.out.print(vo.getSeq() + "\t");
		System.out.print(vo.getAuth() + "\t");
		System.out.print(vo.getDate() + "\t");
		System.out.print(vo.getSubject() + "\t");
		System.out.print(vo.getText() + "\t");
		System.out.print(vo.getCount() + "\n");
		
	}
	@Override
	public void viewBBS() {
		
		this.title();
		for(BBsVO vo : bbsList) {
			this.body(vo);
		}
		System.out.println("=================================================================");

	}

	@Override
	public void viewBBS(String auth) {

		this.title();
		for(BBsVO vo : bbsList) {
			if(vo.getSubject().contains(auth)) {
				this.body(vo);
			}
		}
		System.out.println("=================================================================");
		
	}

	@Override
	public void viewBBS(int sDate, int eDate) {

		this.title();
		for(BBsVO vo : bbsList) {
			int date = vo.getDate();
			if(date >= sDate && date <= eDate) {
				this.body(vo);
			}
		}
		System.out.println("=================================================================");
		
	}

	@Override
	public void viewBBS(boolean sort) {

		this.title();
		System.out.println(bbsList);
		while(sort) {
			
			//Collections.sort(bbsList);
			
		}
		
	}

}
