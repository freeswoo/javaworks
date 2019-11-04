package com.biz.thread.exec;

import com.biz.thread.classes.StaticClassV1;

public class StaticClassThread_01 extends Thread {

	@Override
	public void run() {
		StaticClassV1.sum = 0;
		for(int i = 1 ; 1 < 200 ; i++) {
			StaticClassV1.sum += i ;
		}
		System.out.println(StaticClassV1.sum);
	}

	
	
}
