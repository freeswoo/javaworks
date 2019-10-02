package com.biz.blackjack.model;

public class DeckVO {

	private String suit; // 카드의 무늬
	private String denomination; // 표면값
	private int value; // 실제점수

	
	// private 로 선언된 변수를 다른곳에서 사용할수 있도록 하기위해 getter, setter 생성, to String 생성, 슈퍼클레스 및 필드생성
	public DeckVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeckVO(String suit, String denomination, int value) {
		super();
		this.suit = suit;
		this.denomination = denomination;
		this.value = value;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "DeckVO [suit=" + suit + ", denomination=" + denomination + ", value=" + value + "]";
	}
	
	
	
	
}