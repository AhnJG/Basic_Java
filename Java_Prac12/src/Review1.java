abstract class abst{ //����� ���� Ŭ����, ��ü ���� �Ұ�, �ڽ� Ŭ������ ���ؼ� �����ؾ� �Ѵ�.
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
	public void print() {} // interface�� �޼ҵ�� �⺻������  default�̱� ������ ��ӹ��� �������� �� ���� ������ public ���� �����ؾ��Ѵ�.
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
