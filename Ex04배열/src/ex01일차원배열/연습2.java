package ex01일차원배열;

public class 연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		while (true) {
			System.out.println("[1]회원가입 [2]로그인 [3]종료 >>");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("==회원가입==");
				if (cnt < 3) {
					System.out.println("아이디입력 : ");
					id[cnt] = sc.next();
					System.out.println("비밀번호입력 : ");
					pw[cnt] = sc.next();
					cnt++;
					System.out.println("가입성공");
				} else {
					System.out.println("더이상 회원가입이 불가능하다.");
				}
			}else if (choice == 2) {
				System.out.println("==로그인==");
			}else if (choice == 3) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}
	}

}
