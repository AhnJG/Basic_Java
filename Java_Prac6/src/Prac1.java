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
		System.out.println(name+"의 가격은 "+price+"만원이고, 부가세는"+(price*tax)+"이며 총 가격은"+(price + (price*tax))+"입니다.");
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
		System.out.println(name+"의 가격은 "+price+"만원이고, 부가세는"+(price*tax)+"이며 총 가격은"+(price + (price*tax))+"입니다.");
	}
}

public class Prac1 {

	public static void main(String[] args) {
		Car socar = new Car("소나타", 3000, 0.07);
		CarList ci[] = new CarList[3];
		
		Scanner	sc = new Scanner(System.in);
		
		for(int i=0; i<ci.length; i++)
		{
			System.out.println("차 이름:");
			String name = sc.next();
			
			System.out.println("차 가격:");
			int price = sc.nextInt();
			
			ci[i] = new CarList(name, price);
		}
		
		for(int i=0; i<ci.length; i++)
		{
			ci[i].display();
		}
		
//		socar.name = "소나타";
//		socar.price = 3000;
		socar.display();
	}
}
