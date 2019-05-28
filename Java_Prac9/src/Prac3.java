
public class Prac3 {

	public static void main(String[] args) {
		CalcData a = new CalcData("ㄱㄱㄱ", 20);
		System.out.println("합 : " + a.sum(8,5));
		System.out.println("차 : " + a.subt(7,35));
		
		int k[] = {1,4,2,3,5,7,8,6,9,0};
		System.out.println("평균 : " + a.avg(k));
		System.out.println("이름 : " + a.reName() + "나이 : " + a.age);
	}	

}

abstract class Calc
{
	Calc(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	abstract int sum(int a, int b);
	abstract int subt(int a, int b);
	abstract double avg(int k[]);
	private String name;
	protected int age;
	String reName()
	{
		return name;
	}
}

class CalcData extends Calc
{
	CalcData(String name, int age)
	{
		super(name, age);
	}
	
	int sum(int a, int b)
	{
		return a+b;
	}
	
	int subt(int a, int b)
	{
		return a-b;
	}
	
	double avg(int k[])
	{
		double result=0;
		
		for(int i=0; i<k.length; i++)
		{
			result += k[i];
		}
		
		result /= k.length;
		
		return result;
	}
}