package ex02연산자;

import java.util.Scanner;

public class Ex09삼항연산자홀짝판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.print("정수를 입력하세요"); // 줄바꿈x -> print
		int num = sc.nextInt();
		
		String result = num % 2 == 0? "는 짝수입니다" : "는 홀수입니다";
		
		System.out.println(num + result);
		
		sc.close();
	
	}

}
