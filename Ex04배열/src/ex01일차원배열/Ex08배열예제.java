package ex01일차원배열;

import java.util.Scanner;

public class Ex08배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자가 입력한 답이 실제 정답과 맞는지 채점해보자 + 총합
	      
	      // 1) 입력하는 도구 가져오기
	      Scanner sc = new Scanner(System.in);
	      // 2) 실제 답을 관리하는 배열 만들기 : answer
	      //                         1 4 3 2 1
	      int[] answer = {1, 4, 3, 2, 1};
	      // int 자료형을 관리하는 5칸짜리 배열
	      System.out.println("==채점하기==");
	      System.out.println("답을 입력하세요");
	      
	      // 3) 사용자로 부터 정답 입력 받기
	      // + 입력받은 정답을 관리하는 배열 만들기 : input
	      int[] input = new int[5];
	      
	      for(int i = 0; i < 5; i++) {
	         // i : 0 1 2 3 4 (5번 반복하는 for문)
	         System.out.print((i+1)+"번답 >> ");
	         input[i] = sc.nextInt();
	      }
	      
	      System.out.println("정답 확인");
	      int sum = 0; // 총합이 저장될 변수
	      // 4) 실제 정답과 사용자가 입력한 정답이 일치하는지 판단
	      // + 맞으면 O, 틀리면 X를 출력하기
	      // + 단, 정답이 맞으면 20점을 받을 수 있다!
	      
	      // 1번문제의 실제 정답과 사용자가 입력한 정답이 같은지!판단
	      
	      for(int i = 0; i < 5; i++) {
	         // i : 0 1 2 3 4 (5번 반복) 
	         if(answer[i] == input[i]) {
	            System.out.print("O ");
	            sum+=20;
	         }else {
	            System.out.print("X ");
	         }
	      }
	      
	      System.out.print("총 점 : "+sum);
	      
	      
	      

		
		
		
		
		
//		// 1) 입력하는 도구 가져오기
//		System.out.println("==채점하기==");
//		Scanner sc = new Scanner(System.in);
//		
//		// 2) 실제 답을 관리하는 배열 만들기 answer
//		int[] answer = { 1 , 4 , 3 , 2 , 1};
//		// int 자료형을 관리하는 5칸짜리 배열
//		int[] input = new int[5];
//		// 3) 사용자로부터 정답 입력 받기
//		for(int i= 0; i < 5; i++) {
//			System.out.print(i + 1 + " 번답 >> " );
//			input[i] = sc.nextInt();
//		}
//		System.out.println("정답확인");
//		
//		for(int i = 0; i<5; i++) {
//			if( answer[i] == input[i] ) {
//				System.out.print("O ");
//			} else { System.out.print("X ");
//			
//			
//		}
//		}
	}

}
