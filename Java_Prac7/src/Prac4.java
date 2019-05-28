import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.text.html.ParagraphView;

public class Prac4 {

	public static void main(String[] args) {
		//������ a = new ������("ȫ�浿","�λ��",2350000,500000); -> 3070
		//									����       ���ʽ�(�� 5��)
		//�˹� b = new �˹�("��ȣ","���񽺺�",7350,8); 30�� -> 1807200 
		//								�ñ�   �ð�
		//�������� c = new ��������("�μ�","����",1250000,70000)
		//���� = ����*12 + ����
		
		DecimalFormat d = new DecimalFormat("###,###,###");
		Permanent p = new Permanent("������", "�λ��", 2350000, 500000);
		Alba a = new Alba("������", "���񽺺�", 7530, 8);
		Temporary t = new Temporary("�ٴٴ�", "����", 1250000, 70000);
		
		System.out.println(p.getName()+"�� "+p.getDepartment()+"�̰� ������"+d.format(p.getPay())+"�� �Դϴ�.");
		a.info();
		t.info();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("�μ� : ");
		String department = sc.next();
		System.out.print("���� : ");
		int payPerMonth = sc.nextInt();
		System.out.print("���ʽ� : ");
		int bonus = sc.nextInt();
		
		Permanent p1 = new Permanent(name, department, payPerMonth, bonus);
		p1.info();
	}

}

class Empolyee
{
	//private �̸�, �μ�
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

class Permanent extends Empolyee // ������
{
	//protected ����, ���ʽ�
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
		System.out.println(getName()+"�� "+getDepartment()+"�̰� ������"+d.format(getPay())+"�� �Դϴ�.");
	}
}

class Alba extends Empolyee // �ӽ���
{
	//protected �ð���޿�, �ð���
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
		System.out.println(getName()+"�� "+getDepartment()+"�̰� ������"+d.format(getPay())+"�� �Դϴ�.");
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
		System.out.println(getName()+"�� "+getDepartment()+"�̰� ������"+d.format(this.getPay())+"�� �Դϴ�.");
	}
}
