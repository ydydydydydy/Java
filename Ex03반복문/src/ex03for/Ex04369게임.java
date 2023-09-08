package ex03for;

public class Ex04369게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 50; i++) {
		// 끝자리 수를 가져오기 위한 연산
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				// && 쓰지 않도록 주의
		// = 같은 식 int cal = i % 10;
		//			if (cal == 3 || cal == 6 || cal == 9)
				System.out.println("박수");
			} else if(i % 10 == 5) {
				// else if(cal == 5)
				System.out.println("으악"); 
			} else {
				System.out.println(i);
				
			}
		}
				
		
		
	}

}
