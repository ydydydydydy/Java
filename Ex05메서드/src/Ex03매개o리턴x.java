
public class Ex03매개o리턴x {

	public static void main(String[] args) {
		
		// 매개변수 있고, 리턴타입 없다( void ---> 텅빈)
		// 전달인자 있고, 리턴타입 자리에 데이터 타입이 명시x (return 키워드가 안 온다)
		//void가 오는 경우는 메서드가 순수하게 기능자체를 가지고 있는 경우가 많다
		// ex) syso, compile을 하는 기능
		
		// sumPrint : 숫자 2개를 전달 받아서 더한 결과값을 출력해주는 기능
		sumPrint(3,5);
		// + 출력하는 기능을 출력하려고해서 발생한 오류
		System.out.println(sumPrint(3,5))
	}
	
	// sumPrint 만들기
	public static void sumPrint(int num1, int num2) {
		// num1, num2를 더한 결과값을 출력
		System.out.println(num1 + num2);
		// + void라는 리턴타입은 return x
	}

}
