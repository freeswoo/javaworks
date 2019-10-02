package com.biz.blackjack.controller;

import java.util.Scanner;

import com.biz.blackjack.service.BlackJackService;
import com.biz.blackjack.service.PlayService;

public class BlackJack_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // 키보드 입력받기 위해 스케너 함수를 scan으로 선언 및 초기화
		BlackJackService bs = new BlackJackService(); // BlackJackService를 bs로 선언및 초기화
		bs.makeDeck(); // makeDeck() 호출 (카드 생성)

		while(true) {
			System.out.println("=========================");
			System.out.println(" GAME Start ");
			System.out.println("=========================");
			
			PlayService dealer = new PlayService(bs.getDeck(),"딜러");
			// PlayService 를 dealer라는 이름으로 선언 및 초기화 하고 playService 메서드를 호출 하면서 bs.getDeck()값과  "딜러" 라는 문자열을 넘겨줌
			PlayService player = new PlayService(bs.getDeck(),"플레이어");
			// PlayService 를 player라는 이름으로 선언 및 초기화 하고 playService 메서드를 호출 하면서 bs.getDeck()값과  "플레이어" 라는 문자열을 넘겨줌
			for(int i = 0 ; i < 2 ; i++) { // 딜러와 플에이어의 처음 카드 2장 받기 위함
				dealer.hit(); // dealer로 hit()메서드 호출
				player.hit(); // player로 hit()메서드 호출
			}
			
			while(true) { // 무한 반복문
				System.out.println("=============================");
				System.out.println("1.Hit   2.Stand   0.GameEnd");
				System.out.println("-----------------------------");
				System.out.print("선택>> ");
				String strMenu = scan.nextLine(); // 키보드에서 원하는 메뉴 입력받기
				
				try { // try catch 문을 사용한 이유는 메뉴 값 입력시 다른 값이 입력되었을 경우 발생되는 오류로 게임이 중단되지 않게 하기 위해서
					int intMenu = Integer.valueOf(strMenu); // 키보드에서 입력받은 값을 정수형으로 변경후 intMenu에 담기
					if(intMenu == 0) { // 키보드에서 입력받은 값이 0이면 return 문을 만나서 while문을 끝냄
						System.out.println("Good Bye!!");
						// main method에서 return 문을 만나면
						// 프로젝트 실행이 종료된다.
						return;
					}
					
					if(intMenu == 1) { // 메뉴 값이 1이면 dealer 와 player가 각각 hit()메서드 호출
						dealer.hit();
						player.hit();
					}
					
					int dSum = dealer.sumValue(); // dealer의 sumValue()의 값을 dSum에 넣어라 (딜러 카드 값의 총 액)
					int pSum = player.sumValue(); // player의 sumValue()의 값을 pSum에 넣어라 (플레이어 카드 값의 총 액)
					
					if(pSum > 21) { // 플레이어 점수가 21점 이상이면 딜러 승리
						System.out.println("딜러승리!!");
						break;
					} else if(dSum > 21) { // 딜러의 점수가 21점 이상이면 플레이어 승리
						System.out.println("플레이어 승리!!");
						break;
					}
					
					if(intMenu == 2) { // 메뉴값이 2 이면
						if(dSum > pSum) { // 딜러 점수가 플레이어 점수 보다 크면
							System.out.println("딜러승리");
						} else {// 아니면 플레이어 승리
							System.out.println("플리에어 승리");
						}
						System.out.println("아무키나 누르세요...");
						break;
					}
					
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

}