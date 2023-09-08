package 월급계산프로그램;

public class PartTimeEmployee {
	
	   // 1) 필드 : 사번, 이름, 일당, 일수
	   String empno;
	   String name;
	   int pay;
	   int workDay;
	   // 2) 메서드 : 생성자, 월급여, 정보
	   public PartTimeEmployee(String empno, String name, int pay, int workDay) {
	      // super();
	      this.empno = empno;
	      this.name = name;
	      this.pay = pay;
	      this.workDay = workDay;
	   }
	   
	   public int getMoneyPay() {
	      return pay*workDay;
	   }
	   
	   public String print() {
	      return empno+" : "+name+" : "+pay;
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	}
 }
}