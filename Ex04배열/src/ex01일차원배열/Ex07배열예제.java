package ex01일차원배열;

import java.util.Scanner;

public class Ex07배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] star = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 별의 개수를 입력 >> ");
			star[i] = sc.nextInt();
		}
		// 배열에 저장되어있는 별의 개수를 꺼내와서 별을 출력
		
		for(int j = 0; j < 5; j++) {
			System.out.print(star[j] + " : " + );
		for(int i = 0; i < star[j]; i++) {
            // star[0] 데이터 값만큼 반복하는 for문
            System.out.print("*");
         }
         System.out.println();
		}
		
		// 1번째 출력 : star[0] 데이터만큼 출력
//		System.out.print(star[0]+ " : ");
//		for(int i= 0; i < star[0]; i++) {
//			// star[0]에 데이터 값만큼 반복하는 for문
//			System.out.print("*");
//		}
//		// 2번째 출력 : star[1] 데이터만큼 출력
//		System.out.print(star[1]+" : ");
//		for(int i = 0; i < star[1]; i++) {
//			System.out.print("*");
//		}
		
	}

}

//		System.out.print("1번째 별의 개수를 입력 >> ");
//		star[0] = sc.nextInt();
//		System.out.print("2번째 별의 개수를 입력 >> ");
//		star[1] = sc.nextInt();
//		System.out.print("3번째 별의 개수를 입력 >> ");
//		star[2] = sc.nextInt();
//		System.out.print("4번째 별의 개수를 입력 >> ");
//		star[3] = sc.nextInt();
//		System.out.print("5번째 별의 개수를 입력 >> ");
//		star[4] = sc.nextInt();