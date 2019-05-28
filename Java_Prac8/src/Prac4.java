import java.util.Scanner;

public class Prac4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수:");
		int a = sc.nextInt();
		System.out.println("두번째 수:");
		int b = sc.nextInt();
		System.out.println("연산자 :");
		char s = sc.next().charAt(0);
		Calc cal;
		if(s == '+')
		{
			cal = new Add(a, b);
			System.out.println("두수의 합 = "+cal.calc());
		}
		else if(s == '-')
		{
			cal = new Sub(a, b);
			System.out.println("두수의 차 = "+cal.calc());
		}
		else if(s == '/')
		{
			cal = new Div(a, b);
			System.out.println("두수의 몫 = "+cal.calc());
		}
		else if(s == '*')
		{
			cal = new Mul(a, b);
			System.out.println("두수의 곱 = "+cal.calc());
		}
	}
}

class Calc
{
	private int ope1, ope2;
	Calc(int ope1, int ope2)
	{
		this.ope1 = ope1;
		this.ope2 = ope2;
	}
	
	protected int calc()
	{
		return 0;
	}
	
	protected int callOpe1()
	{
		return ope1;
	}
	
	protected int callOpe2()
	{
		return ope2;
	}
}

class Add extends Calc              
{
	Add(int ope1, int ope2)
	{
		super(ope1, ope2);
	}
	
	protected int calc()
	{
		return callOpe1()+callOpe2();
	}
}

class Sub extends Calc
{
	Sub(int ope1, int ope2)
	{
		super(ope1, ope2);
	}
	
	protected int calc()
	{
		return callOpe1()-callOpe2();
	}
}

class Div extends Calc
{
	Div(int ope1, int ope2)
	{
		super(ope1, ope2);
	}
	
	protected int calc()
	{
		return callOpe1()/callOpe2();
	}
}

class Mul extends Calc
{
	Mul(int ope1, int ope2)
	{
		super(ope1, ope2);
	}
	
	protected int calc()
	{
		return callOpe1()*callOpe2();
	}
}