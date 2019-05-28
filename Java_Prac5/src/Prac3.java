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
			System.out.println("������ �Է� : ");
			c[i] = new Circle(sc.nextInt());
		}
		
		for(i=0; i<c.length; i++)
		{
			System.out.println("�������� "+c[i].radius+"�϶�");
			System.out.printf("���� ���̴�  %.2f �̰� ���� �ѷ��� %.2f �̴�.\n\n", c[i].getArea(), c[i].circumFerence());
		}
	}
}
