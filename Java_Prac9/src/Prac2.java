
public class Prac2 {

	public static void main(String[] args) {
		Shape a = new Line(); // 업캐스팅
		a.draw();
		Circle b = new Circle();
		b.draw();
		a = new Rect();
		a.draw();
	}

}

abstract class Shape
{
	Shape() {} // 생성자
	
	void show() // 일반 메소드
	{
		
	}
	
	abstract void draw(); // 추상메소드 : 구현x 이름만
	String name; // 일반 멤버변수
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
