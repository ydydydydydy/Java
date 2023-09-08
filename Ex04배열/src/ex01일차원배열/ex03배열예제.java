package ex01일차원배열;

public class ex03배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // 1) 정수형 데이터를 저장할 수 있는 arr 배열을 생성
	      int[] arr = {23, 45, 95, 17, 6, 89, 47, 56, 68, 17};
	      // 2) 문제에 적혀있는 값으로 초기화
	      //    23, 45, 95, 17, 6, 89, 47, 56, 68, 17
	      // arr 배열의 크기 : 10
	      // arr 인덱스 : 0 ~ 9
	      
	      int max = arr[0];
	      int min = arr[0]; // 0 : 0보다 작은값이 없으면 
	      // 원하는 결과값을 받아볼 수가 없기때문에 배열안에있는 값으로 초기화
	      
	      // 3) arr에 들어있는 값들 중에서 가장 큰 값을 찾아서 출력해보자
	      for(int i = 1; i<arr.length; i++) {
	         // max보다 값이 더 크면 max에 다시 값을 대입(재할당)
	         // 9번 : i(1,2,3,4,5,6,7,8,9)
	         if(arr[i] > max) {
	            max = arr[i];
	         }
	      }
	      
	      // 4) arr에 들어있는 값들 중에서 가장 작은 값을 찾아서 출력해보자
	      for(int i = 1; i < arr.length; i++) {
	         // min보다 값이 더 작으면 min에 해당 값을 대입(재할당)
	         if(arr[i] < min) {
	            min = arr[i];
	         }
	      }
	      System.out.println("최소값 : "+min);
	      
	   }

	}