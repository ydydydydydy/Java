package ex01while;

import java.util.Scanner;

public class while연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 100까지의 합
		int sum = 0; //1부터 100까지의 합을 저장
		int cnt = 1; //1부터 100까지의 합을 증가
		
		while(true) {
			sum += cnt;
			if (cnt == 100) {
				break;
			}
			cnt++;
		}
		System.out.println("1부터 100까지의 합은" + sum);
	}
}
