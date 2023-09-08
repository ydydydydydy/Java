package ex04책관리프로그램;

import java.util.Scanner;

public class BookDataMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      
	      // 객체 배열
	      // 자료형[] 레퍼런스변수명 = new 자료형[배열의크기];
	      // BookData 자료형을 가진 변수들만 저장할 수 있다.
	      BookData[] bookList = new BookData[5];
	      // b1은 BookData 자료형을 가진 상태
	      BookData b1 = new BookData("Java",21000,"홍길동");
	      // 북 데이터 자료형을 관리하는 배열에 들어갈 데이터 만들기
	      // 1) b2 ~ b5 만들기!
	      BookData b2 = new BookData("C++",29000,"박문수");
	      BookData b3 = new BookData("Database",31000,"김장독");
	      BookData b4 = new BookData("Android",18000,"이순신");
	      BookData b5 = new BookData("Web",26000,"김철수");
	      // 2) b1 ~ b5를 배열에 저장하기
	      bookList[0] = b1;
	      bookList[1] = b2;
	      bookList[2] = b3;
	      bookList[3] = b4;
	      bookList[4] = b5;
	      
	      // 3) 배열 안에 들어있는 값들에 접근하는 방법을 사용해서
	      // 사용자로부터 입력받은 금액으로 구매할 수 있는 책의 정보를 
	      // 출력해주세요!
	      
	      System.out.print("금액을 입력하세요 : ");
	      int price = sc.nextInt();// 사용자가 입력받은 금액
	      // bookList에 저장되어있는 책중에서 가격이 입력받은것 보다
	      // 작은 것들을 출력
	      System.out.println("구매 가능한 책 목록");
	      
	      for(int i = 0; i < bookList.length; i++) {
	         // i : 0 1 2 3 4 (5번)
	         // 판단 : 0 ~ 4
	         if(price >= bookList[i].getPrice()) {
	            System.out.println("["+bookList[i].getTitle()+","+
	         bookList[i].getWriter()+","+bookList[i].getPrice()+"원]");
	         }
	      }
	      sc.close();
	      
	      
	      
	      
	      
	      
	      
	      
	      
//	      // 객체배열에 값을 대입
//	      bookList[0] = b1;
//	      // b1 출력하기 
//	      System.out.println(bookList[0]);
//	      // bookList[0] == b1
//	      // b1.getTitle()
//	      // bookList[0].getTitle()
//	      System.out.println(bookList[].getTitle());
	      
	      
	      
	      
	      
	      
	      
	   }

	}