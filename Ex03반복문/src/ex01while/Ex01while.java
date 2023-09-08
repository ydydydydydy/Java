package ex01while;

public class Ex01while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문 - 조건에 성립할 때까지 반복하는 문법
		// while, do-while, for
		
		// while(조건식) {
		// }
		// while를 사용하여 1부터 5까지 출력
		int num = 1;
		while(true) {
			System.out.println(num);
			
			if(num == 5) {
				break;
			}
			
			num++;
			
		}

			
		
//		while(num <= 5) {  //num이 5보다 작거나 같다
//			System.out.println(num);
//			 1. num = num + 1;
//			 2. num += 1;
//			num++;
//			 break; --> 1출력
//			
//		}
//	System.out.println(num);
		
	}
}

// Ctrl + / --> 주석처리 한 번에 
