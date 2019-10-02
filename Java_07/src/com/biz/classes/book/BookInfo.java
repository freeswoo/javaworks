package com.biz.classes.book;

public class BookInfo {
	
	public String strName;
	public String strOfficeName;
	public String strMadeName;
	public int intMoney;
	
	public void viewInfo() {
		System.out.println("도서명 : " + strName);
		System.out.println("출판사 : " + strOfficeName);
		System.out.println("저   자 : " + strMadeName);
		System.out.println("가   격 : " + intMoney);
		System.out.println();
		System.out.println();
		
	}
	public void list() {
		System.out.printf("%s\t%s\t%s\t%d\n",
				 strName,
				 strOfficeName,
				 strMadeName,
				 intMoney);
	}	

}
