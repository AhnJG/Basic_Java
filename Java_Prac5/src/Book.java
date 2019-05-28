public class Book {

	String title;
	String author;
	int page;
	
	
	public Book() {} // 기본 생성자, 다른 생성자를 만들면 기본 생성자를 만들어줘야함
	
	public Book(String title) // 생성자 : 객체를 만들면서 변수 초기화, 리틴형 x
	{
		this(title, "작자미상", 200);
//		this.title = title; // this. : 내 클래스의 멤버
//		author = "작자미상";
//		page = 200;
	}
	
	public Book(String title, String author) // 생성자
	{
		this(title, author, 250);
//		this.title = title;
//		this.author = author;
//		page = 156;
	}
	
	public Book(String title, String author, int page) // 생성자
	{
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	public void info()
	{
		System.out.println(title + ", " + author + ", " + page);
	}
	
	public static void main(String[] args) {
		Book b1 = new Book("어린왕자", "생텍쥐페리");
		Book b2 = new Book("춘향전");
		Book b3 = new Book("열 두 발자국", "정재승");
		Book b4 = new Book("위저드 베이커리", "구병모", 300);
		Book b5 = new Book();

		b1.info();
		b2.info();
		b3.info();
		b4.info();
		b5.info();
	}
}
