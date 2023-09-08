package ex01while;

public class Ex02홀수만출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		while(true) {
			if(num % 2 == 1) {
				System.out.println(num);
			}
			if(num == 100) {
				break;
			}
			num++;
		}

	}
}

//		while (num <= 100) {
//			if (num % 2 == 1)  // 조건문
//				System.out.println(num);
//			num++;  // 1부터 100까지 출력
//		}

// 코드 줄 이동 Alt 누른 상태로 방향키


//		while (num <=100) {
//			System.out.println(num);
//			num += 2;
//			}
//		}
