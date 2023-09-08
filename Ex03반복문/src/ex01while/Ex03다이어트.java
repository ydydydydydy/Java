package ex01while;

import java.util.Scanner;

public class Ex03다이어트 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int weight = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goalWeight = sc.nextInt();
		
		int lostWeight = weight ;
		while (true) {
			System.out.print("1주차 감량 몸무게 : ");
			int weight1 = sc.nextInt();
			
			lostWeight -=  weight1;
			System.out.println(lostWeight);
			if (lostWeight <= goalWeight)
				break;
			
		}
		System.out.println(lostWeight + "kg 달성!! 축하합니다!");
		
		sc.close();
	}
}


//		System.out.print("현재몸무게 : ");
//		int nowKg = sc.nextInt();
//		System.out.print("목표몸무게 : ");
//		int goalKg = sc.nextInt();
//		
//		int cnt = 1; //주차를 기록할 변수
//		while(nowKg > goalKg) {
//			int minus = 0;
//		System.out.print(cnt + "주차 감량 몸무게 : ");
//			minus = sc.nextInt();
//			cnt++;
//			// nowKg = nowKg - minus;
//			nowKg -= minus;
//			
//		}
//		
		// 한 번에 바꾸기 --> Alt + Shift + R