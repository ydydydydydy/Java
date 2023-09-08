package ex06뮤직플레이어;

public class Music {
	public static char[] getSinger;
	// class MusicVo --> 값을 담고 있다
	// 1.가수명 2.노래제목 3.출시년도 4.시간초
	private String singer;
	private String title;
	private int year;
	private int time;
	private String path;
	
	// 메소드 오버로딩 - 동일한 이름의 메소드를 정의하는 방법
	// 하는 이유 - 획일화 하기 위해
	// 1. 매개변수 개수가 다를 때
	// 2. 매개변수의 데이터타입이 다를 때
	
	
	public Music(String singer, String title, int year, int time, String path) {
		super();
		this.singer = singer;
		this.title = title;
		this.year = year;
		this.time = time;
		this.path = path;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	// private -> class 에서만 접근 o 
	public Music(String singer, String title, int year, int time) {
		this.singer = singer;
		this.title = title;
		this.year = year;
		this.time = time;
	} // Alt + Shift + s -> Generate Constructor using Field 
	
	
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	
	
	
}
