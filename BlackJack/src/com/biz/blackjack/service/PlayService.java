package com.biz.blackjack.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.blackjack.model.DeckVO;

public class PlayService {

	List<DeckVO> playList; // DeckVO 를 playList로 선언
	List<DeckVO> deckList; // DeckVO 를 deckList로 선언
	String playName ;      // 문자열형으로 playName 이라는 변수명 선언
	
	public PlayService(List<DeckVO> deckList, String playName) {
		// PlayService 클래스를 호출할때 2개의 값을 받는다
		this.playList = new ArrayList<DeckVO>();
		// playList 라는 필드에  DeckVO를 배열로 초기화 
		this.deckList = deckList;
		// deckList 초기화
		this.playName = playName;
		// playName 초기화
	}
	
	public int sumValue() {
		int sumValue = 0; // 정수형변수 sumValue 를 0으로 초기화
		for(DeckVO vo : playList) { // playList 배열 개수만큼 반복
			sumValue += vo.getValue(); // sumValue 에 vo.getValue 갑을 가져와 더하기
		}
		return sumValue; // 더해진 sumValue 값을 가지고 sumValue 메서드를 호출 한 곳으로 돌아감
	}
	
	public void hit() {
		
		if(playName.equals("딜러") && this.sumValue() > 16) { // playName 값이 '딜러'와 같고 sumValue 값이 16 보다 크면
			System.out.println("딜러점수:" + this.sumValue()); // 딜러점수 : sumValue 값 콘솔에 출력
			System.out.println("딜러 Hit 금지"); // 콘솔 출력
		} else { // 딜러 점수가 16보다 작으면 카드 1장을 더 받고 받은 카드는 전체카드 리스트에서 제거하기 
			playList.add(deckList.get(0)); // deckList의 0번째 값을 playList에 주입
			deckList.remove(0); // deckList의 0번째 값을 지워라
		}
		// 딜러와 플레이어의 카드값들을 출력하기
		System.out.println("----------------");
		System.out.println(playName);
		System.out.println("----------------");
		for(DeckVO vo : playList) {
			System.out.println(vo);
		}
	}
	
}