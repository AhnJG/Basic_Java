import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//나라명과 인구 5개 넣기
//나라명 입력받아 인구수 구하기
class National
{
	HashMap<String, Integer> nat = new HashMap<String, Integer>();
	void set()
	{
		nat.put("한국", 5000);
		nat.put("일본", 10000);
		nat.put("중국", 100000);
		nat.put("미국", 30000);
		nat.put("호주", 2500);
	}
	
	void find(String name)
	{	
		System.out.println(nat.get(name));
	}
}

public class HashMap2 {

	public static void main(String[] args) {
		int menu;
		Scanner sc = new Scanner(System.in);
		National nation = new National();
		nation.set();
		
		while(true)
		{
			System.out.println("1.나라별 인구수 검색");
			System.out.println("2.종료");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("검색할 나라명 입력: ");
				nation.find(sc.next());	
				break;
			case 2:
				return;

			}
			
			
		}
	}

}
