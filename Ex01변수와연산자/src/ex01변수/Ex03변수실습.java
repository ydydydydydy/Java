package ex01변수;

public class Ex03변수실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수형 변수 num1에 10을 넣기
		// int num1 = 10;
		int num1; // 선언
		num1 = 10; // 할당
		num1 = 100;
		// 변수의 특징 - 변수에 새로운 값을 할당하는 순간 이전의 값은 사라진다
		System.out.println(num1);

		int myAge = 26;
		int yourAge = 25;

		///////

		///////
		System.out.println("나의 나이 : " + myAge);
		System.out.println("짝꿍의 나이 : " + yourAge);

		/// 나이 바꾸기
		int temp = myAge; // temp 잠깐 저장하는 변수에 많이 사용
		myAge = yourAge;
		yourAge = temp;

		System.out.println("나의 나이 : " + myAge);
		System.out.println("짝꿍의 나이 : " + yourAge);
		
		// Ctrl + Shift + F -- 자동정렬

	}

}
