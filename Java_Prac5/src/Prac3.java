import java.util.Scanner;

class Circle
{
	int radius;
	
	public Circle(int radius)
	{
		this.radius = radius;
	}
	
	public double getArea()
	{
		return 3.14 * radius * radius;
	}
	
	public double circumFerence()
	{
		return 3.14 * radius * 2;
	}
}
public class Prac3 {

	public static void main(String[] args) {
		Circle [] c = new Circle[5];
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		for(i=0; i<c.length; i++)
		{
			System.out.println("반지름 입력 : ");
			c[i] = new Circle(sc.nextInt());
		}
		
		for(i=0; i<c.length; i++)
		{
			System.out.println("반지름이 "+c[i].radius+"일때");
			System.out.printf("원의 넓이는  %.2f 이고 원의 둘레는 %.2f 이다.\n\n", c[i].getArea(), c[i].circumFerence());
		}
	}
}
