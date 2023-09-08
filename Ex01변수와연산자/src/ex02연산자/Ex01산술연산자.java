package ex02연산자;

public class Ex01산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 산술연산자
		int num1 = 7;
		int num2 = 3;
		
		int result1 = num1 + num2;
		System.out.println(result1);
		int result2 = num1 - num2;
		System.out.println(result2);
		int result3 = num1 * num2;
		System.out.println(result3);
		int result4 = num1 / num2;
		System.out.println(result4);
		// 정수 나누기 정수 --> 정수만 나옴(몫)
		double result5 = 7.0 / 3.0;
		System.out.println(result5);
		// 실수 나누기 실수 --> 실수형태로만 나옴 
		int result6 = num1 % num2;
		System.out.println(result6);
		// % --> 나누고 나온 나머지를 의미
		
		// 문자열과 숫자를 더한다면 --> 바나나8 로 출력(str)
		System.out.println("바나나" + 8 );
		System.out.println("바나나" + (8 + 2));
		// 바나나10으로 출력
		System.out.println("바나나" + 3 * 2);
		// 바나나 6으로 출력
		
		System.out.println("81" + 3 * 2 + 2 + 4);
		//81624 출력
		
		
		
	}

}
