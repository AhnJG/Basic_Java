
public class Prac4 {

	public static void main(String[] args) {
		Inter a = new Inter();
		a.show();
	}

}

interface A
{
	double PI = 3.14; // final ����
	//String name; -> ����
	void show(); // �߻� �޼ҵ� (public abstract����)
	
	default void show2() {}
	//private void show3() {} 1.9 �������� ����
	//void show4() {} �Ϲ� �޼ҵ� �Ұ�
}

interface B extends A
{
	void print();
}

interface C 
{
	void display();
}
class Inter implements B, C
{
	public void show() // public �����ϸ� �ȵ�.
	{
		System.out.println("PI : "+PI);
	}
	
	public void print()
	{
		
	}
	
	public void display()
	{
		
	}
}