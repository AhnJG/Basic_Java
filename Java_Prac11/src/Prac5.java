class Car
{
	String name;
	int price;
	Car(String name, int price)
	{
		this.name = name;
		this.price = price;
	}
	void show() {}
}

class Bongo extends Car
{
	String color;
	Bongo(String name, int price, String color)
	{
		super(name, price);
		this.color = color;
	}
	void show()
	{
		System.out.println(name+"��"+price+"cc�̰� ����"+color+"�̴�");
	}
	
}

class Self_Car extends Car
{
	int speed;
	Self_Car(String name, int price, int speed)
	{
		super(name, price);
		this.speed = speed;
	}
	void show()
	{
		System.out.println(name+"��"+price+"cc�̰� ���� �ӵ���"+speed+"km�̴�");
	}
}

class Truck extends Car
{
	double weight;
	Truck(String name, int price, double weight)
	{
		super(name, price);
		this.weight = weight;
	}
	void show()
	{
		System.out.println(name+"��"+price+"cc�̰� ���Դ�"+weight+"�̴�");
	}
}

public class Prac5 {

	public static void main(String[] args) {
		Bongo a = new Bongo("��Ÿ����", 1500, "�����");
		Self_Car b = new Self_Car("�ҳ�Ÿ", 1800, 100);
		Truck c = new Truck("����Ƽ", 2000, 3.5);
		
		a.show();
		b.show();
		c.show();
		
		Car d[] = new Car[3];
		d[0] = new Bongo("��", 1500, "�����");
		d[1] = new Self_Car("��", 1800, 100);
		d[2] = new Truck("��", 2000, 3.5);
		
		for(Car k: d)
		{
			k.show();
		}
	}

}
