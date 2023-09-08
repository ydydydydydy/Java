package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	 // 데이터베이스에 연결하고 사용하는 것을 담당하는 클래스
	   // DAO클래스가 모든 JDBC 기능을 수행한다
	   public int join(String id, String pw, String nick) {
	      // 예외사항 발생
	      // 이유 : 오타가 있거나 파일이 존재하지 않을때
	      // 클래스를 못찾는 예외사항이 발생한다
	      // 예외사항 해결방법 - try - catch
	      // try에 예외사항이 발생할 만한 코드를 작성
	      // catch 해당 예외사항이 발생하면 오류를 감지 및 포착

	      int cnt = 0;
	      Connection conn = null;
	      PreparedStatement psmt = null;

	      // 0.드라이버 파일을 프로젝트 안에 넣어주기
	      try {
	         // 1.드라이버 설치 (동적로딩)
	         // 왜 동적로딩인가
	         // - 컴파일러는 아래의 코드를 만나기 전까지 어떠한 DBMS에
	         // 드라이버를 사용하는지 모르고 아래의 코드를 만나는 순간
	         // 해당 드라이버를 찾아서 설치를 한다
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         // 2.커넥션 열기
	         // - DB가 존재하는 url, 아이디, 비밀번호
	         String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
	         String db_id = "shopping";
	         String db_pw = "12345";

	         conn = DriverManager.getConnection(db_url, db_id, db_pw);

	         if (conn != null) {
	            System.out.println("DB연결 성공!");
	         } else {
	            System.out.println("DB연결 실패...");
	         }

	         // 3.SQL문 실행
	         // SQL문을 실행하기 위해서는 조건이 있다
	         // 1.sql문장이 이상없는지 검토를 받아야한다
	         String sql = "INSERT INTO MEMBER VALUES(?,?,?)";
	         psmt = conn.prepareStatement(sql);

	         // psmt객체가 sql문을 완성하고 실행할 수 있는 객체이다
	         psmt.setString(1, id);
	         psmt.setString(2, pw);
	         psmt.setString(3, nick);
	         // executeUpdate(); sql 문장을 실행하는 메소드
	         // 실행한 문장의 개수를 int 형태로 반환
	         cnt = psmt.executeUpdate();

	      } catch (ClassNotFoundException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } finally {
	         // try 잘 실행되거나
	         // 또는 중간에 catch로 넘어간다고 하더라고
	         // finally에는 마지막에 반드시 넘어오게 되어있다
	         // 4.연결끊기
	         // - 연결을 끊을때는 역순으로 끊어준다
	         try {
	            if (psmt != null) {
	               psmt.close();
	            }
	            if (conn != null) {
	               conn.close();
	            }
	         } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }
	      
	      return cnt;
	   }

	   public int delete(String id, String pw) {
	      // TODO Auto-generated method stub
	      
	      int cnt = 0;
	      Connection conn = null;
	      PreparedStatement psmt = null;

	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");

	         // 준비물 3개
	         String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
	         String db_id = "shopping";
	         String db_pw = "12345";

	         conn = DriverManager.getConnection(db_url, db_id, db_pw);

	         // SQL문 준비

	         String sql = "delete from member where id = ? and pw = ?";
	         psmt = conn.prepareStatement(sql);
	         psmt.setString(1, id);
	         psmt.setString(2, pw);

	         cnt = psmt.executeUpdate(); // 결과값 : 영향을 받은 행이 있는지 없는지

	      } catch (ClassNotFoundException | SQLException e) {
	         System.out.println("데이터베이스 연결실패");
	         e.printStackTrace();
	      } finally {
	         // 자원 반납은 역순으로
	         try {
	            if (psmt != null)
	               psmt.close();
	            if (conn != null)
	               conn.close();
	         } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }
	      
	      return cnt;
	   }

	   public int update(String id, String pw) {
	      // TODO Auto-generated method stub
	      
	      int cnt = 0;
	      Connection conn = null;
	      PreparedStatement psmt = null;

	      // 1. 데이터베이스 연결
	      try {
	         // 동적 로딩
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         // 준비물 3개
	         String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
	         String db_id = "shopping";
	         String db_pw = "12345";
	         // 연결권한 확인
	         conn = DriverManager.getConnection(db_url, db_id, db_pw);

	         // SQL문을 준비
	         String sql = "update member set pw = ? where id = ?";
	         psmt = conn.prepareStatement(sql);
	         // ? 인자를 채워주자
	         psmt.setString(1, pw);
	         psmt.setString(2, id);
	         cnt = psmt.executeUpdate();
	         // 영향을 받은 행이 있는지 없는지에 대한 결과값을 받아온다.
	         
	      } catch (ClassNotFoundException | SQLException e) {
	         // OracleDriver라는 클래스가 없거나 ---> ojdbc.jar
	         // 대소문자
	         // id, pw
	         System.out.println("데이터 베이스 연결 실패");
	         e.printStackTrace();
	      } finally {
	         // finally : 예외상황이 발생하더라도
	         // 꼭한번은 실행되는 코드들이 {}

	         // 사용한적이 있으면 conn, psmt를 close하자

	         try {
	            // 반드시 자원은 사용한 순서 역순으로 반납해야한다!

	            if (psmt != null)
	               psmt.close();

	            if (conn != null)
	               conn.close();

	         } catch (SQLException e) {
	            System.out.println("자원 반납 오류");
	            e.printStackTrace();
	         }

	      }
	      
	      return cnt;
	   }

	   public MemberVO login(String id, String pw) {
	      // TODO Auto-generated method stub
	      MemberVO info = null;
	      
	      Connection conn = null;
	      PreparedStatement psmt = null;
	      ResultSet rs = null;

	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");

	         String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
	         String db_id = "shopping";
	         String db_pw = "12345";

	         conn = DriverManager.getConnection(db_url, db_id, db_pw);

	         String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ?";

	         psmt = conn.prepareStatement(sql);
	         psmt.setString(1, id);
	         psmt.setString(2, pw);

	         rs = psmt.executeQuery();
	         // rs.next()
	         // ResultSet에서 커서를 한칸 내림과 동시에 아래에 값이 있다면 true를 반환
	         // 값이 없다면 false를 반환한다
	         if (rs.next()) {
	            // 로그인 성공
	            String login_id = rs.getString("ID");
	            String login_pw = rs.getString("PW");
	            String login_nick = rs.getString("NICK");
	            
	            info = new MemberVO(login_id, login_pw, login_nick);
	         }

	      } catch (ClassNotFoundException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } finally {

	         try {
	            if (rs != null) {
	               rs.close();
	            }
	            if (psmt != null) {
	               psmt.close();
	            }
	            if (conn != null) {
	               conn.close();
	            }

	         } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }
	      
	      return info;
	   }
 
	 public void select()  {
		 Connection conn = null;
         PreparedStatement psmt = null;
         ResultSet rs = null;
		 try {
             Class.forName("oracle.jdbc.driver.OracleDriver");

             String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
             String db_id = "shopping";
             String db_pw = "12345";

             conn = DriverManager.getConnection(db_url, db_id, db_pw);

             String sql = "SELECT * FROM MEMBER";

             psmt = conn.prepareStatement(sql);

             rs = psmt.executeQuery();
             // rs.next()
             // ResultSet에서 커서를 한칸 내림과 동시에 아래에 값이 있다면 true를 반환
             // 값이 없다면 false를 반환한다
             while (rs.next()) {
                String login_id = rs.getString("ID");
                String login_pw = rs.getString("PW");
                String login_nick = rs.getString("NICK");

                System.out.println(login_id + "-" + login_pw + "-" + login_nick);
             }

          } catch (ClassNotFoundException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
          } catch (SQLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
          } finally {

             try {
                if (rs != null) {
                   rs.close();
                }
                if (psmt != null) {
                   psmt.close();
                }
                if (conn != null) {
                   conn.close();
                }

             } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
             }

          }
	 }
	 
	}