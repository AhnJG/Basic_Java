
public class Prac4 {

	public static void main(String[] args) {
		Inter a = new Inter();
		a.show();
	}

}

interface A
{
	double PI = 3.14; // final 생략
	//String name; -> 오류
	void show(); // 추상 메소드 (public abstract생략)
	
	default void show2() {}
	//private void show3() {} 1.9 버전부터 가능
	//void show4() {} 일반 메소드 불가
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
	public void show() // public 생략하면 안됨.
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