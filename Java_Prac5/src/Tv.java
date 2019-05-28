import java.util.Scanner;

class Power
{
	Boolean power;
	
	public Power()
	{
		power = false;
	}
	
	void powerOn()
	{
		if(power)
		{
			System.out.println("TV ��������.");
		}
		else
		{
			power = true;
			System.out.println("TV ����.");
		}
	}
	
	void powerOff()
	{
		if(power)
		{
			power = false;
			System.out.println("TV ����.");
			System.exit(0);
		}
		else
		{
			System.out.println("TV ��������");
		}
	}
}

class Channel
{
	int c;
	public Channel(int c)
	{
		this.c = c;
		System.out.println("���� ä�� : "+ c);
	}
	
	void up(Boolean power)
	{
		if(power)
		{
			c++;
			if(c == 101)
			{
				c = 0;
			}
			System.out.println("���� ä�� : "+ c);
		}
		else
		{
			System.out.println("TV ��������.");
		}
	}
	
	void down(Boolean power)
	{
		if(power)
		{
			
			c--;
			if(c == -1)
			{
				c = 100;
			}
			System.out.println("���� ä�� : "+ c);
		}
		else
		{
			System.out.println("TV ��������.");
		}
	}
}

public class Tv {
	//a.equals(b)
	public static void main(String[] args) {
		Channel c = new Channel(9);
		Power p = new Power();
		Scanner sc = new Scanner(System.in);
		
		String activity;
		
		while(true)
		{
			System.out.println("on. Tv �ѱ�");
			System.out.println("off. Tv ����");
			System.out.println("up. Tv ä�� �ø���");
			System.out.println("down. Tv ä�� ������");
			
			System.out.println("������ ��� : ");
			activity = sc.next();
			
			if(activity.equals("on"))
			{
				p.powerOn();
			}
			else if(activity.equals("off"))
			{
				p.powerOff();
			}
			else if(activity.equals("up"))
			{
				c.up(p.power);
			}
			else if(activity.equals("down"))
			{
				c.down(p.power);
			}
			else
			{
				System.out.println("�ٽ� �Է����ּ���.");
			}
			
//			switch(sc.next())
//			{
//			case :
//				p.powerOn();
//				break;
//			case 2:
//				p.powerOff();
//				break;
//			case 3:
//				c.up(p.power);
//				break;
//			case 4:
//				c.down(p.power);
//				break;
//			default:
//				System.out.println("�ٽ� �Է����ּ���.");
//			}
		}
	}

}
