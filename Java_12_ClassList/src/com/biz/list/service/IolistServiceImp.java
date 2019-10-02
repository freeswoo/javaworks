package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.IolistVO;

public class IolistServiceImp {
	
	List<IolistVO> iolist;
	
	public IolistServiceImp() {
		iolist = new ArrayList<IolistVO>();
				
	}
	
	public void input() {
		
		IolistVO iolistVO
		
		/*
		 * 4개의 매개변수를 세팅하면서 객체를 생성하는 방법
		 * 4개의 매개변수 
		 */
		= new IolistVO("2019-09-05","14:00:01","CJ 햇반",1500);				
		iolist.add(iolistVO);
		
		iolistVO = new IolistVO("2019-09-05","14:00:01","CJ 햇반",1500);				
		iolist.add(iolistVO);
		
		iolistVO = new IolistVO("2019-09-05","14:00:01","CJ 햇반",1500);				
		iolist.add(iolistVO);
		
		iolistVO = new IolistVO("2019-09-05","14:00:01","CJ 햇반",1500);				
		iolist.add(iolistVO);		
		
	}
	
	public void input(int count) {
		
		IolistVO iolistVO;
		Random rnd = new Random();
		
		for(int i = 0 ; i < count ; i++) {
			
			String strTime = String.format("14:00:%02d", i);
			int intH = rnd.nextInt(5) + 1;
			String strPname = String.format("일반미 %d호",intH);
			
			int intQty = rnd.nextInt(30) + 10; // 10부터 39까지 난수
			
			/*
			 * 매개변수가 5개인 
			 */
			iolistVO 
			= new IolistVO("2019-09-05",
					strTime,
					strPname,
					1000 * intH,
					intQty);
			
			iolist.add(iolistVO);	
			
		}	
		
	}
	public void total() {
		
		// 확장 for를 이용하면
		// setter 메서드가 제대로 작동하지 않는 경우도있다
		int nSize = iolist.size();
		for(int i = 0 ; i < nSize; i++) {
			IolistVO vo = iolist.get(i);
			int total = vo.getIntPrice() * vo.getIntQty();
			vo.setIntTotal(total);			
		}
		
		// setter 메서드를 사용해야 할 경우
		// setter 메서드가 제대로 작동하지 않으면
		// 고전 for 를 사용해야 한다.
		for(IolistVO vo : iolist) {
			int total = vo.getIntPrice() * vo.getIntQty();
			vo.setIntTotal(total);
		}
		
	}
	
	
	public void list() {
		
		System.out.println("========================");
		System.out.println("거래내역");
		System.out.println("========================");
		System.out.println("일자\t\t시각\t\t상품명\t\t단가\t수량\t합계");
		System.out.println("------------------------");
		for(IolistVO vo : iolist) {
			System.out.print(vo.getStrDate() + "\t");
			System.out.print(vo.getStrTime() + "\t");
			System.out.print(vo.getStrPname() + "\t");
			System.out.print(vo.getIntPrice() + "\t");
			System.out.print(vo.getIntQty() + "\t");
			System.out.print(vo.getIntTotal() + "\n");
						
		}
		System.out.println("========================");
	}

}
