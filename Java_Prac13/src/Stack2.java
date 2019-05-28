import java.util.Scanner;
import java.util.Stack;

class st
{
	Stack<String> bef = new Stack<>();
	Stack<String> aft = new Stack<>();
	
	void set()
	{
		bef.push("����");
		bef.push("���̹�");
		bef.push("����");
		bef.push("����");
	}
	
	void before()
	{
		if(bef.size() == 1)
		{
			System.out.println("���� �������� �����ϴ�.");
			return;
		}
		aft.push(bef.pop());
	}

	void after()
	{
		if(aft.empty())
		{
			System.out.println("���� �������� �����ϴ�.");
			return;
		}
		bef.push(aft.pop());
	}
	
	void current()
	{
		if(bef.empty())
		{
			System.out.println("���� �������� �����ϴ�.");
			return;
		}
		System.out.println(bef.peek());
	}
	
	void open(String name)
	{
		bef.push(name);
		aft.clear();
	}
}

public class Stack2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		st page = new st();
		int menu;
		page.set();
		while(true)
		{
			System.out.println("1.���� ������ ���");
			System.out.println("2.���� ������ �̵�");
			System.out.println("3.���� ������ �̵�");
			System.out.println("4.������ ����");
			System.out.println("5.����");
			menu = sc.nextInt();
			0
			switch(menu)
			{
			case 1:
				page.current();
				break;
			case 2:
				page.before();
				break;
			case 3:
				page.after();
				break;
			case 4:
				System.out.println("���� ������ �̸�:");
				page.open(sc.next());
				break;
			case 5:
				return;
			}
		}
	}
}
