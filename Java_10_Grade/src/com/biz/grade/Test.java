package com.biz.grade;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
        int[] intNum = new int[50];
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(100) +1;
			//System.out.print(intNum[i]+" ");
		}
		
		 int count = 0;

         for(int i = 0 ; i < intNum.length ; i++) {
             
        	 for(int j=2; j<=i; j++) {
                  
        		 if(intNum[i] % j == 0) 
                  {
                       count ++;
                  }    
             }
                          
             if(count==1)
             {
                  System.out.print(intNum[i]+" ");
             }
             count=0;
         }
		
	}

}
