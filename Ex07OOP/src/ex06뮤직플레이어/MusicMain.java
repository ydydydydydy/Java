package ex06뮤직플레이어;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "\r\n"
				+ "\r\n"
				+ "                                                                                                    \r\n"
				+ "                                                                                                    \r\n"
				+ "                                                                                                    \r\n"
				+ "                                                                                                    \r\n"
				+ "                                                                                                    \r\n"
				+ "                                                                                                    \r\n"
				+ "                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-                                    \r\n"
				+ "                 ;                                             ;,                                   \r\n"
				+ "                 ;                                             :~-                                  \r\n"
				+ "                 ;                                             :.~-                                 \r\n"
				+ "                 ;                                             :..:-                                \r\n"
				+ "                 ;                                             :...~-                               \r\n"
				+ "                 ;                                             :....:-                              \r\n"
				+ "                 ;                                             :.....~-                             \r\n"
				+ "                 ;                               .             :......:-                            \r\n"
				+ "                 ;                              ...            :.......:-                           \r\n"
				+ "                 ;                              ...            :........~-                          \r\n"
				+ "                 ;                              ...            :.........:-                         \r\n"
				+ "                 ;                              ...            :..........~-                        \r\n"
				+ "                 ;                              ....           :...........:-                       \r\n"
				+ "                 ;                              ....           :............:-                      \r\n"
				+ "                 ;                              ....           :.............:-                     \r\n"
				+ "                 ;                              .,.,           :..............:-                    \r\n"
				+ "                 ;                              ....,          :...............:-                   \r\n"
				+ "                 ;                              .....          :................:-                  \r\n"
				+ "                 ;                              .,....         ;~~~~~~~~~~~~~~~~~;-                 \r\n"
				+ "                 ;                              .......                           ;                 \r\n"
				+ "                 ;                              ........                          ;                 \r\n"
				+ "                 ;                              .........                         ;                 \r\n"
				+ "                 ;                              ...........                       ;                 \r\n"
				+ "                 ;                              ...........                       ;                 \r\n"
				+ "                 ;                              ........,...                      ;                 \r\n"
				+ "                 ;                              .............                     ;                 \r\n"
				+ "                 ;                              ..............                    ;                 \r\n"
				+ "                 ;                              ...,...........                   ;                 \r\n"
				+ "                 ;                              ... ,...........                  ;                 \r\n"
				+ "                 ;                              ...   ,,........                  ;                 \r\n"
				+ "                 ;                              ...    .......,.                  ;                 \r\n"
				+ "                 ;                              ...     .........                 ;                 \r\n"
				+ "                 ;                              ...      ,,......                 ;                 \r\n"
				+ "                 ;                              ...       ,......                 ;                 \r\n"
				+ "                 ;                              ...        ......                 ;                 \r\n"
				+ "                 ;                              ...        ,......                ;                 \r\n"
				+ "                 ;                              ...         ,....,                ;                 \r\n"
				+ "                 ;                              ,..         .....,                ;                 \r\n"
				+ "                 ;                              ,..          .....                ;                 \r\n"
				+ "                 ;                     ........ ,..          ,....                ;                 \r\n"
				+ "                 ;                    ..........,..           ,..                 ;                 \r\n"
				+ "                 ;                  ...............           ,..                 ;                 \r\n"
				+ "                 ;                 .......,.,......           ,.,                 ;                 \r\n"
				+ "                 ;                .....,,.....,....           ...                 ;                 \r\n"
				+ "                 ;               ..................            .                  ;                 \r\n"
				+ "                 ;              ...,...............                               ;                 \r\n"
				+ "                 ;              ..................                                ;                 \r\n"
				+ "                 ;              .,...............,                                ;                 \r\n"
				+ "                 ;              ..................                                ;                 \r\n"
				+ "                 ;              ,................                                 ;                 \r\n"
				+ "                 ;              ................                                  ;                 \r\n"
				+ "                 ;               ,.............                                   ;                 \r\n"
				+ "                 ;                ,.........,.                                    ;                 \r\n"
				+ "                 ;                 .,.....,.                                      ;                 \r\n"
				+ "                 ;                                                                ;                 \r\n"
				+ "                 ;                                                                ;                 \r\n"
				+ "                 ;                                                                ;                 \r\n"
				+ "                 ;                                                                ;                 \r\n"
				+ "                 ;                                                                ;                 \r\n"
				+ "                 ;                                                                ;                 \r\n"
				+ "                 ;................................................................;                 \r\n"
				+ "                 ;................................................................;                 \r\n"
				+ "                 ;................................................................;                 \r\n"
				+ "                 ;........,,,..............,...,.................,,...,,..........;                 \r\n"
				+ "                 ;........     .......     ....,          ......,      ,,.........;                 \r\n"
				+ "                 ;........     ......,     ....,           .....         ,........;                 \r\n"
				+ "                 ;........  -  .......     ....,   ...,.    ,.,    ,-    -........;                 \r\n"
				+ "                 ;........  .  .......     ....,   ...,.,   ..,   ,,.,.   ........;                 \r\n"
				+ "                 ;........  .   .....  .   ....,   ......   ..    ,....   ........;                 \r\n"
				+ "                 ;........  .   .....  .   ....,   .....,   ..,,,,....,   ........;                 \r\n"
				+ "                 ;........       ,.,   ,   ....,   ......    ......,,.   ,........;                 \r\n"
				+ "                 ;........   ,  .,..   ,   ....,   ....,    ,....., .    .........;                 \r\n"
				+ "                 ;........   ,   ...  ,,   ....,           .......-    ...........;                 \r\n"
				+ "                 ;........   .   ,..  .,   ....,          ........,      ,,.......;                 \r\n"
				+ "                 ;........   ,.   .   ,,   ....,   ..... ,...........,    ........;                 \r\n"
				+ "                 ;........   ,.   ,   ..   ....,   ...................,.   .......;                 \r\n"
				+ "                 ;........   ,,      ...   ....,   ....................    .......;                 \r\n"
				+ "                 ;........   ,.      ,,.   ....,   ...........    ....,    .......;                 \r\n"
				+ "                 ;........   ,.,    ..,.   ....,   ...........    ,....    .......;                 \r\n"
				+ "                 ;........   ,,.    ....   ....,   ..........,.    ...    ,.......;                 \r\n"
				+ "                 ;........   ,,.    ....   ....,   ...........,.         .........;                 \r\n"
				+ "                 ;.......    ,..    ,..,   ....,   ............,       ..,........;                 \r\n"
				+ "                 ;.................................................,,,............;                 \r\n"
				+ "                 ;................................................................;                 \r\n"
				+ "                 ;................................................................;                 \r\n"
				+ "                 ;----------------------------------------------------------------;                 \r\n"
				+ "                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                 \r\n"
				+ "                                                                                                    \r\n"
				+ "                                                                                                    \r\n"
				+ "                                                                                                    \r\n"
				+ "                                                                                                    \r\n"
				+ "                                                                                                    \r\n"
				+ "                                                                                                    \r\n"
				+ "";
		
		
		
		Scanner sc = new Scanner(System.in);
		//노래를 실행, 정지해주는 객체
				MP3Player mp3 = new MP3Player();
		// mp3노래를 실행하기 위해서는 노래가 위치하고 있는 경로가 필요
		//mp3.play("C:\\Users\\gjaischool\\Desktop\\mp3\\뉴진스-HypeBoy.mp3");
				
		// 1.가수명(String) 2.노래제목(String) 3.출시년도(int) 4.시간(int) 5.경로
		System.out.println(text);
		
		Music m1 = new Music("뉴진스", "HYpeBoy", 2022, 40,"C:\\Users\\gjaischool\\Desktop\\mp3\\뉴진스-HypeBoy.mp3");
		Music m2 = new Music("르세라핌", "Antifragile", 2022, 46, "C:\\Users\\gjaischool\\Desktop\\mp3\\르세라핌-Antifragile.mp3");
		Music m3 = new Music("아이브", "LoveDive", 2022, 48, "C:\\Users\\gjaischool\\Desktop\\mp3\\아이브-LoveDive.mp3");
		Music m4 = new Music("윤하", "사건의 지평선", 2002, 42,"C:\\Users\\gjaischool\\Desktop\\mp3\\윤하-사건의지평선.mp3");
		Music m5 = new Music("카라", "When I Move", 2002, 46, "C:\\Users\\gjaischool\\Desktop\\mp3\\카라-WhenIMove.mp3");
		// Music m6 = new Music("진성", "보릿고개", 2020, 83);
		
		ArrayList<Music> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		// list.add(m6);
		
