package ex01Person;

public class Person {

	// 사람에 대한 설계도 : Class
	
	// 1. Field(필드)
	// : 객체가 '가질 수 있는 공통적인' 속성, 데이터, 변수
	
	String name;
	String gender;
	int age;
	int height;
	// 거주지도 저장하게 만들고 싶다
	String local;
	
	
	// 2. Method(메서드)
	// : 객체가 '할 수 있는 공통적인' 행위, 행동, 기능
	
	// 숨쉬기
	public void breathe() {
		System.out.println("나는 숨을 쉬는 중");
	}
	// 잠자기
	public void sleep() {
		System.out.println("쿨쿨 잠을 자는 중");
	}
	// 밥먹기
	public void eat() {
		System.out.println("우걱우걱 밥을 먹는 중");
	}

	
	// 설계도를 만들기 위해서 클래스를 만들면, 그 안에 자동으로
	// 생성자가 만들어진다. ---> 생략
	// 기본 생성자 : 생략가능하다.
//	public Person() {
//		// 기본 생성자의 모양
//	}
	// 기본 생성자 말고, 객체를 선언과 동시에 초기화를 시켜주는
	// 새로운 생성자를 만들어보자

	// * 생성자의 특징
	// 1) 생성자도 메서드 이다
	// 2) 생성자의 이름(메서드명)은 클래스의 이름과 같아야한다
	// : 대소문자 구분 필요!
	// 3) 클래스를 처음 만들 때 기본생성자는 생략이 되어있다
	// 4) 새로운 생성자를 만들면 생략되어있는 기본 생성자는 사용할 수 없다
	// 기본 생성자도 사용하고 싶으면 눈에 보이게 코드로 작성해줘라
	// ('오버로딩: 중복정의' 을 해줘야한다)
	public Person() {
		
	}

	public Person(String name, int age, 
			String gender, int height, 
			String local) {
		// main에서 보내온 전달인자를 매개변수로 받아서
		// {현재 클래스에 있는 필드를 받아온 값으로 초기화}
		// this : 현재 클래스를 지칭하는 키워드
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.local = local;
	}
}
