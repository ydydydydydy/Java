package 인터페이스;

public interface PokeMon {
	
	// 나는 포켓몬 게임을 만드는 개발자
	// 내가 만드는 게임에 들어있는 모든 캐릭터들은
	// 공격, 특수공격을 할 수 있어야 된다
	
	// 인터페이스
	// : 프로젝트 지침서, 설계도
	
	// 1) 필드
	// final String name = "조자연";
	// final --> 상수형태, 변하지 xxx
	
	// 2) 메서드
	// 단, 메서드는 반드시 선언만 되어있어야 한다
	// 인터페이스는 일반 메서드를 포함할 수 없다
	// 무조건 추상메서드만 포함할 수 있다
	
	// 일반공격 : atk
	public abstract void atk();
	
	// 특수공격 :specialAtk
	public abstract void specialAtk();
	
	
}
