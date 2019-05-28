
public class Prac2 {

	static void paint(Shape p)
	{
		p.draw(); // p가 가리키는 객체 내에 오버라이딩된 draw()호출, 동적 바인딩
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape()); // Shape p = new Shape()
		paint(new Line()); // Shape p = new Line()
		paint(new Rect()); //Shape p = new Rect()
		paint(new Circle()); //Shape p = new Circle() --> 업캐스팅  : 부모가 자식클래스를 가리킨다.
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

