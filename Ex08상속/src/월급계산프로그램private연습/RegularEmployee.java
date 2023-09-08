package 월급계산프로그램private연습;

public class RegularEmployee extends Employee {
	private int bonus;
	
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}

	@Override
	public int getMoneyPay() {
		// TODO Auto-generated method stub
		
		return (getPay()+bonus)/12;
		
	}
	
	
}
