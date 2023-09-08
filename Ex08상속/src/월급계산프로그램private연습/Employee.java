package 월급계산프로그램private연습;

public class Employee {

	// Regular/PartTime/TempEmployee가
	// 가지고 있는 공통적인 필드, 메서드가 있음
	
	// Regular/PartTime/TempEmployee가
	// Employee클래스를 상속받을 예정
	private String empno;
	private String name;
	private int pay;
	
	
	
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	public int	getMoneyPay() {
		return (this.pay/12);
	}
	public String print() {
		return (this.empno + ":" + this.name +":"+this.pay);
	}
	
	
	
}
