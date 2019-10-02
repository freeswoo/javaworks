package test;


public class test {

	public static void main(String[] args) {
		
		ScoreVO[] scoreVO = new ScoreVO[5];
		scoreVO[1] = new ScoreVO();
		
		scoreVO[1].intKor=92;
		scoreVO[1].intEng=87;
		scoreVO[1].intMath=65;
			
		int intSum = scoreVO[1].intKor;
		intSum += scoreVO[1].intEng;
		intSum += scoreVO[1].intMath;

		System.out.printf("합계 : %5d",intSum);
		
	}

}
