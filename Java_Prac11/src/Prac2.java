import java.util.Scanner;

class Tv
{
	//�Ӽ�(�ʵ�, �������) + �޼ҵ�(�Լ�, ����)
	private String name;
	private int size;
	private int ch=7;
	
	Tv(){} //�⺻������
	
	Tv(String name, int size)
	{
		this.name = name;
		this.size = size;
	}
	
	Tv(String name, int size, String color)
	{
		this.name = name;
		this.size = size;
	}
	
	void On()
	{
		System.out.println(size+"inch " + name+"�� �մϴ�");
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1. ä��up");
			System.out.println("2. ä��down");
			System.out.println("3. Tv����");
			System.out.print("�Է�:");
			int ch_menu = sc.nextInt(); 
			
			switch(ch_menu)
			{
			case 1:
				ch_up();
				break;
			case 2:
				ch_down();
				break;
			case 3:
				Off();
				System.out.println("�ȳ��� �ֹ�����");
				return;
			}
			System.out.println("���� ä����: "+ch+"�Դϴ�.");
		}
		
	}
	
	void Off()
	{
		System.out.println(size+"inch " + name+"�� ���ϴ�");
	}
	
	void ch_up()
	{
		if(ch+1 == 11)
		{
			ch = 0;
		}
		else
		{
			ch++;
		}
		
	}
	void ch_down()
	{
		if(ch-1 == -1)
		{
			ch = 10;
		}
		else
		{
			ch--;
		}
	}
	
	void start()
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("**����ð�**");
			System.out.println("1. Tv �Ҵ�.");
			System.out.println("2. Tv ����.");
			System.out.println("3. ���ڱ�.");
			System.out.print("�Է�:");
			int main_menu = sc.nextInt(); 
			
			switch(main_menu)
			{
			case 1:
				On();
				break;
			case 2:
				System.out.println("Tv�� ����Ǿ��ֽ��ϴ�.");
				break;
			case 3:
				System.out.println("�ȳ��� �ֹ�����");
				return;
			}
		}
	}
}

public class Prac2 {

	public static void main(String[] args) {
		
		Tv t = new Tv("OLED TV", 100);
		t.start();
		
//		Tv t2 = new Tv("OLED TV", 100);
//		t2.start();
	}

}
