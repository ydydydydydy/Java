package ex01일차원배열;

import java.util.Scanner;

public class ex05배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1) 입력하는 도구 가져오기
	      Scanner sc = new Scanner(System.in);
	      // 2) 사용자가 입력한 5개의 점수들을 배열에 저장
	      //      배열의 이름 : score
	      int[] score = new int[5];
	      // score라는 주소값에 5칸짜리 공간이 생긴 상태.
	      // 최대값, 최소값이 들어가는 공간 만들기 
	      int max;
	      int min;
	      
	      // 5번 반복, 0 - 4(score.length -1)
	      for(int i = 0; i < score.length; i++) {
	         // i : 0 1 2 3 4 (5번 반복)
	         System.out.print((i+1)+"번째 입력 >> ");
	         // i + 1 : 1 2 3 4 5 
	         score[i] = sc.nextInt();
	      }
	      // 사용자가 입력한 후에 max, min이 초기화가 이루어져야한다.
	      max = score[0];
	      min = score[0];
	   
	      // 3) 입력된 점수들을 모두 출력하기
	      System.out.print("입력된 점수 : ");
	      for(int i = 0; i < score.length; i++) {
	         System.out.print(score[i]+" ");
	      }
	      System.out.println();
	      // 4) 최고 점수, 최저 점수 출력하기
	      for(int i = 1; i < score.length; i++) {
	         // 최고 점수
	         if(score[i]>max) {
	            max = score[i];
	         }
	         // 최저 점수
	         if(score[i]<min) {
	            min = score[i];
	         }
	      }
	      System.out.println("최고 점수 : "+max);
	      System.out.println("최저 점수 : "+min);
	      
	      // 5) 총합, 평균 출력하기
	      // 누적된 값이 들어갈 공간 : 총합
	      int sum = 0;
	      // 누적 : 복합대입연산자 +=
	      for(int i = 0; i < score.length; i++) {
	         // i : 0 1 2 3 4 (5번 반복)
	         sum = sum + score[i]; // sum += score[i];
	      }
	      // build up
//	      sum = sum + score[0];
//	      sum = sum + score[1];
//	      sum = sum + score[2];
	      System.out.println("총합 : "+sum);
	      // 평균 = 과목점수총합 / 과목의 개수
	      // 평균 = sum / 점수의 개수(score.length)
	      System.out.println("평균 : "+(sum/(float)score.length));
	      // int/int ---> int
	      // int/float --> flo at
	      // float/int ---> float
	      // (float)(int/int) ---> float
	   }

	}
		
//		// 1) 입력하는 도구 가져오기
//		Scanner sc = new Scanner(System.in);
//		
//		// 2) 사용자가 입력한 5개의 점수들을 배열에 저장
//		int[] score = new int[5];
//		
//		System.out.print("1번째 입력>> ");
//		score[0] = sc.nextInt();
//		System.out.print("2번째 입력>> ");
//		score[1] = sc.nextInt();
//		System.out.print("3번째 입력>> ");
//		score[2] = sc.nextInt();
//		System.out.print("4번째 입력>> ");
//		score[3] = sc.nextInt();
//		System.out.print("5번째 입력>> ");
//		score[4] = sc.nextInt();
//		// 배열의 이름 : score
//		
//		
//		// 3) 입력된 점수들을 모두 출력하기
//		for(int i = 0; i < score.length; i++) {
//			System.out.print(score[i]);
//		}
//		
//		// 4) 최고 점수, 최저점수
//		int max;
//	    int min;
//	    
//	    for(int i = 1; i<score.length; i++) {
//	         if(score[i] > max) {
//	            max = score[i];
//	    System.out.println("최고 점수 : " + max);
//	         }
//	         }
//	    
//	    for(int i = 1; i<score.length; i++) {
//	    	if(score[i] < min) {
//	    		min = score[i];
//	    System.out.println("최저 점수 : " + min);
//	    	}
//	    	}
//	    // 5) 총합, 평균
//	    // 누적된 값이 들어갈 공간 : 총합
//	    int sum = 0;
//	    // 누적 : 복합대입연산자 += 
//	    for(int i = 0; i < score.length; i++) {
//	    	// i : 0 1 2 3 4 (5번 반복)
//	    	sum = sum + score[i]; // sum += score[i];
//	    }
//	    // build up
////	    sum = sum + score[0];
////	    sum = sum + score[1];
////	    sum = sum + score[2];
//	    System.out.println("총합 : " + sum);
//	    // 평균 =  과목점수총합 / 과목의 개수
//	    // 평균 =  sum / 점수의 개수(score.length)
//	    System.out.println("평균 : " + (sum/score.length));


