class Data	// main �ִ� Ŭ������ public ���, �� ��Ű�� �������� ��밡��
{
	String name;
	String job;
	int age;
	
	void eat() // public (default)
	{
		System.out.println("���� �Դ´�.");
	}
	
	public void sleep()
	{
		System.out.println("���� �ܴ�.");
	}
}

public class Person {

	
	
	public static void main(String[] args) {
		Data p1 = new Data(); // ��üȭ, �ν��Ͻ�ȭ 
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
		p4.name = "������";
		p4.age = 20;
		p4.height = 180;
		p4.work();
		
	}

}
