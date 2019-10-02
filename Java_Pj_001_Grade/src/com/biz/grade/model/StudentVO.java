package com.biz.grade.model;

public class StudentVO {
	
	private String strNum;  // 학번
	private String strName; // 이름
	private String strAddr; // 주소
	private String strTel;  // 전화번호
	private String strDept; // 학과
	private int intGrade;   // 학년
	private int intNum;
	
		
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub		
	}
	
	
	public StudentVO(String strNum, String strName, String strAddr, String strTel, String strDept, int intGrade,
			int intNum) {
		super();
		this.strNum = strNum;
		this.strName = strName;
		this.strAddr = strAddr;
		this.strTel = strTel;
		this.strDept = strDept;
		this.intGrade = intGrade;
		this.intNum = intNum;
	}


	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrAddr() {
		return strAddr;
	}
	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	public String getStrTel() {
		return strTel;
	}
	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}
	public String getStrDept() {
		return strDept;
	}
	public void setStrDept(String strDept) {
		this.strDept = strDept;
	}
	public int getIntGrade() {
		return intGrade;
	}
	public void setIntGrade(int intGrade) {
		this.intGrade = intGrade;
	}
	public int getIntNum() {
		return intNum;
	}
	public void setIntNum(int intNum) {
		this.intNum = intNum;
	}
	@Override
	public String toString() {
		return "StudentVO [strNum=" + strNum + ", strName=" + strName + ", strAddr=" + strAddr + ", strTel=" + strTel
				+ ", strDept=" + strDept + ", intGrade=" + intGrade + ", intNum=" + intNum + "]";
	}
	
	

	
}
