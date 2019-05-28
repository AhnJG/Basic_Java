public class Book {

	String title;
	String author;
	int page;
	
	
	public Book() {} // �⺻ ������, �ٸ� �����ڸ� ����� �⺻ �����ڸ� ����������
	
	public Book(String title) // ������ : ��ü�� ����鼭 ���� �ʱ�ȭ, ��ƾ�� x
	{
		this(title, "���ڹ̻�", 200);
//		this.title = title; // this. : �� Ŭ������ ���
//		author = "���ڹ̻�";
//		page = 200;
	}
	
	public Book(String title, String author) // ������
	{
		this(title, author, 250);
//		this.title = title;
//		this.author = author;
//		page = 156;
	}
	
	public Book(String title, String author, int page) // ������
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
		Book b1 = new Book("�����", "�������丮");
		Book b2 = new Book("������");
		Book b3 = new Book("�� �� ���ڱ�", "�����");
		Book b4 = new Book("������ ����Ŀ��", "������", 300);
		Book b5 = new Book();

		b1.info();
		b2.info();
		b3.info();
		b4.info();
		b5.info();
	}
}
