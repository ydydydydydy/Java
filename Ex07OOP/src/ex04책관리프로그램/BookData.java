package ex04책관리프로그램;

public class BookData {
	
	// 1) 필드
	   private String title;
	   private int price;
	   private String writer;
	   // 2) 메서드
	   public BookData(String title, int price, String writer) {
	      this.title = title;
	      this.price = price;
	      this.writer = writer;
	   }
	   
	   public String getTitle() {
	      return title;
	   }
	   
	   public int getPrice() {
	      return price;
	   }
	   
	   public String getWriter() {
	      return writer;
	   }
	}