package ex02상속실습;

public class BeginnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beginner b = new Beginner();
		b.level = 8;
		b.nickName = "병관이얌";
		b.hp = 200;
		b.mp = 50;
		b.exp = 321;
		
		b.snailThrow();
		b.agileMovement();
		
		
		Warrior w = new Warrior();
		w.level = 15;
		w.nickName = "타락파워전사";
		w.hp = 800;
		w.mp = 100;
		w.exp = 720;
		
		w.smash();
		w.snailThrow();
		
		Wizard wi = new Wizard();
		wi.snailThrow();
		
	}

}
