package com.biz.blackjack.controller;

import com.biz.blackjack.service.BlackJackService;

public class BlackJack_01 {

	public static void main(String[] args) {

		BlackJackService bs = new BlackJackService(); // BlackJackService 를 bs로 선언및 초기화

		// 카드가 생성 제대로 생성 되었는지 확인함 
		bs.makeDeck(); // makeDeck() 메서드 호출
		bs.viewCardList(); // viewCardList() 메서드 호출
		
		
	}

}