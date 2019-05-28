
public class Prac3 {

	public static void main(String[] args) {
		Burger a = new ABurger(4500);
		System.out.println(a.show());
		a = new BBurger(3400);
		System.out.println(a.show());
		a = new CBurger(5600);
		System.out.println(a.show());
		
	}
}

class Burger
{
	protected int price;
	protected static int money = 57000;
	Burger(int price)
	{
		this.price = price;
		money -= price;
	}
	
	protected String show()
	{
		return "����";
	}
}

class ABurger extends Burger
{
	ABurger(int price) 
	{
		super(price);
	}
	
	protected String show()
	{
		return "�Ұ����� " + money;
	}
}

class BBurger extends Burger
{
	BBurger(int price) 
	{
		super(price);
	}
	protected String show()
	{
		return "������ �����̽� ���� " + money;
	}
}

class CBurger extends Burger
{
	CBurger(int price) 
	{
		super(price);
	}
	protected String show()
	{
		return "�������� " + money;
	}
}
