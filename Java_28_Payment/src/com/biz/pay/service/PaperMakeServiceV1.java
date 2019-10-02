package com.biz.pay.service;
/*
 * 1. make() method를 정의하고
 * 2. 매개변수로 pay(급여)를 전달받고
 * 3. 화폐매수를 계산하여 console에 보이시오
 * 4. test를 위해서 PayEx_02를 만들고
 * 	  main() method에서 테스트를 수행하시오
 */
public class PaperMakeServiceV1 {
	
	public void make(int pay) {
		
		int money = 50000;
		int sw = 1;
		
		while(true) {
			
			if(pay < 5) break;
			int count = (int)(pay / money);
			
			System.out.printf("%d원권 : %d",money,count);
			
			pay -= (count * money);
			if(sw > 0)
				money /= 5;
			else
				money /= 2;
			sw *= (-1);
		}		
	}
	
}