package 보충수업;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 박병관 짜장면집
		// PBKJajangmyeon pbk = new PBKJajangmyeon();
		
		// 박충현 짜장면집
		PCHJajangmyeon pch = new PCHJajangmyeon();
		
		// 박보경 짜장면집
		PBGJajangmyeon pbg = new PBGJajangmyeon();
		
		// 박종권 짜장면집
		PJGJajangmyeon pjg = new PJGJajangmyeon();
		
		// 박다영 짜장면집
		PDYJajangmyeon pdy = new PDYJajangmyeon();
		
		PBKJajangmyeon p1 = pch; //형변환 자식클래스에서 부모클래스로 업캐스팅(무조건 부모자식 관계에서 가능)
//		p1.makeJajang(); 
		PBKJajangmyeon p2 = pbg;
//		p2.makeJajang();
		PBKJajangmyeon p3 = pjg;
//		p3.makeJajang();
		PBKJajangmyeon p4 = pdy;
		// 업캐스팅
		
		ArrayList<PBKJajangmyeon> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		for(int i = 0; i < list.size(); i++) {
			list.get(i).makeJajang();
		}
		
		PCHJajangmyeon pch2 = (PCHJajangmyeon)p1;
		pch2.makeGoonMando();
		
		// 부모타입을 자식타입으로 강제 형변환 -> 다운캐스팅
		
		
		
	}

}
