package ex03학생정보관리프로그램;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Student클래스를 사용하는 곳
		// 생성자를 사용해서 student 초기화
		Student student1 = new Student("나예호", "20200801", 20, 10, 80, 95);
		Student student2 = new Student("김운비", "20111003", 19, 90, 65, 30);
		
		student1.show();
		student2.show();
		
		

			
	}

}
