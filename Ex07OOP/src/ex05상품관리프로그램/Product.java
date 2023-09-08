package ex05상품관리프로그램;
	// 객체 -> 자료형 (레퍼런스 자료형)
	public class Product {
	// class -> 객체 -> 자료형
	// 자료형 <- 데이터를 담을 수 있는 형태
	// 내가 정의한 자료형태를 담을 수 있다
	
	// 생성자
	// 객체를 생성하는 역할
	// 객체를 생성할 때 반드시 한 번만 호출이된다
	// 생성자를 만들지 않아도 사용할 수 있는 이유는?
	// -> 기본생성자가 존재하기 때문에
	// 특징 1. 리턴타입x
	//	  2. 이름이 클래스와 동일하다
	public Product(String name, int unitPrice, int amount) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}
	
	
	
	// 속성(필드) <- 데이터를 담을 수 있는 변수
	private String name; // 이름
	private int unitPrice; // 단가
	private int amount; // 수량

	// 행위(메소드) <- 데이터를 가지고 움직이는 함수
	// 이름을 받아와 필드에 넣는 메소드
	public void setName(String name) {
		this.name = name;
	}
	//단가를 받아와 필드에 넣는 메소드
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;		
	}
	// 수량을 받아와 필드에 넣는 메소드
	public void setAmount(int amount) {
		if (amount > 0) {
			this.amount = amount;
		}
	}
	
	// name값을 돌려주는 메소드
	public String getName() {
		return name;
	
	}
	// 가격을 돌려주는 메소드
	public int getUnitPrice() {
		return unitPrice;
	}
	// 수량을 돌려주는 메소드
	public int getAmount() {
		return amount;
		
	}
}
