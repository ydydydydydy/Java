package ex05상품관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		// 상품 만들어보기
//		Product g1 = new Product();
//		g1.setName("만년필");
//		g1.setUnitPrice(150000);
//		g1.setAmount(10);
//		
//		System.out.println(g1.getName());
//		System.out.println(g1.getUnitPrice());
//		System.out.println(g1.getAmount());
		
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Product> list = new ArrayList<>();
	
	while(true) {
	System.out.println("[1]물건추가 [2]예상 판매량 조회 [3]종료 >>");
	int menu = sc.nextInt();
	
	if(menu == 1) {
		System.out.println("물건 이름 : ");
		String name = sc.next();
		System.out.println("단가 : ");
		int unitPrice = sc.nextInt();
		System.out.println("수량 : ");
		int amount = sc.nextInt();
		
		Product g = new Product(name, unitPrice, amount);
		list.add(g);
		
//		g.setName(name);
//		g.setUnitPrice(unitPrice);
//		g.setAmount(amount); (쓸필요 x 세팅을 바꿔줄 때만)
		
		
	}else if(menu == 2) {
		
		System.out.println("제품명\t단가\t수량");
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
			System.out.println("\t");
			System.out.println(list.get(i).getUnitPrice());
			System.out.println("\t");
			System.out.println(list.get(i).getAmount());
			System.out.println();
			
			sum += list.get(i).getUnitPrice() * list.get(i).getAmount();
		}
		System.out.println("판매 시 매출 :" + sum + "원");
		
		
	}else if(menu == 3) {
		System.out.println("프로그램 종료");
		break;
	}
	
	
	}
	
	sc.close();
	}
}
