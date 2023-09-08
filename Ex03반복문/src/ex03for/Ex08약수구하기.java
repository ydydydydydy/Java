package ex03for;

import java.util.Scanner;

public class Ex08약수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0)
			System.out.print(i + " ");
			
		}
		sc.close();
	}
	
}
