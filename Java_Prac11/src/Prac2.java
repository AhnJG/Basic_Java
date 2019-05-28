import java.util.Scanner;

class Tv
{
	//속성(필드, 멤버변수) + 메소드(함수, 동작)
	private String name;
	private int size;
	private int ch=7;
	
	Tv(){} //기본생성자
	
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
		System.out.println(size+"inch " + name+"를 켭니다");
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1. 채널up");
			System.out.println("2. 채널down");
			System.out.println("3. Tv종료");
			System.out.print("입력:");
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
				System.out.println("안녕히 주무세요");
				return;
			}
			System.out.println("현재 채널은: "+ch+"입니다.");
		}
		
	}
	
	void Off()
	{
		System.out.println(size+"inch " + name+"를 끕니다");
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
			System.out.println("**저녁시간**");
			System.out.println("1. Tv 켠다.");
			System.out.println("2. Tv 끈다.");
			System.out.println("3. 잠자기.");
			System.out.print("입력:");
			int main_menu = sc.nextInt(); 
			
			switch(main_menu)
			{
			case 1:
				On();
				break;
			case 2:
				System.out.println("Tv가 종료되어있습니다.");
				break;
			case 3:
				System.out.println("안녕히 주무세요");
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