//		m1.setSinger("아이들");
//		m1.setTitle("퀸카");
//		m1.setYear(2023);
//		m1.setTime(90);
//		
//		System.out.println(m1.getSinger());
//		System.out.println(m1.getTitle());
//		System.out.println(m1.getYear());
//		System.out.println(m1.getTime());
		
		
		int point = 0;
		while(true) {
			System.out.println("1.재생 2.정지 3.이전곡 4.다음곡 5.목록 6.종료 >>");
			int menu = sc.nextInt();
			if(menu == 1) {
				System.out.println("=====재생=====");
				
				if(mp3.isPlaying()) {
					mp3.stop();				
				}
				mp3.play(list.get(point).getPath());
				
				System.out.print(point + 1 + ".");
				System.out.print(list.get(point).getSinger());
				System.out.print(list.get(point).getTitle() +"(");
				System.out.println(list.get(point).getTime() + "초)");
				
			}else if(menu == 2) {
				System.out.println("=====정지=====");
				System.out.print(point + 1 + ".");
				System.out.print(list.get(point).getSinger());
				System.out.print(list.get(point).getTitle() +"(");
				System.out.println(list.get(point).getTime() + "초)");
				if(mp3.isPlaying()) {
					mp3.stop();				
				}
			}else if(menu == 3) {
				System.out.println("=====이전곡=====");
				if(point > 0) {
					point--;
				}
				if(mp3.isPlaying()) {
					mp3.stop();				
				}
				mp3.play(list.get(point).getPath());
				System.out.print(point + 1 + ".");
				System.out.print(list.get(point).getSinger());
				System.out.print(list.get(point).getTitle() +"(");
				System.out.println(list.get(point).getTime() + "초)");
				
			}else if(menu == 4) {
				System.out.println("=====다음곡=====");
				// 현재 "1.아이들-퀸카(90초)" 노래가 나온다면 다음곡을 선택할 시
				// "2.윤하-사건의 지평선(85초)"가 출력되게 해주세요
				// 힌트. 현재 몇 번째 노래가 실행되고 있는지 위치를 알고있는 변수가 필요
				if(point < list.size() - 1) { 
					point++;					
				}
				if(mp3.isPlaying()) {
					mp3.stop();				
				}
				mp3.play(list.get(point).getPath());
				System.out.print(point + 1 + ".");
				System.out.print(list.get(point).getSinger());
				System.out.print(list.get(point).getTitle() +"(");
				System.out.println(list.get(point).getTime() + "초)");
				
				
			}else if(menu == 5) {
				
				System.out.println("=====목록=====");
				// 1. 아이들 - 퀸카(90초)
				// 2. 윤하 - 사건의 지평선(85초)
				// 3. 임영웅 - 사랑은 늘 도망가(70초)
				// 4. 야다 - 이미 슬픈 사랑(90초)
				// 5. 체리필터 - 낭만 고양이(81초)
				// 6. 진성 - 보릿고개(83초)
				for(int i = 0; i < list.size(); i++) {
					System.out.print(i + 1 + ".");
					System.out.print(list.get(i).getSinger());
					// list 0번째 노래의 가수 private 이기때문에 get 넣어주기
					System.out.print(list.get(i).getTitle() +"(");
					System.out.println(list.get(i).getTime() + "초)");
				}	
				
			}else if(menu == 6) {
				if(mp3.isPlaying()) {
					mp3.stop();				
				}
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
	}

}
