package 연습;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        // 출력예시를 반드시 지켜주세요
        		System.out.print("입력: ");
		array[0] = sc.nextInt();
		System.out.print("입력: ");
		array[1] = sc.nextInt();
		System.out.print("입력: ");
		array[2] = sc.nextInt();
		System.out.print("입력: ");
		array[3] = sc.nextInt();
		System.out.print("입력: ");
		array[4] = sc.nextInt();
		
		
		
    for(int i = 1; i<array.length; i++) {
	         if(array[i] > max) {
	            max = array[i];
	    System.out.println("출력 : " + max);