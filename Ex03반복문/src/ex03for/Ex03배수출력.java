package ex03for;

import java.util.Scanner;

public class Ex03배수출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		// 문제
		// 숫자를 입력받고 그 숫자의 배수 10개를 나타내게 하시오
		// 입력숫자 3
		// -> 3 6 9 12 15 18 21 24 27 30
		// 입력숫자 4
		// -> 4 8 12 16 20 24 28 32 36 40
		
		
		for(int i = 1; i <= 10 ; i++) {
			System.out.print(num * i + " ");
			
		
		
		}
		
	}

}
