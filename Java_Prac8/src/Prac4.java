import java.util.Scanner;

public class Prac4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ��:");
		int a = sc.nextInt();
		System.out.println("�ι�° ��:");
		int b = sc.nextInt();
		System.out.println("������ :");
		char s = sc.next().charAt(0);
		Calc cal;
		if(s == '+')
		{
			cal = new Add(a, b);
			System.out.println("�μ��� �� = "+cal.calc());
		}
		else if(s == '-')
		{
			cal = new Sub(a, b);
			System.out.println("�μ��� �� = "+cal.calc());
		}
		else if(s == '/')
		{
			cal = new Div(a, b);
			System.out.println("�μ��� �� = "+cal.calc());
		}
		else if(s == '*')
		{
			cal = new Mul(a, b);
			System.out.println("�μ��� �� = "+cal.calc());
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