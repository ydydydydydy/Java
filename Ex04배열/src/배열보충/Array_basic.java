package 배열보충;

public class Array_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 생성
		// 자료형[] 변수명 = new 자료형[배열의 크기];
		// 자료형 변수명[] = new 자료형[배열의 크기];
		
		String[] names = new String[5];
		int[] age = new int[5];
		double[] ht = new double[5];
		boolean[] yn = new boolean[5];
		char[] yn1 = new char[5];
		// 배열 사용하기 => names[index]
		System.out.println(names);
		// 초기값들
		
		// 초기값을 가지는 배열 생성
		
		// 자료형[] 변수명 = {ㅁ, ㅁ, null}
		String[] resident = {"송승호", "박병관", "이명훈", null};
		resident[3] = "김태연";
		System.out.println(resident[3]);
		
		
		
		
	}

}
