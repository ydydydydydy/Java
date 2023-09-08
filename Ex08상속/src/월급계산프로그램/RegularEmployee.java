package 월급계산프로그램;

public class RegularEmployee {
	// 1) 필드 : 사번, 이름, 연봉, 보너스
	String empno;
	String name;
	int pay;
	int bonus;
	// 2) 메서드  : 생성자, getMoneyPay, print
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus= bonus;
	}
	// 월 급여 리턴
	public int getMoneyPay() {
		return (pay+bonus)/12;
	}
	// 사원의 정보
	public String print() {
		return empno+" : "+name+" : "+pay;
	}
	
}
