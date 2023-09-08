package 도서관리프로그램;

import java.util.ArrayList;

public class Controller {
 // View랑 Model(DAO) 소통할 수 있는 중간다리
   
   // 도서등록 : Main에서 보내준 vo를 받아서 DAO로 보내주는 역할
   public void insert(BookVO vo) {
      BookDAO dao = new BookDAO();
      int row = dao.insert(vo);
      if(row > 0) {
         System.out.println("도서등록 성공");
      } else {
         System.out.println("도서등록 실패");
      }
   }
   
   
   public void select() {
      BookDAO dao = new BookDAO();
      ArrayList<BookVO> bookList = dao.select(); // 테이블 데이터를 결과값
      // ArrayList<BookVO>가 결과값
      for(int i = 0; i < bookList.size(); i++) {
         System.out.print(bookList.get(i).getTitle() +"\t");
         System.out.print(bookList.get(i).getName() +"\t");
         System.out.print(bookList.get(i).getPrice() +"\t");
         System.out.print(bookList.get(i).getNum() +"\t");
         System.out.println();
      }
   }
   
   
   public void selectOne(BookVO vo) {
      BookDAO dao = new BookDAO();
      vo = dao.selectOne(vo);
      
      System.out.println(vo.getName());
   }
   
   
   
   
   
}