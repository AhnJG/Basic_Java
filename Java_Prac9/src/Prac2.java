
public class Prac2 {

	public static void main(String[] args) {
		Shape a = new Line(); // ��ĳ����
		a.draw();
		Circle b = new Circle();
		b.draw();
		a = new Rect();
		a.draw();
	}

}

abstract class Shape
{
	Shape() {} // ������
	
	void show() // �Ϲ� �޼ҵ�
	{
		
	}
	
	abstract void draw(); // �߻�޼ҵ� : ����x �̸���
	String name; // �Ϲ� �������
}

class Line extends Shape
{
	void draw()
	{
		System.out.println("line");
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle");
	}
}

class Rect extends Shape
{
	void draw()
	{
		System.out.println("Rect");
	}
}
