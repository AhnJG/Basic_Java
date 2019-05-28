import java.util.ArrayList;

class Person
{
	String name;
	int price;
	String air;
	
	Person(String name, int price, String air)
	{
		this.name = name;
		this.price = price;
		this.air = air;
	}
	
	void show()
	{
		System.out.println(name + " " + price);
	}
}

public class Prac2 {

	public static void main(String[] args) {
		ArrayList <Person> p = new ArrayList<>();
		
		p.add(new Person("�̱�", 250, "�����װ�"));
		p.add(new Person("����", 220, "�ƽþƳ�"));
		p.add(new Person("������", 150, "�����װ�"));
		
		for(int i=0; i<p.size(); i++)
		{
			System.out.println(p.get(i).name + " " + p.get(i).price + " " + p.get(i).air);
		}
		
		System.out.println();
		
		for(Person per : p)
		{
			System.out.println(per.name + " " + per.price + " " + per.air);
		}
		
		System.out.println();
		
		for(int i=0; i<p.size(); i++)
		{
			p.get(i).show();
		}
		
		System.out.println();
		
		for(Person per : p)
		{
			per.show();
		}
		
	}
}
