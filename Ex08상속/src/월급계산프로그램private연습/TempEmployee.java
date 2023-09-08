package 월급계산프로그램private연습;

public class TempEmployee extends Employee{
	
	
	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay);
		// this() 메소드가 같은 클래스의 다른 생성자를 호출할 때 사용된다면
		// super() 메소드는 부모 클래스의 생성자를 호출할 때 사용
	}
	
	
}
