abstract class abst{ //상속을 위한 클래스, 객체 생성 불가, 자식 클래스를 통해서 접근해야 한다.
	String name;
	abstract void show();
	void paint()
	{
		System.out.println("asdf");
	}
}

interface in1{
	final double PI=3.14;
	void print();
}

interface in2{
	void display();
}

class Ex2 extends abst implements in1, in2{
	void show() {}
	public void print() {} // interface의 메소드는 기본값으로  default이기 때문에 상속받은 곳에서는 더 넓은 범위인 public 으로 선언해야한다.
	public void display() {}
}

public class Review1 {

	public static void main(String[] args) {
		Ex2 a = new Ex2();
		a.paint();
		abst b = new Ex2();
		b.paint();
	}

}
