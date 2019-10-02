package com.biz.loop;

public class Loop_05 {

	public static void main(String[] args) {
		
		int nCount = 0;
		for(; nCount < 9;) {
			System.out.printf("%d X %d = %d\n",
					3, ++nCount, nCount * 3);
		}

	}

}
