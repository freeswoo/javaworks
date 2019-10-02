package com.biz.arrays.exec;

import com.biz.arrays.service.MethodService;

public class MethodEx_04 {

	public static void main(String[] args) {

		// MethodService 클래스를 사용해서
		// ms 객체를 생성한다.
		// MethodService 클래스에 포함된
		//    맴버변수, method를 사용하기 위한 준비
		MethodService ms = new MethodService();
		
		int retNum = ms.getSum(30,40);
		
		System.out.println("30 X 40 = " + retNum);
				
	}

}
