package ex02do_while;

import java.util.Random;
import java.util.Scanner;

public class Ex04PlusGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 난수를 뽑는 방법
		Random rd = new Random();
		
		System.out.println("====Plus Game====");
		
		// 틀렸을 때는 기존 문제를
		// 성공했을 떄는 새로운 문제를 출력
		// 성공할 때만 새로운 문제 뽑기
		
		// 첫 게임을 시작할 때는 3개의 목숨이 주어진다
		// 문제의 답을 틀렸을 때는 목숨을 하나씩 차감하며 클라이언트에게 알려준다
		// 예 - 첫번째 문제 틀렸을 시 ) - 남은 목숨 2개
		// 마지막으로 목숨이 0이 되는 순간 게임은 종료된다
		
		// 정답을 맞출 때마다 카운트를 한다
		// 마지막 게임 종료시 최종 맞춘 개수를 보여준다
		// 정답횟수 : 00개
		
			int num1 = rd.nextInt(10) + 1;
			int num2 = rd.nextInt(10) + 1;
			int life = 3;
			int cnt = 0;
			
			while(life > 0) { // 반복 -> while로 감싸준다
			System.out.print(num1 + "+" + num2 + "=");
			int inputNum = sc.nextInt();
			
			//정답확인
			int answer = num1 + num2;
			if(inputNum == answer) {
				System.out.println("Success!!!");
				num1 = rd.nextInt(10) + 1;
				num2 = rd.nextInt(10) + 1;
				cnt++;
			}else {
				System.out.println("Fail....");
				life--;
				System.out.println("남은 목숨 :" + life);
			}
		
		}
			System.out.println("맞춘개수 : " + cnt);
			System.out.println("게임종료.");
			sc.close();
	}

}
