package ex02do_while;

import java.util.Scanner;

public class Ex03로그인프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// do-while, while
		// 공통점 : 반복 횟수가 주로 정해져있지 않다
		// 차이점 : 조건을 먼저 보고 반복할 것인지 아니면 실행하고 조건을 볼 것인지
		
		// 로그인 프로그램
		// 아이디와 패스워드를 입력받아 일치하면 프로그램 종료
		// 일치하지 않으면 일치할 때까지 아이디와 패스워드를 입력받는다
		
		Scanner sc = new Scanner(System.in);
		String id = "hodoo";
		String pw = "1234";
		
		do {
			System.out.println("id : ");
			String inputId = sc.next();
			System.out.println("pw : ");
			String inputPw = sc.next();
			
			if(inputId.equals(id) && inputPw.equals(pw)) {
				System.out.println("로그인 성공!");
				break;
			}else {
				System.out.println("아이디와 비밀번호가 잘못되었습니다.");
			}
			
		}while(true);
		
		sc.close();
	}

}
