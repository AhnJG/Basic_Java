import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Prac4 {

	public static void main(String[] args) {
		ArrayList <String> st = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++)
		{
			System.out.print("�̸�:");
			st.add(sc.next());
		}
		
		Iterator <String> it = st.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		
		System.out.print("ã�� ������: ");
		String find = sc.next();
		if(st.contains(find))
		{
			System.out.println("ã�� �����Ͱ� �ֽ��ϴ�.");
		}
		else
		{
			System.out.println("ã�� �����Ͱ� �����ϴ�.");
		}
		
		System.out.println();
		
		System.out.print("ã�� ������: ");
		String find1 = sc.next();
		boolean flag = false;
		it = st.iterator();
		while(it.hasNext())
		{
			if(it.next().contentEquals(find1))
			{
				flag = true;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("ã�� �����Ͱ� �ֽ��ϴ�.");
		}
		else
		{
			System.out.println("ã�� �����Ͱ� �����ϴ�.");
		}
	}

}
