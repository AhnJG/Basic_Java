import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex7 {

	public static void main(String[] args) { // ����!!
		Calendar now = Calendar.getInstance(); // PC�� �ð��� ������
		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH)+1;
		int d = now.get(Calendar.DAY_OF_MONTH);
		int h = now.get(Calendar.HOUR_OF_DAY); // 24�ð� ����, HOUR -> 0~11
		int mi = now.get(Calendar.MINUTE);
		int s = now.get(Calendar.SECOND);
		
		System.out.println(y+"��");
		System.out.println(m+"��");
		System.out.println(d+"��");
		System.out.println(h+"��");
		System.out.println(mi+"��");
		System.out.println(s+"��");
		
		Calendar me = Calendar.getInstance();
		me.set(1998, 5, 30);
		//���� ���ϱ�
		System.out.println("���� ���̴�"+(now.get(Calendar.YEAR) - me.get(Calendar.YEAR) + 1) + "��");
		
		//4��~12�� : �¸��, 12~18�� : �¾����ʹ�, 18~22 : ���̺��, 22~4 : �³���
		int nowHour = now.get(Calendar.HOUR_OF_DAY);
		if(nowHour >= 4 && nowHour<12)
		{
			System.out.println("Good Morning");
		}
		else if(nowHour>=12 && nowHour<18)
		{
			System.out.println("Good Afternoon");
		}
		else if(nowHour>=18 && nowHour<22)
		{
			System.out.println("Good Evening");
		}
		else if(nowHour>=22 && nowHour<4)
		{
			System.out.println("Good Night");
		}
		
		//StringToKennizer, ���� �Է� : we are the world
		//we
		//are
		//the
		//world
		//�ܾ�� : 
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է�: ");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		System.out.println("�ܾ�� : "+st.countTokens()); // ���� ���� ��ū�� ����, nextToken���� ����ϰ� ���� �������.
		int count=0;
		while(st.hasMoreTokens())
		{ 
			System.out.println(st.nextToken());
			count++;
		}
		System.out.println("�ܾ�� : "+count);
		
	}

}
