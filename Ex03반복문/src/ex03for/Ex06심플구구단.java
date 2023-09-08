package ex03for; //☆★☆중요

public class Ex06심플구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(2 + "단");
//		for(int i = 1; i <= 9; i++) {
//			System.out.println(2 + "X" + i + "=" + 2 * i);
//	}
		
		
		for(int i = 2; i <= 9; i++) {
			System.out.print(i + "단 : ");
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + "X" + j + "=" + i * j +"\t");
				
			}
			
			System.out.println(); // 줄바꿈 출력문
		}
			

	}
}
