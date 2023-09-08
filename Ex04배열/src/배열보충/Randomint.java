package 배열보충;

import java.util.Random;

public class Randomint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 정수 10개가 저장된 배열 생성
		int[] num = {13, 5, 7, 1, 3, 32, 55, 65, 8, 99};
		
		// 2. 랜덤수 셋팅 => 리소스 구성
		// 0~9번까지 한 칸씩 세팅
		Random rd = new Random();
		for(int i=0; i<num.length; i++) {
			num[i] = rd.nextInt(20); // 0~19
		// 중복검사하기
		// 검사용 for문 만들기
			// 1. j의 범위를 결정
			// 2. j번째 숫자랑 i번째 숫자 비교
			for(int j = 0; j < i; j++) {
				if(num[i]==num[j]) {
					i--;
					break;
				}
			}
			
		}
		// 3. 출력하기
		// 확장 for문을 이용해보자 (for-each)
		for(int temp : num ) {
			System.out.println(temp);
		}
		
		// 총합과 평균
		// 0~ 9번 1개씩
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum+=num[i];
		}
		System.out.println("총합 : " + sum);
		
		//평균 구하기
		double avg = sum/ num.length;
		System.out.println(avg);
		
	}
	

}
