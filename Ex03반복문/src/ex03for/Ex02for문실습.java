package ex03for;

public class Ex02for문실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 1부터 100까지 콘솔에 출력을 해주세요
		// 2. 그 중에서 홀수만 출력
		// i += 2 --> i가 2씩 증가
		
		for(int i = 1; i <= 100; i += 2) {
			if(i % 2 == 1) {
				System.out.println(i);
			
			}
			
		}
	}

}
