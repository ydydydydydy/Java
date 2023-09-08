package ex04switch;

import java.util.Scanner;

public class Ex04최종조건문실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("금액을 입력하세요.");
		int inputMoney = sc.nextInt();

		System.out.println("메뉴를 고르세요");
		System.out.print("1.콜라(800원) 2.생수(500원) 3.비타민워터(1500) >> ");
		int menu = sc.nextInt();

		// 잔돈이 저장될 변수
		int changeMoney = 0;
		int changeMoney_1000 = 0;

		if(menu == 1) {
		   
		   if(inputMoney >= 800) {
		      changeMoney = inputMoney - 800;
		   }else {
		      changeMoney = inputMoney;
		      System.out.println("돈이 부족해요ㅠㅠ");
		   }
		   
		}else if(menu == 2) {

		   if(inputMoney >= 500) {
		      changeMoney = inputMoney - 500;
		   }else {
		      changeMoney = inputMoney;
		      System.out.println("돈이 부족해요ㅠㅠ");
		   }
		   
		}else if(menu == 3) {
		   
		   if(inputMoney >= 1500) {
		      changeMoney = inputMoney - 1500;
		   }else {
		      changeMoney = inputMoney;
		      System.out.println("돈이 부족해요ㅠㅠ");
		   }
		   
		}

		System.out.println("잔돈 : " + changeMoney + "원");
		int c = changeMoney / 1000;
		int o = changeMoney % 1000 / 500;
		int b = changeMoney % 1000 % 500 / 100;
		System.out.println("천원 : "+ c + "개, ");
		System.out.println("오백원 : "+ c + "개, ");
		System.out.println("백원 : "+ c + "개, ");

	}

		
	
		
		
		
		
		/*시험
		 * Scanner scanner = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요.");
		int num = nextInt();
		System.out.print("1.콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원");
		int menu = sc.nextInt();
		
		switch(menu ) {
		
		
		case 1:
			System.out.println("잔돈 1700원");
			break;
		case 2:
			System.out.println("잔돈 2000");
			break;
		case 3:
			System.out.println("잔돈 1000원");
			break;
		default: System.out.println("돈이 부족해요ㅠㅠ")
	}
	*/
		
	}








