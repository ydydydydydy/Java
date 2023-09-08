
public class Ex08오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 메서드 특징
		// 오버로딩(Overloading) : 중복정의
		// 같은 클래스 내에서 같은 이름의 메서드를 정의할 수 있다.
		// 단, 매개변수의 형태가 달라야한다 (형태 : 데이터타입, 갯수)
		
		// 오버라이딩 : 재정의
		
		// 숫자 두 개를 더해주는 기능 sum2 ---> sum
		sum(2,3);
		// 숫자 세 개를 더해주는 기능 sum3 ---> sum
		sum(2,3,4);
		// 같은 더하기 기능이라면 같은 이름으로 사용할 수 있게 만들자
		
	}
	
	public static void sum2(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	// 매개변수의 갯수가 다르기때문에 같은 이름으로 메서드를 정의할 수 있다
	
	public static void sum(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
}

//메서드 
//: ㄱㅊㅇ ㅎㅇ (객체의 행위)
//기능
//
//* 선언 (main 밖)
//1) public (공공의) - 접근제한자
//- 클래스 내/외부에서 마음대로 접근이 가능하도록 도와주는 제한자
//(private, protected, default)
//2) static : 저장소 (정적인) <----> heap (동적인)
//3) 리턴타입 : 메서드가 돌려주는 결과값에 대한 데이터 타입
//有 : 데이터타입이 명시 (int, String, flaot, double...)
//無 : 메서드가 기능을 자체 (출력하는 기능, 컴파일) : void
//4) 메서드명(호출명) : 변수명작성규칙과 동일
//5) () : 모든 메서드들은 소괄호를 가지고있음 
//6) 소괄호 안쪽에 선언된 변수 == 메서드안에서 사용될 변수
//   : 매개변수(parameter)
//    + 전달인자의 갯수, 데이터타입, 순서가 무조건 일치 
//7) {메서드 로직} : return 키워드
//有 : 리턴타입 자리에 데이터 타입이 명시되어있다 반드시 return
//無 : 리턴타입 자리에 void가 있으면 return xxxxxx
//
//* 사용방법 (메서드 실행 = main안에서)
//호출명(전달인자);
//
//+ 메서드의 특징
//Overloading(오버로딩)
//: 같은 클래스 내에서 메서드를 같은 이름으로 만들 수 있다.
//단, 매개변수의 형태가 달라야한다.
//형태 : 데이터타입, 매개변수의 갯수

