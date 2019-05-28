
public class Prac3 {

	public static void main(String[] args) {
		B b1 = new B();
		
		System.out.println("");
		
		B b2 = new B(3);
		
		System.out.println("");
		
		B b3 = new B(1,2);
	}
}

class A
{
	public A()
	{
		System.out.println("A");
	}
	
	public A(int x) 
	{
		System.out.println("A"+x);
	}
}

class B extends A
{
	public B()
	{
		System.out.println("B");
	}
	
	public B(int x)
	{
		super(x);
		System.out.println("B"+x);
	}
	
	public B(int x, int y)
	{
		System.out.println("B"+x+y);
	}
}


