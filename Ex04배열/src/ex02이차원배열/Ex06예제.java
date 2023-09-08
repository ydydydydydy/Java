package ex02이차원배열;

public class Ex06예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

					}
	 // 앞 : 1, 3 <----
    //       0, 2, 4 ---->
    
    int[][] arr = new int[5][5];
    int num = 21;
    
    // 입력부
    for(int j = 0; j < 5; j++) {
       // j : 0 1 2 3 4
       // j가 2로 나눴을 때 나머지가 1인지 0인지 
       if(j % 2 == 1) {
          // 4 ~ 0, -1
          for(int i = 4; i >= 0; i--) {
             arr[j][i] = num;
             num++;
          }
       }else {
          // 0 ~ 4, +1
          for(int i = 0; i < 5; i++) {
             arr[j][i] = num;
             num++;
          }
       }
    }
    
    // 출력부
    for(int j = 0; j < 5; j++) {
       for(int i = 0; i < 5; i++) {
          System.out.print(arr[j][i]+"\t");
       }System.out.println();
    }
    
    
    
    
    
 }


			
				
	


