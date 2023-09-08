package ex02이차원배열;

public class Ex02이차원배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[5][5];
	      
	      // 00 01 02 03 04
	      // 21 22 23 24 25
	      int num = 21;
	      
	      for(int j = 0; j < 5; j++) {
	         // j : 0 1 2 3 4 (5번 반복)
	         for(int i = 0; i < 5; i++) {
	            arr[j][i] = num;
	            num++;
	         }
	      }
	      
	      for(int j = 0; j < 5; j++) {
	         for(int i = 0; i < 5; i++) {
	            System.out.print(arr[j][i]+"\t");
	         }System.out.println();
	      }
	      
	      
	      
	      
	      
//	      // 10 11 12 13 14
//	      // 26 27 28 29 30
//	      for(int i = 0; i < 5; i++) {
//	         arr[1][i] = num;
//	         num++;
//	      }
//	      // 20 21 22 23 24
//	      // 31 32 33 34 35
//	      for(int i = 0; i < 5; i++) {
//	         arr[2][i] = num;
//	         num++;
//	      }
	      
	   }

	}