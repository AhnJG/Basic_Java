
public class Prac1 {

	public static void main(String[] args) {
		Plant p = new Plant();
		p.name="용담";	
		p.color="남색";
		p.breathe();
		p.fruit();
		
		System.out.println();
		Human h = new Human(20, "연어", "Chu");
		h.age = 20;
		h.food = "연어";
		h.name = "Chu";
		h.sound();
		h.study();
		
		System.out.println();
		Salmon s = new Salmon();
		s.name = "연어";
		s.breathe();
		s.age = 1;
		s.move();
		s.info();
		
		System.out.println();
		Dog d = new Dog("ㄱㄱㄱ",2,"사료");
		d.setKind("진돗개");
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
		System.out.println(name+"은 숨쉰다.");
	}
}

class Plant extends Biology
{
	Plant() {}
	String color;
	public void fruit()
	{
		System.out.println(name+"은 열매가 맺히고 색깔은 "+color+"이다");
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
		System.out.println(name+"은 움직인다.");
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
		System.out.println(name+"는 소리를 내고 "+age+"살이다.");
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
		System.out.println(name+"는 공부를 하고 "+age+"살이며 "+food+"를 먹는다.");
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
		System.out.println(name+"는 "+kind +"종으로 달리고 "+age+"살이며 "+food+"를 먹는다.");
	}
}

class Fish extends Animal
{
	public void info()
	{
		System.out.println(name+"는 "+age+"살이다.");
	}
}

class Salmon extends Fish
{
	
}





