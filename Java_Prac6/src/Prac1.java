import java.util.Scanner;

class Car
{
	String name;
	int price;
	double tax;
	
	Car( String name, int price, double tax)
	{
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
	
	void display()
	{
		System.out.println(name+"�� ������ "+price+"�����̰�, �ΰ�����"+(price*tax)+"�̸� �� ������"+(price + (price*tax))+"�Դϴ�.");
	}
}

class CarList
{
	String name;
	int price;
	double tax;
	
	CarList(String name, int price)
	{
		this.name = name;
		this.price = price;
		this.tax = 0.07;
	}
	
	void display()
	{
		System.out.println(name+"�� ������ "+price+"�����̰�, �ΰ�����"+(price*tax)+"�̸� �� ������"+(price + (price*tax))+"�Դϴ�.");
	}
}

public class Prac1 {

	public static void main(String[] args) {
		Car socar = new Car("�ҳ�Ÿ", 3000, 0.07);
		CarList ci[] = new CarList[3];
		
		Scanner	sc = new Scanner(System.in);
		
		for(int i=0; i<ci.length; i++)
		{
			System.out.println("�� �̸�:");
			String name = sc.next();
			
			System.out.println("�� ����:");
			int price = sc.nextInt();
			
			ci[i] = new CarList(name, price);
		}
		
		for(int i=0; i<ci.length; i++)
		{
			ci[i].display();
		}
		
//		socar.name = "�ҳ�Ÿ";
//		socar.price = 3000;
		socar.display();
	}
}
