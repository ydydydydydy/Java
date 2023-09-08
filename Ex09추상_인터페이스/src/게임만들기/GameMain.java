package 게임만들기;

import java.util.Scanner;

public class GameMain {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. PlusGame을 진행할 수 있도록 객체 생성하기
		PlusGame game1 = new PlusGame();
		SubGame game2 = new SubGame();

		int round = 1; // 게임라운드 체크를 위한 변수
		int cnt = 1; // 정답의 기회를 체크할 변수

		boolean check = true;

		System.out.println("----------사칙연산 게임 start!---------");

		// 문제를 제출할 수 있는 메소드를 호출하여 보여주고
		// 사용자는 답을 입력할 수 있도록 한다!

		while (round < 6) {
		String quiz = game2.getQuizMsg();
			System.out.print(round + "라운드 : " + quiz);
		int ans = sc.nextInt();

			check = game2.checkAnswer(ans);

		if (check == false) {
			while (cnt < 3) {

			System.out.println("틀렸습니다!");
			// 정답을 맞추지 못했을 경우
			// 3번의 기회를 주고, 문제는 틀린 문제 그대로 출제!
			System.out.print(round + "라운드 : " + quiz);
			ans = sc.nextInt();
			cnt++;

		check = game2.checkAnswer(ans);

			if (check == true) {
						break;
			}
		}

		System.out.println("다음으로 넘어갑니다!!");
		cnt = 1;

	} else {
		System.out.println("정답입니다!");
	}

			// 1라운드가 종료되면 다음 라운드로 증가!
			round++;
			System.out.println();

		} // while문 종료
	}

}
