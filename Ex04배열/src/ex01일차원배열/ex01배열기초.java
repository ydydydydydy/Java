package ex01일차원배열;

public class ex01배열기초 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 : 같은 타입의 데이터를 관리하기 위해 사용하는 자료 구조
		// 자료형[] 변수명 = new 자료형[n];
		
		// 1. 인덱스로 이루어진 자료구조
		// 2. 순차적 접근이 가능한 자료구조
		
		// 3. 학생 3명의 이름을 저장하자!
//		String stu1 = "조미소";
//		String stu2 = "조자연";
//		String stu3 = "박호용";
//		
//		for(int i = 1; i <= 3; i++) {
//			System.out.println(stu+i);
//		}
		
		// 이름이라는 같은 타입의 데이터를 하나로 관리할 수 있는 배열
		// 1. 배열을 선언하는 방법
		// 자료형[] 배열명 = new 자료형 [배열의 크기];
		// + 배열은 선언 및 생성을 할 때 크기가 정해져 있다 
		// 뒤쪽에서 크기를 변경할 수 없다
		String[] stu = new String[3];
		System.out.println(stu); // 3칸짜리 공간이 저장되어있는 주소값
		stu[0] = "조자연";
		stu[1] = "박호용";
		stu[2] = "조미소";
		
		System.out.println(stu[0]);
		System.out.println(stu[1]);
		System.out.println(stu[2]);
		
		System.out.println("배열의 크기 : " + stu.length);
		// stu[3] = "조충현"; : 3번 인덱스 값은 존재하지 않음
		// + 오류 두가지
		// Syntax Error : 빨간줄 (문법적으로 치명적인 오류)
		// Exception : 실행을 시켜야 확인할 수 있는 오류
		
		// 인덱스값을 사용해서 3명의 이름을 for문을 사용해서 출력
		
		for(int i = 0; i < stu.length; i++) {
			// i : 0 1 2 -> (i<3)라고도 쓸 수 있음
			// 2. 배열의 크기 : 배열명.length
			// 인덱스 값에 접근을 할 때
			// 0 ~ 배열의 크기 - 1
			
			System.out.println(stu[i]);
		
		}
		// 자료형[] 배열명 = new 자료형[3];
		// 배열을 만드는 방법 2
		String[] 사무실 = {"이명훈","박병관","송승호","조자연"};
		
		// + 배열을 만드는 2번째 방법도 아래쪽에서 크기 변경은 불가능하다ㅏ
		// 바꾸고 싶을 경우 선언 및 초기화 하는 곳에 와서 변경을 해야한다
		// 안에 있는 데이터가 초기화된다 ~ 사라졌다가 다시 입력된다 ~
		
		for(int i = 0; i < 사무실.length; i++) {
			// i : 0 1 2 3 4(5번 반복)
			System.out.println(사무실[i]);
		}
	}

}
