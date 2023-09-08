package ex03Animal;

public class Penguin extends Bird{

	// 조류입니다
	// 알낳기, 이름, 성별, 숨쉬기, 울기, 움직임
	
	// 펭귄이 움직이는 형태는 "헤엄치다"입니다.
	@Override // Alt + Shift + s -> override...
	public void move() {
		System.out.println("헤엄치다");
	}
	public void cry() {
		System.out.println("꿹꿹운다.");
	}
	// 울다 "꿹꿹 울다"로 출력되도록 만들기
	
	
}
