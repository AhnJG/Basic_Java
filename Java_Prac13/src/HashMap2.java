import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//������ �α� 5�� �ֱ�
//����� �Է¹޾� �α��� ���ϱ�
class National
{
	HashMap<String, Integer> nat = new HashMap<String, Integer>();
	void set()
	{
		nat.put("�ѱ�", 5000);
		nat.put("�Ϻ�", 10000);
		nat.put("�߱�", 100000);
		nat.put("�̱�", 30000);
		nat.put("ȣ��", 2500);
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
			System.out.println("1.���� �α��� �˻�");
			System.out.println("2.����");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("�˻��� ����� �Է�: ");
				nation.find(sc.next());	
				break;
			case 2:
				return;

			}
			
			
		}
	}

}
