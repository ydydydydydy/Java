package ex02이차원배열;

public class Ex04예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][5];
	      int num = 21; 
	      
	      // 21 ~ 25
	      // 04 03 02 01 00
	      // 입력부
	      for(int j = 0; j < 5; j++) {
	         // j 0 1 2 3 4 : 5번
	         for(int i = 4; i >=0; i--) {
	            // i 4 3 2 1 0 --> 5번
	            arr[j][i] = num;
	            num++;
	         }
	      }
	      
	      // 출력부
	      for(int j = 0; j < 5; j++) {
	         for(int i = 0; i < 5; i++) {
	            System.out.print(arr[j][i]+"\t");
	         }System.out.println();
	      }
	      
	      
//	      // 26 ~ 30
//	      // 14 13 12 11 10
//	      for(int i = 4; i >= 0; i--) {
//	         arr[1][i] = num;
//	         num++;
//	      }
//	      
	      
	      
	      
	      
	      
	   }

	}
	


