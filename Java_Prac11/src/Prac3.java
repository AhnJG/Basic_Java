class Circle
{
	int radius;
	Circle(int radius)
	{
		this.radius = radius;
	}
	
	void area()
	{
		System.out.println("���� ���̴�"+radius * radius * 3.14+"�Դϴ�");
	}
}

public class Prac3 {

	public static void main(String[] args) {
//		Circle ob = new Circle(5);
//		ob.area();
	
		Circle c[] = new Circle[3];
		for(int i=0; i<c.length; i++)
		{
			c[i] = new Circle(i+5);
		}
		
		for(int i=0; i<c.length; i++)
		{
			c[i].area();
		}
		
		System.out.println();
		
		for(Circle k : c)
		{
			k.area();
		}
	}
}

