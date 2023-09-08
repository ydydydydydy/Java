package ex01일차원배열;

import java.util.Random;

public class Ex09로또번호출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로또번호 출력 중복없이!
		// 랜덤한 숫자를 가져오는 기능
		Random rd = new Random();
		//로또 번호가 저장될 배열 만들기
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			//인덱스 0 1 2 3 4 5 에 접근해서 랜덤한 숫자가 들어가게 만들어주자
			lotto[i] = rd.nextInt(10)+1; // 0- 9 + 1 : 1-10
			// 중복되어 있는지 확인해서 제거
			// 제거: 다시 랜덤한 숫자를 재할당
			for(int j = 0; j < i; j++) {
				//자기 자신을 제외한 앞쪽 인덱스값들과 비교를 해야함
				if(lotto[i] == lotto[j]) {
					// 재입력
					// lotto[i] : 새로 입력되고있는 값
					// lotto[j] : 이미 앞쪽에 입력되어있는 값
					i--;
					break;
				}
				
			}
			
		}
	}

}
