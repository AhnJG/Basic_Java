import java.util.Scanner;

class Data
{
	String name; 
	int age;
	
	//public void eat() // 멤버 메소드, public은 main에서만 사용가능
	void eat()
	{
		System.out.println(age + "살" + name + "먹는다.");
	}
}

public class Prac1 {
	String name; // 멤버변수, 기본값 NULL
	int age;// 멤버변수, 기본값 0
	
	public static void main(String[] args) {
			// 클래스명 객체변수 = new 클래스명();
			String name; // 지역변수, 기본값 쓰레기값
			Data p1 = new Data(); // 객체화, 객체변수, 인스턴스화
			Prac2 p2 = new Prac2();
			Scanner sc = new Scanner(System.in);
			
			p1.name = "asd";
			p1.age = 12;
			p1.eat();
			
			p2.height = sc.nextFloat();
			System.out.println("키: " + p2.height);
	}

}
