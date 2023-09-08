package ex03Animal;

public class Bird extends Animal{
	// 조류는 동물이 가진 기능들을 다 가질 수 있다
	// 조류의 설계도
	// 조류도 울고, 움직이고, 숨쉬고, 이름, 성별도 있음
	
	// 동물이 위에 있는 데이터, 기능을 이미 다 가지고 있음
	// 상속에서 사용되는 키워드 : extends(확장하다.)
	
	// 알을 낳다
	public void egg() {
		System.out.println("알을 낳음");
	}

	// 오버라이딩
	// move를 물려받긴 할건데 안에 있는 로직을 다르게 구현하고 싶다
	// : 상속 관계에서 메서드를 재정의(구현을 다르게, 로직을 다르게)
	// 하는 것을 오버라이딩이라고 한다.
	// 단, 같은 이름을 사용해야 한다.
	
	@Override // 어노테이션
	public void move() {
		// move 메서드를 구현할 수 있도록 자동완성
		System.out.println("날아다닌다.");
	}
	
	

	
	
	
	
}
