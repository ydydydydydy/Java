import java.util.ArrayList;
import java.util.Scanner;

public class ex02뮤직플레이어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 노래 리스트가 저장될 ArrayList 만들기 : musicList
	      // "가수이름 - 노래제목" : String
	      ArrayList<String> musicList = new ArrayList<>();
	      // musicList.add("깡");
	      // 입력하는 도구 가져오기
	      Scanner sc = new Scanner(System.in);

	      // 사용자에게 보여지는 화면 구현!
	      while (true) {
	         System.out.print("[1]노래조회 [2]노래추가 [3]노래삭제 [4]종료 >> ");
	         // 숫자 입력받기 : select
	         int select = sc.nextInt();
	         // select가 어떤 숫자인 판단
	         // 단, 1~4가아닌 다른 숫자를 입력하면 "잘못입력했습니다."
	         // 4를 입력하면 프로그램 종료

	         if (select == 1) {
	            // 노래조회
	            // 1) 현재 재생 목록
	            // 만약에 리스트가 하나도 없으면 재생목록이 없습니다.
	            System.out.println("======현재 재생 목록======");

	            if (musicList.size() == 0) {
	               // 재생 목록이 없을 때
	               System.out.println("재생 목록이 없습니다.");
	            } else {
	               // 재생 목록이 있을 떄
	               for (int i = 0; i < musicList.size(); i++) {
	                  System.out.println((i + 1) + ". " + musicList.get(i));
	               }
	            }

	            System.out.println("=======================");
	         } else if (select == 2) {
	            // 노래추가
	            System.out.println("======현재 재생 목록======");

	            if (musicList.size() == 0) {
	               // 재생 목록이 없을 때
	               System.out.println("재생 목록이 없습니다.");
	            } else {
	               // 재생 목록이 있을 떄
	               for (int i = 0; i < musicList.size(); i++) {
	                  System.out.println((i + 1) + ". " + musicList.get(i));
	               }
	            }

	            System.out.println("=======================");
	            //------------------재생 목록 보여주기
	            System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
	            select = sc.nextInt();
	            if(select == 1) {
	               System.out.print("추가할 노래 입력 >> ");
	               String musicTitle = sc.next();
	               musicList.add(musicTitle);
	               System.out.println("추가가 완료되었습니다.");
	            }else if(select == 2) {
	               // 사용자가 원하는 위치에 추가
	               System.out.print("추가할 노래 입력 >> ");
	               String musicTitle = sc.next();
	               System.out.print("추가할 위치 입력 >> ");
	               int index = sc.nextInt();
	               musicList.add(index -1, musicTitle);
	               System.out.println("추가가 완료되었습니다.");
	            }
	            
	         } else if (select == 3) {
	            // 노래삭제
	            System.out.println("======현재 재생 목록======");

	            if (musicList.size() == 0) {
	               // 재생 목록이 없을 때
	               System.out.println("재생 목록이 없습니다.");
	            } else {
	               // 재생 목록이 있을 떄
	               for (int i = 0; i < musicList.size(); i++) {
	                  System.out.println((i + 1) + ". " + musicList.get(i));
	               }
	            }
	            System.out.println("=======================");
	            //------------------재생 목록 보여주기
	            
	            if(musicList.size() == 0) {
	               System.out.println("삭제할 데이터가 없습니다.");
	            }else {

	               System.out.print("[1]선택삭제 [2]전체삭제 >> ");
	               select = sc.nextInt();
	               
	               
	               if(select == 1) {
	                  // 선택삭제
	                  System.out.print("삭제할 노래 선택 >> ");
	                  int index = sc.nextInt(); // 1 ~ 
	                  musicList.remove(index - 1);
	                  System.out.println("노래가 삭제되었습니다.");
	               }else if(select == 2) {
	                  // 전체삭제
	                  musicList.clear();
	                  System.out.println("전체 노래가 삭제되었습니다.");
	               }
	            }
	            
	            
	            
	            
	            
	            
	            
	            
	         } else if (select == 4) {
	            // 프로그램 종료
	            System.out.println("프로그램 종료");
	            break; // while문을 빠져나간다.
	            // 가장 근접한 반복문을 빠져나가는 키워드
	         } else {
	            // 문구 "다시 입력해주세요"
	            System.out.println("다시 입력해주세요");
	         }

	         // 1 --> ArrayList에 데이터가 있으면 재생목록을 보여주기
	         // --> 데이터가 없으면 "재생 목록이 없습니다."

	         // 2 --> 마지막 위치에 추가 : 추가 할 노래 입력
	         // 원하는 위치에 추가 : 추가할 노래 입력, 추가할 위치 입력
	         // 공통 사항 : 추가가 완료 되었습니다. 문구 띄워 주기

	         // 3 --> 선택 삭제 : 삭제할 노래 번호 선택
	         // ex) 1. Maria
	         // 2. 깡
	         // 3. 살짝 설렛어
	         // 삭제할 노래 선택을 2로하면 깡이 삭제되어야 한다!!!!!
	         // 전체 삭제 :

	      }

	   }

	}