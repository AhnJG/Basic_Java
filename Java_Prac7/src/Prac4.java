import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.text.html.ParagraphView;

public class Prac4 {

	public static void main(String[] args) {
		//정규직 a = new 정규직("홍길동","인사부",2350000,500000); -> 3070
		//									월급       보너스(월 5번)
		//알바 b = new 알바("찬호","서비스부",7350,8); 30일 -> 1807200 
		//								시급   시간
		//비정규직 c = new 비정규직("민수","고객부",1250000,70000)
		//연봉 = 월급*12 + 수당
		
		DecimalFormat d = new DecimalFormat("###,###,###");
		Permanent p = new Permanent("가가가", "인사부", 2350000, 500000);
		Alba a = new Alba("나나나", "서비스부", 7530, 8);
		Temporary t = new Temporary("다다다", "고객부", 1250000, 70000);
		
		System.out.println(p.getName()+"은 "+p.getDepartment()+"이고 연봉은"+d.format(p.getPay())+"원 입니다.");
		a.info();
		t.info();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("부서 : ");
		String department = sc.next();
		System.out.print("월급 : ");
		int payPerMonth = sc.nextInt();
		System.out.print("보너스 : ");
		int bonus = sc.nextInt();
		
		Permanent p1 = new Permanent(name, department, payPerMonth, bonus);
		p1.info();
	}

}

class Empolyee
{
	//private 이름, 부서
	private String name, department;
	
	Empolyee(String name, String department)
	{
		this.name = name;
		this.department = department;
	}
	
	String getName()
	{
		return name;
	}
	
	String getDepartment()
	{
		return department;
	}
	
}

class Permanent extends Empolyee // 정규직
{
	//protected 월급, 보너스
	protected int payPerMonth, bonus;
	Permanent(String name, String department, int payPerMonth, int bonus)
	{
		super(name,department);
		this.payPerMonth = payPerMonth;
		this.bonus = bonus;
	}
	
	int getPay()
	{
		return payPerMonth*12 + bonus*5;
	}
	
	void info()
	{
		DecimalFormat d = new DecimalFormat("###,###,###");
		System.out.println(getName()+"은 "+getDepartment()+"이고 연봉은"+d.format(getPay())+"원 입니다.");
	}
}

class Alba extends Empolyee // 임시직
{
	//protected 시간당급여, 시간수
	protected int payPerHour, Hour;
	Alba(String name, String department, int payPerHour, int Hour)
	{
		super(name,department);
		this.payPerHour = payPerHour;
		this.Hour = Hour;
	}
	
	int getPay()
	{
		return payPerHour * Hour * 30;
	}
	
	void info()
	{
		DecimalFormat d = new DecimalFormat("###,###,###");
		System.out.println(getName()+"은 "+getDepartment()+"이고 월급은"+d.format(getPay())+"원 입니다.");
	}
}

class Temporary extends Permanent
{
	Temporary(String name, String department, int payPerMonth, int bonus)
	{
		super(name, department, payPerMonth, bonus);
	}
	
	int getPay()
	{
		return payPerMonth*12 + bonus;
	}
	
	void info()
	{
		DecimalFormat d = new DecimalFormat("###,###,###");
		System.out.println(getName()+"은 "+getDepartment()+"이고 연봉은"+d.format(this.getPay())+"원 입니다.");
	}
}
