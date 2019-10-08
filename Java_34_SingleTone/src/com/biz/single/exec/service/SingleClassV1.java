package com.biz.single.exec.service;

public class SingleClassV1 {

	/*
	 * 프로젝트가 시작될때
	 * 자신(SingleClassV1)을 myObject라는 인스턴스로
	 * 생성해 두어라 
	 */
	private static SingleClassV1 myObject
		= new SingleClassV1();
	
	/*
	 * 클래스 생성자를 private으로 선언하여
	 * new SingleClassV1() 생성자 코드를 사용할수 
	 * 		없도록 한다.
	 */
	private SingleClassV1() {
		// this.myObject 
	}
	
	public static SingleClassV1 getInstance() {
		return myObject;
	}
	
}
