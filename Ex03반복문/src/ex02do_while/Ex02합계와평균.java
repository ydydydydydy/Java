package ex02do_while;

import java.util.Scanner;

public class Ex02합계와평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 입력한 숫자를 누적할 변수
		int cnt = 0; // 횟수
		
		do {
			System.out.println("숫자를 입력하세요 >> ");
			int num = sc.nextInt();
			
			if(num > 100) {
				break;
			}
			sum += num;
			cnt++;
		}while(true);
			
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum * 1.0 / cnt);
		// * 1.0 = 소수점까지 나오게 하는 법
		//System.out.println("평균 : " + (double)sum / cnt);
		
		// 평균이 소수점 2자리까지만 나오게 하는 법
		// -> double temp1 = (double)sum / cnt;
		// int temp2 = (int)(temp1 * 100);
		// double result = temp2 * 100.0;
		// System.out.println("평균 : " + result);
		sc.close();
	}


}
//int sum = 0;
//int cnt = 1;
//
//while(true) {
//	sum += cnt;
//	if(cnt == 100) {
//		break;
//	}
//	cnt++;
//	
//	
//} 
//do {
//	System.out.println("숫자를 입력하세요");
//	num +=;
//}while(num > 100);
//int sum = sc.nextInt();