package 배열보충;

public class 이차원예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] arr = new int [5][5];
//		int num = 21;
//		
//		for(int j = 0; j < 5; j++) {
//			for(int i = 0; i < 5; i++) {
//				arr[j][i] = num;
//				num++;
//			}
//		}
//		for(int j = 0; j < 5; j++) {
//			for(int i = 0; i < 5; i++) {
//				System.out.print(arr[j][i]+"\t");
//			}System.out.println();
//		}
		
		int[][] snake = new int[5][5];
		
		int cnt=1;
		boolean right = true;
		
		for(int i=0; i < snake.length; i++) {
			if(right) { // 오른쪽 방향으로 넣기
				for(int j=0; j<snake[i].length; j++) {
					snake[i][j] = cnt++;
			}
		}else {// 왼쪽 방향으로 넣기
			
			for(int j=snake[i].length-1; j>=0; j--) {
				snake[i][j]= cnt++;
				right = true;
				}
			}
		}
			//-----------------데이터를 넣는 부분-----
			for(int i=0; i<snake.length; i++) {
				for(int j=0; j<snake[i].length; j++) {
					System.out.print(snake[i][j]+"\t");
				}
				System.out.println();
		}
	}

}
