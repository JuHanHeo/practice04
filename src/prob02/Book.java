package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	private String genre;
	
	public Book(int bookno, String title, String author) {
		// TODO Auto-generated constructor stub
		this.bookNo = bookno;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void rent(){
		System.out.println(title + "이(가) 대여 됐습니다.");
		stateCode = 0;
	}
	
	public void print(){
		String state;
		if(stateCode == 1){
			state = "재고있음";
		}else{
			state = "대여중";
		}
		System.out.println("책 제목:" + title + ", 작가:" + author + ", 대여 유무:" + state);
	}

	
	

	
	
}
