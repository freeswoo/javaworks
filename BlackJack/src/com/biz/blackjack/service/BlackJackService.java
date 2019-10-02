package com.biz.blackjack.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.biz.blackjack.model.DeckVO;

// 카드정보를 생성하고
// 게임을 진행하는데 필요한 클래스
public class BlackJackService {
	
	private List<DeckVO> deckList; // deckList 배열 선언 (private 로 자신의 클래스 내에서만 접근가능)
	private String suit = "다이아몬드(◆):하트(♥):스페이드(♠):클로버(♣)"; // suit에 "..." 안의 문자열 담기
	private String denomiation = "A234567890KQJ"; // denomiation에 "A234.." 문자열 담기
	
	public BlackJackService() {
		deckList = new ArrayList(); // deckList 배열 로 선언및 초기화
	}
	
	public List<DeckVO> getDeck() {
		
		for(int i = 0 ; i < 50 ; i++) { // 50번 반복하라 
			Collections.shuffle(deckList); // deckList 배열 안의 값을 50번 섞어라
		}
		return deckList; // deckList 배열의 섞인 값을 가지고 호출한 곳으로 돌아가라
	}
	
	public void makeDeck() {
		
		String[] suits = suit.split(":"); // suit 안의 문자열을 콜론(:) 단위로 나누어 suits배열에 담아라
		String[] denominations = denomiation.split(""); // denomiation 안의 문자열을  한글자씩 나누어 denominations배열에 담아라 
		
		for(String s : suits) { // suits배열의 개수만큼 반복
			for(String d : denominations) { // denominations 배열의 개수만큼 반복
				
				DeckVO vo = new DeckVO(); //DeckVO를 vo로 초기화
				vo.setSuit(s); // s 값을 vo.setSuit에 담기
				vo.setDenomination(d); // d 값을 vo.setDenomination에 담기
				
				int intValue = 0; // 정수형 변수 intValue를 0으로 초기화
				
				try { // try문을 사용한 이유는 d에 들어 있는 변수가 정수형으로 변환시 오류가 발생되면(A,K,J,Q) 이면 catch 문 이후 실행 
					intValue = Integer.valueOf(d);	// d에 들어있는 문자를 정수형으로 변환후  intValue에 담기
					if(intValue == 0) intValue = 10; // intValue 가 0 이면 intValue 에 10 담기
				} catch (Exception e) {
					if(d.equals("A")) { // d에 들어있는 값이 A 와 같으면 intValue 에 1 담기
						intValue = 1;
					} else {
						intValue = 10; // 그렇지 않으면 intValue 에 10 담기
					}
				}

				vo.setValue(intValue); // intValue 값을 vo.setValue에 담아라
				deckList.add(vo); // deckList에 vo 값을 추가해라
				
			}
		}

		
	}
	
	// 테스트코드 (카드가 제대로 생성 되었는지 확인하는 코드)
	public void viewCardList() {
		
		for(DeckVO vo : deckList) { // deckList의 배열 개수 만큼 반복
			System.out.println(vo.toString()); // 만들어진 카드 출력
		}
		System.out.println("===============");
		System.out.println("카드매수:" + deckList.size()); // 만들어진 카드의 개수 출력
		
	}

}