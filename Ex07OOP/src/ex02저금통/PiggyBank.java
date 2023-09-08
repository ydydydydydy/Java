package ex02저금통;

public class PiggyBank {
	
	// 저금통이 설계되는 곳
	
	// 1) 필드 : 데이터, 변수, 속성
	private int money;
	// private (사적인)
	// : 클래스 내부에 있는 메서드를 통해서만 접근 가능하도록
	// 	 도와주는 접근제한자
	// - private으로 감싸진 필드에 접근하고 싶으면
	//	 클래스 내부에 메서드가 설계되어있어야한다
	// 수정(setting), 가져와서 확인(get)
	
	// 1.5) 생성자(메서드)
	// - 생성자의 이름은 클래스의 이름과 동일하다.(대소문자도 구분)
	// - 생성자도 메서드 이다.
	// - 생성자는 리턴타입이 없다(void X)
	// - 새로운 생성자를 만들면 기본생성자는 사용할 수 없다.
	//	 기본생성자도 사용하고 싶으면 코드로 작성해줘야한다
	//	 기본생성자는 클래스를 만들 때 생략되어 있다
	public PiggyBank(int money) {
		this.money = money;
	}
	// getter/setter
	// : private으로 감싸진 필드에 접근할 수 있도록
	//	 클래스 내부에 만들어진 메서드
	// money를 수정할 수 있는 메서드
	public void setMoney(int money) {
		this.money = money;
	}
	// money에 값을 확인할 수 있는 메서드
	public int getMoney() {
		return money;
	}
	
	
	
	// 2) 메서드 : 기능, 객체의 행위, 행동
	// 출금(withdraw)
	public void withdraw(int money) {
		// 내 전재산 = 내 전재산 - 매개변수
		//this.money = this.money - money;
		this.money -= money;
	}
	
	// 입금 (deposit)
	public void deposit(int money) {
		// 매개변수 int money
		// : main에서 받아온 입금할 금액
		// 내가 가지고 있는 money = 현재 필드 money + main 받아온 입금 금액
		this.money = this.money + money;
	}
	// 잔액을 확인 (showMoney)
	public void showMoney() {
		System.out.println("현재 잔액 : " + money);
	}


	
	
	
}