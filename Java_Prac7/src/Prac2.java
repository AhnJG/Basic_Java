
public class Prac2 {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.name = "aaa";
		c.age = 10;
		c.eat();
		c.sleep();
		c.cry();
		
		System.out.println("");
		
		Hamster h = new Hamster();
		h.name = "bbb";
		h.age = 3;
		h.eat();
		h.sleep();
		h.cry();
	}
}

class Animal 
{
	String name;
	int age;
	
	public void eat()
	{
		System.out.print(name+"��"+age+"���̰� �԰�, ");
	}

	public void sleep()
	{
		System.out.print("�ڰ�, ");
	}
}

class Cat extends Animal
{
	public void cry()
	{
		System.out.println("�߿˰Ÿ���.");
	}
}

class Mouse extends Animal
{
	public void cry()
	{
		System.out.println("����Ÿ���.");
	}
}

class Hamster extends Mouse
{

}