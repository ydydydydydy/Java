package ex03Animal;

public class Animal {
	
	// 동물 설계도
	// 1) 필드
	String name;
	String gender;
	
	// 2) 메서드(기능, 행위, 행동)
	// : 숨쉬기, 움직이기, 울기
	public void breathe() {
		System.out.println("숨쉰다!");
	}
	//동물의 움직임
	public void move() {
		System.out.println("네 발로 걸어다닌다.");
	}
	// 동물의 울음소리
	public void cry() {
		System.out.println("운다");
	}
	
}
