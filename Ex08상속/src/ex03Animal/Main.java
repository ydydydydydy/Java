package ex03Animal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Animal
		Animal a1 = new Animal();
		a1.name = "동물";
		a1.move();
		
		// Bird
		Bird b1 = new Bird();
		b1.move(); // "날아다닌다."
		
//		// Penguin
		Penguin p1 = new Penguin();
		p1.move();
		p1.cry();
		
		// 오버라이딩(Overriding) : 재정의
		// 상속 관계에 있는 메서드를 같은 이름으로 구현하되 
		// 안에 있는 로직이 다르게 작성되는 것을 보고 오버라이딩이라고 한다
		
		// 캐스팅(Casting)
		// - 기본 데이터 타입에 대한 형변환
		// - 객체의 타입에 대한 형변환 -> 객체의 타입을 바꾸는
		// 단, 반드시 상속의 개념이 있어야 한다
		
		// 1) 묵시적(자동) 형변환 -> 업캐스팅 개념
		// : 자식 클래스가 부모 클래스의 타입으로 변형되는 것
		// Bird b1 ---> Animal b1
		// ---> 조류는 동물이다.(o)
		Animal a2 = new Bird();
		// a2는 Animal 자료형 = Bird자료형을 대입
		a2.cry();
		a2.move();
		// 1) Bird가 가지고 있는 고유한 기능, 데이터는 사용이 불가
		// 2) Animal로부터 물려받아서 오버라이딩한 메서드는
		// 	  사용이 가능
		
		
		// 2) 명시적(강제) 형변환 -> 다운캐스팅 개념
		// : 부모 클래스가 자식 클래스의 타입으로 변형되는 것
		// + (업캐스팅이 되었던 레퍼런스 변수만 다운캐스팅 가능)
		// Bird b2 = new Animal();
		
		Bird b2 = (Bird)a2;
		
		
	}

}
