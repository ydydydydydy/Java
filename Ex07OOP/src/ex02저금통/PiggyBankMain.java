package ex02저금통;

public class PiggyBankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1) 저금통 설계도를 사용해서 저금통을 1개 만들어주자
		PiggyBank pig1 = new PiggyBank(1500);
		// 2) 저금통에 초기금액을 1500원으로 설정
		// pig1.money = 1500;
		// pig1.money = 200000;
		// 1) + 2)
		// 객체를 생성 + 필드를 초기화 --> 새로운 생성자
		
		pig1.setMoney(2000);
		System.out.println(pig1.getMoney());
		
		// 3) 저금통에 700원을 입금
		// : 필드 money 에다가 700원을 더해주자!
		pig1.deposit(700);
		// 4) 잔액을 확인
		pig1.showMoney();
		// 5) 500원을 저금통에서 출금
		pig1.withdraw(500);
		// 6) 잔액을 확인
		pig1.showMoney();
		
	
		
	}

}
