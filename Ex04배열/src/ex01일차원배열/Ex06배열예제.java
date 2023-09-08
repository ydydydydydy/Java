package ex01일차원배열;

import java.util.Scanner;

public class Ex06배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력도구
		Scanner sc = new Scanner(System.in);
		// 수 , 박 을 저장할 배열
		String[] arr = {"수" , "박"};
		
		System.out.println("==== 수박 게임 Start! ====");
		
		// 사용자에게 숫자 입력
		System.out.println("숫자를 입력해주세요 >>");
		int num = sc.nextInt();
		
		// num번 반복 : 글자를 출력하는 것
		for(int i = 0; i < num; i++) {
			// num번 반복하는 for문
			// i : 0 1 2 3 ... num-1
			// for문이 홀수번쨰 반복: 수--> 0 2 4 6 ...
			// for문이 짝수번째 반복: 박--> 1 3 5 7 ...
			if(i % 2 == 0) {
				System.out.print(arr[0]);
			}else {
				System.out.print(arr[1]);
			}
			
			
		}
		
		
		
//		String[] arr = ['수' , '박'];
//		arr[0] = '수';
//		arr[1] = '박';
//		System.out.println("수");
//		System.out.println("박");
//		
//		System.out.println("==== 수박 게임 Start! ====");
//		
//		sc.nextInt();
//		
//		
//		for(if i % 2 == 0; i == num ) {
//			System.out.println("수");
//		} else {i%2 == 1; i == ) {
//			System.out.println("박");
//		}
//		System.out.println();
	}

}
