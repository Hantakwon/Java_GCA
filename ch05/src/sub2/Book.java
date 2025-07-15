package sub2;

public class Book {
	
	private String title;
	private String author;
	private String isbn;
	private int availableCopies;
	
	// 생성자
	public Book(String title, String author, String isbn, int availableCopies) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.availableCopies = availableCopies;
	}

	// 메서드
	public boolean borrowBook() {
		if(availableCopies > 0) { // 이용 가능한 복사본(도서)이 있으면
			availableCopies--;
			return true;
		} else return false;
	}
	
	public void returnBook() {
		availableCopies++;
	}
	
	public void show() {
		System.out.println("도서명 : " + title);
		System.out.println("지은이 : " + author);
		System.out.println("도서번호 : " + isbn);
		System.out.println("이용 가능한 복사본 : " + availableCopies);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAvailableCopies() {
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	
	
}
