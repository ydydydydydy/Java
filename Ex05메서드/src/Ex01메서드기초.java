
public class Ex01메서드기초 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 메서드 선언
		// 1) 접근제한자 : public
		//             클래스 내/외부에서 자유롭게 접근이 가능하도록 도와주는 제한자
		// ex) private, default, protected
		// 2) 저장소 : static
		// 3) *** 리턴타입 
		// : 내가 메서드를 실행시켜서 받는 결과값에 대한 데이터타입
		// 4) 메서드명(호출명)
		// + 호출명 옆에는 반드시 소괄호()
		// + 모든 메서드들은 소괄호를 가지고 있다! main(), syso()
		// 5) 매개변수 : 메서드 안에서 사용될 변수
		// 실행시킬때 보내주는 전달인자가 들어오는 곳
		// + 매개변수는 반드시 선언만 되어있어야한다! 
		// 선언 : int a;
		// 매개변수의 이름을 작성하는것은 내 맘, 전달인자와 이름이 같지 않아도됨
		// + 되도록이면 일치를 시켜주는 걸 권장
		
	}
//	public static int sum(int a, int b) {
//		int result = a + b;
//		return result;
//		public static void main(String[] args) {
//			sum(5, 10);
		// manin 밖에 
		// 1. 메서드 선언
	
	// 메서드를 사용하는 곳은 main 안쪽
	// 호출명(전달인자)
	// + 전달인자는매개변수가 있으면 전달인자도 있음
	// 매개변수가 없으면 전달인자도 없음
	// : 데이터 타입, 갯수가 일치해야 한다
	int a = 3;
	int b = 5;
	sum(a , b); // return result는 값만 보내주는 기능, 출력 기능 x 
	System.out.println(sum(a,b)); // 값을 확인하고 싶으면 출력문으로 감싸줘야 한다
	
	// main 밖
	   
	   public static int sum(int a, int b) {
	      // 메서드 로직
	      int result = a + b;
	      return result;
	      // return이라는 키워드는 호출한 곳으로 결과값을 보내준다
	      // 언제작성하지? 
	      // : 리턴타입 자리에 데이터 타입이 명시되어있으면 반드시!!! 따라온다
	      // + 리턴타입 자리에 void가 있으면 작성x

	}
}
