package test;

public class Test_1 {
	static String strName = "홍길동";

	public static void main(String[] args) {
		
		getName(strName);
		System.out.println(strName);

	}
	
	public static void getName(String strName) {
		strName = "성춘향";
	}

}
