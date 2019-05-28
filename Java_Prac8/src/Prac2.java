
public class Prac2 {

	static void paint(Shape p)
	{
		p.draw(); // p�� ����Ű�� ��ü ���� �������̵��� draw()ȣ��, ���� ���ε�
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape()); // Shape p = new Shape()
		paint(new Line()); // Shape p = new Line()
		paint(new Rect()); //Shape p = new Rect()
		paint(new Circle()); //Shape p = new Circle() --> ��ĳ����  : �θ� �ڽ�Ŭ������ ����Ų��.
	}
}

class Shape
{
	public Shape next;
	public Shape() {next = null;}
	
	public void draw()
	{
		System.out.println("Shape");
	}
}

class Line extends Shape
{
	public void draw()
	{
		System.out.println("Line");
	}
}

class Rect extends Shape
{
	public void draw()
	{
		System.out.println("Rect");
	}
}

class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Circle");
	}
}

