import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Prac4 {

	public static void main(String[] args) {
		ArrayList <String> st = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++)
		{
			System.out.print("이름:");
			st.add(sc.next());
		}
		
		Iterator <String> it = st.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		
		System.out.print("찾을 데이터: ");
		String find = sc.next();
		if(st.contains(find))
		{
			System.out.println("찾는 데이터가 있습니다.");
		}
		else
		{
			System.out.println("찾는 데이터가 없습니다.");
		}
		
		System.out.println();
		
		System.out.print("찾을 데이터: ");
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
			System.out.println("찾는 데이터가 있습니다.");
		}
		else
		{
			System.out.println("찾는 데이터가 없습니다.");
		}
	}

}
