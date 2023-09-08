package 월급계산프로그램private연습;

public class 월급계산Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartTimeEmployee partTime = new PartTimeEmployee("SMHRD001", "홍길동", 10, 10 );
		
		
		System.out.println(partTime.print());
		
		
		System.out.println(partTime.getMoneyPay()+"만원");
		
		
		
		TempEmployee temp = new TempEmployee("SMHRD002", "박문수", 3000);
		
		
		System.out.println(temp.print());
		
		
		System.out.println(temp.getMoneyPay()+"만원");
		
		
		RegularEmployee regular = new RegularEmployee("SMHRD003", "임성훈",10,10);
		
		
		System.out.println(regular.print());
		
		
		System.out.println(regular.getMoneyPay()+"만원");
		
	}

}
