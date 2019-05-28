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
			System.out.println("TV 켜져있음.");
		}
		else
		{
			power = true;
			System.out.println("TV 시작.");
		}
	}
	
	void powerOff()
	{
		if(power)
		{
			power = false;
			System.out.println("TV 종료.");
			System.exit(0);
		}
		else
		{
			System.out.println("TV 꺼져있음");
		}
	}
}

class Channel
{
	int c;
	public Channel(int c)
	{
		this.c = c;
		System.out.println("현재 채널 : "+ c);
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
			System.out.println("현재 채널 : "+ c);
		}
		else
		{
			System.out.println("TV 꺼져있음.");
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
			System.out.println("현재 채널 : "+ c);
		}
		else
		{
			System.out.println("TV 꺼져있음.");
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
			System.out.println("on. Tv 켜기");
			System.out.println("off. Tv 끄기");
			System.out.println("up. Tv 채널 올리기");
			System.out.println("down. Tv 채널 내리기");
			
			System.out.println("수행할 명령 : ");
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
				System.out.println("다시 입력해주세요.");
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
//				System.out.println("다시 입력해주세요.");
//			}
		}
	}

}
