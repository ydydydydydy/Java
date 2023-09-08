package 월급계산프로그램private연습;

public class PartTimeEmployee extends Employee{
	
	private int workDay;
	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}
	
	public int getMoneyPay() {
		return (getPay()*workDay); 
	}
	
		
}
