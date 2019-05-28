
abstract class First
{
	int num;
	
	First(int num)
	{
		this.num = num;
	}
	
	abstract void show();
}

class Second extends First
{
	Second(int num)
	{
		super(num);
	}
	
	void show()
	{
		System.out.println(num);
	}
}

class Third extends First
{
	Third(int num)
	{
		super(num);
	}
	
	void show()
	{
		System.out.println(num);
	}
}

public class Test1 {

	public static void main(String[] args) {
		
	}

}
