package ex03for;

public class Ex05PlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(" " + -i + " "); // == (-1 * i)
			} else {
				System.out.print(" " + i + " ");
				// println -> print(옆으로 출력)
			}
		} 
	}

}
