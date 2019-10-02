package com.biz.classes.book;

public class BookMain {

	public static void main(String[] args) {

		BookInfo bookinfo = new BookInfo();
		
		bookinfo.strName = "알라딘";
		bookinfo.strOfficeName = "우리집";
		bookinfo.strMadeName = "홍길동";
		bookinfo.intMoney = 15000;
		
		bookinfo.viewInfo();
		
		bookinfo.list();
				
		
	}

}
