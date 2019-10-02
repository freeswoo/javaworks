package com.biz.classes;

import com.biz.classes.model.AddressVO;

public class AddressExec {

	public static void main(String[] args) {

	

		AddressVO adVO1 = new AddressVO();
		
		
		adVO1.strName = "가가가";
		adVO1.strTel = "123-4567";
		adVO1.strAddr = "광주광역시 광산구";
		adVO1.strChain = "친구";
				
		
		adVO1.view();

				
		
	}

}
