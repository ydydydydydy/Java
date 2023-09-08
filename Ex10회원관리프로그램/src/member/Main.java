package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DAO클래스 안에있는 메소드를 사용하기 위해 객체생성
	      MemberDAO dao = new MemberDAO();

	      Scanner sc = new Scanner(System.in);
	      // CRUD -> 어떠한 프로그램이든 기본적으로 존재해야하는 기능들

	      while (true) {
	         System.out.print("1.회원가입 2.로그인 3.회원목록 4.회원정보수정 5.회원탈퇴 6.종료 >> ");

	         int menu = sc.nextInt();

	         if (menu == 1) {
	            System.out.println("======회원가입======");
	            // 아이디, 비밀번호, 닉네임
	            System.out.print("아이디 입력 : ");
	            String id = sc.next();
	            System.out.print("비밀번호 입력 : ");
	            String pw = sc.next();
	            System.out.print("닉네임 입력 : ");
	            String nick = sc.next();
	            
	            int cnt = dao.join(id, pw, nick);

	            if (cnt > 0) {
	               System.out.println("회원가입 성공!");
	            } else {
	               System.out.println("회원가입 실패...");
	            }

	         } else if (menu == 2) {

	            // 로그인
	            // 사용자한테 아이디랑 비밀번호 입력받아서
	            // 테이블에 해당 데이터가 있는지 확인후!
	            // 있으면 닉네임가져와서
	            // "자연보호님 로그인 성공하셨습니다!"

	            System.out.print("아이디 입력 : ");
	            String id = sc.next();
	            System.out.print("비밀번호 입력 : ");
	            String pw = sc.next();
	            
	            MemberVO info = dao.login(id, pw);
	            
	            // 로그인 성공실패 판단
	            if(info != null) {
	               System.out.println(info.getNick() + "님 환영합니다!");
	            }else {
	               System.out.println("로그인 실패...");
	            }
	            

	         } else if (menu == 3) {

	        	 //DAO에 있는 기능을 가져다가 사용
	        	 dao.select();

	            
	         } else if (menu == 4) {

	            // 회원정보 수정
	            // 사용자로부터 아이디를 입력받아서 비밀번호를 바꾸자!
	            // Query
	            // Update 테이블명 set 컬럼명 조건문
	            // 조건문 : 사용자가 입력한 아이디에 해당하는 비밀번호를 변경
	            System.out.print("비밀번호를 바꾸고 싶은 아이디 입력 >> ");
	            String id = sc.next();
	            System.out.println("변경할 비밀번호 입력 >> ");
	            String pw = sc.next();
	            
	            int cnt = dao.update(id, pw);
	            
	            if (cnt > 0) {
	               // update가 성공
	               System.out.println("비밀번호 변경 성공");
	            } else {
	               // update가 실패
	               System.out.println("비밀번호 변경 실패");
	            }

	         } else if (menu == 5) {

	            // 사용자한테 아이디랑 비밀번호 입력받아서
	            // 해당 아이디 비밀번호가 있으면 테이블에서 정보가 사라지게 만들자
	            System.out.print("회원 탈퇴 아이디 >> ");
	            String id = sc.next();
	            System.out.print("회원 탈퇴 비밀번호 >> ");
	            String pw = sc.next();
	            // 회원 탈퇴 완료!
	            
	            int cnt = dao.delete(id, pw);
	            
	            if (cnt > 0) {
	               System.out.println("회원 탈퇴 성공");
	            } else {
	               System.out.println("회원 탈퇴 실패");
	            }

	         } else if (menu == 6) {
	            System.out.println("프로그램을 종료합니다.");
	            break;
	         } else {
	            System.out.println("정확한 숫자를 입력해주세요.");
	         }

	      }

	   }

	}