package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex01Select {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		// 1. 데이터베이스 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// - DB가 존재하는 url, 아이디, 비밀번호
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
            String db_id = "shopping";
            String db_pw = "12345";
            
            // 권한 가져오기
            conn = DriverManager.getConnection(db_url, db_id, db_pw);
            
            //select
            String sql = "select * from member";
            psmt = conn.prepareStatement(sql);
            
            // ResultSet : sql select문을 실행시 돌아오는 테이블 형태를
            // 담을 수 있는 객체
            
            rs = psmt.executeQuery();
            // rs.next() : 커서를 한 칸씩 이동 시키면서 데이터가 있는지 없는지에 대한
            // 결과값을 t/f로 받아오는 메서드
            while(rs.next()) {
            	String id = rs.getString(1);
            	String pw = rs.getString(2);
            	String nick = rs.getString(3);
            	System.out.println(id +"\t"+pw+"\t"+nick);
            }
            
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			// 역순으로 자원을 반납
			// ResultSet
			try {
				if(rs != null)
				rs.close();
				if(psmt != null)
					psmt.close();
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			// PreparedStatement
		}

	}

}
