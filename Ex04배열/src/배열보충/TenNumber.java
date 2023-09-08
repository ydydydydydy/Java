package 배열보충;

import java.util.Scanner;

public class TenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 열칸짜리 정수를 담을 수 있는 배열 만들기
		int[] numbers = new int[10];
		Scanner sc = new Scanner(System.in);
		// 반복할 개수가 정해져 있으므로 for문 쓰기
		for(int i=0; i<numbers.length; i++) {
			System.out.println(i+1+"번째 정수 입력 >>");
			numbers[i] = sc.nextInt();
		}
		// 3의 배수를 출력하기
		System.out.println("3의 배수 : ");
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 3 == 0) {
				System.out.println(numbers[i]);
			}
		}
		
		
	}

}
