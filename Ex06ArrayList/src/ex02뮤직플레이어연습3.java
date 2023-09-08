import java.util.ArrayList;
import java.util.Scanner;

public class ex02뮤직플레이어연습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//마지막 위치에 추가를 선택할 시 추가할 노래 제목과 추가할 위치를 입력받고

        //입력받은 위치의 인덱스에 노래를 추가하세요

        Scanner sc = new Scanner(System.in);

        ArrayList<String> musicList = new ArrayList<String>();

        

        while(true) { 

            System.out.print("[1]노래 추가 [2]노래 삭제 [3]노래 목록 [4]종료 >> ");

            int sel = sc.nextInt();

            

            if(sel == 1) {

                System.out.println("==== 현재 재생 목록 ===");

                if(musicList.size() == 0) {

                    System.out.println();

                    System.out.println("       재생목록이 없습니다");

                    System.out.println();

                    System.out.println("==================");

                    System.out.print("[1]마지막에 추가 [2]원하는 위치에 추가 >> ");

                    int sel2 = sc.nextInt();



                    if(sel2 == 1) {

                        System.out.print("추가할 노래 입력 : ");

                        String str = sc.next();

                        musicList.add(str);

                        System.out.println("추가가 완료 되었습니다.");

                    } else {

                        System.out.print("추가할 노래 입력 : ");

                        String str = sc.next();

                        System.out.println("추가할 위치 입력 >> ");

                        int num2 = sc.nextInt();

                        musicList.add(num2, str);

                        System.out.println("추가가 완료 되었습니다.");

                    }

                } else {

                    for(int i=0; i<musicList.size(); i++) {

                        System.out.println((i+1)+". "+musicList.get(i));

                    }

                    System.out.println("==================");

                    System.out.print("[1]마지막에 추가 [2]원하는 위치에 추가 >> ");

                    int sel3 = sc.nextInt();

                    if(sel3 == 1) {

                        System.out.print("추가할 노래 입력 : ");

                        String str = sc.next();

                        musicList.add(str);

                        System.out.println("추가가 완료 되었습니다.");

                    } else {

                        System.out.print("추가할 노래 입력 : ");

                        String str = sc.next();

                        System.out.println("추가할 위치 입력 >> ");

                        int num2 = sc.nextInt();

                        if(musicList.size() == 0) {

                            System.out.println("추가 할 수 없습니다.");

                        } else {

                            musicList.add(num2, str);

                            System.out.println("추가가 완료 되었습니다.");

                        }

                    }

                }

            } else if(sel == 2) {

                if(musicList.size() == 0) {

                    System.out.println();

                    System.out.println("       재생목록이 없습니다");

                    System.out.println();

                    System.out.println("==================");

                } else {

                    for(int i=0; i<musicList.size(); i++) {

                        System.out.println((i+1)+". "+musicList.get(i));

                    }

                    System.out.print("[1]선택 삭제 [2]전체 삭제 >> ");

                    int sel4 = sc.nextInt();

                    if(sel4 == 1) {

                        System.out.print("삭제할 노래 선택 >> ");

                        int sel5 = sc.nextInt();

                        musicList.remove(sel5-1);

                    } else {

                        musicList.clear();

                        System.out.println("노래 전체가 삭제 되었습니다.");

                    }

                }

            } else {

                System.out.print("프로그램이 종료 되었습니다. >> ");

                break;

            }

        }

	}

}
