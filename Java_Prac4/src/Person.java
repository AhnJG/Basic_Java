class Data	// main 있는 클래스만 public 사용, 이 패키지 내에서만 사용가능
{
	String name;
	String job;
	int age;
	
	void eat() // public (default)
	{
		System.out.println("밥을 먹는다.");
	}
	
	public void sleep()
	{
		System.out.println("잠을 잔다.");
	}
}

public class Person {

	
	
	public static void main(String[] args) {
		Data p1 = new Data(); // 객체화, 인스턴스화 
		p1.name = "qwe";
		p1.age = 1;
		p1.eat();
		System.out.println(p1.name + " " + p1.age);
		
		Data p2 = new Data();
		p2.name = "asd";
		p2.age = 2;
		p2.eat();
		p2.sleep();
		System.out.println(p2.name + " " + p2.age);
	
		Data p3 = new Data();
		p3.name = "zxc";
		p3.age = 3;
		p3.eat();
		System.out.println(p3.name + " " + p3.age);
		
		PersonData p4 = new PersonData();
		p4.name = "ㅂㅈㄷ";
		p4.age = 20;
		p4.height = 180;
		p4.work();
		
	}

}
