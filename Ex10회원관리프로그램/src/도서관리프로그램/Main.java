package 도서관리프로그램;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("[1]도서등록 [2]도서조회 [3]도서검색 [4]종료 >> ");
			int select = sc.nextInt();
			if(select == 1) {
				// 도서등록
				System.out.println("책 제목 : ");
				String title = sc.next();
				System.out.println("책 저자 : ");
				String name = sc.next();
				System.out.println("책 가격 : ");
				int price = sc.nextInt();
				System.out.println("책 번호 :");
				String num = sc.next();
				
				// 4가지 데이터를 입력받아서 하나의 자료형으로 묶어주자
				BookVO vo = new BookVO(title, name, price, num);
				Controller con = new Controller();
				con.insert(vo);
				
			}else if(select == 2) {
				// 도서조회
				Controller con = new Controller();
				con.select();
				
			}else if(select == 3 ) {
				//도서검색
				System.out.print("검색하고 싶은 책 이름을 적어주세요 >> ");
				String title = sc.next();
				BookVO vo = new BookVO(title);
				Controller con = new Controller();
				con.selectOne(vo);
				// console
				// 책이름		책저자		책가격		책번호
				
			}else if(select == 4) {
				//종료
			}else {
				System.out.println("다시 입력해 주세요");
			}
		}
	}

}
