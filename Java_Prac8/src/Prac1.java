
public class Prac1 {

	public static void main(String[] args) {
		Plant p = new Plant();
		p.name="���";	
		p.color="����";
		p.breathe();
		p.fruit();
		
		System.out.println();
		Human h = new Human(20, "����", "Chu");
		h.age = 20;
		h.food = "����";
		h.name = "Chu";
		h.sound();
		h.study();
		
		System.out.println();
		Salmon s = new Salmon();
		s.name = "����";
		s.breathe();
		s.age = 1;
		s.move();
		s.info();
		
		System.out.println();
		Dog d = new Dog("������",2,"���");
		d.setKind("������");
		d.run();
	}
}

class Biology
{
	Biology() {}
	Biology(String name)
	{
		this.name = name;
	}
	String name;
	public void breathe()
	{
		System.out.println(name+"�� ������.");
	}
}

class Plant extends Biology
{
	Plant() {}
	String color;
	public void fruit()
	{
		System.out.println(name+"�� ���Ű� ������ ������ "+color+"�̴�");
	}
}

class Animal extends Biology
{
	Animal() {}
	Animal(int age, String name)
	{
		super(name);
		this.age = age;
	}
	
	int age;
	public void move()
	{
		System.out.println(name+"�� �����δ�.");
	}
}


class Mammal extends Animal
{
	Mammal() {}
	Mammal(int age, String name)
	{
		super(age, name);
	}
	int legs;
	public void sound()
	{
		System.out.println(name+"�� �Ҹ��� ���� "+age+"���̴�.");
	}
}

class Human extends Mammal
{
	Human() {}
	Human(int age, String food, String name)
	{
		super(age, name);
//		this.age = age;
//		this.food = food;
		this.name = name;
	}
	
	String food;
	public void study()
	{
		System.out.println(name+"�� ���θ� �ϰ� "+age+"���̸� "+food+"�� �Դ´�.");
	}
}

class Dog extends Mammal
{
	Dog(String name, int age, String food)
	{
		this.name = name;
		this.age = age;
		this.food = food;
	}
	
	String food;
	private String kind;
	
	public void setKind(String kind)
	{
		this.kind = kind;
	}
	
	public void run()
	{
		System.out.println(name+"�� "+kind +"������ �޸��� "+age+"���̸� "+food+"�� �Դ´�.");
	}
}

class Fish extends Animal
{
	public void info()
	{
		System.out.println(name+"�� "+age+"���̴�.");
	}
}

class Salmon extends Fish
{
	
}





