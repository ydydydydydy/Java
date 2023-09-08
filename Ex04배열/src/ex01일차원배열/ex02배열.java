package ex01일차원배열;

public class ex02배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // 정수형 배열 arr을 생성
	      // 다음과 같은 값으로 초기화 하기
	      // 3, 10, 4, 8, 17, 22, 31
	      int[] arr = {3, 10, 4, 8, 17, 22, 31};
	      
	      // 1) arr 배열에 들어있는 값을 for문을 사용해서 한번에 출력하기
	      // 0 ~ 6,  +1 
	      // arr.length == 7
	      // i < 7
	      for(int i = 0; i < arr.length; i++) {
	         // i : 0 1 2 3 4 5 6 (7번 반복)
	         System.out.println(arr[i]);
	      }
	      // 2) arr 배열에 들어있는 값들 중에서 짝수만 출력하기
	      // hint. arr[0]가 짝수인지 아닌지 판단 -true-> syso
	      //       arr[1]가 짝수인지 아닌지 판단 -true-> syso
	      //       arr[arr.length-1]가 짝수인지 아닌지 판단 -true-> syso
	      // 2-1) 배열에 있는 모든 값들을 하나씩 접근하면서 짝수인지 아닌지 판단
	      // 판단 ---> 조건식
	      
	      for(int i = 0; i < arr.length; i++) {
	         // arr.length : 7
	         // 0 ~ arr.lenth-1(6)
	         if(arr[i] % 2 == 0) {
	            System.out.println(arr[i]);
	         }
	      }
	      
	      
//	      if(arr[1]%2==0) {
//	         System.out.println(arr[1]);
//	      }
//	      if(arr[2]%2==0) {
//	         System.out.println(arr[2]);
//	      }
//	      //..
//	      if(arr[6]%2 == 0) {
//	         System.out.println(arr[6]);
//	      }
	      
	      
	      
	      // 3) arr 배열에 들어있는 값들 중에서 가장 큰 수를 출력하기(선택)
	      // "가장 큰 값은 31입니다."
	      
	      // 배열안에 있는 값들에 하나하나 접근하면서 
	      // 서로 비교를 통해 큰 값이 출력되게 만들어 주자!
	      
//	      if(arr[0]>기준값) {
//	         최대값 = arr[0];
//	      }       
	      // 최대값이 들어갈 공간 : max
	      int max = arr[0];
	      // max = 0 : 만약에 배열에 들어가 있는 모든 값들이 음수라면
	      // 정확한 결과값을 받아볼수가 없다!
	      // + 배열안에 들어있는 값들로만 비교를 해야한다
	      
	      for(int i = 1; i < arr.length; i++) {
	         // 인덱스 값 : 0 1 2 3 4 5 6(arr.length - 1)
	         // i : 0 1 2 3 4 5 6 (7번 반복)
	         if(arr[i] > max) {
	            max = arr[i];
	            
	         }
	      
	      }
	      System.out.println("최대값은 "+max+"입니다.");
	      
	      
	      
	      
	      
	   }

	}
