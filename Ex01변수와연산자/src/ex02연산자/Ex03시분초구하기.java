package ex02연산자;

import java.util.Scanner;

public class Ex03시분초구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3723 -> 1시간 2분 3초
		Scanner sc = new Scanner(System.in);
		System.out.println("초 입력: ");
		int totalSecond = sc.nextInt();
		
		int h = totalSecond / 3600;
		int m = totalSecond % 3600 / 60;
		int s = totalSecond % 3600 % 60;
		
		System.out.println(h + "시 " + m + "분 " + s + "초");
		
		
		
	}

}
