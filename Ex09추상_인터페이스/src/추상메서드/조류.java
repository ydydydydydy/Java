package 추상메서드;

public abstract class 조류 {
	// 추상 메서드는 추상 클래스만 포함 가능
	// public abstract class 조류
	
	
	// 메서드를 설계만(선언만) --> 추상 메서드
	// 울기
	public abstract void cry();
	// 움직이기
	public abstract void move();
	// 알낳기
	public void egg() {
		System.out.println("알을 낳는다");
		
	}
	
}

// 추상클래스 vs 추상메서드
// public abstract int getMoneyPay()
// 1) 추상 메서드를 포함하고 있는 클래스는 반드시 추상클래스
// public abstract class 조류
// 2) 추상 클래스는 일반 메서드를 포함할 수 있는가? --> 있다
// 3) 추상 클래스는 추상 메서드가 없어도 되는가 --> 된다
// 4) 메서드가 선언되어 있어요 --> 완성이 안된 기능
//	abstract class는 불안정한 기능들이 들어있을 가능성이 있기
//	때문에 객체 생성(실체화)가 불가능하다
//	+ 추상메서드는 자식 클래스에서 구현을 강제화하고 있다

