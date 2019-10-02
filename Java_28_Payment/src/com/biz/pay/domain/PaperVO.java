package com.biz.pay.domain;

/*
 * 1. 다음의 필드(맴버변수)가 포함된 VO 클래스를 정의하시오
 * 2. 	액면가 : paper, 문자열
 * 		매수 : count, 정수형
 * 3.	getter와 setter method 생성
 * 4. 필드생성자, super(기본)생성자
 * 5. toString() 재정의  
 */
public class PaperVO {
	
	private String paper;
	private int count;
	
	/*
	 * 기본생성자
	 */
	public PaperVO() {
	}
	
	/*
	 * 필드 생성자
	 * 필드 변수를 주입받아서 값을 설정한다.
	 */
	public PaperVO(String paper, int count) {
		super();
		this.paper = paper;
		this.count = count;
	}
	public String getPaper() {
		return paper;
	}
	public void setPaper(String paper) {
		this.paper = paper;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "PaperVO [paper=" + paper + ", count=" + count + "]";
	}
	
	

}
