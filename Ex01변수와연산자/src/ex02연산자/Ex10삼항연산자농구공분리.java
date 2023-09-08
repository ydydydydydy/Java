package ex02연산자;

import java.util.Scanner;

public class Ex10삼항연산자농구공분리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("농구공의 개수를 입력하세요 : ");
		int ball = sc.nextInt();
		
		int result = ball % 5 != 0 ? ball / 5 + 1 : ball / 5 ;
		System.out.println("필요한 상자의 수 : " + result);

		sc.close();
	}

}
