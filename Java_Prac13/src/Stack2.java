import java.util.Scanner;
import java.util.Stack;

class st
{
	Stack<String> bef = new Stack<>();
	Stack<String> aft = new Stack<>();
	
	void set()
	{
		bef.push("다음");
		bef.push("네이버");
		bef.push("구글");
		bef.push("야후");
	}
	
	void before()
	{
		if(bef.size() == 1)
		{
			System.out.println("이전 페이지가 없습니다.");
			return;
		}
		aft.push(bef.pop());
	}

	void after()
	{
		if(aft.empty())
		{
			System.out.println("다음 페이지가 없습니다.");
			return;
		}
		bef.push(aft.pop());
	}
	
	void current()
	{
		if(bef.empty())
		{
			System.out.println("이전 페이지가 없습니다.");
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
			System.out.println("1.현재 페이지 출력");
			System.out.println("2.이전 페이지 이동");
			System.out.println("3.다음 페이지 이동");
			System.out.println("4.페이지 열람");
			System.out.println("5.종료");
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
				System.out.println("열람 페이지 이름:");
				page.open(sc.next());
				break;
			case 5:
				return;
			}
		}
	}
}
