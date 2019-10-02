package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.grade.model.ScoreVO;


public class ScoreServiceImpV1 implements ScoreService {
	
	List<ScoreVO> scoreList;
	
	Random rnd;
	
	public ScoreServiceImpV1() {
		
		scoreList = new ArrayList<ScoreVO>();
		rnd = new Random();
		
	}

	@Override
	public void input(int size) {
		for(int i = 0 ; i < size ; i++) {
			String strNum = String.format("%05d", i+1);
			
			int intKor = rnd.nextInt(50) + 51;
			int intEng= rnd.nextInt(50) + 51;
			int intMath= rnd.nextInt(50) + 51;
			
			ScoreVO vo = new ScoreVO();
			vo.setStrNum(strNum);
			vo.setIntKor(intKor);
			vo.setIntEng(intEng);
			vo.setIntMath(intMath);
			
			scoreList.add(vo);
						
		}

	}

	@Override
	public void total() {
		
		int nSize = scoreList.size();
		
		for(int i = 0 ; i < nSize ; i++) {
			ScoreVO vo = scoreList.get(i);
			int total = scoreList.get(i).getIntKor();
			total += scoreList.get(i).getIntEng();
			total += scoreList.get(i).getIntMath();
			vo.setIntTotal(total);
			vo.setIntAvg(total / 3);
		}

	}
	
	
	public void rank() {
		int Rank = 0;
		ScoreVO vo = new ScoreVO();
		for(int i = 0 ; i < scoreList.size(); i++) {
			Rank ++; 
			for(int j = 0 ; j < scoreList.size(); j++) {
				
				int total_i = scoreList.get(i).getIntTotal();
				int total_j = scoreList.get(j).getIntTotal();
				
				if(total_i < total_j) {
					ScoreVO _vo = scoreList.get(i);
					scoreList.set(i,scoreList.get(j));
					scoreList.set(j, _vo);
				}
				vo.setIntRank(Rank);
			}
		}
	}

	@Override
	public void list() {
		
		System.out.println("=========================");
		System.out.println("성적일람표");
		System.out.println("================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		
		for(ScoreVO vo : scoreList) {
			System.out.print(vo.getStrNum()+"\t");
			System.out.printf("%3d\t",vo.getIntKor());
			System.out.printf("%3d\t",vo.getIntEng());
			System.out.printf("%3d\t",vo.getIntMath());
			System.out.printf("%3d\t",vo.getIntTotal());
			System.out.printf("%3d\t",vo.getIntAvg());
			System.out.printf("%3d\t\n",vo.getIntRank());
			
		}

	}

}
