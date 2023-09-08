package ex01변수;

public class Ex02변수의종류 {
	
	public static void main(String[] args) {
		//main check x --> main + Ctrl + space + Enter
	
		// Java 변수의 종류
		
		// 정수형 데이터 타입
		//byte = 1byte ( -128 ~ 127)
		byte num1 = 100; // 128 -> x
		
		// short - 2byte
		short num2 = 5000;
		
		// int - 4byte
		int num3 = 24444444;
		
		// long - 8byte
		long num4 = 3000000000L;
		
		// 실수형 데이터 타입
		// float - 4byte
		//float num5 = 14.3F;
		float num5 = (float)14.3;
		
		//double - 8byte
		double num6 = 3.14;
		
		// 논리형
		// boolean - 1 bit or 1 byte
		boolean isCheck = true;
		
		// 문자형(정수형)
		// char - 2byte
		char text = 'A'; //''는 무조건 한 글자
		
		System.out.println(text + 1);
		System.out.println((char)99);
		
		
		// 변수의 규칙
		// 1. 키워드 사용 x
		//2. 대소문자 구분 길이제한 x
		int age = 10;
		
	}

}
