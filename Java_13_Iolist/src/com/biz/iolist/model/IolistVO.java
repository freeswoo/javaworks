package com.biz.iolist.model;

/*
 * 1. 다음 필드(맴버변수)가 포함된 VO 클래스를 정의하시오
 * 2. 거래일자 : date, String
 *    거래시각 : time, String
 *    상품이름 : pname, String
 *    상품단가 : price, int
 *    수량 : qty, int
 *    상품금액 : (상품단가  * 수량), total, int
 */
public class IolistVO {
	
	/*
	 * 맴버변수
	 * 필드
	 * (클래스의) 속성
	 * property
	 */
	private String strDate;
	private String strTime;
	private String strPName;
	
	private int intPrice;
	private int intQty;
	private int intTotal;	
	
	public String getStrDate() {
		return strDate;
	}
	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	public String getStrTime() {
		return strTime;
	}
	public void setStrTime(String strTime) {
		this.strTime = strTime;
	}
	public String getStrPName() {
		return strPName;
	}
	public void setStrPName(String strPName) {
		this.strPName = strPName;
	}
	public int getIntPrice() {
		return intPrice;
	}
	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	public int getIntQty() {
		return intQty;
	}
	public void setIntQty(int intQty) {
		this.intQty = intQty;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}	

}
