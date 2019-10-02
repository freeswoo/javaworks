package com.biz.grade.model;

public class ScoreVO {
	
	private String strNum;
	private int intKor;   // 국어점수
	private int intEng;   // 영어점수
	private int intMath;  // 수학점수
	private int intTotal; // 총점
	private int intAvg;   // 평균
	private int intRank;  // 석차
		
	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ScoreVO(String strNum, int intKor, int intEng, int intMath, int intTotal, int intAvg, int intLank) {
		super();
		this.strNum = strNum;
		this.intKor = intKor;
		this.intEng = intEng;
		this.intMath = intMath;
		this.intTotal = intTotal;
		this.intAvg = intAvg;
		this.intRank = intRank;
	}


	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}
	public int getIntAvg() {
		return intAvg;
	}
	public void setIntAvg(int intAvg) {
		this.intAvg = intAvg;
	}
	public int getIntRank() {
		return intRank;
	}
	public void setIntRank(int intRank) {
		this.intRank = intRank;
	}
	@Override
	public String toString() {
		return "ScoreVO [strNum=" + strNum + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
				+ ", intTotal=" + intTotal + ", intAvg=" + intAvg + ", intRank=" + intRank + "]";
	}
	
	
	
}