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
		System.out.println(name+"는"+price+"cc이고 색은"+color+"이다");
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
		System.out.println(name+"는"+price+"cc이고 현재 속도는"+speed+"km이다");
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
		System.out.println(name+"는"+price+"cc이고 무게는"+weight+"이다");
	}
}

public class Prac5 {

	public static void main(String[] args) {
		Bongo a = new Bongo("스타렉스", 1500, "노란색");
		Self_Car b = new Self_Car("소나타", 1800, 100);
		Truck c = new Truck("마이티", 2000, 3.5);
		
		a.show();
		b.show();
		c.show();
		
		Car d[] = new Car[3];
		d[0] = new Bongo("ㄱ", 1500, "노란색");
		d[1] = new Self_Car("ㄴ", 1800, 100);
		d[2] = new Truck("ㄷ", 2000, 3.5);
		
		for(Car k: d)
		{
			k.show();
		}
	}

}
